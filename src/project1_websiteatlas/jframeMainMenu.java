
package project1_websiteatlas;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.net.URI;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class jframeMainMenu extends javax.swing.JFrame {

    boolean a = false;
    CardLayout cardLayout;
    JPanel buttonShow;
    JPanel buttonShow2;
    Color colorHover = new Color(212,212,212);
    Color colorNormal = new Color(224,224,224);
    Color colorSelected = new Color(240,240,240);
    
    public jframeMainMenu() {
        initComponents();
        setIcon();
        cardLayout = (CardLayout) (dashMain.getLayout());
        this.buttonShow = buttonHome;
        this.buttonShow2 = buttonHome1;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        titleMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JPanel();
        buttonHome1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonVideos = new javax.swing.JPanel();
        buttonVideos1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        buttonStudy = new javax.swing.JPanel();
        buttonStudy1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buttonProfile = new javax.swing.JPanel();
        buttonProfile1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonGrades = new javax.swing.JPanel();
        buttonGrades1 = new javax.swing.JPanel();
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
        dashMain = new javax.swing.JPanel();
        dashHome = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        homePathway = new javax.swing.JPanel();
        homeTitlePath = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homeSpace = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        homeSpace1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        videoCSS = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        videoSQL2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        videoCSS2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        videoJS2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        videoHTML2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        videoSQL = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        videoJS = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        videoHTML = new javax.swing.JLabel();
        dashProfile = new javax.swing.JPanel();
        dashQuest = new javax.swing.JPanel();
        dashGrades = new javax.swing.JPanel();
        dashResources = new javax.swing.JPanel();
        dashVideos = new javax.swing.JPanel();
        dashDiscussion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSITE ATLAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(390, 150));

        panelMenu.setBackground(new java.awt.Color(224, 224, 224));
        panelMenu.setPreferredSize(new java.awt.Dimension(0, 640));
        panelMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 2));

        titleMenu.setBackground(new java.awt.Color(224, 224, 224));
        titleMenu.setPreferredSize(new java.awt.Dimension(300, 70));
        titleMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setText("MENU");
        titleMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/Line2.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(250, 2));
        jLabel3.setMinimumSize(new java.awt.Dimension(250, 2));
        titleMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 10));

        panelMenu.add(titleMenu);

        buttonHome.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonHome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonHome1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonHome1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonHome1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonHome1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonHome1MouseExited(evt);
            }
        });
        buttonHome1.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("   HOME");
        buttonHome1.add(jLabel4, java.awt.BorderLayout.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/home_20px.png"))); // NOI18N
        buttonHome1.add(jLabel5, java.awt.BorderLayout.LINE_START);

        buttonHome.add(buttonHome1);

        panelMenu.add(buttonHome);

        buttonVideos.setBackground(new java.awt.Color(224, 224, 224));
        buttonVideos.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonVideos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonVideos1.setBackground(new java.awt.Color(224, 224, 224));
        buttonVideos1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonVideos1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonVideos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonVideos1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonVideos1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonVideos1MouseExited(evt);
            }
        });
        buttonVideos1.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("   LATEST VIDEOS");
        buttonVideos1.add(jLabel12, java.awt.BorderLayout.CENTER);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/video_20px.png"))); // NOI18N
        buttonVideos1.add(jLabel13, java.awt.BorderLayout.LINE_START);

        buttonVideos.add(buttonVideos1);

        panelMenu.add(buttonVideos);

        buttonStudy.setBackground(new java.awt.Color(224, 224, 224));
        buttonStudy.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonStudy.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonStudy1.setBackground(new java.awt.Color(224, 224, 224));
        buttonStudy1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonStudy1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonStudy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonStudy1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonStudy1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonStudy1MouseExited(evt);
            }
        });
        buttonStudy1.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("   CURRENT PATHWAY");
        buttonStudy1.add(jLabel16, java.awt.BorderLayout.CENTER);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/study_20px.png"))); // NOI18N
        buttonStudy1.add(jLabel17, java.awt.BorderLayout.LINE_START);

        buttonStudy.add(buttonStudy1);

        panelMenu.add(buttonStudy);

        buttonProfile.setBackground(new java.awt.Color(224, 224, 224));
        buttonProfile.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonProfile.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonProfile1.setBackground(new java.awt.Color(224, 224, 224));
        buttonProfile1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonProfile1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonProfile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonProfile1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonProfile1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonProfile1MouseExited(evt);
            }
        });
        buttonProfile1.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("   PROFILE");
        buttonProfile1.add(jLabel6, java.awt.BorderLayout.CENTER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/profile_20px.png"))); // NOI18N
        buttonProfile1.add(jLabel7, java.awt.BorderLayout.LINE_START);

        buttonProfile.add(buttonProfile1);

        panelMenu.add(buttonProfile);

        buttonGrades.setBackground(new java.awt.Color(224, 224, 224));
        buttonGrades.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonGrades.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonGrades1.setBackground(new java.awt.Color(224, 224, 224));
        buttonGrades1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonGrades1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonGrades1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGrades1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGrades1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGrades1MouseExited(evt);
            }
        });
        buttonGrades1.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("   GRADES");
        buttonGrades1.add(jLabel10, java.awt.BorderLayout.CENTER);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/grades_20px.png"))); // NOI18N
        buttonGrades1.add(jLabel11, java.awt.BorderLayout.LINE_START);

        buttonGrades.add(buttonGrades1);

        panelMenu.add(buttonGrades);

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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/file_20px.png"))); // NOI18N
        buttonContact1.add(jLabel15, java.awt.BorderLayout.LINE_START);

        buttonContact.add(buttonContact1);

        panelMenu.add(buttonContact);

        panelSpace.setBackground(new java.awt.Color(224, 224, 224));
        panelSpace.setPreferredSize(new java.awt.Dimension(300, 150));

        javax.swing.GroupLayout panelSpaceLayout = new javax.swing.GroupLayout(panelSpace);
        panelSpace.setLayout(panelSpaceLayout);
        panelSpaceLayout.setHorizontalGroup(
            panelSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelSpaceLayout.setVerticalGroup(
            panelSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        panelMenu.add(panelSpace);

        titleMenu1.setBackground(new java.awt.Color(224, 224, 224));
        titleMenu1.setPreferredSize(new java.awt.Dimension(300, 20));
        titleMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/Line2.png"))); // NOI18N
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

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/logout_20px.png"))); // NOI18N
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

        dashHeader.setToolTipText("");
        dashHeader.setPreferredSize(new java.awt.Dimension(1024, 70));
        dashHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashTitleHeader.setFont(new java.awt.Font("SansSerif", 1, 25)); // NOI18N
        dashTitleHeader.setText("  WEBSITE ATLAS");
        dashHeader.add(dashTitleHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 340, 70));

        buttonHover.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonHover.setMinimumSize(new java.awt.Dimension(24, 24));
        buttonHover.setPreferredSize(new java.awt.Dimension(24, 24));
        buttonHover.setRequestFocusEnabled(false);
        buttonHover.setLayout(new java.awt.BorderLayout());

        buttonMenu.setBackground(new java.awt.Color(51, 51, 0));
        buttonMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/menu_32px.png"))); // NOI18N
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
        buttonHover.add(buttonMenu, java.awt.BorderLayout.PAGE_START);

        dashHeader.add(buttonHover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        dashBoard.add(dashHeader, java.awt.BorderLayout.NORTH);

        dashMain.setLayout(new java.awt.CardLayout());

        dashHome.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1024, 1024));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(979, 1600));
        jScrollPane1.setRequestFocusEnabled(false);

        homePathway.setMaximumSize(new java.awt.Dimension(1024, 1024));
        homePathway.setMinimumSize(new java.awt.Dimension(1024, 151));
        homePathway.setPreferredSize(new java.awt.Dimension(977, 1600));

        homeTitlePath.setPreferredSize(new java.awt.Dimension(977, 30));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setText("PATHWAYS AVAILABLE");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLong.png"))); // NOI18N
        jLabel21.setMaximumSize(new java.awt.Dimension(300, 2));
        jLabel21.setMinimumSize(new java.awt.Dimension(300, 2));
        jLabel21.setPreferredSize(new java.awt.Dimension(300, 2));

        javax.swing.GroupLayout homeTitlePathLayout = new javax.swing.GroupLayout(homeTitlePath);
        homeTitlePath.setLayout(homeTitlePathLayout);
        homeTitlePathLayout.setHorizontalGroup(
            homeTitlePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTitlePathLayout.createSequentialGroup()
                .addGroup(homeTitlePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 767, Short.MAX_VALUE))
        );
        homeTitlePathLayout.setVerticalGroup(
            homeTitlePathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeTitlePathLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        homePathway.add(homeTitlePath);

        jPanel2.setPreferredSize(new java.awt.Dimension(977, 185));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        homeSpace.setPreferredSize(new java.awt.Dimension(977, 15));

        javax.swing.GroupLayout homeSpaceLayout = new javax.swing.GroupLayout(homeSpace);
        homeSpace.setLayout(homeSpaceLayout);
        homeSpaceLayout.setHorizontalGroup(
            homeSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        homeSpaceLayout.setVerticalGroup(
            homeSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        jPanel2.add(homeSpace);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoHTML.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel22);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoCSS.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel23);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoJS.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel24);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/icoSQL.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel25);

        homePathway.add(jPanel2);

        jPanel7.setPreferredSize(new java.awt.Dimension(977, 30));

        jLabel27.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel27.setText("LATEST TUTORIAL VIDEOS");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLong.png"))); // NOI18N
        jLabel28.setMaximumSize(new java.awt.Dimension(300, 2));
        jLabel28.setMinimumSize(new java.awt.Dimension(300, 2));
        jLabel28.setPreferredSize(new java.awt.Dimension(300, 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 742, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        homePathway.add(jPanel7);

        homeSpace1.setPreferredSize(new java.awt.Dimension(977, 15));

        javax.swing.GroupLayout homeSpace1Layout = new javax.swing.GroupLayout(homeSpace1);
        homeSpace1.setLayout(homeSpace1Layout);
        homeSpace1Layout.setHorizontalGroup(
            homeSpace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        homeSpace1Layout.setVerticalGroup(
            homeSpace1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        homePathway.add(homeSpace1);

        jPanel8.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel8.setLayout(new java.awt.BorderLayout());

        videoCSS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoCSS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoCSS.jpg"))); // NOI18N
        videoCSS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoCSS.setPreferredSize(new java.awt.Dimension(977, 140));
        videoCSS.setRequestFocusEnabled(false);
        videoCSS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoCSSMouseClicked(evt);
            }
        });
        jPanel8.add(videoCSS, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel8);

        jPanel10.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel10.setLayout(new java.awt.BorderLayout());

        videoSQL2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoSQL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoSQL2.jpg"))); // NOI18N
        videoSQL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoSQL2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoSQL2.setRequestFocusEnabled(false);
        jPanel10.add(videoSQL2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel11.setLayout(new java.awt.BorderLayout());

        videoCSS2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoCSS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoCSS2.jpg"))); // NOI18N
        videoCSS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoCSS2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoCSS2.setRequestFocusEnabled(false);
        jPanel11.add(videoCSS2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel11);

        jPanel12.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel12.setLayout(new java.awt.BorderLayout());

        videoJS2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoJS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoJS2.jpg"))); // NOI18N
        videoJS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoJS2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoJS2.setRequestFocusEnabled(false);
        jPanel12.add(videoJS2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel12);

        jPanel13.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel13.setLayout(new java.awt.BorderLayout());

        videoHTML2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoHTML2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoHTML2.jpg"))); // NOI18N
        videoHTML2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoHTML2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoHTML2.setRequestFocusEnabled(false);
        jPanel13.add(videoHTML2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel14.setLayout(new java.awt.BorderLayout());

        videoSQL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoSQL.jpg"))); // NOI18N
        videoSQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoSQL.setPreferredSize(new java.awt.Dimension(977, 140));
        videoSQL.setRequestFocusEnabled(false);
        jPanel14.add(videoSQL, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel15.setLayout(new java.awt.BorderLayout());

        videoJS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoJS.jpg"))); // NOI18N
        videoJS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoJS.setPreferredSize(new java.awt.Dimension(977, 140));
        videoJS.setRequestFocusEnabled(false);
        jPanel15.add(videoJS, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel15);

        jPanel16.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel16.setLayout(new java.awt.BorderLayout());

        videoHTML.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoHTML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoHTML.jpg"))); // NOI18N
        videoHTML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoHTML.setPreferredSize(new java.awt.Dimension(977, 140));
        videoHTML.setRequestFocusEnabled(false);
        jPanel16.add(videoHTML, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel16);

        jScrollPane1.setViewportView(homePathway);

        dashHome.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        dashMain.add(dashHome, "dashHome");

        javax.swing.GroupLayout dashProfileLayout = new javax.swing.GroupLayout(dashProfile);
        dashProfile.setLayout(dashProfileLayout);
        dashProfileLayout.setHorizontalGroup(
            dashProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashProfileLayout.setVerticalGroup(
            dashProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashProfile, "dashProfile");

        dashQuest.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout dashQuestLayout = new javax.swing.GroupLayout(dashQuest);
        dashQuest.setLayout(dashQuestLayout);
        dashQuestLayout.setHorizontalGroup(
            dashQuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashQuestLayout.setVerticalGroup(
            dashQuestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashQuest, "dashQuest");

        dashGrades.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout dashGradesLayout = new javax.swing.GroupLayout(dashGrades);
        dashGrades.setLayout(dashGradesLayout);
        dashGradesLayout.setHorizontalGroup(
            dashGradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashGradesLayout.setVerticalGroup(
            dashGradesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashGrades, "dashGrades");

        dashResources.setBackground(new java.awt.Color(153, 102, 0));

        javax.swing.GroupLayout dashResourcesLayout = new javax.swing.GroupLayout(dashResources);
        dashResources.setLayout(dashResourcesLayout);
        dashResourcesLayout.setHorizontalGroup(
            dashResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashResourcesLayout.setVerticalGroup(
            dashResourcesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashResources, "dashResources");

        dashVideos.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout dashVideosLayout = new javax.swing.GroupLayout(dashVideos);
        dashVideos.setLayout(dashVideosLayout);
        dashVideosLayout.setHorizontalGroup(
            dashVideosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashVideosLayout.setVerticalGroup(
            dashVideosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashVideos, "dashVideos");

        dashDiscussion.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout dashDiscussionLayout = new javax.swing.GroupLayout(dashDiscussion);
        dashDiscussion.setLayout(dashDiscussionLayout);
        dashDiscussionLayout.setHorizontalGroup(
            dashDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        dashDiscussionLayout.setVerticalGroup(
            dashDiscussionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        dashMain.add(dashDiscussion, "dashDiscussion");

        dashBoard.add(dashMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(dashBoard, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     
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
            changeimage(button, "/project1_images/menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(300, menushowhide.getHeight()));
            changeimage(button, "/project1_images/back_32px.png");
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
    
    public void desktopLink(String link) {
        try {
            URI newURI = new URI(link);
            Desktop.getDesktop().browse(newURI);
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(jframeMainMenu.class.getName()).log(Level.SEVERE, null, ex);
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

    private void buttonHome1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHome1MouseClicked
        cardLayout.show(dashMain,"dashHome");
        selectShow(buttonHome, buttonHome,buttonHome1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonHome1MouseClicked

    private void buttonHome1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHome1MouseEntered
        hoverShow(buttonHome,buttonHome,buttonHome1,colorHover);
        
    }//GEN-LAST:event_buttonHome1MouseEntered

    private void buttonHome1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonHome1MouseExited
        hoverShow(buttonHome,buttonHome,buttonHome1,colorNormal);

    }//GEN-LAST:event_buttonHome1MouseExited

    private void buttonProfile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProfile1MouseClicked
        cardLayout.show(dashMain,"dashProfile");
        selectShow(buttonProfile, buttonProfile,buttonProfile1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonProfile1MouseClicked

    private void buttonProfile1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProfile1MouseEntered
        hoverShow(buttonProfile,buttonProfile,buttonProfile1,colorHover);
    }//GEN-LAST:event_buttonProfile1MouseEntered

    private void buttonProfile1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProfile1MouseExited
        hoverShow(buttonProfile,buttonProfile,buttonProfile1,colorNormal);
    }//GEN-LAST:event_buttonProfile1MouseExited

    private void buttonGrades1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGrades1MouseClicked
        cardLayout.show(dashMain,"dashGrades");
        selectShow(buttonGrades, buttonGrades,buttonGrades1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonGrades1MouseClicked

    private void buttonGrades1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGrades1MouseEntered
        hoverShow(buttonGrades,buttonGrades,buttonGrades1,colorHover);
    }//GEN-LAST:event_buttonGrades1MouseEntered

    private void buttonGrades1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGrades1MouseExited
        hoverShow(buttonGrades,buttonGrades,buttonGrades1,colorNormal);
    }//GEN-LAST:event_buttonGrades1MouseExited

    private void buttonVideos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVideos1MouseClicked
        cardLayout.show(dashMain,"dashVideos");
        selectShow(buttonVideos, buttonVideos,buttonVideos1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonVideos1MouseClicked

    private void buttonVideos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVideos1MouseEntered
        hoverShow(buttonVideos,buttonVideos,buttonVideos1,colorHover);
        
    }//GEN-LAST:event_buttonVideos1MouseEntered

    private void buttonVideos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonVideos1MouseExited
        hoverShow(buttonVideos,buttonVideos,buttonVideos1,colorNormal);
    }//GEN-LAST:event_buttonVideos1MouseExited

    private void buttonContact1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContact1MouseClicked
        cardLayout.show(dashMain,"dashResources");
        selectShow(buttonContact, buttonContact,buttonContact1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonContact1MouseClicked

    private void buttonContact1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContact1MouseEntered
        hoverShow(buttonContact,buttonContact,buttonContact1,colorHover);
    }//GEN-LAST:event_buttonContact1MouseEntered

    private void buttonContact1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContact1MouseExited
        hoverShow(buttonContact,buttonContact,buttonContact1,colorNormal);
    }//GEN-LAST:event_buttonContact1MouseExited

    private void buttonLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogout1MouseClicked
        java.awt.EventQueue.invokeLater(() -> {
            new jframeLogin().setVisible(true);
        });
        dispose();
    }//GEN-LAST:event_buttonLogout1MouseClicked

    private void buttonLogout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogout1MouseEntered
        hoverShow(buttonLogout,buttonLogout,buttonLogout1,colorHover);
    }//GEN-LAST:event_buttonLogout1MouseEntered

    private void buttonLogout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogout1MouseExited
        hoverShow(buttonLogout,buttonLogout,buttonLogout1,colorNormal);
    }//GEN-LAST:event_buttonLogout1MouseExited

    private void buttonStudy1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStudy1MouseExited
        hoverShow(buttonStudy,buttonStudy,buttonStudy1,colorNormal);
    }//GEN-LAST:event_buttonStudy1MouseExited

    private void buttonStudy1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStudy1MouseEntered
        hoverShow(buttonStudy,buttonStudy,buttonStudy1,colorHover);
    }//GEN-LAST:event_buttonStudy1MouseEntered

    private void buttonStudy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStudy1MouseClicked
        cardLayout.show(dashMain,"dashDiscussion");
        selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonStudy1MouseClicked

    private void videoCSSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoCSSMouseClicked
        desktopLink("https://www.youtube.com/watch?v=D-h8L5hgW-w&t=4s");
    }//GEN-LAST:event_videoCSSMouseClicked

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonContact;
    private javax.swing.JPanel buttonContact1;
    private javax.swing.JPanel buttonGrades;
    private javax.swing.JPanel buttonGrades1;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonHome1;
    private javax.swing.JPanel buttonHover;
    private javax.swing.JPanel buttonLogout;
    private javax.swing.JPanel buttonLogout1;
    private javax.swing.JLabel buttonMenu;
    private javax.swing.JPanel buttonProfile;
    private javax.swing.JPanel buttonProfile1;
    private javax.swing.JPanel buttonStudy;
    private javax.swing.JPanel buttonStudy1;
    private javax.swing.JPanel buttonVideos;
    private javax.swing.JPanel buttonVideos1;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel dashDiscussion;
    private javax.swing.JPanel dashGrades;
    private javax.swing.JPanel dashHeader;
    private javax.swing.JPanel dashHome;
    private javax.swing.JPanel dashMain;
    private javax.swing.JPanel dashProfile;
    private javax.swing.JPanel dashQuest;
    private javax.swing.JPanel dashResources;
    private javax.swing.JPanel dashSpace;
    private javax.swing.JLabel dashTitleHeader;
    private javax.swing.JPanel dashVideos;
    private javax.swing.JPanel homePathway;
    private javax.swing.JPanel homeSpace;
    private javax.swing.JPanel homeSpace1;
    private javax.swing.JPanel homeTitlePath;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSpace;
    private javax.swing.JPanel titleMenu;
    private javax.swing.JPanel titleMenu1;
    private javax.swing.JLabel videoCSS;
    private javax.swing.JLabel videoCSS2;
    private javax.swing.JLabel videoHTML;
    private javax.swing.JLabel videoHTML2;
    private javax.swing.JLabel videoJS;
    private javax.swing.JLabel videoJS2;
    private javax.swing.JLabel videoSQL;
    private javax.swing.JLabel videoSQL2;
    // End of variables declaration//GEN-END:variables
}
