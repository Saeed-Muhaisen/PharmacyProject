package com.cs320.PHARM.GUINB;


import com.cs320.PHARM.dao.UserAccountDao;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.awt.event.ActionEvent;
@Component
public class UserLogin extends javax.swing.JFrame {

    //This is Spring bean: an object controlled by Spring Boot Framework,
    // you don't need to initialize or do anything
    // Example: if you want to switch to adminView you just say:
    // this.setVisible(false) && adminView.setVisible(true)

    //TODO:Beginning of beans
    @Autowired
    private final AdminView adminView;
    @Autowired
    private final DoctorView doctorView;
    @Autowired
    private final PharmacistView pharmacistView;
    @Autowired
    private final UserAccountDao userAccountDao;
    //TODO:End of beans
    private UserAccount userAccount; //We will use this class to keep track which account is managing the db


    private int x;
    private javax.swing.JButton Admintog;

    private javax.swing.JPanel Choice;
    private javax.swing.JPanel Login;
    private javax.swing.JButton PharmaTog;
    private javax.swing.JButton doctorTog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;

    //For spring: This initializes this bean (class)
    // when the software starts, classes with @Component will execute
    // whatever is inside initializeObject method! So if you want this class to be visable on start
    // you must write setVisible(true) otherwise you write setVisble(False)
    @PostConstruct
    public void initializeObject(){
        setVisible(true);
    }
    public UserLogin(AdminView adminView, DoctorView doctorView, PharmacistView pharmacistView, UserAccountDao userAccountDao, UserAccount userAccount) {
        this.adminView = adminView;
        this.doctorView = doctorView;
        this.pharmacistView = pharmacistView;
        this.userAccountDao = userAccountDao;
        this.userAccount = userAccount;
        initComponents();
    }

    private void initComponents() {

        Choice = new javax.swing.JPanel();
        PharmaTog = new javax.swing.JButton();
        Admintog = new javax.swing.JButton();
        doctorTog = new javax.swing.JButton();
        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        PharmaTog.setText("Pharmacist");
        PharmaTog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PharmaTogActionPerformed(evt);
            }
        });

        Admintog.setText("Admin");
        Admintog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmintogActionPerformed(evt);
            }
        });

        doctorTog.setText("Doctor");
        doctorTog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorTogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChoiceLayout = new javax.swing.GroupLayout(Choice);
        Choice.setLayout(ChoiceLayout);
        ChoiceLayout.setHorizontalGroup(
                ChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChoiceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Admintog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doctorTog, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PharmaTog, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ChoiceLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[]{Admintog, PharmaTog, doctorTog});

        ChoiceLayout.setVerticalGroup(
                ChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChoiceLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ChoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Admintog, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(doctorTog, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PharmaTog))
                                .addContainerGap())
        );

        ChoiceLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[]{Admintog, PharmaTog, doctorTog});

        getContentPane().add(Choice, "card3");

        jLabel2.setText("UserName");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

    }

     private void AdmintogActionPerformed(java.awt.event.ActionEvent evt) {
        x=1;
        Choice.setVisible(false);
        Choice.setEnabled(false);
        Login.setVisible(true);
        Login.setVisible(true);

    }

    private void doctorTogActionPerformed(java.awt.event.ActionEvent evt) {
        x=2;
        Choice.setVisible(false);
        Choice.setEnabled(false);
        Login.setVisible(true);
        Login.setVisible(true);
    }


    private void jTextField2ActionPerformed(ActionEvent evt) {
        
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        
    }

    
    private void PharmaTogActionPerformed(ActionEvent evt) {
    }
}