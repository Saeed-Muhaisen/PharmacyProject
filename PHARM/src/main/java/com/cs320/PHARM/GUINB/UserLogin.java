package com.cs320.PHARM.GUINB;


import com.cs320.PHARM.api.UserAccountAPI;
import com.cs320.PHARM.model.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
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
    private final UserAccountAPI userAccountAPI;
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
    private javax.swing.JTextField passwordT;
    private javax.swing.JTextField usernameT;

    //For spring: This initializes this bean (class)
    // when the software starts, classes with @Component will execute
    // whatever is inside initializeObject method! So if you want this class to be visable on start
    // you must write setVisible(true) otherwise you write setVisble(False)
    @PostConstruct
    public void initializeObject(){
        setVisible(true);
    }
    public UserLogin(AdminView adminView, DoctorView doctorView, PharmacistView pharmacistView, UserAccountAPI userAccountAPI, UserAccount userAccount) {
        this.adminView = adminView;
        this.doctorView = doctorView;
        this.pharmacistView = pharmacistView;
        this.userAccountAPI = userAccountAPI;
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
        passwordT = new javax.swing.JTextField();
        usernameT = new javax.swing.JTextField();
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

        ChoiceLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Admintog, PharmaTog, doctorTog});

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

        ChoiceLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Admintog, PharmaTog, doctorTog});

        getContentPane().add(Choice, "card3");

        jLabel2.setText("UserName");
        jButton1.setText("Sign in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Password");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
                LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LoginLayout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addComponent(usernameT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(LoginLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(40, 40, 40)
                                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1)
                                                        .addComponent(passwordT, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(57, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
                LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginLayout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(17, 17, 17))
        );

        getContentPane().add(Login, "card2");

        pack();
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

    private void after_login(){
        Choice.setVisible(true);
        Choice.setEnabled(true);
        Login.setVisible(false);
        Login.setEnabled(false);
        this.setVisible(false);
        usernameT.setText("");
        passwordT.setText("");
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username=usernameT.getText();
        String password=passwordT.getText();
        try {
            userAccount = userAccountAPI.findUserAccountByName(username);
            if (userAccount.getPassword().equals(password)) {
                if (x == 1 && userAccount.getType() == 1) {
                    adminView.initializeObject(userAccount,this);
                    after_login();
                } else if (x == 2 && userAccount.getType() == 2) {
                    doctorView.initializeObject(userAccount,this);
                    after_login();
                } else if( x==3 && userAccount.getType()==3) {
                    pharmacistView.initializeObject(userAccount,this);
                    after_login();
                }
            }
        }catch (EmptyResultDataAccessException e) {
            //todo: Handle account not found
        }
    }

    
    private void PharmaTogActionPerformed(ActionEvent evt) {
        x=3;
        Choice.setVisible(false);
        Choice.setEnabled(false);
        Login.setVisible(true);
        Login.setVisible(true);
    }
}