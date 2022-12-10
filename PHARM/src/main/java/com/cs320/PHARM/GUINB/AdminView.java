package com.cs320.PHARM.GUINB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
public class AdminView extends javax.swing.JFrame {



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
    private JButton jButton1;
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
        jButton1 = new JButton();
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