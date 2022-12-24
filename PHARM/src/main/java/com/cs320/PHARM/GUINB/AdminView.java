package com.cs320.PHARM.GUINB;

import com.cs320.PHARM.api.*;
import com.cs320.PHARM.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.regex.PatternSyntaxException;

@Component
public class AdminView extends javax.swing.JFrame {
    //todo: Spring beans Beginning::
    @Autowired
    DoctorAPI doctorAPI;
    @Autowired
    PharmacyAPI pharmacyAPI;
    @Autowired
    PatientAPI patientAPI;
    @Autowired
    DrugAPI drugAPI;
    @Autowired
    UserAccountAPI userAccountAPI;
    @Autowired
    TransactionHistoryAPI transactionHistoryAPI;
    @Autowired
    PrescriptionAPI prescriptionAPI;
    @Autowired
    DrugListAPI drugListAPI;
    //Todo: Spring beans End::

    private UserLogin userLogin;
    private UserAccount userAccount;
    private JButton DoctorAddB;
    private JButton DoctorB;
    private JButton DoctorDeleteB;
    private JButton DoctorEditB;
    private JButton DoctorListALL1;
    private JTextField DoctorNameT;
    private JTextField DoctorSB;
    private JTable DoctorTable;
    private JButton DrugAddB;
    private JButton DrugDeleteB;
    private JButton DrugEditB;
    private JButton DrugListALL;
    private JTextField DrugNameT;
    private JTextField DrugSearchT;
    private JTable DrugTable;
    private JButton ListAllPatients;
    private JButton Logout;
    private JLabel NameTextField;
    private JButton PatientDeleteB;
    private JButton PatientEditB;
    private JTextField PatientSearchT;
    private JButton PatientsB;
    private JButton PharmaADDB;
    private JTextField PharmaNameT;
    private JButton PharmaciesB;
    private JButton PharmacyDeleteB;
    private JButton PharmacyEditB;
    private JButton PharmacyListAll;
    private JTextField PharmacySearchT;
    private JTable PharmacyTable;
    private JPanel bot;
    private JPanel bot1;
    private JPanel bot2;
    private JPanel bot3;
    private JPanel bot4;
    private JPanel doctorPanel;
    private JPanel drugPanel;
    private JButton drugsB;
    private JButton accountSettings;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLayeredPane jLayeredPane1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane2;
    private JScrollPane jScrollPane3;
    private JScrollPane jScrollPane4;
    private JScrollPane jScrollPane5;
    private JScrollPane jScrollPane6;
    private JTable PatientTable;
    private JPanel left;
    private JPanel left1;
    private JPanel left2;
    private JPanel left3;
    private JPanel left4;
    private JPanel patientPanel;
    private JPanel pharmacyPanel;
    private JPanel right;
    private JPanel right1;
    private JPanel right2;
    private JPanel top;
    private JPanel top1;
    private JPanel top2;
    private JPanel top3;
    private JPanel top4;

    //New Panel Transactions:
    private javax.swing.JButton TransactionDeleteB;

    private javax.swing.JPanel TransactionHistory;
    private javax.swing.JButton TransactionListAllB;
    private javax.swing.JButton TransactionReActivateB;
    private javax.swing.JTextField TransactionT1;
    private javax.swing.JTextField TransactionT2;
    private javax.swing.JTextField TransactionT3;
    private javax.swing.JTextField TransactionT4;
    private javax.swing.JTable TransactionTable;
    private javax.swing.JButton Transactions;

    //init and action listeners Beginning
    public void initializeObject(UserAccount userAccount,UserLogin userLogin) {
        this.userLogin=userLogin;
        this.userAccount=userAccount;
        this.setVisible(true);
        this.setEnabled(true);
        NameTextField.setText(userAccount.getUsername());
        this.drugPanel.setVisible(false);
        this.drugPanel.setEnabled(false);
        this.doctorPanel.setEnabled(true);
        this.doctorPanel.setVisible(true);
    }
    public AdminView() {
        initComponents();
    }
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel3 = new JPanel();
        jPanel1 = new JPanel();
        DoctorB = new JButton();
        PharmaciesB = new JButton();
        drugsB = new JButton();
        PatientsB = new JButton();
        jLayeredPane1 = new JLayeredPane();
        drugPanel = new JPanel();
        top = new JPanel();
        jScrollPane2 = new JScrollPane();
        DrugTable = new JTable();
        bot = new JPanel();
        left = new JPanel();
        jLabel2 = new JLabel();
        DrugSearchT = new JTextField();
        DrugEditB = new JButton();
        DrugDeleteB = new JButton();
        DrugListALL = new JButton();
        right = new JPanel();
        jLabel3 = new JLabel();
        DrugNameT = new JTextField();
        DrugAddB = new JButton();
        doctorPanel = new JPanel();
        top1 = new JPanel();
        jScrollPane3 = new JScrollPane();
        DoctorTable = new JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        bot1 = new JPanel();
        left1 = new JPanel();
        jLabel12 = new JLabel();
        DoctorSB = new JTextField();
        DoctorEditB = new JButton();
        DoctorDeleteB = new JButton();
        DoctorListALL1 = new JButton();
        right1 = new JPanel();
        jLabel5 = new JLabel();
        DoctorNameT = new JTextField();
        DoctorAddB = new JButton();
        pharmacyPanel = new JPanel();
        top2 = new JPanel();
        jScrollPane4 = new JScrollPane();
        PharmacyTable = new JTable();
        bot2 = new JPanel();
        left2 = new JPanel();
        jLabel13 = new JLabel();
        PharmacySearchT = new JTextField();
        PharmacyEditB = new JButton();
        PharmacyDeleteB = new JButton();
        PharmacyListAll = new JButton();
        right2 = new JPanel();
        jLabel7 = new JLabel();
        PharmaNameT = new JTextField();
        PharmaADDB = new JButton();
        patientPanel = new JPanel();
        top3 = new JPanel();
        jScrollPane5 = new JScrollPane();
        PatientTable = new JTable()
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            };
        };
        bot3 = new JPanel();
        left3 = new JPanel();
        jLabel8 = new JLabel();
        PatientSearchT = new JTextField();
        PatientEditB = new JButton();
        PatientDeleteB = new JButton();
        ListAllPatients = new JButton();
        jPanel2 = new JPanel();
        jLabel10 = new JLabel();
        NameTextField = new JLabel();
        jLabel9 = new JLabel();
        jLabel11 = new JLabel();
        accountSettings = new JButton();
        Logout = new JButton();

        Transactions = new javax.swing.JButton();
        TransactionHistory = new javax.swing.JPanel();
        top4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TransactionTable = new javax.swing.JTable();
        bot4 = new javax.swing.JPanel();
        left4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TransactionT1 = new javax.swing.JTextField();

        TransactionDeleteB = new javax.swing.JButton();
        TransactionListAllB = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        TransactionT2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TransactionT3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TransactionT4 = new javax.swing.JTextField();
        TransactionReActivateB = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new Color(255, 255, 255));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setSize(getMaximumSize());
        getContentPane().setLayout(new GridBagLayout());

        jPanel3.setLayout(new GridBagLayout());

        jPanel1.setLayout(new GridLayout(5, 1));

        DoctorB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        DoctorB.setText("Doctors");
        DoctorB.setAlignmentY(0.0F);
        DoctorB.setBorder(BorderFactory.createEtchedBorder());


        jPanel1.add(DoctorB);

        PharmaciesB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        PharmaciesB.setText("Pharmacies");
        PharmaciesB.setAlignmentY(0.0F);
        PharmaciesB.setBorder(BorderFactory.createEtchedBorder());

        jPanel1.add(PharmaciesB);

        drugsB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        drugsB.setText("Drugs");
        drugsB.setAlignmentY(0.0F);
        drugsB.setBorder(BorderFactory.createEtchedBorder());

        jPanel1.add(drugsB);

        PatientsB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        PatientsB.setText("Patients");
        PatientsB.setAlignmentY(0.0F);
        PatientsB.setBorder(BorderFactory.createEtchedBorder());

        jPanel1.add(PatientsB);

        Transactions.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Transactions.setText("Transactions");
        Transactions.setAlignmentY(0.0F);
        Transactions.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Transactions);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(175, 0, 100, 0);
        jPanel3.add(jPanel1, gridBagConstraints);

        jLayeredPane1.setBackground(new Color(255, 255, 255));
        jLayeredPane1.setLayout(new CardLayout());

        drugPanel.setLayout(new BoxLayout(drugPanel, BoxLayout.PAGE_AXIS));

        top.setLayout(new BorderLayout());

        DrugTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Drug ID","Drug Name"
                }
        ));

        jScrollPane2.setViewportView(DrugTable);

        top.add(jScrollPane2, BorderLayout.CENTER);

        drugPanel.add(top);

        bot.setLayout(new GridLayout(1, 0));

        jLabel2.setText("Search By ID");


        DrugEditB.setText("Edit");

        DrugDeleteB.setText("Delete");

        DrugListALL.setText("List All");

        GroupLayout leftLayout = new GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
                leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(leftLayout.createSequentialGroup()
                                                .addComponent(DrugEditB)
                                                .addGap(41, 41, 41)
                                                .addComponent(DrugDeleteB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(DrugListALL, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(DrugSearchT, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );
        leftLayout.setVerticalGroup(
                leftLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(leftLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(DrugSearchT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(leftLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(DrugEditB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DrugDeleteB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DrugListALL, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        bot.add(left);

        jLabel3.setText("Drug Name");

        DrugAddB.setText("Add");


        GroupLayout rightLayout = new GroupLayout(right);
        right.setLayout(rightLayout);
        rightLayout.setHorizontalGroup(
                rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DrugNameT, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                        .addGroup(GroupLayout.Alignment.TRAILING, rightLayout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(DrugAddB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(170, 170, 170))
        );
        rightLayout.setVerticalGroup(
                rightLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(rightLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(rightLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(DrugNameT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DrugAddB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
        );

        bot.add(right);

        drugPanel.add(bot);

        jLayeredPane1.add(drugPanel, "card2");

        doctorPanel.setLayout(new BoxLayout(doctorPanel, BoxLayout.PAGE_AXIS));

        top1.setLayout(new BorderLayout());

        DoctorTable.setModel(new DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Doctor ID", "Doctor Name"
                }
        ) {
            Class[] types = new Class [] {
                    String.class, Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(DoctorTable);

        top1.add(jScrollPane3, BorderLayout.CENTER);

        doctorPanel.add(top1);

        bot1.setLayout(new GridLayout(1, 0));

        jLabel12.setText("Search By ID");


        DoctorEditB.setText("Edit");

        DoctorDeleteB.setText("Delete");

        DoctorListALL1.setText("List All");

        GroupLayout left1Layout = new GroupLayout(left1);
        left1.setLayout(left1Layout);
        left1Layout.setHorizontalGroup(
                left1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, left1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(left1Layout.createSequentialGroup()
                                                .addComponent(DoctorEditB)
                                                .addGap(41, 41, 41)
                                                .addComponent(DoctorDeleteB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(DoctorListALL1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(DoctorSB, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );
        left1Layout.setVerticalGroup(
                left1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(left1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(left1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(DoctorSB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(DoctorEditB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DoctorDeleteB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DoctorListALL1, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        bot1.add(left1);

        jLabel5.setText("Doctor Name");

        DoctorAddB.setText("Add");


        GroupLayout right1Layout = new GroupLayout(right1);
        right1.setLayout(right1Layout);
        right1Layout.setHorizontalGroup(
                right1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(right1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DoctorNameT, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                        .addGroup(GroupLayout.Alignment.TRAILING, right1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(DoctorAddB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(170, 170, 170))
        );
        right1Layout.setVerticalGroup(
                right1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(right1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(right1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(DoctorNameT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DoctorAddB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
        );

        bot1.add(right1);

        doctorPanel.add(bot1);

        jLayeredPane1.add(doctorPanel, "card4");

        pharmacyPanel.setLayout(new BoxLayout(pharmacyPanel, BoxLayout.PAGE_AXIS));

        top2.setLayout(new BorderLayout());

        PharmacyTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Pharmacy ID",  "Pharmacy Name"
                }
        ));
        jScrollPane4.setViewportView(PharmacyTable);

        top2.add(jScrollPane4, BorderLayout.CENTER);

        pharmacyPanel.add(top2);

        bot2.setLayout(new GridLayout(1, 0));

        jLabel13.setText("Search By ID");


        PharmacyEditB.setText("Edit");

        PharmacyDeleteB.setText("Delete");

        PharmacyListAll.setText("List All");

        GroupLayout left2Layout = new GroupLayout(left2);
        left2.setLayout(left2Layout);
        left2Layout.setHorizontalGroup(
                left2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, left2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(left2Layout.createSequentialGroup()
                                                .addComponent(PharmacyEditB)
                                                .addGap(41, 41, 41)
                                                .addComponent(PharmacyDeleteB, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(PharmacyListAll, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(PharmacySearchT, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );
        left2Layout.setVerticalGroup(
                left2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(left2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(left2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(PharmacySearchT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(PharmacyEditB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PharmacyDeleteB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PharmacyListAll, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        bot2.add(left2);

        jLabel7.setText("Pharmacy Name");

        PharmaADDB.setText("Add");


        GroupLayout right2Layout = new GroupLayout(right2);
        right2.setLayout(right2Layout);
        right2Layout.setHorizontalGroup(
                right2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(right2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PharmaNameT, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                        .addGroup(GroupLayout.Alignment.TRAILING, right2Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(PharmaADDB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(170, 170, 170))
        );
        right2Layout.setVerticalGroup(
                right2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(right2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(right2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(PharmaNameT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PharmaADDB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
        );

        bot2.add(right2);

        pharmacyPanel.add(bot2);

        jLayeredPane1.add(pharmacyPanel, "card5");

        patientPanel.setLayout(new BoxLayout(patientPanel, BoxLayout.PAGE_AXIS));

        top3.setLayout(new BorderLayout());

        jScrollPane5.setBackground(new Color(255, 255, 255));

        PatientTable.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "ID", "Patient Name"
                }
        ) {
            Class[] types = new Class [] {
                    Integer.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(PatientTable);

        top3.add(jScrollPane5, BorderLayout.CENTER);

        patientPanel.add(top3);

        bot3.setBackground(new Color(204, 204, 255));
        bot3.setForeground(new Color(204, 204, 255));
        bot3.setLayout(new GridLayout(1, 0));

        jLabel8.setText("Search By ID");


        PatientEditB.setText("Edit");

        PatientDeleteB.setText("Delete");

        ListAllPatients.setText("List All");


        GroupLayout left3Layout = new GroupLayout(left3);
        left3.setLayout(left3Layout);
        left3Layout.setHorizontalGroup(
                left3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, left3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(left3Layout.createSequentialGroup()
                                                .addComponent(PatientEditB, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(PatientDeleteB, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(ListAllPatients, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(PatientSearchT, GroupLayout.PREFERRED_SIZE, 705, GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))
        );
        left3Layout.setVerticalGroup(
                left3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(left3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(left3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(PatientSearchT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(PatientEditB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PatientDeleteB, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ListAllPatients, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16))
        );

        bot3.add(left3);

        patientPanel.add(bot3);

        jLayeredPane1.add(patientPanel, "card2");

        TransactionHistory.setLayout(new javax.swing.BoxLayout(TransactionHistory, javax.swing.BoxLayout.Y_AXIS));

        top4.setLayout(new java.awt.BorderLayout());

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));

        TransactionTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "Transaction ID","Prescription ID","Doctor ID","Patient ID","Pharmacy ID","Drug ID","Amount","Doctor Name","Patient Name","Pharmacy Name"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class,
                    java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false,false,false,false,false,false,false,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        jScrollPane6.setViewportView(TransactionTable);
        if (TransactionTable.getColumnModel().getColumnCount() > 0) {
            TransactionTable.getColumnModel().getColumn(0).setResizable(false);
            TransactionTable.getColumnModel().getColumn(1).setResizable(false);
        }

        top4.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        TransactionHistory.add(top4);

        bot4.setBackground(new java.awt.Color(204, 204, 255));
        bot4.setForeground(new java.awt.Color(204, 204, 255));
        bot4.setLayout(new java.awt.GridLayout());

        jLabel14.setText("Search By TransactionID");




        TransactionDeleteB.setText("Delete");

        TransactionListAllB.setText("List All");


        jLabel15.setText("Search By Patient ID");


        jLabel16.setText("Search By Doctor ID");


        jLabel17.setText("Search By Pharmacy ID");



        TransactionReActivateB.setText("ReActivate");


        javax.swing.GroupLayout left4Layout = new javax.swing.GroupLayout(left4);
        left4.setLayout(left4Layout);
        left4Layout.setHorizontalGroup(
                left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(left4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(left4Layout.createSequentialGroup()
                                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(21, 21, 21))
                                        .addGroup(left4Layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(19, 19, 19)))
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TransactionT1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                        .addComponent(TransactionT2)
                                        .addComponent(TransactionT3)
                                        .addComponent(TransactionT4))

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TransactionListAllB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TransactionReActivateB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TransactionDeleteB)
                                .addGap(50, 50, 50))
        );
        left4Layout.setVerticalGroup(
                left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(left4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(TransactionT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TransactionT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TransactionT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(TransactionT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                        .addGroup(left4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(left4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TransactionListAllB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TransactionReActivateB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TransactionDeleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        bot4.add(left4);

        TransactionHistory.add(bot4);

        jLayeredPane1.add(TransactionHistory, "card6");


        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 10, 10, 10);
        jPanel3.add(jLayeredPane1, gridBagConstraints);

        jPanel2.setLayout(new GridLayout(4, 2));

        jLabel10.setText("Name:                   ");
        jPanel2.add(jLabel10);

        NameTextField.setText("temp");

        jPanel2.add(NameTextField);

        jLabel9.setText("Account type:");
        jPanel2.add(jLabel9);

        jLabel11.setText("Administrator");
        jPanel2.add(jLabel11);

        accountSettings.setText("Account settings");
        jPanel2.add(accountSettings);

        Logout.setText("Logout");

        jPanel2.add(Logout);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(50, 0, 0, 0);
        jPanel3.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel3, new GridBagConstraints());

        DoctorTable.setDefaultEditor(Object.class, null);
        PatientTable.setDefaultEditor(Object.class, null);
        PharmacyTable.setDefaultEditor(Object.class, null);
        DrugTable.setDefaultEditor(Object.class, null);

        DoctorEditB.setEnabled(false);


        actionListeners();
        pack();

    }
    private void actionListeners(){

        //Panels:
        DoctorB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorBActionPerformed(evt);
                resetDoctor();
            }
        });
        PharmaciesB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmaciesBActionPerformed(evt);
                resetPharmacies();
            }
        });
        drugsB.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                drugsBActionPerformed(evt);
                resetDrug();
            }
        });
        PatientsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PatientsBActionPerformed(evt);
                resetPatient();
            }
        });
        Transactions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TransactionsActionPerformed();
            }
        });


        //Search text fields (I REMOVED ACTION LISTENER SO WE CAN FILTER ACTUALLY)
        PharmacySearchT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(PharmacyTable,PharmacySearchT);
                if(PharmacyTable.getRowCount()==1){
                    PharmacyEditB.setEnabled(true);
                    PharmacyDeleteB.setEnabled(true);
                }
                else{
                    PharmacyEditB.setEnabled(false);
                    PharmacyDeleteB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(PharmacyTable,PharmacySearchT);
                if(PharmacyTable.getRowCount()==1){
                    PharmacyEditB.setEnabled(true);
                    PharmacyDeleteB.setEnabled(true);
                }
                else{
                    PharmacyEditB.setEnabled(false);
                    PharmacyDeleteB.setEnabled(false);
                }

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(PharmacyTable,PharmacySearchT);
                if(PharmacyTable.getRowCount()==1){
                    PharmacyEditB.setEnabled(true);
                    PharmacyDeleteB.setEnabled(true);
                }
                else{
                    PharmacyEditB.setEnabled(false);
                    PharmacyDeleteB.setEnabled(false);
                }
            }
        });
        DrugSearchT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(DrugTable,DrugSearchT);
                if(DrugTable.getRowCount()==1){
                    DrugDeleteB.setEnabled(true);
                    DrugEditB.setEnabled(true);
                }
                else{
                    DrugDeleteB.setEnabled(false);
                    DrugEditB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(DrugTable,DrugSearchT);
                if(DrugTable.getRowCount()==1){
                    DrugDeleteB.setEnabled(true);
                    DrugEditB.setEnabled(true);
                }
                else{
                    DrugDeleteB.setEnabled(false);
                    DrugEditB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(DrugTable,DrugSearchT);
                if(DrugTable.getRowCount()==1){
                    DrugDeleteB.setEnabled(true);
                    DrugEditB.setEnabled(true);
                }
                else{
                    DrugDeleteB.setEnabled(false);
                    DrugEditB.setEnabled(false);
                }
            }
        });
        DoctorSB.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(DoctorTable,DoctorSB);
                if(DoctorTable.getRowCount()==1){
                    DoctorEditB.setEnabled(true);
                    DoctorDeleteB.setEnabled(true);
                }
                else{
                    DoctorEditB.setEnabled(false);
                    DoctorDeleteB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(DoctorTable,DoctorSB);
                if(DoctorTable.getRowCount()==1){
                    DoctorEditB.setEnabled(true);
                    DoctorDeleteB.setEnabled(true);
                }
                else{
                    DoctorEditB.setEnabled(false);
                    DoctorDeleteB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(DoctorTable,DoctorSB);
                if(DoctorTable.getRowCount()==1){
                    DoctorEditB.setEnabled(true);
                    DoctorDeleteB.setEnabled(true);
                }
                else{
                    DoctorEditB.setEnabled(false);
                    DoctorDeleteB.setEnabled(false);
                }
            }
        });
        PatientSearchT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(PatientTable,PatientSearchT);
                if(PatientTable.getRowCount()==1){
                    PatientDeleteB.setEnabled(true);
                    PatientEditB.setEnabled(true);
                }
                else{
                    PatientDeleteB.setEnabled(false);
                    PatientEditB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(PatientTable,PatientSearchT);
                if(PatientTable.getRowCount()==1){
                    PatientDeleteB.setEnabled(true);
                    PatientEditB.setEnabled(true);
                }
                else{
                    PatientDeleteB.setEnabled(false);
                    PatientEditB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(PatientTable,PatientSearchT);
                if(PatientTable.getRowCount()==1){
                    PatientDeleteB.setEnabled(true);
                    PatientEditB.setEnabled(true);
                }
                else{
                    PatientDeleteB.setEnabled(false);
                    PatientEditB.setEnabled(false);
                }
            }
        });
        TransactionT1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TransactionFilters(TransactionTable, TransactionT1,0);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TransactionFilters(TransactionTable, TransactionT1,0);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TransactionFilters(TransactionTable, TransactionT1,0);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }
        });
        TransactionT2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TransactionFilters(TransactionTable, TransactionT2,3);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
                TransactionT1.setText("");
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT2,3);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT2,3);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }
        });
        TransactionT3.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT3,2);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT3,2);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT3,2);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }
        });
        TransactionT4.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT4,4);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT4,4);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TransactionT1.setText("");
                TransactionFilters(TransactionTable, TransactionT4,4);
                if(TransactionTable.getRowCount()==1){
                    TransactionDeleteB.setEnabled(true);
                    TransactionReActivateB.setEnabled(true);
                }
                else{
                    TransactionDeleteB.setEnabled(false);
                    TransactionReActivateB.setEnabled(false);
                }
            }
        });

        //adding text enables ADD Done
        DoctorNameT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!DoctorNameT.getText().equals("")) {
                    DoctorAddB.setEnabled(true);
                } else {
                    DoctorAddB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!DoctorNameT.getText().equals("")) {
                    DoctorAddB.setEnabled(true);
                } else {
                    DoctorAddB.setEnabled(false);
                }

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (!DoctorNameT.getText().equals("")) {
                    DoctorAddB.setEnabled(true);
                } else {
                    DoctorAddB.setEnabled(false);
                }
            }
        });
        DrugNameT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!DrugNameT.getText().equals("")) {
                    DrugAddB.setEnabled(true);
                } else {
                    DrugAddB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!DrugNameT.getText().equals("")) {
                    DrugAddB.setEnabled(true);
                } else {
                    DrugAddB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (!DrugNameT.getText().equals("")) {
                    DrugAddB.setEnabled(true);
                } else {
                    DrugAddB.setEnabled(false);
                }
            }
        });
        PharmaNameT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!PharmaNameT.getText().equals("")) {
                    PharmaADDB.setEnabled(true);
                } else {
                    PharmaADDB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!PharmaNameT.getText().equals("")) {
                    PharmaADDB.setEnabled(true);
                } else {
                    PharmaADDB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (!PharmaNameT.getText().equals("")) {
                    PharmaADDB.setEnabled(true);
                } else {
                    PharmaADDB.setEnabled(false);
                }
            }
        });

        //Adding
        DrugAddB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DrugAddBActionPerformed(evt);
            }
        });
        DoctorAddB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorAddBActionPerformed(evt);
            }
        });
        PharmaADDB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmaADDBActionPerformed(evt);
            }
        });

        //List all
        ListAllPatients.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ListAllPatientsActionPerformed(evt);
            }
        });
        DoctorListALL1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorListallAction();
            }
        });
        DrugListALL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DrugListallAction();
            }
        });
        PharmacyListAll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmacyListallAction();
            }
        });
        TransactionListAllB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetTransactionHistory();
            }
        });

        //Delete
        DoctorDeleteB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorDeleteAction();
            }
        });
        PharmacyDeleteB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmacyDeleteAction();
            }


        });
        PatientDeleteB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PatientDeleteB();
            }
        });
        DrugDeleteB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DrugDeleteAction();
            }
        });
        TransactionDeleteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTransactionHistory();
            }
        });

        //Edit
        DoctorEditB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorEditAction();
            }
        });
        PatientEditB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PatientEditAction();
            }
        });
        PharmacyEditB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmacyEditBAction();
            }
        });
        DrugEditB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DrugEditBAction();
            }
        });
        TransactionReActivateB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reActivateTransaction();
            }
        });

        //Key Listeners (To not allow letters in id sections or numbers in letter sections
        DrugSearchT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        PharmacySearchT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        PatientSearchT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        DoctorSB.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        DoctorNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        DrugNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        PharmaNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        TransactionT1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        TransactionT2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        TransactionT3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
        TransactionT4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

        DrugTable.getTableHeader().setReorderingAllowed(false);
        PatientTable.getTableHeader().setReorderingAllowed(false);
        PharmacyTable.getTableHeader().setReorderingAllowed(false);
        DoctorTable.getTableHeader().setReorderingAllowed(false);



        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        accountSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAccount();
            }
        });
    }


    //init and action listeners end

    //Adding methods Beginning
    private void DrugAddBActionPerformed(java.awt.event.ActionEvent evt) {
        Drug drug=new Drug();
        drug.setDrugName(DrugNameT.getText());
        try{
            drugAPI.addDrug(drug);
        }
        catch(Exception e){
            //should we add something here? because sometimes we catch exceptions
        }
        resetDrug();
    }
    private void PharmaADDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmaADDBActionPerformed
        Pharmacy temp=new Pharmacy();
        temp.setPharmacyName(PharmaNameT.getText());
        pharmacyAPI.addPharmacy(temp);
        resetPharmacies();
    }
    private void DoctorAddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorAddBActionPerformed
        Doctor doctor = new Doctor();
        doctor.setDoctorName(DoctorNameT.getText());
        doctorAPI.addDoctor(doctor);
        resetDoctor();
    }
    //Adding methods END

    //Delete methods begins:
    private void PharmacyDeleteAction() {
        pharmacyAPI.deletePHarmacy(Integer.parseInt(PharmacyTable.getValueAt(0,0).toString()));
        resetPharmacies();
    }
    private void DoctorDeleteAction() {
        doctorAPI.deleteDoctor(Integer.parseInt(DoctorTable.getValueAt(0,0).toString()));
        resetDoctor();
    }
    private void DrugDeleteAction() {
        drugAPI.deleteDrug(Integer.parseInt(DrugTable.getValueAt(0,0).toString()));
        resetDrug();
    }
    private void PatientDeleteB() {
        patientAPI.deletePatientById(Integer.parseInt(PatientTable.getValueAt(0,0).toString()));
        resetPatient();
    }
    private void deleteTransactionHistory() {
        transactionHistoryAPI.deleteByID(Integer.parseInt(TransactionTable.getValueAt(0,0).toString()));
        resetTransactionHistory();
    }
    //Delete Methods ends:

    //Listing All methods;
    private void PharmacyListallAction() {
        resetPharmacies();
    }
    private void DrugListallAction() {
        resetDrug();
    }
    private void DoctorListallAction() {
        resetDoctor();
    }
    private void ListAllPatientsActionPerformed(ActionEvent evt) {
        resetPatient();
    }
    //Listing all end;

    //Switching pannels functions Beginning
    private void PharmaciesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmaciesBActionPerformed
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false );
        doctorPanel.setEnabled(false);
        doctorPanel.setVisible(false);
        pharmacyPanel.setEnabled(true);
        pharmacyPanel.setVisible(true);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
        TransactionHistory.setEnabled(false);
        TransactionHistory.setVisible(false);
        PharmacyTableFiller();
    }
    private void PatientsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientsBActionPerformed
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false );
        doctorPanel.setEnabled(false);
        doctorPanel.setVisible(false);
        pharmacyPanel.setEnabled(false);
        pharmacyPanel.setVisible(false);
        patientPanel.setEnabled(true);
        patientPanel.setVisible(true);
        TransactionHistory.setEnabled(false);
        TransactionHistory.setVisible(false);
        PatientTableFiller();
    }
    private void DoctorBActionPerformed(java.awt.event.ActionEvent evt) {
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false);
        doctorPanel.setEnabled(true);
        doctorPanel.setVisible(true);
        pharmacyPanel.setEnabled(false);
        pharmacyPanel.setVisible(false);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
        TransactionHistory.setEnabled(false);
        TransactionHistory.setVisible(false);
        DoctorTableFiller();
    }
    private void drugsBActionPerformed(java.awt.event.ActionEvent evt) {
        drugPanel.setEnabled(true);
        drugPanel.setVisible(true);
        doctorPanel.setEnabled(false);
        doctorPanel.setVisible(false);
        pharmacyPanel.setEnabled(false);
        pharmacyPanel.setVisible(false);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
        TransactionHistory.setEnabled(false);
        TransactionHistory.setVisible(false);
        DrugTableFiller();
    }
    private void TransactionsActionPerformed() {
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false);
        doctorPanel.setEnabled(false);
        doctorPanel.setVisible(false);
        pharmacyPanel.setEnabled(false);
        pharmacyPanel.setVisible(false);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
        TransactionHistory.setEnabled(true);
        TransactionHistory.setVisible(true);
        resetTransactionHistory();
    }

    //Switching pannels functions End

    //Table Fillers and Filters
    private void PharmacyTableFiller() {
        List<Pharmacy> pharmacyList=pharmacyAPI.PharmacyList();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) PharmacyTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[3];

        for(int i=0;i<pharmacyList.size();i++){
            rowData[1]=pharmacyList.get(i).getPharmacyName();
            rowData[0]=pharmacyList.get(i).getPharmacyID();
            rowData[2]=pharmacyList.get(i).getInventoryId();
            model.addRow(rowData);
        }
    }
    private void PatientTableFiller(){
        List<Patient> temp = patientAPI.findAll();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) PatientTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[2];

        for(int i=0;i<temp.size();i++){
            rowData[0]=temp.get(i).getId();
            rowData[1]=temp.get(i).getName();
            model.addRow(rowData);
        }
    }
    private void DoctorTableFiller() {
        List<Doctor> d=doctorAPI.DoctorList();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) DoctorTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[2];

        for(int i=0;i<d.size();i++){
            rowData[1]=d.get(i).getDoctorName();
            rowData[0]=d.get(i).getDoctorId();
            model.addRow(rowData);
        }
    }
    private void DrugTableFiller() {
        List<Drug> temp = drugAPI.DrugList();
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) DrugTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[2];

        for(int i=0;i<temp.size();i++){
            rowData[1]=temp.get(i).getDrugName();
            rowData[0]=temp.get(i).getDrugID();
            model.addRow(rowData);
        }
    }
    private void TransactionTableFiller() {
        List<TransactionHistory> temp = transactionHistoryAPI.ListAll();
        DefaultTableModel model = (javax.swing.table.DefaultTableModel) TransactionTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[10];

        for(int i=0;i<temp.size();i++){
            rowData[0]=temp.get(i).getTransactionhistoryId();
            rowData[1]=temp.get(i).getDrugListId();
            rowData[2]=temp.get(i).getDoctorId();
            rowData[3]=temp.get(i).getPatientID();
            rowData[4]=temp.get(i).getPharmacyId();
            rowData[5]=temp.get(i).getDrugID();
            rowData[6]=temp.get(i).getAmount_sold();
            rowData[7]=doctorAPI.findDoctorById(temp.get(i).getPharmacyId()).getDoctorName(); //doc name
            rowData[8]=patientAPI.findPatientById(temp.get(i).getPatientID()).getName(); //patient name
            rowData[9]=pharmacyAPI.findPharmacyByID(temp.get(i).getPharmacyId()).getPharmacyName();; //pharmacy name

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
    private void TransactionFilters(JTable table,JTextField textField,int col) {
        final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
        table.setRowSorter(sorter);
        String text = textField.getText();
        if(text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            try {

                sorter.setRowFilter(RowFilter.regexFilter("^(?i)"+text+"$",col));
            } catch(PatternSyntaxException pse) {
                System.out.println("Bad regex pattern");
            }
        }
    }
    //Table Fillers and Filters

    //Reset methods: (after clicking a tab a table is filled and all settings are reset to normal
    private void resetDoctor(){
        DoctorDeleteB.setEnabled(false);
        DoctorEditB.setEnabled(false);
        DoctorAddB.setEnabled(false);
        DoctorSB.setText("");
        DoctorNameT.setText("");
        DoctorTableFiller();
    }
    private void resetDrug(){
        DrugAddB.setEnabled(false);
        DrugEditB.setEnabled(false);
        DrugDeleteB.setEnabled(false);
        DrugNameT.setText("");
        DrugSearchT.setText("");
        DrugTableFiller();
    }
    private void resetPatient(){
        PatientEditB.setEnabled(false);
        PatientDeleteB.setEnabled(false);
        PatientSearchT.setText("");
        PatientTableFiller();
    }
    private void resetPharmacies(){
        PharmacyEditB.setEnabled(false);
        PharmacyDeleteB.setEnabled(false);
        PharmaADDB.setEnabled(false);
        PharmacySearchT.setText("");
        PharmaNameT.setText("");
        PharmacyTableFiller();

    }
    private void resetTransactionHistory() {
        TransactionDeleteB.setEnabled(false);
        TransactionReActivateB.setEnabled(false);
        TransactionT1.setText("");
        TransactionT2.setText("");
        TransactionT3.setText("");
        TransactionT4.setText("");
        TransactionTableFiller();
    }
    //Reset Methods end


    //TODO: editing frame for all panels
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel EditIDLabel;
    private javax.swing.JLabel EditNameLabel;
    private java.awt.TextField NewNameT;
    private javax.swing.JLabel jLabela;
    private javax.swing.JLabel jLabelb;
    private javax.swing.JLabel jLabelc;
    private void DrugEditBAction() {

        JFrame edit=new JFrame();

        edit.setEnabled(true);
        edit.setVisible(true);
        java.awt.GridBagConstraints gridBagConstraints;

        jLabela = new javax.swing.JLabel();
        jLabelb = new javax.swing.JLabel();
        EditNameLabel = new javax.swing.JLabel();
        EditIDLabel = new javax.swing.JLabel();
        jLabelc = new javax.swing.JLabel();
        NewNameT = new java.awt.TextField();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();


        EditNameLabel.setText(DrugTable.getValueAt(0,1).toString());
        EditIDLabel.setText(DrugTable.getValueAt(0,0).toString());

        edit.setResizable(false);
        edit.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabela.setText("Drug Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabela, gridBagConstraints);

        jLabelb.setText("New Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelb, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditNameLabel, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditIDLabel, gridBagConstraints);

        jLabelc.setText("Drug ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelc, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(NewNameT, gridBagConstraints);

        ConfirmButton.setText("Confirm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(ConfirmButton, gridBagConstraints);

        CancelButton.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(CancelButton, gridBagConstraints);
        edit.pack();
        edit.setSize(new Dimension(300,200));
        edit.setAlwaysOnTop(true);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Drug temp=new Drug();
                temp.setDrugName(NewNameT.getText());
                temp.setDrugID(Integer.parseInt(EditIDLabel.getText()));
                drugAPI.updateDrug(temp);
                edit.dispose();
                resetDrug();

            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit.dispose();
                resetDrug();
            }
        });
        NewNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });

    }
    private void PharmacyEditBAction() {

        JFrame edit=new JFrame();


        edit.setEnabled(true);
        edit.setVisible(true);
        java.awt.GridBagConstraints gridBagConstraints;

        jLabela = new javax.swing.JLabel();
        jLabelb = new javax.swing.JLabel();
        EditNameLabel = new javax.swing.JLabel();
        EditIDLabel = new javax.swing.JLabel();
        jLabelc = new javax.swing.JLabel();
        NewNameT = new java.awt.TextField();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();


        EditNameLabel.setText(PharmacyTable.getValueAt(0,1).toString());
        EditIDLabel.setText(PharmacyTable.getValueAt(0,0).toString());

        edit.setResizable(false);
        edit.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabela.setText("Pharmacist Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabela, gridBagConstraints);

        jLabelb.setText("New Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelb, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditNameLabel, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditIDLabel, gridBagConstraints);

        jLabelc.setText("Pharmacist ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelc, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(NewNameT, gridBagConstraints);

        ConfirmButton.setText("Confirm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(ConfirmButton, gridBagConstraints);

        CancelButton.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(CancelButton, gridBagConstraints);
        edit.pack();
        edit.setSize(new Dimension(300,200));
        edit.setAlwaysOnTop(true);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Pharmacy temp=new Pharmacy();
                temp.setPharmacyName(NewNameT.getText());
                temp.setPharmacyID(Integer.parseInt(EditIDLabel.getText()));
                pharmacyAPI.updatePharmacy(temp);
                edit.dispose();
                resetPharmacies();
            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit.dispose();
                resetPharmacies();
            }
        });
        NewNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
    }
    private void PatientEditAction() {

        JFrame edit=new JFrame();

        edit.setEnabled(true);
        edit.setVisible(true);
        java.awt.GridBagConstraints gridBagConstraints;

        jLabela = new javax.swing.JLabel();
        jLabelb = new javax.swing.JLabel();
        EditNameLabel = new javax.swing.JLabel();
        EditIDLabel = new javax.swing.JLabel();
        jLabelc = new javax.swing.JLabel();
        NewNameT = new java.awt.TextField();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        EditNameLabel.setText(PatientTable.getValueAt(0,1).toString());
        EditIDLabel.setText(PatientTable.getValueAt(0,0).toString());

        edit.setResizable(false);
        edit.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabela.setText("Patient Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabela, gridBagConstraints);

        jLabelb.setText("New Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelb, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditNameLabel, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditIDLabel, gridBagConstraints);

        jLabelc.setText("Patient ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelc, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(NewNameT, gridBagConstraints);

        ConfirmButton.setText("Confirm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(ConfirmButton, gridBagConstraints);

        CancelButton.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(CancelButton, gridBagConstraints);
        edit.pack();
        edit.setSize(new Dimension(300,200));
        edit.setAlwaysOnTop(true);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Patient temp=new Patient();
                temp.setName(NewNameT.getText());
                temp.setId(Integer.parseInt(EditIDLabel.getText()));
                patientAPI.save(temp);
                edit.dispose();
                resetPatient();


            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit.dispose();
                resetPatient();

            }
        });
        NewNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
    }
    private void DoctorEditAction() {
        JFrame edit=new JFrame();

        edit.setEnabled(true);
        edit.setVisible(true);
        java.awt.GridBagConstraints gridBagConstraints;

        jLabela = new javax.swing.JLabel();
        jLabelb = new javax.swing.JLabel();
        EditNameLabel = new javax.swing.JLabel();
        EditIDLabel = new javax.swing.JLabel();
        jLabelc = new javax.swing.JLabel();
        NewNameT = new java.awt.TextField();
        ConfirmButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();



        EditNameLabel.setText(DoctorTable.getValueAt(0,1).toString());
        EditIDLabel.setText(DoctorTable.getValueAt(0,0).toString());

        edit.setResizable(false);
        edit.getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabela.setText("Doctor Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabela, gridBagConstraints);

        jLabelb.setText("New Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelb, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditNameLabel, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(EditIDLabel, gridBagConstraints);

        jLabelc.setText("Doctor ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        edit.getContentPane().add(jLabelc, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        edit.getContentPane().add(NewNameT, gridBagConstraints);

        ConfirmButton.setText("Confirm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(ConfirmButton, gridBagConstraints);

        CancelButton.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        edit.getContentPane().add(CancelButton, gridBagConstraints);
        edit.pack();
        edit.setSize(new Dimension(300,200));
        edit.setAlwaysOnTop(true);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                Doctor temp=new Doctor();
                temp.setDoctorName(NewNameT.getText());
                temp.setDoctorId(Integer.parseInt(EditIDLabel.getText()));
                doctorAPI.updateDoctor(temp);
                edit.dispose();
                resetDoctor();

            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit.dispose();
                resetDoctor();
            }
        });
        NewNameT.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < 'a') || (c > 'z')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }
        });
    }
    private void reActivateTransaction() {
        Prescription prescription=new Prescription();
        prescription.setPrescriptionId((Integer) TransactionTable.getValueAt(0,1));
        prescription.setDoctorID((Integer) TransactionTable.getValueAt(0,2));
        prescription.setPatientId((Integer) TransactionTable.getValueAt(0,3));
        prescription.setDrugListId((Integer) TransactionTable.getValueAt(0,1));
        prescription.setPatientName(TransactionTable.getValueAt(0,8).toString());

        DrugList drugList=new DrugList();
        drugList.setDrugID((Integer) TransactionTable.getValueAt(0,5));
        drugList.setDrugListID((Integer) TransactionTable.getValueAt(0,1));
        drugList.setAmount((Integer) TransactionTable.getValueAt(0,6));

        try{
            prescriptionAPI.findPrescriptionById(prescription.getPrescriptionId());
            drugListAPI.insertDrugList(prescription.getPrescriptionId(), drugList.getDrugID(),drugList.getAmount());
            transactionHistoryAPI.deleteByID((Integer) TransactionTable.getValueAt(0,0));
        }
        catch (EmptyResultDataAccessException e){
            prescriptionAPI.addPrescriptionWithIDs(prescription);
            drugListAPI.insertDrugList(prescription.getDrugListId(),drugList.getDrugID(), drugList.getAmount());
            transactionHistoryAPI.deleteByID((Integer) TransactionTable.getValueAt(0,0));
        }

    }

    //Todo: End of editing frame::

    private javax.swing.JPanel AccountSettingsPanel;
    private javax.swing.JButton CancelPasswordChange;
    private javax.swing.JButton ConfirmPasswordChange;
    private javax.swing.JLabel DrugIdLabel;
    private javax.swing.JLabel DrugNameLabel;
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
            DrugNameLabel = new javax.swing.JLabel();
            TempUserName = new javax.swing.JLabel();
            DrugIdLabel = new javax.swing.JLabel();
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

            DrugNameLabel.setText("Username");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 10;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(DrugNameLabel, gridBagConstraints);

            TempUserName.setText(userAccount.getUsername());
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridwidth = 4;
            gridBagConstraints.ipadx = 57;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(TempUserName, gridBagConstraints);

            DrugIdLabel.setText("UserId");
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.ipadx = 21;
            gridBagConstraints.ipady = 7;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            AccountSettingsPanel.add(DrugIdLabel, gridBagConstraints);

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
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        userLogin.setEnabled(true);
        userLogin.setVisible(true);
    }
}