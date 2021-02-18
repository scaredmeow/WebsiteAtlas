
package websiteatlas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public final class jframeAdmin extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean a = false;
    static int i = -1,limit,j,ctr;
    CardLayout cardLayout, cardLayout2;
    JPanel buttonShow, buttonShow2;
    Color colorHover = new Color(212,212,212);
    Color colorNormal = new Color(224,224,224);
    Color colorSelected = new Color(240,240,240);
    Color colorSide = new Color(50,50,250);
    static String[] nameLeaderboard;
    static int[] scoreLeaderboard;
    static int overall,rowNumber =0,x,y,place,arr;
    static String arr2;
    JLabel[] label;
    public jframeAdmin() {
        
        initComponents();
        setIcon();
        
        conn = WebsiteAtlas.ConnectDb();
        tablePopulate();
        tablePopulate2();
        cardLayout = (CardLayout) (dashMain.getLayout());
        this.buttonShow = buttonRecord;
        this.buttonShow2 = buttonRecord1;  
        getnumberofrows();
        
        nameLeaderboard = new String[rowNumber];
        scoreLeaderboard = new int[rowNumber];
        getallScore();
        this.label = new JLabel[]{first, second,third,fourth,fifth,sixth,seventh,eight,ninth,tenth};
        leaderboard();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        titleMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonRecord = new javax.swing.JPanel();
        buttonRecord1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonLeaderboard = new javax.swing.JPanel();
        buttonLeaderboard1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buttonQuiz = new javax.swing.JPanel();
        buttonQuiz1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buttonContact = new javax.swing.JPanel();
        buttonContact1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelSpace = new javax.swing.JPanel();
        titleMenu1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JPanel();
        buttonLogout1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        dashBoard = new javax.swing.JPanel();
        dashSpace = new javax.swing.JPanel();
        dashHeader = new javax.swing.JPanel();
        dashTitleHeader = new javax.swing.JLabel();
        buttonHover = new javax.swing.JPanel();
        buttonMenu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dashMain = new javax.swing.JPanel();
        dashRecord = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        userRecord = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        userQuizTable = new javax.swing.JTable();
        dashLeaderboard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        third = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        fourth = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        fifth = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        sixth = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        seventh = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        eight = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        ninth = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        tenth = new javax.swing.JLabel();
        dashQuiz = new javax.swing.JPanel();
        dashContact = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(390, 150));
        setResizable(false);

        panelMenu.setBackground(new java.awt.Color(224, 224, 224));
        panelMenu.setPreferredSize(new java.awt.Dimension(0, 640));
        panelMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        titleMenu.setBackground(new java.awt.Color(224, 224, 224));
        titleMenu.setPreferredSize(new java.awt.Dimension(300, 70));
        titleMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("MENU");
        titleMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line2.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(250, 2));
        jLabel3.setMinimumSize(new java.awt.Dimension(250, 2));
        titleMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 10));

        panelMenu.add(titleMenu);

        buttonRecord.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonRecord.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonRecord1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonRecord1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonRecord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRecord1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonRecord1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonRecord1MouseExited(evt);
            }
        });
        buttonRecord1.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("   STUDENT RECORDS");
        buttonRecord1.add(jLabel6, java.awt.BorderLayout.CENTER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/block_chain_20px.png"))); // NOI18N
        buttonRecord1.add(jLabel7, java.awt.BorderLayout.LINE_START);

        buttonRecord.add(buttonRecord1);

        panelMenu.add(buttonRecord);

        buttonLeaderboard.setBackground(new java.awt.Color(224, 224, 224));
        buttonLeaderboard.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonLeaderboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonLeaderboard1.setBackground(new java.awt.Color(224, 224, 224));
        buttonLeaderboard1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLeaderboard1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonLeaderboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLeaderboard1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLeaderboard1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLeaderboard1MouseExited(evt);
            }
        });
        buttonLeaderboard1.setLayout(new java.awt.BorderLayout());

        jLabel16.setBackground(new java.awt.Color(224, 224, 224));
        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("   LEADERBOARD");
        buttonLeaderboard1.add(jLabel16, java.awt.BorderLayout.CENTER);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/certificate_20px.png"))); // NOI18N
        buttonLeaderboard1.add(jLabel17, java.awt.BorderLayout.LINE_START);

        buttonLeaderboard.add(buttonLeaderboard1);

        panelMenu.add(buttonLeaderboard);

        buttonQuiz.setBackground(new java.awt.Color(224, 224, 224));
        buttonQuiz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonQuiz.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonQuiz.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonQuiz1.setBackground(new java.awt.Color(224, 224, 224));
        buttonQuiz1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonQuiz1.setEnabled(false);
        buttonQuiz1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonQuiz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonQuiz1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonQuiz1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonQuiz1MouseExited(evt);
            }
        });
        buttonQuiz1.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("   QUIZ MODIFICATION");
        jLabel10.setEnabled(false);
        buttonQuiz1.add(jLabel10, java.awt.BorderLayout.CENTER);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questions_20px_1.png"))); // NOI18N
        jLabel11.setEnabled(false);
        buttonQuiz1.add(jLabel11, java.awt.BorderLayout.LINE_START);

        buttonQuiz.add(buttonQuiz1);

        panelMenu.add(buttonQuiz);

        buttonContact.setBackground(new java.awt.Color(224, 224, 224));
        buttonContact.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonContact.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonContact1.setBackground(new java.awt.Color(224, 224, 224));
        buttonContact1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonContact1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonContact1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonContact1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonContact1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonContact1MouseExited(evt);
            }
        });
        buttonContact1.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("   CONTACT US");
        buttonContact1.add(jLabel14, java.awt.BorderLayout.CENTER);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file_20px.png"))); // NOI18N
        buttonContact1.add(jLabel15, java.awt.BorderLayout.LINE_START);

        buttonContact.add(buttonContact1);

        panelMenu.add(buttonContact);

        panelSpace.setBackground(new java.awt.Color(224, 224, 224));
        panelSpace.setPreferredSize(new java.awt.Dimension(300, 280));

        javax.swing.GroupLayout panelSpaceLayout = new javax.swing.GroupLayout(panelSpace);
        panelSpace.setLayout(panelSpaceLayout);
        panelSpaceLayout.setHorizontalGroup(
            panelSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelSpaceLayout.setVerticalGroup(
            panelSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        panelMenu.add(panelSpace);

        titleMenu1.setBackground(new java.awt.Color(224, 224, 224));
        titleMenu1.setPreferredSize(new java.awt.Dimension(300, 20));
        titleMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line2.png"))); // NOI18N
        jLabel19.setMaximumSize(new java.awt.Dimension(250, 2));
        jLabel19.setMinimumSize(new java.awt.Dimension(250, 2));
        titleMenu1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 250, 10));

        panelMenu.add(titleMenu1);

        buttonLogout.setBackground(new java.awt.Color(224, 224, 224));
        buttonLogout.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonLogout.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonLogout1.setBackground(new java.awt.Color(224, 224, 224));
        buttonLogout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonLogout1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLogout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLogout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLogout1MouseExited(evt);
            }
        });
        buttonLogout1.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("   LOG OUT");
        buttonLogout1.add(jLabel18, java.awt.BorderLayout.CENTER);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_20px.png"))); // NOI18N
        buttonLogout1.add(jLabel20, java.awt.BorderLayout.LINE_START);

        buttonLogout.add(buttonLogout1);

        panelMenu.add(buttonLogout);

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        dashBoard.setPreferredSize(new java.awt.Dimension(1024, 640));
        dashBoard.setLayout(new java.awt.BorderLayout());

        dashSpace.setPreferredSize(new java.awt.Dimension(28, 590));

        javax.swing.GroupLayout dashSpaceLayout = new javax.swing.GroupLayout(dashSpace);
        dashSpace.setLayout(dashSpaceLayout);
        dashSpaceLayout.setHorizontalGroup(
            dashSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        dashSpaceLayout.setVerticalGroup(
            dashSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashBoard.add(dashSpace, java.awt.BorderLayout.LINE_START);

        dashHeader.setPreferredSize(new java.awt.Dimension(1024, 70));
        dashHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashTitleHeader.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        dashTitleHeader.setText("  WEBSITE ATLAS");
        dashHeader.add(dashTitleHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 340, 40));

        buttonHover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHover.setMinimumSize(new java.awt.Dimension(24, 24));
        buttonHover.setPreferredSize(new java.awt.Dimension(24, 24));
        buttonHover.setRequestFocusEnabled(false);

        buttonMenu.setBackground(new java.awt.Color(51, 51, 0));
        buttonMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_32px.png"))); // NOI18N
        buttonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMenu.setRequestFocusEnabled(false);
        buttonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMenuMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buttonHoverLayout = new javax.swing.GroupLayout(buttonHover);
        buttonHover.setLayout(buttonHoverLayout);
        buttonHoverLayout.setHorizontalGroup(
            buttonHoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        buttonHoverLayout.setVerticalGroup(
            buttonHoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonHoverLayout.createSequentialGroup()
                .addComponent(buttonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        dashHeader.add(buttonHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1024, 2));
        jLabel8.setMinimumSize(new java.awt.Dimension(1024, 2));
        jLabel8.setPreferredSize(new java.awt.Dimension(1024, 2));
        dashHeader.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1080, 10));

        dashBoard.add(dashHeader, java.awt.BorderLayout.NORTH);

        dashMain.setLayout(new java.awt.CardLayout());

        dashRecord.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Current Student Record");
        dashRecord.add(jLabel2);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(980, 240));

        userRecord.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userRecord.setPreferredSize(new java.awt.Dimension(500, 600));
        jScrollPane2.setViewportView(userRecord);

        dashRecord.add(jScrollPane2);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Current Quiz Record");
        dashRecord.add(jLabel9);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(980, 240));

        userQuizTable.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userQuizTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        userQuizTable.setPreferredSize(new java.awt.Dimension(500, 600));
        jScrollPane3.setViewportView(userQuizTable);

        dashRecord.add(jScrollPane3);

        dashMain.add(dashRecord, "dashRecord");

        dashLeaderboard.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        jPanel1.setPreferredSize(new java.awt.Dimension(980, 50));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trophy_40px.png"))); // NOI18N
        jPanel1.add(jLabel12, java.awt.BorderLayout.LINE_START);

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel13.setText("  LEADERBOARD");
        jPanel1.add(jLabel13, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel21.setText("1");
        jPanel2.add(jLabel21, java.awt.BorderLayout.LINE_START);

        first.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel2.add(first, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel23.setText("2");
        jPanel3.add(jLabel23, java.awt.BorderLayout.LINE_START);

        second.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel3.add(second, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel25.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel25.setText("3");
        jPanel4.add(jLabel25, java.awt.BorderLayout.LINE_START);

        third.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel4.add(third, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel27.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel27.setText("4");
        jPanel5.add(jLabel27, java.awt.BorderLayout.LINE_START);

        fourth.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel5.add(fourth, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel29.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel29.setText("5");
        jPanel6.add(jLabel29, java.awt.BorderLayout.LINE_START);

        fifth.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel6.add(fifth, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel6);

        jPanel7.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel31.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel31.setText("6");
        jPanel7.add(jLabel31, java.awt.BorderLayout.LINE_START);

        sixth.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel7.add(sixth, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel7);

        jPanel8.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel33.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel33.setText("7");
        jPanel8.add(jLabel33, java.awt.BorderLayout.LINE_START);

        seventh.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel8.add(seventh, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel35.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel35.setText("8");
        jPanel9.add(jLabel35, java.awt.BorderLayout.LINE_START);

        eight.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel9.add(eight, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel37.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel37.setText("9");
        jPanel10.add(jLabel37, java.awt.BorderLayout.LINE_START);

        ninth.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel10.add(ninth, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(980, 30));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel39.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel39.setText("10");
        jPanel11.add(jLabel39, java.awt.BorderLayout.LINE_START);

        tenth.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jPanel11.add(tenth, java.awt.BorderLayout.CENTER);

        dashLeaderboard.add(jPanel11);

        dashMain.add(dashLeaderboard, "dashLeaderboard");

        javax.swing.GroupLayout dashQuizLayout = new javax.swing.GroupLayout(dashQuiz);
        dashQuiz.setLayout(dashQuizLayout);
        dashQuizLayout.setHorizontalGroup(
            dashQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashQuizLayout.setVerticalGroup(
            dashQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashQuiz, "dashQuiz");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jP0gVmpXQruvR0jfNGlu_contactuswhite_1.png"))); // NOI18N
        jLabel22.setPreferredSize(new java.awt.Dimension(997, 330));
        dashContact.add(jLabel22);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel24.setPreferredSize(new java.awt.Dimension(700, 50));
        dashContact.add(jLabel24);

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("<html>  <head>  <style> p {   text-transform: uppercase; text-align: justify;} </style> </head> <p> <font size = 30> Hi! Having troubles using the app? </font> <br> Horrible experience? Bug reports? Complaints?<br><br>  No Worries. Hang in there, we got you covered. <br> As much as we want a smooth sailing experience to our users, issues are inevitable. <br> Let us know by sending an email on neilchristianriego3@gmail.com and we’ll get down to business. <br><br><br> <font size = 30> No troubles? </font> <br> Great. Send us your feedback on neilriego3@gmail.com. Every feedback counts. <br><br>  We appreciate your time sending comprehensive feedback as this will guarantee quality<br> improvements in the future. We ensure every feedbacks are evaluated because we value <br> your time and effort on this matter. We hope to provide you a better experience in the future.  </p> </html>");
        jLabel26.setToolTipText("");
        jLabel26.setPreferredSize(new java.awt.Dimension(700, 400));
        dashContact.add(jLabel26);

        dashMain.add(dashContact, "dashContact");

        dashBoard.add(dashMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(dashBoard, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void leaderboard(){
        for (x = 0; x < (rowNumber -1);x++){
            place = x;
            for (y =x + 1; y < rowNumber; y++){
                if (scoreLeaderboard[place] > scoreLeaderboard[y])
                    place = y;}
                    if (place != x){
                        arr = scoreLeaderboard[x];
                        arr2 = nameLeaderboard[x];
                        scoreLeaderboard[x] = scoreLeaderboard[place];
                        nameLeaderboard[x] = nameLeaderboard[place];
                        scoreLeaderboard[place] = arr;
                        nameLeaderboard[place] = arr2;
                    }
        }

        for (x = (rowNumber-1); x !=0; x--) 
            label[(rowNumber-1)-x].setText("  " + nameLeaderboard[x] + " with a score of " + String.valueOf(scoreLeaderboard[x]));
    }
    
    public void getnumberofrows() {
        rowNumber = 0;
        String sql = "Select * from userQuiz";
        try {
            pst = conn.prepareStatement (sql);
            rs = pst.executeQuery();
            while (rs.next()){
                rowNumber ++;
            }
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                rs.close();
                pst.close();                       
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
            }
        }            
    }
    
    public void getallScore() {
        ctr = 0;
        String sql = "Select * from userQuiz";
        try {
            pst = conn.prepareStatement (sql);
            rs = pst.executeQuery();
            while (rs.next()){
                
                String name = rs.getString(2);
                String q1 = rs.getString(3);
                String q2 = rs.getString(4);
                String q3 = rs.getString(5);
                String q4 = rs.getString(6);
                String q5 = rs.getString(7);
                String q6 = rs.getString(8);
                String q7 = rs.getString(9);
                String q8 = rs.getString(10);
                String q9 = rs.getString(11);
                String q10 = rs.getString(12);
                String q11 = rs.getString(13);
                String q12 = rs.getString(14);
                String q13 = rs.getString(15);
                String q14 = rs.getString(16);
                String q15 = rs.getString(17);
                String q16 = rs.getString(18);
                String q17 = rs.getString(19);
                String q18 = rs.getString(20);
                
                overall = Integer.valueOf(q1) +
                        Integer.valueOf(q2) +
                        Integer.valueOf(q3) +
                        Integer.valueOf(q4) +
                        Integer.valueOf(q5) +
                        Integer.valueOf(q6) +
                        Integer.valueOf(q7) +
                        Integer.valueOf(q8) +
                        Integer.valueOf(q9) +
                        Integer.valueOf(q10) +
                        Integer.valueOf(q11) +
                        Integer.valueOf(q12) +
                        Integer.valueOf(q13) +
                        Integer.valueOf(q14) +
                        Integer.valueOf(q15) +
                        Integer.valueOf(q16) +
                        Integer.valueOf(q17) +
                        Integer.valueOf(q18);
                        
                        
                scoreLeaderboard[ctr] = overall;
                nameLeaderboard[ctr] = name;
                ctr ++;
            }
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                rs.close();
                pst.close(); 
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
            }
        }        
    }
    
    public void tablePopulate() {
        String sql = "Select name,email,username,password,activationkey,pathchoice,retry from userInfo";
        try {
            pst = conn.prepareStatement (sql);
            rs = pst.executeQuery();
            userRecord.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                rs.close();
                pst.close();                       
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
            }
        }
    }
    
        public void tablePopulate2() {
        String sql = "Select * from userQuiz";
        try {
            pst = conn.prepareStatement (sql);
            rs = pst.executeQuery();
            userQuizTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try{
                rs.close();
                pst.close();  

            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
            }
        }
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon img = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(img);
    }
    
    public void colorChange(JPanel h1, JPanel h2, Color h1Color) {
        h1.setBackground(h1Color);
        h2.setBackground(h1Color);
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(0, menushowhide.getHeight()));
            changeimage(button, "/images/menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(300, menushowhide.getHeight()));
            changeimage(button, "/images/back_32px.png");
        }
    }
    
    public void selectShow(JPanel state, JPanel select, JPanel select2, Color selectColor, Color normalColor) {
        if (state != buttonShow){
            colorChange(buttonShow, buttonShow2, normalColor);
            buttonShow = select;
            buttonShow2 = select2;
            colorChange(select, select2, selectColor);
        }
    }
    
    public void hoverShow(JPanel state,JPanel select, JPanel select2, Color hoverColor){
        if (state != buttonShow){
            colorChange(select, select2, hoverColor);
        }
    }
    
    
    private void buttonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseClicked
        if(a==true){
          hideshow(panelMenu, a, buttonMenu);
          SwingUtilities.updateComponentTreeUI(this);
          a=false;
        }
        else{
            hideshow(panelMenu, a, buttonMenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
        }
    }//GEN-LAST:event_buttonMenuMouseClicked

    private void buttonMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseEntered
        buttonHover.setBackground(colorHover);
    }//GEN-LAST:event_buttonMenuMouseEntered

    private void buttonMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMenuMouseExited
        buttonHover.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_buttonMenuMouseExited

    private void buttonContact1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContact1MouseClicked
        cardLayout.show(dashMain,"dashContact");
        selectShow(buttonContact, buttonContact,buttonContact1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonContact1MouseClicked

    private void buttonContact1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContact1MouseEntered
        hoverShow(buttonContact,buttonContact,buttonContact1,colorHover);
    }//GEN-LAST:event_buttonContact1MouseEntered

    private void buttonContact1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContact1MouseExited
        hoverShow(buttonContact,buttonContact,buttonContact1,colorNormal);
    }//GEN-LAST:event_buttonContact1MouseExited

    private void buttonLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogout1MouseClicked
        try{
                conn.close();
                        
                java.awt.EventQueue.invokeLater(() -> {
                    new jframeLogin().setVisible(true);
                });
                dispose();
            } catch (HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);   
        }

    }//GEN-LAST:event_buttonLogout1MouseClicked

    private void buttonLogout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogout1MouseEntered
        hoverShow(buttonLogout,buttonLogout,buttonLogout1,colorHover);
    }//GEN-LAST:event_buttonLogout1MouseEntered

    private void buttonLogout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogout1MouseExited
        hoverShow(buttonLogout,buttonLogout,buttonLogout1,colorNormal);
    }//GEN-LAST:event_buttonLogout1MouseExited

    private void buttonQuiz1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonQuiz1MouseExited
        hoverShow(buttonQuiz,buttonQuiz,buttonQuiz1,colorNormal);
    }//GEN-LAST:event_buttonQuiz1MouseExited

    private void buttonQuiz1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonQuiz1MouseEntered
        hoverShow(buttonQuiz,buttonQuiz,buttonQuiz1,colorHover);
    }//GEN-LAST:event_buttonQuiz1MouseEntered

    private void buttonQuiz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonQuiz1MouseClicked
//        cardLayout.show(dashMain,"dashQuiz");
//        selectShow(buttonQuiz, buttonQuiz,buttonQuiz1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonQuiz1MouseClicked

    private void buttonRecord1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRecord1MouseExited
        hoverShow(buttonRecord,buttonRecord,buttonRecord1,colorNormal);
    }//GEN-LAST:event_buttonRecord1MouseExited

    private void buttonRecord1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRecord1MouseEntered
        hoverShow(buttonRecord,buttonRecord,buttonRecord1,colorHover);
    }//GEN-LAST:event_buttonRecord1MouseEntered

    private void buttonRecord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRecord1MouseClicked
        tablePopulate();
        tablePopulate2();
        cardLayout.show(dashMain,"dashRecord");
        selectShow(buttonRecord, buttonRecord,buttonRecord1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonRecord1MouseClicked

    private void buttonLeaderboard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLeaderboard1MouseExited
        hoverShow(buttonLeaderboard,buttonLeaderboard,buttonLeaderboard1,colorNormal);
    }//GEN-LAST:event_buttonLeaderboard1MouseExited

    private void buttonLeaderboard1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLeaderboard1MouseEntered
        hoverShow(buttonLeaderboard,buttonLeaderboard,buttonLeaderboard1,colorHover);
    }//GEN-LAST:event_buttonLeaderboard1MouseEntered

    private void buttonLeaderboard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLeaderboard1MouseClicked
        cardLayout.show(dashMain,"dashLeaderboard");
        selectShow(buttonLeaderboard, buttonLeaderboard,buttonLeaderboard1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonLeaderboard1MouseClicked

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonContact;
    private javax.swing.JPanel buttonContact1;
    private javax.swing.JPanel buttonHover;
    private javax.swing.JPanel buttonLeaderboard;
    private javax.swing.JPanel buttonLeaderboard1;
    private javax.swing.JPanel buttonLogout;
    private javax.swing.JPanel buttonLogout1;
    private javax.swing.JLabel buttonMenu;
    private javax.swing.JPanel buttonQuiz;
    private javax.swing.JPanel buttonQuiz1;
    private javax.swing.JPanel buttonRecord;
    private javax.swing.JPanel buttonRecord1;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel dashContact;
    private javax.swing.JPanel dashHeader;
    private javax.swing.JPanel dashLeaderboard;
    private javax.swing.JPanel dashMain;
    private javax.swing.JPanel dashQuiz;
    private javax.swing.JPanel dashRecord;
    private javax.swing.JPanel dashSpace;
    private javax.swing.JLabel dashTitleHeader;
    private javax.swing.JLabel eight;
    private javax.swing.JLabel fifth;
    private javax.swing.JLabel first;
    private javax.swing.JLabel fourth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel ninth;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSpace;
    private javax.swing.JLabel second;
    private javax.swing.JLabel seventh;
    private javax.swing.JLabel sixth;
    private javax.swing.JLabel tenth;
    private javax.swing.JLabel third;
    private javax.swing.JPanel titleMenu;
    private javax.swing.JPanel titleMenu1;
    private javax.swing.JTable userQuizTable;
    private javax.swing.JTable userRecord;
    // End of variables declaration//GEN-END:variables
}
