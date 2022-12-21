package com.cs320.PHARM.GUINB;

import com.cs320.PHARM.api.*;
import com.cs320.PHARM.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.regex.PatternSyntaxException;

@Component
public class DoctorView extends javax.swing.JFrame {
    //TODO: Spring beans beginning::
    @Autowired
    PatientAPI patientAPI;
    @Autowired
    DrugAPI drugAPI;
    @Autowired
    PharmacyAPI pharmacyAPI;
    @Autowired
    PrescriptionAPI prescriptionAPI;
    @Autowired
    UserAccountAPI userAccountAPI;
    @Autowired
    DrugListAPI drugListAPI;
    UserLogin userLogin;

    //Todo: Spring beans end::
    private boolean editing=false;
    private int active_DrugListID;
    private UserAccount userAccount;
    public static void main(String args[]) {
        JFrame frame=new DoctorView();
        frame.setVisible(true);
        frame.setEnabled(true);
    }
    private JFrame create;
    private javax.swing.JButton AddPatientB;
    private javax.swing.JButton CreateB;
    private javax.swing.JButton DeletePatientB;
    private javax.swing.JButton DeletePrescriptionB;
    private javax.swing.JButton DoctorB;
    private javax.swing.JButton EditB;
    private javax.swing.JButton ListAllB;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel NameTextField;
    private javax.swing.JTextField PatientIDT;
    private javax.swing.JTextField PatientNameT;
    private javax.swing.JTable PatientTable;
    private javax.swing.JPanel bot;
    private javax.swing.JPanel drugPanel;
    private javax.swing.JButton accountSettings;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    private javax.swing.JPanel rightP;
    private javax.swing.JPanel top;
    //TODO: create/edit frame objects -----------
    private javax.swing.JButton AddDrugB;

    private javax.swing.JPanel Bot;
    private javax.swing.JButton CancelPrescriptionB;
    private javax.swing.JButton CreatePrescriptionB;
    private javax.swing.JTable DrugListTable;
    private javax.swing.JTextField DrugSearchT;
    private javax.swing.JButton ListAllDrugsB;
    private javax.swing.JButton ListAllPrescriptionsB1;
    private javax.swing.JPanel Mid;
    private javax.swing.JPanel Mid1;
    private javax.swing.JPanel Mid2;
    private javax.swing.JTextArea NoteTextArea;
    private javax.swing.JLabel PatientTempID;
    private javax.swing.JLabel PatientTempName;
    private javax.swing.JTextField PrescriptionSearchT1;
    private javax.swing.JTable PrescriptionTable;
    private javax.swing.JButton RemovePrescirptionB1;
    private javax.swing.JPanel drugpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel prescriptionpanel;
    private javax.swing.JScrollPane scrool;
    private javax.swing.JPanel topPanel;
    private JTextField AmountfieldT;
    private JLabel Amount;


    public void initializeObject(UserAccount userAccount,UserLogin userLogin) {
        this.setVisible(true);
        this.setEnabled(true);
        this.userAccount=userAccount;
        this.userLogin=userLogin;
        NameTextField.setText(userAccount.getUsername());
        PatientTableFiller();
    }
    public DoctorView() {
        initComponents();
    }


    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jpanel1 = new javax.swing.JPanel();
        DoctorB = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        drugPanel = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        bot = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        rightP = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        CreateB = new javax.swing.JButton();
        EditB = new javax.swing.JButton();
        DeletePrescriptionB = new javax.swing.JButton();
        DeletePatientB = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        ListAllB = new javax.swing.JButton();
        left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PatientNameT = new javax.swing.JTextField();
        AddPatientB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        PatientIDT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accountSettings = new javax.swing.JButton();
        Logout = new javax.swing.JButton();



        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
                jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
                jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
                jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
                jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(getMaximumSize());
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jpanel1.setLayout(new java.awt.GridLayout(4, 1));

        DoctorB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        DoctorB.setText("Patients");
        DoctorB.setAlignmentY(0.0F);
        DoctorB.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        DoctorB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorBMouseClicked(evt);
                DoctorBMouseClicked1(evt);
            }
        });

        jpanel1.add(DoctorB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(175, 0, 100, 0);
        jPanel3.add(jpanel1, gridBagConstraints);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        drugPanel.setLayout(new javax.swing.BoxLayout(drugPanel, javax.swing.BoxLayout.PAGE_AXIS));

        top.setLayout(new java.awt.BorderLayout());

        PatientTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Patient Name","Prescriptions"
                }
        ));
        jScrollPane2.setViewportView(PatientTable);

        top.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        drugPanel.add(top);

        bot.setLayout(new java.awt.GridLayout(1, 0));

        rightP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("Search Patients By ID");

        CreateB.setText("Create Prescription");

        EditB.setText("Edit Prescription");

        DeletePrescriptionB.setText("Delete Prescription");

        DeletePatientB.setText("Delete Patient");

        jLabel14.setText("Manage Prescriptions:");

        ListAllB.setText("List All");


        javax.swing.GroupLayout rightPLayout = new javax.swing.GroupLayout(rightP);
        rightP.setLayout(rightPLayout);
        rightPLayout.setHorizontalGroup(
                rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(rightPLayout.createSequentialGroup()
                                                .addGroup(rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(rightPLayout.createSequentialGroup()
                                                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(DeletePatientB)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ListAllB, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(rightPLayout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(CreateB, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(DeletePrescriptionB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(12, Short.MAX_VALUE))
                                        .addGroup(rightPLayout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        rightPLayout.setVerticalGroup(
                rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(rightPLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DeletePatientB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ListAllB))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DeletePrescriptionB, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addGroup(rightPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(EditB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CreateB, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        javax.swing.GroupLayout rightLayout = new javax.swing.GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
                rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rightP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rightLayout.setVerticalGroup(
                rightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rightP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bot.add(right);

        jLabel2.setText("Patient Name");

        AddPatientB.setText("Add Patient");

        jLabel3.setText("Patient ID");


        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PatientNameT)
                                        .addComponent(PatientIDT, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                        .addComponent(AddPatientB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16))
        );
        leftLayout.setVerticalGroup(
                leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(PatientNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PatientIDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddPatientB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        bot.add(left);

        drugPanel.add(bot);

        jLayeredPane1.add(drugPanel, "card2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jLayeredPane1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridLayout(4, 2));

        jLabel10.setText("Name:                   ");
        jPanel2.add(jLabel10);

        NameTextField.setText("temp");
        jPanel2.add(NameTextField);

        jLabel99.setText("Account type:");
        jPanel2.add(jLabel99);

        jLabel11.setText("Doctor Account");
        jPanel2.add(jLabel11);

        accountSettings.setText("Account settings");
        jPanel2.add(accountSettings);

        Logout.setText("Logout");

        jPanel2.add(Logout);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanel3.add(jPanel2, gridBagConstraints);


        jPanel3.setBorder(new EmptyBorder(5,5,5,5));
        getContentPane().add(jPanel3, new java.awt.GridBagConstraints());

        accountSettings.setEnabled(true);

        actionListeners();
        pack();
        setResizable(false);

    }
    //we put here everything for actionListeners!
    private void actionListeners(){
        accountSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAccount();
            }
        });
        jTextField7.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(PatientTable,jTextField7);
                if(PatientTable.getRowCount()==1){
                    if(Integer.valueOf(PatientTable.getValueAt(0,2).toString())==1){
                        EditB.setEnabled(true);
                        DeletePrescriptionB.setEnabled(true);
                    }
                    else {
                        CreateB.setEnabled(true);
                    }
                    DeletePatientB.setEnabled(true);

                }
                else{
                    EditB.setEnabled(false);
                    CreateB.setEnabled(false);
                    DeletePatientB.setEnabled(false);
                    DeletePrescriptionB.setEnabled(false);

                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(PatientTable,jTextField7);
                if(PatientTable.getRowCount()==1){
                    if(Integer.valueOf(PatientTable.getValueAt(0,2).toString())==1){
                        EditB.setEnabled(true);
                        DeletePrescriptionB.setEnabled(true);
                    }
                    else {
                        CreateB.setEnabled(true);
                    }
                    DeletePatientB.setEnabled(true);

                }
                else{
                    EditB.setEnabled(false);
                    CreateB.setEnabled(false);
                    DeletePatientB.setEnabled(false);
                    DeletePrescriptionB.setEnabled(false);

                }

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(PatientTable,jTextField7);
                if(PatientTable.getRowCount()==1){
                    if(Integer.valueOf(PatientTable.getValueAt(0,2).toString())==1){
                        EditB.setEnabled(true);
                        DeletePrescriptionB.setEnabled(true);
                    }
                    else {
                        CreateB.setEnabled(true);
                    }
                    DeletePatientB.setEnabled(true);

                }
                else{
                    EditB.setEnabled(false);
                    CreateB.setEnabled(false);
                    DeletePatientB.setEnabled(false);
                    DeletePrescriptionB.setEnabled(false);

                }

            }
        });
        ListAllB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7.setText("");
            }
        });

        //Adding and deleting functionality
        DeletePatientB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientBActionPerformed(evt);
            }
        });
        AddPatientB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientBActionPerformed();
            }
        });

        CreateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editing=false;
                createFrame();
            }
        });
        EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editing=true;
                Prescription prescription=prescriptionAPI.findPrescriptionByPatientIdAndDoctorID(Integer.parseInt(PatientTable.getValueAt(0, 0).toString()),userAccount.getId());
                active_DrugListID= prescription.getDrugListId();
                createFrame();
                PrescrptionTableFiller();
            }
        });

        DoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBActionPerformed(evt);
            }
        });
        DeletePrescriptionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePrescriptionBActionPerformed(evt);
            }
        });

        PatientNameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameTActionPerformed(evt);
            }
        });

        PatientIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDTActionPerformed(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

    }
    private void createFrame(){
        create=new JFrame();
        create.setEnabled(true);
        create.setVisible(true);
        create.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                create.dispose();
            }
        });
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PatientTempID = new javax.swing.JLabel();
        PatientTempName = new javax.swing.JLabel();
        //todo
        PatientTempID.setText(String.valueOf(PatientTable.getValueAt(0,0)));
        PatientTempName.setText(String.valueOf(PatientTable.getValueAt(0,1)));
        //todo
        jLabel4 = new javax.swing.JLabel();
        Mid = new javax.swing.JPanel();
        Mid1 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        scrool = new javax.swing.JScrollPane();
        DrugListTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PrescriptionTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        drugpanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        DrugSearchT = new javax.swing.JTextField();
        ListAllDrugsB = new javax.swing.JButton();
        AddDrugB = new javax.swing.JButton();
        AmountfieldT = new javax.swing.JTextField();
        Amount = new javax.swing.JLabel();
        prescriptionpanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        PrescriptionSearchT1 = new javax.swing.JTextField();
        ListAllPrescriptionsB1 = new javax.swing.JButton();
        RemovePrescirptionB1 = new javax.swing.JButton();
        Mid2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        // NoteTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        Bot = new javax.swing.JPanel();
        CreatePrescriptionB = new javax.swing.JButton();
        CancelPrescriptionB = new javax.swing.JButton();


        DrugTableFiller();


        create.setResizable(false);
        create.getContentPane().setLayout(new java.awt.CardLayout(10, 10));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        topPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Patient ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        topPanel.add(jLabel1, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        topPanel.add(PatientTempID, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        topPanel.add(PatientTempName, gridBagConstraints);

        jLabel4.setText("Patient Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        topPanel.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(topPanel, gridBagConstraints);

        Mid.setLayout(new java.awt.GridBagLayout());

        Mid1.setLayout(new java.awt.GridBagLayout());

        jPanel33.setLayout(new java.awt.GridBagLayout());

        DrugListTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Drug ID", "Drug Name"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrool.setViewportView(DrugListTable);
        if (DrugListTable.getColumnModel().getColumnCount() > 0) {
            DrugListTable.getColumnModel().getColumn(0).setResizable(false);
            DrugListTable.getColumnModel().getColumn(1).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 290;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel33.add(scrool, gridBagConstraints);

        jLabel7.setText("Drug List");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 26);
        jPanel33.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        Mid1.add(jPanel33, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        PrescriptionTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][][] {

                },
                new String [] {
                        "Drug ID", "Drug Name","amount"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class,java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(PrescriptionTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 290;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        jPanel5.add(jScrollPane3, gridBagConstraints);

        jLabel6.setText("Prescription");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 26);
        jPanel5.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        Mid1.add(jPanel5, gridBagConstraints);

        drugpanel.setLayout(new java.awt.GridBagLayout());

        jLabel5.setText("Drug ID:   ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 50);
        drugpanel.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        drugpanel.add(DrugSearchT, gridBagConstraints);

        ListAllDrugsB.setText("List All");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 5, 0);
        drugpanel.add(ListAllDrugsB, gridBagConstraints);

        AddDrugB.setText("Add");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 5, 1);
        drugpanel.add(AddDrugB, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        drugpanel.add(AmountfieldT, gridBagConstraints);
        Amount.setText("Amount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 50);
        drugpanel.add(Amount, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Mid1.add(drugpanel, gridBagConstraints);

        prescriptionpanel.setLayout(new java.awt.GridBagLayout());

        jLabel9.setText("Drug ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 50);
        prescriptionpanel.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 149;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        prescriptionpanel.add(PrescriptionSearchT1, gridBagConstraints);

        ListAllPrescriptionsB1.setText("List All");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 5, 0);
        prescriptionpanel.add(ListAllPrescriptionsB1, gridBagConstraints);

        RemovePrescirptionB1.setText("Remove");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 5, 1);
        prescriptionpanel.add(RemovePrescirptionB1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        Mid1.add(prescriptionpanel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 21);
        Mid.add(Mid1, gridBagConstraints);

        Mid2.setLayout(new java.awt.GridBagLayout());

        jPanel7.setLayout(new java.awt.GridBagLayout());
        NoteTextArea =new JTextArea();
        NoteTextArea.setColumns(20);
        NoteTextArea.setRows(5);
        NoteTextArea.setText("temporary note.");
        jScrollPane4.setViewportView(NoteTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 620;
        gridBagConstraints.ipady = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel7.add(jScrollPane4, gridBagConstraints);

        jLabel8.setText("Attatch a Note:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 26);
        jPanel7.add(jLabel8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        Mid2.add(jPanel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        Mid.add(Mid2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = -872;
        gridBagConstraints.ipady = -477;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 0, 0, 0);
        jPanel1.add(Mid, gridBagConstraints);

        Bot.setLayout(new java.awt.GridBagLayout());

        CreatePrescriptionB.setText("Create Prescription");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(15, 3, 0, 3);
        Bot.add(CreatePrescriptionB, gridBagConstraints);

        CancelPrescriptionB.setText("Cancel ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 62;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.insets = new java.awt.Insets(15, 3, 0, 3);
        Bot.add(CancelPrescriptionB, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 23, 0, 0);
        jPanel1.add(Bot, gridBagConstraints);

        createFrameActionListeners();
        DrugTableFiller();
        create.getContentPane().add(jPanel1, "card2");
        create.setResizable(false);
        create.pack();


    }
    private void createFrameActionListeners() {
        AmountfieldT.setEnabled(false);
        AddDrugB.setEnabled(false);
        RemovePrescirptionB1.setEnabled(false);


        DrugSearchT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(DrugListTable,DrugSearchT);
                if(DrugListTable.getRowCount()==1) {
                    AmountfieldT.setEnabled(true);
                    if(!AmountfieldT.getText().equals("")){
                        AddDrugB.setEnabled(true);
                    }
                }
                else{
                    AmountfieldT.setEnabled(false);
                    AddDrugB.setEnabled(false);
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(DrugListTable,DrugSearchT);
                if(DrugListTable.getRowCount()!=1){
                    AmountfieldT.setEnabled(false);
                    AddDrugB.setEnabled(false);
                    AmountfieldT.setText("");
                }
                else{
                    AmountfieldT.setEnabled(true);
                    AddDrugB.setEnabled(true);
                    AmountfieldT.setText("");
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(DrugListTable,DrugSearchT);
                if(DrugListTable.getRowCount()==1) {
                    AmountfieldT.setEnabled(true);
                    if(!AmountfieldT.getText().equals("")){
                        AddDrugB.setEnabled(true);
                    }

                }
                else{
                    AmountfieldT.setEnabled(false);
                    AddDrugB.setEnabled(false);
                    AmountfieldT.setText("");
                }
            }
        });
        AmountfieldT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(DrugListTable.getRowCount()==1 && !DrugSearchT.getText().equals("")) {
                    AddDrugB.setEnabled(true);
                }
                else{
                    AddDrugB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(AmountfieldT.getText().equals("")) {
                    AddDrugB.setEnabled(false);
                }
                else{
                    if(DrugListTable.getRowCount()==1 && !DrugSearchT.getText().equals("")) {
                        AddDrugB.setEnabled(true);
                    }
                    else{
                        AddDrugB.setEnabled(false);
                    }
                }

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(DrugListTable.getRowCount()==1 && !DrugSearchT.getText().equals("")) {
                    AddDrugB.setEnabled(true);
                }
                else{
                    AddDrugB.setEnabled(false);
                }

            }
        });
        PrescriptionSearchT1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(PrescriptionTable,PrescriptionSearchT1);
                if(PrescriptionTable.getRowCount()==1){
                    RemovePrescirptionB1.setEnabled(true);
                }
                else{
                    RemovePrescirptionB1.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(PrescriptionTable,PrescriptionSearchT1);
                if(PrescriptionTable.getRowCount()==1){
                    RemovePrescirptionB1.setEnabled(true);
                }
                else{
                    RemovePrescirptionB1.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(PrescriptionTable,PrescriptionSearchT1);
                if(PrescriptionTable.getRowCount()==1){
                    RemovePrescirptionB1.setEnabled(true);
                }
                else{
                    RemovePrescirptionB1.setEnabled(false);
                }
            }
        });

        RemovePrescirptionB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeDrugFromPrescription();
            }
        });
        AddDrugB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddDrugAction(evt);
            }
        });
        ListAllDrugsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DrugSearchT.setText("");
                AmountfieldT.setText("");
            }
        });
        ListAllPrescriptionsB1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                PrescriptionSearchT1.setText("");
            }
        });

        CreatePrescriptionB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                createPrescription();
            }
        });
        CancelPrescriptionB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                create.dispose();
            }
        });
    }
    private void removeDrugFromPrescription() {
        DefaultTableModel tableModel= (DefaultTableModel) PrescriptionTable.getModel();
        tableModel.removeRow(PrescriptionTable.getRowSorter().convertRowIndexToModel(0));
        PrescriptionSearchT1.setText("");
    }
    private void createPrescription() {
        if(editing){
            Prescription test= prescriptionAPI.findPrescriptionByPatientIdAndDoctorID(
                    Integer.parseInt(PatientTempID.getText()),userAccount.getId());
            drugListAPI.deleteDrugListById(test.getDrugListId());
            for (int i = 0; i < PrescriptionTable.getRowCount(); i++) {
                drugListAPI.insertDrugList(test.getDrugListId(),
                        Integer.valueOf(PrescriptionTable.getValueAt(i, 0).toString()),
                        Integer.valueOf(PrescriptionTable.getValueAt(i, 2).toString()));
            }

        }
        else{
            Prescription prescription = new Prescription();
            prescription.setDoctorID(userAccount.getId());
            prescription.setPatientName(PatientTempName.getText());
            prescription.setPatientId(Integer.parseInt(PatientTempID.getText()));
            prescription.setNote(NoteTextArea.getText());
            active_DrugListID = prescriptionAPI.addPrescription(prescription);
            for (int i = 0; i < PrescriptionTable.getRowCount(); i++) {
                drugListAPI.insertDrugList(active_DrugListID,
                        Integer.valueOf(PrescriptionTable.getValueAt(i, 0).toString()),
                        Integer.valueOf(PrescriptionTable.getValueAt(i, 2).toString()));
            }
        }
        create.dispose();

        jTextField7.setText("");
        PatientTableFiller();
    }
    private void AddDrugAction(ActionEvent evt)  {
        int id=Integer.valueOf(DrugListTable.getValueAt(0,0).toString());
        String drugName=DrugListTable.getValueAt(0,1).toString();
        int newAmount= Integer.parseInt(AmountfieldT.getText());

        System.out.println("id "+ id+" drugname "+drugName);
        DefaultTableModel model = (DefaultTableModel) PrescriptionTable.getModel();
        boolean available=false;
        for(int i=0; i<PrescriptionTable.getRowCount();i++){
            if(id==Integer.valueOf(PrescriptionTable.getValueAt(i,0).toString())){
                int oldAmount= Integer.valueOf(PrescriptionTable.getValueAt(i,2).toString());
                System.out.println("newAmount "+ newAmount+" oldAmount "+oldAmount);
                PrescriptionTable.setValueAt(oldAmount+newAmount,i,2);
                available=true;
            }
        }
        if(!available){
            model.addRow(new Object[]{id,drugName,AmountfieldT.getText()
            });
        }
        DrugSearchT.setText("");
        AmountfieldT.setText("");

    /*//todo: when pressing add to a drug that is already on prescription, we should increase the amount of throw and error

        TableModel drugtable = DrugListTable.getModel();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) PrescriptionTable.getModel();
        int id=Integer.valueOf(drugtable.getValueAt(0,0).toString());
        int amount=Integer.parseInt(AmountfieldT.getText());
        drugListDao.insertDrugList(active_DrugListID,id, amount);
        PrescrptionTableFiller();*/
    }
    private void EditBActionPerformed(ActionEvent evt) {}




    private void AddPatientBActionPerformed() {

        Patient patient=new Patient();
        patient.setName(PatientNameT.getText());
        patient.setId(Integer.parseInt(PatientIDT.getText()));
        patientAPI.save(patient);
        PatientTableFiller();
    }

    private void DeletePatientBActionPerformed(ActionEvent evt) {
        TableModel tm = PatientTable.getModel();
        int id = Integer.parseInt(tm.getValueAt(0, 0).toString());
        patientAPI.deletePatientById(id);
        PatientTable.removeAll();
        DeletePatientB.setEnabled(false);
        PatientTableFiller();
    }

    private void DeletePrescriptionBActionPerformed(ActionEvent evt) {
        int PatientId=Integer.valueOf(PatientTable.getValueAt(0,0).toString());
        Prescription prescription=prescriptionAPI.findPrescriptionByPatientIdAndDoctorID(PatientId,userAccount.getId());

        drugListAPI.deleteDrugListById(prescription.getDrugListId());
        prescriptionAPI.deletePrescriptionbyId(prescription.getPrescriptionId());
        PatientTableFiller();
    }

    private void PatientIDTActionPerformed(ActionEvent evt) {

    }

    private void PatientNameTActionPerformed(ActionEvent evt) {

    }

    private void DoctorBActionPerformed(java.awt.event.ActionEvent evt) {
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false);

    }

    private void DoctorBMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void DoctorBMouseClicked1(java.awt.event.MouseEvent evt) {

    }

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        userLogin.setEnabled(true);
        userLogin.setVisible(true);
    }

    //table fillers here:-
    private void PatientTableFiller(){
        DeletePatientB.setEnabled(false);
        CreateB.setEnabled(false);
        EditB.setEnabled(false);
        DeletePrescriptionB.setEnabled(false);
        List<Patient> temp = patientAPI.findAll();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) PatientTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[3];

        for(int i=0;i<temp.size();i++){
            rowData[0]=temp.get(i).getId();
            rowData[1]=temp.get(i).getName();
            rowData[2]= prescriptionAPI.sumOfPrescriptionByPatientID(temp.get(i).getId(),userAccount.getId());
            model.addRow(rowData);
        }
    }
    private void DrugTableFiller(){
        List<Drug> temp = drugAPI.DrugList();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) DrugListTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[2];

        for(int i=0;i<temp.size();i++){
            rowData[1]=temp.get(i).getDrugName();
            rowData[0]=temp.get(i).getDrugID();
            model.addRow(rowData);
        }
    }
    private void TableFilter(JTable table,JTextField textField) {
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        String text = textField.getText();
        if(text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {
                int col=0;
                sorter.setRowFilter(RowFilter.regexFilter("^(?i)"+text+"$",col));
            } catch(PatternSyntaxException pse) {
                System.out.println("Bad regex pattern");
            }
        }
    }
    private void PrescrptionTableFiller()  {
        RemovePrescirptionB1.setEnabled(false);
        List<DrugList> temp = drugListAPI.findDrugList(active_DrugListID);
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) PrescriptionTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[3];
        try {
            for (int i = 0; i < temp.size(); i++) {
                rowData[0] = temp.get(i).getDrugID();
                rowData[1] = drugAPI.findDrugByID(temp.get(i).getDrugID()).getDrugName();
                rowData[2] = temp.get(i).getAmount();
                model.addRow(rowData);
            }
        }catch (Exception e){
            //todo ignore??
        }
    }

    //TODO:: Edit account settings Beginning::
    private javax.swing.JPanel AccountSettingsPanel;
    private javax.swing.JButton CancelPasswordChange;
    private javax.swing.JButton ConfirmPasswordChange;
    private javax.swing.JLabel DrugIdLabel1;
    private javax.swing.JLabel DrugNameLabel1;
    private javax.swing.JLabel OldPasswordLabel;
    private javax.swing.JLabel TempUserId;
    private javax.swing.JLabel TempUserName;
    private javax.swing.JTextField newPassword;
    private javax.swing.JTextField newPassword1;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JLabel newPasswordLabel1;
    private javax.swing.JTextField oldPassword;
    private void EditAccount(){
        {
            JFrame edit=new JFrame();
            edit.setVisible(true);
            edit.setEnabled(true);
            java.awt.GridBagConstraints gridBagConstraints;

            AccountSettingsPanel = new javax.swing.JPanel();
            DrugNameLabel1 = new javax.swing.JLabel();
            TempUserName = new javax.swing.JLabel();
            DrugIdLabel1 = new javax.swing.JLabel();
            newPasswordLabel1 = new javax.swing.JLabel();
            TempUserId = new javax.swing.JLabel();
            ConfirmPasswordChange = new javax.swing.JButton();
            CancelPasswordChange = new javax.swing.JButton();
            OldPasswordLabel = new javax.swing.JLabel();
            newPasswordLabel = new javax.swing.JLabel();
            oldPassword = new javax.swing.JTextField();
            newPassword = new javax.swing.JTextField();
            newPassword1 = new javax.swing.JTextField();


            edit.setResizable(false);
            edit.getContentPane().setLayout(new java.awt.GridBagLayout());

            AccountSettingsPanel.setLayout(new java.awt.GridBagLayout());

            DrugNameLabel1.setText("Username");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 10;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(DrugNameLabel1, gridBagConstraints);

            TempUserName.setText(userAccount.getUsername());
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.ipadx = 57;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(TempUserName, gridBagConstraints);

            DrugIdLabel1.setText("UserId");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.ipadx = 21;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(DrugIdLabel1, gridBagConstraints);

            newPasswordLabel1.setText("Confirm Password");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.ipadx = 21;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            AccountSettingsPanel.add(newPasswordLabel1, gridBagConstraints);

            TempUserId.setText(String.valueOf(userAccount.getId()));
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.ipadx = 78;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(TempUserId, gridBagConstraints);

            ConfirmPasswordChange.setText("Confirm");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
            AccountSettingsPanel.add(ConfirmPasswordChange, gridBagConstraints);

            CancelPasswordChange.setText("Cancel");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
            AccountSettingsPanel.add(CancelPasswordChange, gridBagConstraints);

            OldPasswordLabel.setText("Old Password");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            AccountSettingsPanel.add(OldPasswordLabel, gridBagConstraints);

            newPasswordLabel.setText("New Password");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.ipadx = 21;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
            AccountSettingsPanel.add(newPasswordLabel, gridBagConstraints);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            AccountSettingsPanel.add(oldPassword, gridBagConstraints);

            newPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 3;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            AccountSettingsPanel.add(newPassword, gridBagConstraints);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 4;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
            AccountSettingsPanel.add(newPassword1, gridBagConstraints);
            AccountSettingsPanel.setBorder(new EmptyBorder(5,5,5,5));
            edit.getContentPane().add(AccountSettingsPanel, new java.awt.GridBagConstraints());
            edit.pack();
            ConfirmPasswordChange.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oldPassword.getText().equals(userAccount.getPassword()) && newPassword.getText().equals(newPassword1.getText())){
                        userAccountAPI.updatePassword(userAccount.getUsername(),newPassword.getText());
                        JOptionPane.showMessageDialog(edit, "Password change successfully!");
                        edit.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(edit, "Check your inputs!");
                        oldPassword.setText("");
                        newPassword.setText("");
                        newPassword1.setText("");
                    }
                }
            });
            edit.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    edit.dispose();
                }
            });
            CancelPasswordChange.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    edit.dispose();
                }
            });
        }
    }
    //TODO: Edit account settings end::

}

