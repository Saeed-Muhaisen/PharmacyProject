package com.cs320.PHARM.GUINB;
//test


import com.cs320.PHARM.api.*;
import com.cs320.PHARM.model.Inventory;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.*;
import java.util.List;
import java.util.regex.PatternSyntaxException;

@Component
public class PharmacistView extends javax.swing.JFrame {
    //TODO:: Beginning of Beans ::
    @Autowired
    PrescriptionAPI prescriptionAPI;
    @Autowired
    TransactionHistoryAPI transactionHistoryAPI;
    @Autowired
    PatientAPI patientAPI;
    @Autowired
    DrugListAPI drugListAPI;
    @Autowired
    PharmacyAPI pharmacyAPI;
    @Autowired
    DoctorAPI doctorAPI;
    @Autowired
    InventoryAPI inventoryAPI;
    @Autowired
    DrugAPI drugAPI;
    @Autowired
    UserAccountAPI userAccountAPI;
    UserLogin userLogin;
    private UserAccount userAccount;
    //TODO:: End of Beans::

    public void initializeObject(UserAccount userAccount, UserLogin userLogin) {
        this.setVisible(true);
        this.setEnabled(true);
        this.userAccount=userAccount;
        this.userLogin=userLogin;
        NameTextField.setText(userAccount.getUsername());

    }
    public static void main(String args[]) {
        JFrame frame=new PharmacistView();
        frame.setVisible(true);
        frame.setEnabled(true);

    }


    private javax.swing.JButton ListAllB;

    private javax.swing.JButton CancelB;
    private javax.swing.JButton ConfirmB;
    private javax.swing.JLabel DoctorIDTemp;
    private javax.swing.JLabel DoctorNameTemp;
    private javax.swing.JTable DrugListTable;
    private javax.swing.JTable DrugListTable1;
    private javax.swing.JButton Logout;
    private javax.swing.JButton ManagePrescriptionsB;
    private javax.swing.JButton ManageStockB;
    private javax.swing.JLabel NameTextField;
    private javax.swing.JTextArea NoteArea;
    private javax.swing.JLabel PatientIDTemp;
    private javax.swing.JTextField PatientIdT;
    private javax.swing.JTextField DrugIdSearchInSell;
    private javax.swing.JTextField PatientNameT;
    private javax.swing.JLabel PatientNameTemp;
    private javax.swing.JPanel PatientPanel;
    private javax.swing.JTable PharmacyTable;
    private javax.swing.JTable PrescriptionListTable;
    private javax.swing.JLabel PrescriptionStatusTemp;
    private javax.swing.JButton RemoveDrugB1;
    private javax.swing.JButton SearchPatientB;
    private javax.swing.JPanel StockPanel;
    private javax.swing.JPanel bot2;
    private javax.swing.JButton accountSettings;
    private javax.swing.JButton DeleteB;
    private javax.swing.JButton AddDrugToInventoryB;
    private javax.swing.JButton addDrugToSell;
    private javax.swing.JButton EditB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField DrugAmountToAddT;
    private javax.swing.JTextField SearchInventoryT;
    private javax.swing.JTextField DrugIdToAddT;
    private javax.swing.JPanel left2;
    private javax.swing.JPanel right2;
    private javax.swing.JPanel top2;
    public PharmacistView() {
        initComponents();
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ManageStockB = new javax.swing.JButton();
        ManagePrescriptionsB = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PatientPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PatientNameT = new javax.swing.JTextField();
        PatientIdT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchPatientB = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        PatientNameTemp = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PatientIDTemp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DoctorNameTemp = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        DoctorIDTemp = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PrescriptionStatusTemp = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DrugListTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        NoteArea = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        CancelB = new javax.swing.JButton();
        ConfirmB = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        DrugListTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        RemoveDrugB1 = new javax.swing.JButton();
        DrugIdSearchInSell = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addDrugToSell = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrescriptionListTable = new javax.swing.JTable();
        StockPanel = new javax.swing.JPanel();
        top2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        PharmacyTable = new javax.swing.JTable();
        bot2 = new javax.swing.JPanel();
        left2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SearchInventoryT = new javax.swing.JTextField();
        EditB = new javax.swing.JButton();
        DeleteB = new javax.swing.JButton();
        ListAllB = new javax.swing.JButton();
        right2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DrugIdToAddT = new javax.swing.JTextField();
        AddDrugToInventoryB = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        DrugAmountToAddT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        accountSettings = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(getMinimumSize());
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 1));

        ManageStockB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ManageStockB.setText("Manage Stock");
        ManageStockB.setAlignmentY(0.0F);
        ManageStockB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.add(ManageStockB);

        ManagePrescriptionsB.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ManagePrescriptionsB.setText("Manage Prescriptions");
        ManagePrescriptionsB.setAlignmentY(0.0F);
        ManagePrescriptionsB.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.add(ManagePrescriptionsB);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(175, 0, 100, 0);
        jPanel3.add(jPanel1, gridBagConstraints);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        PatientPanel.setLayout(new java.awt.CardLayout());

        jPanel5.setLayout(new java.awt.BorderLayout(10, 0));

        jPanel6.setPreferredSize(new java.awt.Dimension(800, 625));

        jLabel1.setText("Patient Name:");



        jLabel2.setText("Patient ID:");

        SearchPatientB.setText("Search");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SearchPatientB)
                                        .addComponent(PatientNameT, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PatientIdT, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PatientNameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PatientIdT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SearchPatientB))
        );

        jLabel3.setText("Patient Name");

        PatientNameTemp.setText("TBA");

        jLabel23.setText("Patient ID");

        PatientIDTemp.setText("TBA");

        jLabel14.setText("Doctor Name");

        DoctorNameTemp.setText("TBA");

        jLabel16.setText("Doctor ID");

        DoctorIDTemp.setText("TBA");

        jLabel18.setText("Prescription Status:");

        PrescriptionStatusTemp.setText("TBA");

        jLabel20.setText("Prescription:");

        DrugListTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "Drug ID", "Drug Name", "Amount", "Inventory"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(DrugListTable);
        if (DrugListTable.getColumnModel().getColumnCount() > 0) {
            DrugListTable.getColumnModel().getColumn(0).setResizable(false);
            DrugListTable.getColumnModel().getColumn(1).setResizable(false);
            DrugListTable.getColumnModel().getColumn(2).setResizable(false);
            DrugListTable.getColumnModel().getColumn(3).setResizable(false);
        }

        NoteArea.setColumns(20);
        NoteArea.setRows(5);
        jScrollPane5.setViewportView(NoteArea);

        jLabel21.setText("Attached Notes");

        CancelB.setText("Cancel");
        CancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelBActionPerformed(evt);
            }
        });

        ConfirmB.setText("Confirm");
        ConfirmB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBActionPerformed(evt);
            }
        });

        DrugListTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Drug ID", "Drug Name", "Amount"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(DrugListTable1);
        if (DrugListTable1.getColumnModel().getColumnCount() > 0) {
            DrugListTable1.getColumnModel().getColumn(0).setResizable(false);
            DrugListTable1.getColumnModel().getColumn(1).setResizable(false);
            DrugListTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel22.setText("Sell:");

        RemoveDrugB1.setText("Remove");
        RemoveDrugB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDrugB1ActionPerformed(evt);
            }
        });

        DrugIdSearchInSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSellByID();

            }
        });

        jLabel4.setText("Drug ID");

        addDrugToSell.setText("Add");

        PrescriptionListTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Prescription ID", "Doctor Name"
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

        jScrollPane1.setViewportView(PrescriptionListTable);
        if (PrescriptionListTable.getColumnModel().getColumnCount() > 0) {
            PrescriptionListTable.getColumnModel().getColumn(0).setResizable(false);
            PrescriptionListTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jSeparator1)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(42, 42, 42)
                                                                .addComponent(PatientNameTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(74, 74, 74)
                                                                .addComponent(PatientIDTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(88, 88, 88)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                                .addComponent(DoctorIDTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                                .addComponent(DoctorNameTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(39, 39, 39)
                                                                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(PrescriptionStatusTemp, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                                                .addGap(83, 83, 83))
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(99, 99, 99)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                                .addContainerGap())))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(DrugIdSearchInSell, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(RemoveDrugB1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                        .addGap(261, 261, 261)
                                                                        .addComponent(ConfirmB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jScrollPane6)
                                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                                        .addComponent(addDrugToSell)
                                                                                        .addGap(98, 98, 98))
                                                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                                        .addComponent(jLabel20)
                                                                                        .addGap(257, 257, 257))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel21)
                                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PatientNameTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DoctorNameTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PrescriptionStatusTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PatientIDTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DoctorIDTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel20)
                                        .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addDrugToSell)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DrugIdSearchInSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RemoveDrugB1))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ConfirmB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))
        );

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        PatientPanel.add(jPanel5, "card2");

        jLayeredPane1.add(PatientPanel, "card4");

        StockPanel.setLayout(new javax.swing.BoxLayout(StockPanel, javax.swing.BoxLayout.PAGE_AXIS));

        top2.setLayout(new java.awt.BorderLayout());

        PharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Drug ID", "Drug Name","Capacity"
                }
        ));
        jScrollPane4.setViewportView(PharmacyTable);

        top2.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        StockPanel.add(top2);

        bot2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setText("Search");

        EditB.setText("Edit");

        DeleteB.setText("Delete");

        ListAllB.setText("List All");

        javax.swing.GroupLayout left2Layout = new javax.swing.GroupLayout(left2);
        left2.setLayout(left2Layout);
        left2Layout.setHorizontalGroup(
                left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(left2Layout.createSequentialGroup()
                                                .addComponent(SearchInventoryT)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ListAllB, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(left2Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(EditB, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                                .addGap(47, 47, 47)
                                                .addComponent(DeleteB, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                                .addGap(52, 52, 52))))
        );
        left2Layout.setVerticalGroup(
                left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(left2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(SearchInventoryT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ListAllB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(left2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EditB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DeleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
        );

        bot2.add(left2);

        jLabel7.setText("Drug ID");

        AddDrugToInventoryB.setText("Add");


        jLabel24.setText("Amount");

        javax.swing.GroupLayout right2Layout = new javax.swing.GroupLayout(right2);
        right2.setLayout(right2Layout);
        right2Layout.setHorizontalGroup(
                right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(right2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(right2Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(16, 16, 16)
                                                .addComponent(DrugIdToAddT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, right2Layout.createSequentialGroup()
                                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(AddDrugToInventoryB)
                                                        .addComponent(DrugAmountToAddT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        right2Layout.setVerticalGroup(
                right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(right2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(DrugIdToAddT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(right2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                        .addComponent(DrugAmountToAddT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddDrugToInventoryB)
                                .addGap(18, 18, 18))
        );

        bot2.add(right2);

        StockPanel.add(bot2);

        jLayeredPane1.add(StockPanel, "card5");

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

        jLabel9.setText("Account type:");
        jPanel2.add(jLabel9);

        jLabel11.setText("Pharmacist Account");
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

        getContentPane().add(jPanel3, new java.awt.GridBagConstraints());
        jPanel3.setBorder(new EmptyBorder(5,5,5,5));

        actionListeners();
        pack();

    }
    private void actionListeners(){
        accountSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditAccount();
            }
        });
        //switching tabs
        ManageStockB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageStockBActionPerformed();
                resetStock();
            }
        });
        ManagePrescriptionsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagePrescriptionsBActionPerformed();
            }
        });

        //Stock Tab buttons
        ListAllB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchInventoryT.setText("");
            }
        }); //Done
        EditB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditDrug();
            }
        }); //Done
        DeleteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteDrugFromInventory();
                resetStock();
            }
        }); //Done

        //Filtering pharmacyTable and adding drugs into it
        DrugIdToAddT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(!DrugIdToAddT.getText().isEmpty()){
                    DrugAmountToAddT.setEnabled(true);}
                else{
                    DrugAmountToAddT.setText("");
                    DrugAmountToAddT.setEnabled(false);
                    AddDrugToInventoryB.setEnabled(false);

                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                if(!DrugIdToAddT.getText().isEmpty()){
                    DrugAmountToAddT.setEnabled(true);}
                else{
                    DrugAmountToAddT.setText("");
                    DrugAmountToAddT.setEnabled(false);
                    AddDrugToInventoryB.setEnabled(false);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if(!DrugIdToAddT.getText().isEmpty()){
                    DrugAmountToAddT.setEnabled(true);}
                else{
                    DrugAmountToAddT.setText("");
                    DrugAmountToAddT.setEnabled(false);
                    AddDrugToInventoryB.setEnabled(false);
                }
            }
        }); //done
        DrugAmountToAddT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                AddDrugToInventoryB.setEnabled(!DrugAmountToAddT.getText().isEmpty());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                AddDrugToInventoryB.setEnabled(!DrugAmountToAddT.getText().isEmpty());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                AddDrugToInventoryB.setEnabled(!DrugAmountToAddT.getText().isEmpty());
            }
        });
        SearchInventoryT.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                TableFilter(PharmacyTable,SearchInventoryT);
                if(PharmacyTable.getRowCount()==1){
                    EditB.setEnabled(true);
                    DeleteB.setEnabled(true);
                }
                else{
                    EditB.setEnabled(false);
                    DeleteB.setEnabled(false);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                TableFilter(PharmacyTable,SearchInventoryT);
                if(PharmacyTable.getRowCount()==1){
                    EditB.setEnabled(true);
                    DeleteB.setEnabled(true);
                }
                else{
                    EditB.setEnabled(false);
                    DeleteB.setEnabled(false);
                }

            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableFilter(PharmacyTable,SearchInventoryT);
                if(PharmacyTable.getRowCount()==1){
                    EditB.setEnabled(true);
                    DeleteB.setEnabled(true);
                }
                else{
                    EditB.setEnabled(false);
                    DeleteB.setEnabled(false);
                }
            }
        });
        AddDrugToInventoryB.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDrugToInventoryActionPerformed(evt);
                resetStock();
            }
        });

    }
    //Table filler and filters
    private void TableFilter(JTable table,JTextField textField) {
        System.out.println("d");
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
    private void PharmacyTableFiller() {

        EditB.setEnabled(false);
        DeleteB.setEnabled(false);
        List<Inventory> temp = inventoryAPI.findByInventoryId(userAccount.getId());
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) PharmacyTable.getModel();
        model.setRowCount(0);
        Object rowData[]=new Object[3];


        for(int i=0;i<temp.size();i++){
            rowData[0]=temp.get(i).getDrugID();
            rowData[1]= drugAPI.findDrugByID(temp.get(i).getDrugID()).getDrugName();
            rowData[2]=temp.get(i).getCapacity();
            model.addRow(rowData);
        }
    }


    //resets Stock tab settings and texts
    public void resetStock(){
        SearchInventoryT.setText("");
        DrugIdToAddT.setText("");
        DrugAmountToAddT.setText("");
        DeleteB.setEnabled(false);
        EditB.setEnabled(false);
        DrugAmountToAddT.setEnabled(false);
        AddDrugToInventoryB.setEnabled(false);
        PharmacyTableFiller();
    }

    private void SearchSellByID() {

    }

    private void DeleteDrugFromInventory() { //Todo: Fix the optionpane being at the back!
        String msg=PharmacyTable.getValueAt(0,1).toString()+ " has been removed from inventory";
        int DrugId=Integer.valueOf(PharmacyTable.getValueAt(0,0).toString());
        inventoryAPI.deleteDrugFromInventory(userAccount.getId(), DrugId);
        PharmacyTableFiller();
        SearchInventoryT.setText("");
        JOptionPane.showMessageDialog(this, msg);
    }
    private void AddDrugToInventoryActionPerformed(ActionEvent evt) {
        int drugId= Integer.parseInt(DrugIdToAddT.getText());
        int amount= Integer.parseInt(DrugAmountToAddT.getText());
        inventoryAPI.insertDrug(userAccount.getId(),drugId,amount);

    }

    private void SearchPatientAndFillPrescriptionTable() {

    }

    //Switching tabs
    private void ManagePrescriptionsBActionPerformed() {
        PatientPanel.setEnabled(true);
        PatientPanel.setVisible(true);
        StockPanel.setEnabled(false);
        StockPanel.setVisible(false);
    }
    private void ManageStockBActionPerformed() {
        PatientPanel.setEnabled(false);
        PatientPanel.setVisible(false);
        StockPanel.setEnabled(true);
        StockPanel.setVisible(true);

    }

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        this.setEnabled(false);

    }

    private void CancelBActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void ConfirmBActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void RemoveDrugB1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    //editing Drug JFrame Instance and method Beginning:
    private JFrame edit;
    private JPanel FullPanel;
    private javax.swing.JButton CancelCapacityB;
    private javax.swing.JLabel CapacityLabel;
    private javax.swing.JButton ConfirmCapacityB;
    private javax.swing.JLabel DrugIdLabel;
    private javax.swing.JLabel DrugNameLabel;
    private javax.swing.JLabel ECapacityTemp;
    private javax.swing.JLabel EDrugIDTemp;
    private javax.swing.JLabel EDrugNameTemp;
    private javax.swing.JLabel NewCapacityLabel;
    private java.awt.TextField NewCapacityT;
    private void EditDrug() {
        edit=new JFrame();

        edit.setEnabled(true);
        edit.setVisible(true);
        edit.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                edit.dispose();
            }
        });

        java.awt.GridBagConstraints gridBagConstraints;

        FullPanel = new javax.swing.JPanel();
        DrugNameLabel = new javax.swing.JLabel();
        EDrugNameTemp = new javax.swing.JLabel();
        DrugIdLabel = new javax.swing.JLabel();
        NewCapacityLabel = new javax.swing.JLabel();
        EDrugIDTemp = new javax.swing.JLabel();
        ConfirmCapacityB = new javax.swing.JButton();
        NewCapacityT = new java.awt.TextField();
        CancelCapacityB = new javax.swing.JButton();
        CapacityLabel = new javax.swing.JLabel();
        ECapacityTemp = new javax.swing.JLabel();


        EDrugIDTemp.setText(PharmacyTable.getValueAt(0,0).toString());
        EDrugNameTemp.setText(PharmacyTable.getValueAt(0,1).toString());
        ECapacityTemp.setText(PharmacyTable.getValueAt(0,2).toString());


        edit.setResizable(false);
        edit.getContentPane().setLayout(new java.awt.GridBagLayout());

        FullPanel.setLayout(new java.awt.GridBagLayout());

        DrugNameLabel.setText("Drug Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        FullPanel.add(DrugNameLabel, gridBagConstraints);

        //EDrugNameTemp.setText("TempName");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        FullPanel.add(EDrugNameTemp, gridBagConstraints);

        DrugIdLabel.setText("Drug ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        FullPanel.add(DrugIdLabel, gridBagConstraints);

        NewCapacityLabel.setText("New Capacity:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        FullPanel.add(NewCapacityLabel, gridBagConstraints);

        //EDrugIDTemp.setText("TempID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        FullPanel.add(EDrugIDTemp, gridBagConstraints);

        ConfirmCapacityB.setText("Confirm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        FullPanel.add(ConfirmCapacityB, gridBagConstraints);

        NewCapacityT.setText("textField1");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 73;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 5, 0, 0);
        FullPanel.add(NewCapacityT, gridBagConstraints);

        CancelCapacityB.setText("Cancel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        FullPanel.add(CancelCapacityB, gridBagConstraints);

        CapacityLabel.setText("Capacity");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        FullPanel.add(CapacityLabel, gridBagConstraints);

        //ECapacityTemp.setText("CapacityTemp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        FullPanel.add(ECapacityTemp, gridBagConstraints);
        FullPanel.setBorder(new EmptyBorder(10, 10, 10, 10)); //todo: added the padding!!
        edit.getContentPane().add(FullPanel, new java.awt.GridBagConstraints());

        edit.pack();
        //issue: java Lang!
        ConfirmCapacityB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inventory inv=new Inventory();
                inv.setDrugID(Integer.parseInt(EDrugIDTemp.getText()));
                inv.setCapacity(Integer.parseInt(NewCapacityT.getText()));
                inv.setInventoryID(userAccount.getId());
                inventoryAPI.updateInventory(inv);
                resetStock();
                edit.dispose();
            }
        });
    }
    //editing Drug JFrame end
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
}
