
package websiteatlas;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class jframeLogin extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static String[] userArray = new String[5];
    public jframeLogin() {
        initComponents();
        setIcon();
        conn = WebsiteAtlas.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JPanel();
        panelEmpty = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelEmpty1 = new javax.swing.JPanel();
        panelUsername = new javax.swing.JPanel();
        inputEmail = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        panelUserPass = new javax.swing.JPanel();
        inputPass = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        loginPass = new javax.swing.JPasswordField();
        panelLogin = new javax.swing.JPanel();
        buttonLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelUserSignUp = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelSignUpButton = new javax.swing.JPanel();
        buttonSignUp = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        buttonGuess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(390, 150));
        setPreferredSize(new java.awt.Dimension(1024, 640));
        setResizable(false);

        mainWindow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        panelEmpty.setPreferredSize(new java.awt.Dimension(1024, 50));

        javax.swing.GroupLayout panelEmptyLayout = new javax.swing.GroupLayout(panelEmpty);
        panelEmpty.setLayout(panelEmptyLayout);
        panelEmptyLayout.setHorizontalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelEmptyLayout.setVerticalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty);

        panelTitle.setPreferredSize(new java.awt.Dimension(1024, 100));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoApplication.png"))); // NOI18N
        panelTitle.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEBSITE ATLAS");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 60));
        panelTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        mainWindow.add(panelTitle);

        panelEmpty1.setPreferredSize(new java.awt.Dimension(1024, 20));

        javax.swing.GroupLayout panelEmpty1Layout = new javax.swing.GroupLayout(panelEmpty1);
        panelEmpty1.setLayout(panelEmpty1Layout);
        panelEmpty1Layout.setHorizontalGroup(
            panelEmpty1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelEmpty1Layout.setVerticalGroup(
            panelEmpty1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty1);

        panelUsername.setPreferredSize(new java.awt.Dimension(1024, 60));

        inputEmail.setPreferredSize(new java.awt.Dimension(200, 50));
        inputEmail.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 118, 118));
        jLabel5.setText("Username:");
        jLabel5.setPreferredSize(new java.awt.Dimension(109, 20));
        inputEmail.add(jLabel5, java.awt.BorderLayout.CENTER);

        loginUser.setPreferredSize(new java.awt.Dimension(10, 25));
        inputEmail.add(loginUser, java.awt.BorderLayout.PAGE_END);

        panelUsername.add(inputEmail);

        mainWindow.add(panelUsername);

        panelUserPass.setPreferredSize(new java.awt.Dimension(1024, 80));

        inputPass.setPreferredSize(new java.awt.Dimension(200, 50));
        inputPass.setLayout(new java.awt.BorderLayout(0, 3));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 118, 118));
        jLabel6.setText("Password:");
        jLabel6.setPreferredSize(new java.awt.Dimension(109, 20));
        inputPass.add(jLabel6, java.awt.BorderLayout.CENTER);

        loginPass.setDoubleBuffered(true);
        loginPass.setMinimumSize(new java.awt.Dimension(7, 25));
        loginPass.setPreferredSize(new java.awt.Dimension(112, 25));
        inputPass.add(loginPass, java.awt.BorderLayout.PAGE_END);

        panelUserPass.add(inputPass);

        mainWindow.add(panelUserPass);

        panelLogin.setPreferredSize(new java.awt.Dimension(1024, 40));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        panelLogin.setLayout(flowLayout1);

        buttonLogin.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonLogin.setText("Log In");
        buttonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLogin.setPreferredSize(new java.awt.Dimension(130, 30));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        panelLogin.add(buttonLogin);

        mainWindow.add(panelLogin);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(1044, 20));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Forgot your password?");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        mainWindow.add(jPanel1);

        panelUserSignUp.setPreferredSize(new java.awt.Dimension(1024, 35));
        panelUserSignUp.setRequestFocusEnabled(false);
        panelUserSignUp.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        panelUserSignUp.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Don't have an account?");
        jLabel4.setPreferredSize(new java.awt.Dimension(197, 30));
        panelUserSignUp.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        mainWindow.add(panelUserSignUp);

        panelSignUpButton.setPreferredSize(new java.awt.Dimension(1024, 300));

        buttonSignUp.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonSignUp.setText("Sign Up for Website Atlas");
        buttonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignUp.setPreferredSize(new java.awt.Dimension(250, 30));
        buttonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSignUpActionPerformed(evt);
            }
        });
        panelSignUpButton.add(buttonSignUp);

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Or");
        jLabel9.setPreferredSize(new java.awt.Dimension(10245, 30));
        panelSignUpButton.add(jLabel9);

        buttonGuess.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonGuess.setText("Sign in as a Guest");
        buttonGuess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuessActionPerformed(evt);
            }
        });
        panelSignUpButton.add(buttonGuess);

        mainWindow.add(panelSignUpButton);

        getContentPane().add(mainWindow, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String[] getuserArray() {
        return userArray;
    }

    private void buttonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSignUpActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new jframeSignUp().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_buttonSignUpActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        char[] inputPassword = loginPass.getPassword();
        String str = String.valueOf(inputPassword);
        if (loginUser.getText().equals("") ||loginPass.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"Username or Password is Empty","Alert",JOptionPane.WARNING_MESSAGE); 
        } else {
            if(loginUser.getText().equals("admin")|| str.equals("admin")) {
                Arrays.fill(userArray, "Admin");
                userArray[4] = "-1";
                java.awt.EventQueue.invokeLater(() -> {
                    new jframeMainMenu().setVisible(true);
                    });
                dispose();         
            }
            else {
                try {
                    String sql = "SELECT password, name, email,activationkey, pathchoice from userInfo where username = ?";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, loginUser.getText());
                    rs = pst.executeQuery();
            
                if (rs.next() == true) {
                    //getting the password from database
                    String realPass = rs.getString(1);
                    String realName = rs.getString(2);
                    String email = rs.getString(3);
                    String activationKey = rs.getString(4);
                    String currentPath = rs.getString(5);
                    //getting the inputted password
                    
                    if (realPass.equals(str)) { 
                        userArray[0] = realName;
                        userArray[1] = email;
                        userArray[2] = loginUser.getText();
                        userArray[3] = activationKey.toUpperCase();
                        userArray[4] = currentPath;
                        java.awt.EventQueue.invokeLater(() -> {
                            new jframeMainMenu().setVisible(true);
                        });
                        dispose();       
                    } else {
                        JOptionPane.showMessageDialog(null,"Password is Incorrect","Alert",JOptionPane.WARNING_MESSAGE);
                        loginPass.setText(null);
                    }                
                } else {
                    JOptionPane.showMessageDialog(null,"Username is not found","Alert",JOptionPane.WARNING_MESSAGE);
                    loginPass.setText(null);
                    loginUser.setText(null);
                }    
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);  
                
            } finally {
                try{
                    rs.close();
                    pst.close();
                    conn.close();                       
                } catch (HeadlessException |SQLException e) {
                    JOptionPane.showMessageDialog(null, e);   
                }
            }
        }
    }     

    }//GEN-LAST:event_buttonLoginActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

    }//GEN-LAST:event_jLabel8MouseClicked

    private void buttonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuessActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new jframeGuestLogin().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_buttonGuessActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGuess;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonSignUp;
    private javax.swing.JPanel inputEmail;
    private javax.swing.JPanel inputPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField loginPass;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JPanel panelEmpty;
    private javax.swing.JPanel panelEmpty1;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelSignUpButton;
    private javax.swing.JPanel panelTitle;
    private javax.swing.JPanel panelUserPass;
    private javax.swing.JPanel panelUserSignUp;
    private javax.swing.JPanel panelUsername;
    // End of variables declaration//GEN-END:variables
}
