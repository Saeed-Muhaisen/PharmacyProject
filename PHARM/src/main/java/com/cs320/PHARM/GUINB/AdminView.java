package com.cs320.PHARM.GUINB;

import com.cs320.PHARM.api.DoctorAPI;
import com.cs320.PHARM.api.DrugAPI;
import com.cs320.PHARM.api.PharmacyAPI;
import com.cs320.PHARM.api.UserAccountAPI;
import com.cs320.PHARM.dao.PatientDao;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
@Component
public class AdminView extends javax.swing.JFrame {
    //todo: Spring beans Beginning::
    @Autowired
    DoctorAPI doctorAPI;
    @Autowired
    PharmacyAPI pharmacyAPI;
    @Autowired
    PatientDao patientDao;
    @Autowired
    DrugAPI drugAPI;
    @Autowired
    UserAccountAPI userAccountAPI;
    UserLogin userLogin;

    //Todo: Spring beans End::

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
    private JPanel doctorPanel;
    private JPanel drugPanel;
    private JButton drugsB;
    private JButton accountSettings;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
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
    private JTable jTable5;
    private JPanel left;
    private JPanel left1;
    private JPanel left2;
    private JPanel left3;
    private JPanel patientPanel;
    private JPanel pharmacyPanel;
    private JPanel right;
    private JPanel right1;
    private JPanel right2;
    private JPanel top;
    private JPanel top1;
    private JPanel top2;
    private JPanel top3;


    public AdminView() {
        initComponents();

    }
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
        DoctorTable = new JTable();
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
        jTable5 = new JTable();
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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new Color(255, 255, 255));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setSize(getMaximumSize());
        getContentPane().setLayout(new GridBagLayout());

        jPanel3.setLayout(new GridBagLayout());

        jPanel1.setLayout(new GridLayout(4, 1));

        DoctorB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        DoctorB.setText("Doctors");
        DoctorB.setAlignmentY(0.0F);
        DoctorB.setBorder(BorderFactory.createEtchedBorder());

        DoctorB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorBActionPerformed(evt);
            }
        });
        jPanel1.add(DoctorB);

        PharmaciesB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        PharmaciesB.setText("Pharmacies");
        PharmaciesB.setAlignmentY(0.0F);
        PharmaciesB.setBorder(BorderFactory.createEtchedBorder());
        PharmaciesB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmaciesBActionPerformed(evt);
            }
        });
        jPanel1.add(PharmaciesB);

        drugsB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        drugsB.setText("Drugs");
        drugsB.setAlignmentY(0.0F);
        drugsB.setBorder(BorderFactory.createEtchedBorder());
        drugsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                drugsBActionPerformed(evt);
            }
        });
        jPanel1.add(drugsB);

        PatientsB.setFont(new Font("Calibri", 0, 18)); // NOI18N
        PatientsB.setText("Patients");
        PatientsB.setAlignmentY(0.0F);
        PatientsB.setBorder(BorderFactory.createEtchedBorder());
        PatientsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PatientsBActionPerformed(evt);
            }
        });
        jPanel1.add(PatientsB);

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

        DrugSearchT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    DrugSearchAction(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

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
        DrugAddB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DrugAddBActionPerformed(evt);
            }
        });

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

        DoctorSB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    DoctorSBActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

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
        DoctorAddB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DoctorAddBActionPerformed(evt);
            }
        });

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

        PharmacySearchT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    PharmacySearchActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

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
        PharmaADDB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PharmaADDBActionPerformed(evt);
            }
        });

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

        jTable5.setModel(new DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        top3.add(jScrollPane5, BorderLayout.CENTER);

        patientPanel.add(top3);

        bot3.setBackground(new Color(204, 204, 255));
        bot3.setForeground(new Color(204, 204, 255));
        bot3.setLayout(new GridLayout(1, 0));

        jLabel8.setText("Search By ID");

        PatientSearchT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PatientSearchTActionPerformed(evt);
            }
        });

        PatientEditB.setText("Edit");

        PatientDeleteB.setText("Delete");

        ListAllPatients.setText("List All");
        ListAllPatients.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ListAllPatientsActionPerformed(evt);
            }
        });

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
        Logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel2.add(Logout);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(50, 0, 0, 0);
        jPanel3.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel3, new GridBagConstraints());
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
        DoctorTable.setDefaultEditor(Object.class, null);
        jTable5.setDefaultEditor(Object.class, null);
        PharmacyTable.setDefaultEditor(Object.class, null);
        DrugTable.setDefaultEditor(Object.class, null);

        DoctorEditB.setEnabled(false);
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

        actionListeners();
        pack();

    }
    //for action listeners
    private void actionListeners(){
        accountSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAccount();
            }
        });
    }

    private void DrugEditBAction() {
        //TODO: popup frame to endi a drug
    }


    private void PharmacyEditBAction() {
        //TODO: popup frame to edit a Pharmacy info
    }

    private void PatientEditAction(){
        //TODO: popup frame to edit a Patient
    }

    private void DoctorEditAction() {
        //TODO: popup frame to edit a doctor
    }

    private void PharmacyDeleteAction() {
        //TODO:delete pharmacy

    }

    private void DoctorDeleteAction() {

        //todo:Delete a doctor


    }

    private void DrugDeleteAction() {

        //todo:delete a drug
    }

    private void PatientDeleteB() {

        //todo: delete a patient


    }

    private void PharmacyListallAction() {
        //todo: fill pharmacy table
    }

    private void DrugListallAction() {
        //todo: fill drugtable
    }

    private void DoctorListallAction() {
        //todo fill doctor Table
    }

    private void DrugSearchAction(ActionEvent evt) throws Exception {
        //todo: search a drug
    }

    private void PharmacySearchActionPerformed(ActionEvent evt) throws Exception {
        //todo: search a pharmacy
    }

    private void ListAllPatientsActionPerformed(ActionEvent evt) {
        //todo: show all patients in db
    }


    private void DoctorSBActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
        //todo: Search for a doctor
    }
    private void PatientSearchTActionPerformed(java.awt.event.ActionEvent evt) {
        //todo: search for a patient


    }
    private void PharmaciesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmaciesBActionPerformed
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false );
        doctorPanel.setEnabled(false);
        doctorPanel.setVisible(false);
        pharmacyPanel.setEnabled(true);
        pharmacyPanel.setVisible(true);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
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
        PatientTableFiller();
    }

    private void DoctorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorBActionPerformed
        drugPanel.setEnabled(false);
        drugPanel.setVisible(false);
        doctorPanel.setEnabled(true);
        doctorPanel.setVisible(true);
        pharmacyPanel.setEnabled(false);
        pharmacyPanel.setVisible(false);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
        DoctorTableFiller();
    }//GEN-LAST:event_DoctorBActionPerformed



    private void drugsBActionPerformed(java.awt.event.ActionEvent evt) {
        drugPanel.setEnabled(true);
        drugPanel.setVisible(true);
        doctorPanel.setEnabled(false);
        doctorPanel.setVisible(false);
        pharmacyPanel.setEnabled(false);
        pharmacyPanel.setVisible(false);
        patientPanel.setEnabled(false);
        patientPanel.setVisible(false);
        DrugTableFiller();
    }

    private void DrugTableFiller() {
        //todo:Fill drug table from db
    }

    private void DrugAddBActionPerformed(java.awt.event.ActionEvent evt) {
        //todo: add a new drug to db
    }



    private void PharmaADDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PharmaADDBActionPerformed
        //todo: add a new pharmacy to db
    }


    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        //todo: logout from account
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }




    private void DoctorTableFiller() {
        //todo: fill doctor table from db

    }
    private void DoctorAddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorAddBActionPerformed
        //todo: add a new doctor to db

    }


    private void PharmacyTableFiller() {

        //todo: fill pharmacy table from db
    }
    private void PatientTableFiller(){
        //todo: fill patient table from db
    }
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

            edit.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        }
    }
}