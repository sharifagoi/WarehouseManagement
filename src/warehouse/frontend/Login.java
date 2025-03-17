package warehouse.frontend;

import warehouse.backend.UserDAO;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Check if the window is maximized
                if ((getExtendedState() & MAXIMIZED_BOTH) == MAXIMIZED_BOTH) {
                    // Set background color of JFrame when maximized
                    getContentPane().setBackground(new Color(0, 51, 51));
                    // Center jPanel1
                    Container.setLocation((getWidth() - Container.getWidth()) / 2,
                            (getHeight() - Container.getHeight()) / 2);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userEmail = new javax.swing.JLabel();
        userPassword = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        signupbtn = new javax.swing.JButton();
        fgtpasswordbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Container\n");
        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(600, 500));

        Container.setBackground(new java.awt.Color(0, 102, 102));
        Container.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN PAGE");

        userEmail.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        userEmail.setForeground(new java.awt.Color(255, 255, 255));
        userEmail.setText("Email");

        userPassword.setBackground(new java.awt.Color(255, 255, 255));
        userPassword.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        userPassword.setForeground(new java.awt.Color(255, 255, 255));
        userPassword.setText("Password");

        loginBtn.setBackground(new java.awt.Color(204, 0, 0));
        loginBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 0));
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("I don't have an account?");

        emailTxt.setBackground(new java.awt.Color(0, 102, 102));
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));
        emailTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 242, 242), 1, true));

        passwordTxt.setBackground(new java.awt.Color(0, 102, 102));
        passwordTxt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(242, 242, 242));

        signupbtn.setBackground(new java.awt.Color(255, 0, 51));
        signupbtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(255, 255, 0));
        signupbtn.setText("Sign up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        fgtpasswordbtn.setBackground(new java.awt.Color(0, 102, 102));
        fgtpasswordbtn.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        fgtpasswordbtn.setForeground(new java.awt.Color(255, 255, 0));
        fgtpasswordbtn.setText("Forgot password!");
        fgtpasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fgtpasswordbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userPassword)
                        .addComponent(emailTxt)
                        .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                    .addComponent(fgtpasswordbtn)
                    .addComponent(loginBtn))
                .addContainerGap(280, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(0, 218, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(signupbtn)
                .addGap(98, 98, 98))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(userPassword)
                .addGap(18, 18, 18)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(18, 18, 18)
                .addComponent(fgtpasswordbtn)
                .addGap(36, 36, 36)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signupbtn)
                    .addComponent(jLabel5))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fgtpasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fgtpasswordbtnActionPerformed
        if (emailTxt.getText().isEmpty()) {
            // Login failed
            JOptionPane.showMessageDialog(this, "No email address entered. Please enter email try again.");
        } else {
            AccountVerification accountverificationFrame = new AccountVerification(emailTxt.getText());
            accountverificationFrame.setVisible(true);
            accountverificationFrame.setLocationRelativeTo(null);
            this.dispose();
        }

    }//GEN-LAST:event_fgtpasswordbtnActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        Register registerFrame = new Register();
        registerFrame.setVisible(true);
        registerFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signupbtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
 String useremail = emailTxt.getText().trim().toLowerCase();
String userpassword = new String(passwordTxt.getPassword());

UserDAO userDao = new UserDAO(); 

Object user = userDao.checkLoginCredentials(useremail, userpassword); 

if (user != null) {
    // Login successful
    JOptionPane.showMessageDialog(this, "Login successful!");
    HomeForm homeframe = new HomeForm();
    homeframe.setVisible(true);
    homeframe.setLocationRelativeTo(null);
    this.dispose();
} else {
    // Login failed
    JOptionPane.showMessageDialog(this, "Invalid username or password. Please try again.");
}
    }//GEN-LAST:event_loginBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JButton fgtpasswordbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel userEmail;
    private javax.swing.JLabel userPassword;
    // End of variables declaration//GEN-END:variables
}
