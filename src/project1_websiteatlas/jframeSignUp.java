
package project1_websiteatlas;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jframeSignUp extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public jframeSignUp() {
        initComponents();
        setIcon();
        conn = Project1_WebsiteAtlas.ConnectDb();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainWindow = new javax.swing.JPanel();
        panelEmpty = new javax.swing.JPanel();
        panelTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelEmpty1 = new javax.swing.JPanel();
        panelForm = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS");

        panelEmpty.setPreferredSize(new java.awt.Dimension(1024, 20));

        javax.swing.GroupLayout panelEmptyLayout = new javax.swing.GroupLayout(panelEmpty);
        panelEmpty.setLayout(panelEmptyLayout);
        panelEmptyLayout.setHorizontalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        panelEmptyLayout.setVerticalGroup(
            panelEmptyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty);

        panelTitle.setPreferredSize(new java.awt.Dimension(1024, 100));
        panelTitle.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WEBSITE ATLAS");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 60));
        panelTitle.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoApplication.png"))); // NOI18N
        panelTitle.add(jLabel2, java.awt.BorderLayout.PAGE_END);

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
            .addGap(0, 20, Short.MAX_VALUE)
        );

        mainWindow.add(panelEmpty1);

        panelForm.setPreferredSize(new java.awt.Dimension(500, 335));

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(118, 118, 118));
        jLabel3.setText("Name:");
        jLabel3.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel2.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jTextField1.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel2.add(jTextField1, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel4.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(118, 118, 118));
        jLabel5.setText("Email:");
        jLabel5.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel4.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        jTextField3.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel4.add(jTextField3, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel5.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(118, 118, 118));
        jLabel6.setText("Username:");
        jLabel6.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel5.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jTextField4.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel5.add(jTextField4, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel6.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(118, 118, 118));
        jLabel7.setText("Password:");
        jLabel7.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel6.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jPasswordField2.setMinimumSize(new java.awt.Dimension(7, 25));
        jPasswordField2.setPreferredSize(new java.awt.Dimension(112, 25));
        jPanel6.add(jPasswordField2, java.awt.BorderLayout.PAGE_END);

        panelForm.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel7.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(118, 118, 118));
        jLabel8.setText("Confirm Password:");
        jLabel8.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel7.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPasswordField1.setMinimumSize(new java.awt.Dimension(7, 25));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(112, 25));
        jPanel7.add(jPasswordField1, java.awt.BorderLayout.PAGE_END);

        panelForm.add(jPanel7);

        jPanel3.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel3.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(118, 118, 118));
        jLabel4.setText("Activation Key:");
        jLabel4.setPreferredSize(new java.awt.Dimension(109, 20));
        jPanel3.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jTextField2.setPreferredSize(new java.awt.Dimension(10, 25));
        jPanel3.add(jTextField2, java.awt.BorderLayout.CENTER);

        panelForm.add(jPanel3);

        mainWindow.add(panelForm);

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 110));

        jPanel10.setPreferredSize(new java.awt.Dimension(1024, 25));
        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel8.setMinimumSize(new java.awt.Dimension(500, 44));
        jPanel8.setPreferredSize(new java.awt.Dimension(260, 25));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Already have an account? ");
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 22));
        jPanel8.add(jLabel9, java.awt.BorderLayout.LINE_START);
        jLabel9.getAccessibleContext().setAccessibleDescription("");

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setText("Sign In");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel8);

        jPanel1.add(jPanel10);

        jPanel9.setPreferredSize(new java.awt.Dimension(1024, 5));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);

        jButton1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jButton1.setText("Sign Up");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        mainWindow.add(jPanel1);

        getContentPane().add(mainWindow, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            new jframeLogin().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new jframeLogin().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel mainWindow;
    private javax.swing.JPanel panelEmpty;
    private javax.swing.JPanel panelEmpty1;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelTitle;
    // End of variables declaration//GEN-END:variables
}
