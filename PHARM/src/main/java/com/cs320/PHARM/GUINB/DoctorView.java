package com.cs320.PHARM.GUINB;

import com.cs320.PHARM.api.*;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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


    private UserAccount userAccount;
    public static void main(String args[]) {
        JFrame frame=new DoctorView();
        frame.setVisible(true);
        frame.setEnabled(true);
    }

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

    public void initializeObject(UserAccount userAccount,UserLogin userLogin) {
        this.setVisible(true);
        this.setEnabled(true);
        this.userAccount=userAccount;
        this.userLogin=userLogin;
        NameTextField.setText(userAccount.getUsername());
    }
    public DoctorView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
        DoctorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorBActionPerformed(evt);
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
        EditB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBActionPerformed(evt);
            }
        });

        DeletePrescriptionB.setText("Delete Prescription");
        DeletePrescriptionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePrescriptionBActionPerformed(evt);
            }
        });

        DeletePatientB.setText("Delete Patient");
        DeletePatientB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePatientBActionPerformed(evt);
            }
        });

        jLabel14.setText("Manage Prescriptions:");

        ListAllB.setText("List All");
        ListAllB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                PatientTableFiller();
            }
        });

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

        PatientNameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientNameTActionPerformed(evt);
            }
        });

        AddPatientB.setText("Add Patient");
        AddPatientB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPatientBActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient ID");

        PatientIDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDTActionPerformed(evt);
            }
        });

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
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel2.add(Logout);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanel3.add(jPanel2, gridBagConstraints);


        jPanel3.setBorder(new EmptyBorder(5,5,5,5));
        getContentPane().add(jPanel3, new java.awt.GridBagConstraints());
        CreateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                createFrame();
            }
        });
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
    }
    private void createFrame() {
        //todo: new jframe will be created for creating prescription.
    }
    private void EditBActionPerformed(ActionEvent evt) {}




    private void AddPatientBActionPerformed(ActionEvent evt) {}

    private void DeletePatientBActionPerformed(ActionEvent evt) {}

    private void DeletePrescriptionBActionPerformed(ActionEvent evt) {}

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

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {}


    private void PatientTableFiller(){}

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

