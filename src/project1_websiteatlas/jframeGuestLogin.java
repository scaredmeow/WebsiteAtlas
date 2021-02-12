
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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.util.PropertiesManager;

public class jframeGuestLogin extends javax.swing.JFrame {

    boolean a = false;
    static int i = -1,limit,j;
    CardLayout cardLayout, cardLayout2;
    JPanel buttonShow, buttonShow2,viewHtml,viewCss,viewJs,viewSql,sideHtml,sideCss,sideJs,sideSql;
    Color colorHover = new Color(212,212,212);
    Color colorNormal = new Color(224,224,224);
    Color colorSelected = new Color(240,240,240);
    Color colorSide = new Color(50,50,250);
    SwingController ctrl = new SwingController();   
    String[] htmlArray ={"src//project1_resources//html//HTML-Week-1.pdf",
                        "src//project1_resources//html//HTML-Week-2.pdf",
                        "src//project1_resources//html//HTML-Week-3.pdf",
                        "src//project1_resources//html//HTML-Week-4.pdf",
                        "src//project1_resources//html//HTML-Week-5.pdf",
                        "src//project1_resources//html//HTML-Week-6.pdf",
                        "src//project1_resources//html//HTML-Week-7.pdf"} ;
    String[] cssArray = {};
    String[] jsArray = {};
    String[] sqlArray = {};
    public jframeGuestLogin() {
        initComponents();
        setIcon();
        cardLayout = (CardLayout) (dashMain.getLayout());
        this.buttonShow = buttonHome;
        this.buttonShow2 = buttonHome1;  
        this.viewHtml = htmlView;
//        this.viewCss = htmlView;
//        this.viewSql = htmlView;
//        this.viewJs = htmlView;
        this.sideHtml = htmlSelect;
//        this.sideCss = htmlView;
//        this.sideSql = htmlView;
//        this.sideJs = htmlView;
        openpdf(htmlLesson);
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
        buttonStudy = new javax.swing.JPanel();
        buttonStudy1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        buttonProfile = new javax.swing.JPanel();
        buttonProfile1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonDiscussion = new javax.swing.JPanel();
        buttonDiscussion1 = new javax.swing.JPanel();
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
        dashStudy = new javax.swing.JPanel();
        studyHTML = new javax.swing.JPanel();
        htmlMenu = new javax.swing.JPanel();
        htmlmenuTitle = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        htmlView = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        htmlSelect = new javax.swing.JPanel();
        htmlWeek1 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        htmlSelect1 = new javax.swing.JPanel();
        htmlWeek2 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        htmlSelect2 = new javax.swing.JPanel();
        htmlWeek3 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        htmlSelect3 = new javax.swing.JPanel();
        htmlWeek4 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        htmlSelect4 = new javax.swing.JPanel();
        htmlWeek5 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        htmlSelect5 = new javax.swing.JPanel();
        htmlWeek6 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        htmlSelect6 = new javax.swing.JPanel();
        htmlWeek7 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        htmlSelect7 = new javax.swing.JPanel();
        htmlRight = new javax.swing.JPanel();
        htmlNav = new javax.swing.JPanel();
        buttonPrev = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        htmlViewer = new javax.swing.JPanel();
        htmlOverview = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        htmlLesson = new javax.swing.JPanel();
        dashProfile = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        profileInfo = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        profileOverall = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        profileOverall2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        profileOverall3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        profileOverall4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        profileOverall5 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        dashDiscussion = new javax.swing.JPanel();
        dashContact = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
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

        buttonStudy.setBackground(new java.awt.Color(224, 224, 224));
        buttonStudy.setEnabled(false);
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
        jLabel16.setEnabled(false);
        buttonStudy1.add(jLabel16, java.awt.BorderLayout.CENTER);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/study_20px.png"))); // NOI18N
        jLabel17.setEnabled(false);
        buttonStudy1.add(jLabel17, java.awt.BorderLayout.LINE_START);

        buttonStudy.add(buttonStudy1);

        panelMenu.add(buttonStudy);

        buttonProfile.setBackground(new java.awt.Color(224, 224, 224));
        buttonProfile.setEnabled(false);
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
        jLabel6.setEnabled(false);
        buttonProfile1.add(jLabel6, java.awt.BorderLayout.CENTER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/profile_20px.png"))); // NOI18N
        jLabel7.setEnabled(false);
        buttonProfile1.add(jLabel7, java.awt.BorderLayout.LINE_START);

        buttonProfile.add(buttonProfile1);

        panelMenu.add(buttonProfile);

        buttonDiscussion.setBackground(new java.awt.Color(224, 224, 224));
        buttonDiscussion.setEnabled(false);
        buttonDiscussion.setPreferredSize(new java.awt.Dimension(300, 50));
        buttonDiscussion.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        buttonDiscussion1.setBackground(new java.awt.Color(224, 224, 224));
        buttonDiscussion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDiscussion1.setEnabled(false);
        buttonDiscussion1.setPreferredSize(new java.awt.Dimension(260, 50));
        buttonDiscussion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDiscussion1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDiscussion1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDiscussion1MouseExited(evt);
            }
        });
        buttonDiscussion1.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("   DISCUSSION FORUM");
        jLabel10.setEnabled(false);
        buttonDiscussion1.add(jLabel10, java.awt.BorderLayout.CENTER);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/communicate_20px_1.png"))); // NOI18N
        jLabel11.setEnabled(false);
        buttonDiscussion1.add(jLabel11, java.awt.BorderLayout.LINE_START);

        buttonDiscussion.add(buttonDiscussion1);

        panelMenu.add(buttonDiscussion);

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
        panelSpace.setPreferredSize(new java.awt.Dimension(300, 200));

        javax.swing.GroupLayout panelSpaceLayout = new javax.swing.GroupLayout(panelSpace);
        panelSpace.setLayout(panelSpaceLayout);
        panelSpaceLayout.setHorizontalGroup(
            panelSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        panelSpaceLayout.setVerticalGroup(
            panelSpaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLongGrey.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1024, 2));
        jLabel8.setMinimumSize(new java.awt.Dimension(1024, 2));
        jLabel8.setPreferredSize(new java.awt.Dimension(1024, 2));
        dashHeader.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1080, 10));

        dashBoard.add(dashHeader, java.awt.BorderLayout.NORTH);

        dashMain.setLayout(new java.awt.CardLayout());

        dashHome.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1024, 1024));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(997, 1600));
        jScrollPane1.setRequestFocusEnabled(false);

        homePathway.setMaximumSize(new java.awt.Dimension(1024, 1024));
        homePathway.setMinimumSize(new java.awt.Dimension(1024, 151));
        homePathway.setPreferredSize(new java.awt.Dimension(977, 1600));

        homeTitlePath.setPreferredSize(new java.awt.Dimension(977, 30));
        homeTitlePath.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setText("PATHWAYS AVAILABLE");
        homeTitlePath.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 21));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLong.png"))); // NOI18N
        jLabel21.setMaximumSize(new java.awt.Dimension(300, 2));
        jLabel21.setMinimumSize(new java.awt.Dimension(300, 2));
        jLabel21.setPreferredSize(new java.awt.Dimension(300, 2));
        homeTitlePath.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 27, 210, -1));

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
        jLabel22.setEnabled(false);
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
        jLabel23.setEnabled(false);
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
        jLabel24.setEnabled(false);
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
        jLabel25.setEnabled(false);
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
        videoSQL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoSQL2MouseClicked(evt);
            }
        });
        jPanel10.add(videoSQL2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel11.setLayout(new java.awt.BorderLayout());

        videoCSS2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoCSS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoCSS2.jpg"))); // NOI18N
        videoCSS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoCSS2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoCSS2.setRequestFocusEnabled(false);
        videoCSS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoCSS2MouseClicked(evt);
            }
        });
        jPanel11.add(videoCSS2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel11);

        jPanel12.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel12.setLayout(new java.awt.BorderLayout());

        videoJS2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoJS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoJS2.jpg"))); // NOI18N
        videoJS2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoJS2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoJS2.setRequestFocusEnabled(false);
        videoJS2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoJS2MouseClicked(evt);
            }
        });
        jPanel12.add(videoJS2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel12);

        jPanel13.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel13.setLayout(new java.awt.BorderLayout());

        videoHTML2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoHTML2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoHTML2.jpg"))); // NOI18N
        videoHTML2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoHTML2.setPreferredSize(new java.awt.Dimension(977, 140));
        videoHTML2.setRequestFocusEnabled(false);
        videoHTML2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoHTML2MouseClicked(evt);
            }
        });
        jPanel13.add(videoHTML2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel13);

        jPanel14.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel14.setLayout(new java.awt.BorderLayout());

        videoSQL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoSQL.jpg"))); // NOI18N
        videoSQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoSQL.setPreferredSize(new java.awt.Dimension(977, 140));
        videoSQL.setRequestFocusEnabled(false);
        videoSQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoSQLMouseClicked(evt);
            }
        });
        jPanel14.add(videoSQL, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel14);

        jPanel15.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel15.setLayout(new java.awt.BorderLayout());

        videoJS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoJS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoJS.jpg"))); // NOI18N
        videoJS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoJS.setPreferredSize(new java.awt.Dimension(977, 140));
        videoJS.setRequestFocusEnabled(false);
        videoJS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoJSMouseClicked(evt);
            }
        });
        jPanel15.add(videoJS, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel15);

        jPanel16.setPreferredSize(new java.awt.Dimension(977, 160));
        jPanel16.setLayout(new java.awt.BorderLayout());

        videoHTML.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        videoHTML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/videoHTML.jpg"))); // NOI18N
        videoHTML.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoHTML.setPreferredSize(new java.awt.Dimension(977, 140));
        videoHTML.setRequestFocusEnabled(false);
        videoHTML.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoHTMLMouseClicked(evt);
            }
        });
        jPanel16.add(videoHTML, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel16);

        jScrollPane1.setViewportView(homePathway);

        dashHome.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        dashMain.add(dashHome, "dashHome");

        dashStudy.setLayout(new java.awt.CardLayout());

        studyHTML.setLayout(new java.awt.BorderLayout(20, 0));

        htmlMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        htmlMenu.setPreferredSize(new java.awt.Dimension(250, 570));
        htmlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        htmlmenuTitle.setPreferredSize(new java.awt.Dimension(246, 85));
        htmlmenuTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel41.setText("<html> Hypertext Markup<br> Language [HTML] </html>");
        htmlmenuTitle.add(jLabel41);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLongGrey.png"))); // NOI18N
        jLabel44.setText("jLabel44");
        jLabel44.setPreferredSize(new java.awt.Dimension(248, 14));
        htmlmenuTitle.add(jLabel44);

        htmlMenu.add(htmlmenuTitle);

        htmlView.setBackground(new java.awt.Color(224, 224, 224));
        htmlView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlView.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlViewMouseExited(evt);
            }
        });
        htmlView.setLayout(new java.awt.BorderLayout());

        jLabel43.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel43.setText("  OVERVIEW");
        jLabel43.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlView.add(jLabel43, java.awt.BorderLayout.CENTER);

        htmlSelect.setBackground(new java.awt.Color(50, 50, 250));
        htmlSelect.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelectLayout = new javax.swing.GroupLayout(htmlSelect);
        htmlSelect.setLayout(htmlSelectLayout);
        htmlSelectLayout.setHorizontalGroup(
            htmlSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelectLayout.setVerticalGroup(
            htmlSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlView.add(htmlSelect, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlView);

        htmlWeek1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek1.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek1MouseExited(evt);
            }
        });
        htmlWeek1.setLayout(new java.awt.BorderLayout());

        jLabel45.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel45.setText("  WEEK 1");
        jLabel45.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek1.add(jLabel45, java.awt.BorderLayout.CENTER);

        htmlSelect1.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect1Layout = new javax.swing.GroupLayout(htmlSelect1);
        htmlSelect1.setLayout(htmlSelect1Layout);
        htmlSelect1Layout.setHorizontalGroup(
            htmlSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect1Layout.setVerticalGroup(
            htmlSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek1.add(htmlSelect1, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek1);

        htmlWeek2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek2.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek2MouseExited(evt);
            }
        });
        htmlWeek2.setLayout(new java.awt.BorderLayout());

        jLabel46.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel46.setText("  WEEK 2");
        jLabel46.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek2.add(jLabel46, java.awt.BorderLayout.CENTER);

        htmlSelect2.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect2Layout = new javax.swing.GroupLayout(htmlSelect2);
        htmlSelect2.setLayout(htmlSelect2Layout);
        htmlSelect2Layout.setHorizontalGroup(
            htmlSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect2Layout.setVerticalGroup(
            htmlSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek2.add(htmlSelect2, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek2);

        htmlWeek3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek3.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek3MouseExited(evt);
            }
        });
        htmlWeek3.setLayout(new java.awt.BorderLayout());

        jLabel47.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel47.setText("  WEEK 3");
        jLabel47.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek3.add(jLabel47, java.awt.BorderLayout.CENTER);

        htmlSelect3.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect3Layout = new javax.swing.GroupLayout(htmlSelect3);
        htmlSelect3.setLayout(htmlSelect3Layout);
        htmlSelect3Layout.setHorizontalGroup(
            htmlSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect3Layout.setVerticalGroup(
            htmlSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek3.add(htmlSelect3, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek3);

        htmlWeek4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek4.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek4MouseExited(evt);
            }
        });
        htmlWeek4.setLayout(new java.awt.BorderLayout());

        jLabel48.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel48.setText("  WEEK 4");
        jLabel48.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek4.add(jLabel48, java.awt.BorderLayout.CENTER);

        htmlSelect4.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect4Layout = new javax.swing.GroupLayout(htmlSelect4);
        htmlSelect4.setLayout(htmlSelect4Layout);
        htmlSelect4Layout.setHorizontalGroup(
            htmlSelect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect4Layout.setVerticalGroup(
            htmlSelect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek4.add(htmlSelect4, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek4);

        htmlWeek5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek5.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek5MouseExited(evt);
            }
        });
        htmlWeek5.setLayout(new java.awt.BorderLayout());

        jLabel49.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel49.setText("  WEEK 5");
        jLabel49.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek5.add(jLabel49, java.awt.BorderLayout.CENTER);

        htmlSelect5.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect5Layout = new javax.swing.GroupLayout(htmlSelect5);
        htmlSelect5.setLayout(htmlSelect5Layout);
        htmlSelect5Layout.setHorizontalGroup(
            htmlSelect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect5Layout.setVerticalGroup(
            htmlSelect5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek5.add(htmlSelect5, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek5);

        htmlWeek6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek6.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek6MouseExited(evt);
            }
        });
        htmlWeek6.setLayout(new java.awt.BorderLayout());

        jLabel50.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel50.setText("  WEEK 6");
        jLabel50.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek6.add(jLabel50, java.awt.BorderLayout.CENTER);

        htmlSelect6.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect6Layout = new javax.swing.GroupLayout(htmlSelect6);
        htmlSelect6.setLayout(htmlSelect6Layout);
        htmlSelect6Layout.setHorizontalGroup(
            htmlSelect6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect6Layout.setVerticalGroup(
            htmlSelect6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek6.add(htmlSelect6, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek6);

        htmlWeek7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlWeek7.setPreferredSize(new java.awt.Dimension(246, 40));
        htmlWeek7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlWeek7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                htmlWeek7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                htmlWeek7MouseExited(evt);
            }
        });
        htmlWeek7.setLayout(new java.awt.BorderLayout());

        jLabel51.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel51.setText("  WEEK 7");
        jLabel51.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek7.add(jLabel51, java.awt.BorderLayout.CENTER);

        htmlSelect7.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout htmlSelect7Layout = new javax.swing.GroupLayout(htmlSelect7);
        htmlSelect7.setLayout(htmlSelect7Layout);
        htmlSelect7Layout.setHorizontalGroup(
            htmlSelect7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        htmlSelect7Layout.setVerticalGroup(
            htmlSelect7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        htmlWeek7.add(htmlSelect7, java.awt.BorderLayout.LINE_START);

        htmlMenu.add(htmlWeek7);

        studyHTML.add(htmlMenu, java.awt.BorderLayout.LINE_START);

        htmlRight.setMaximumSize(new java.awt.Dimension(680, 197));
        htmlRight.setPreferredSize(new java.awt.Dimension(680, 570));
        htmlRight.setLayout(new java.awt.BorderLayout(0, 10));

        htmlNav.setMaximumSize(new java.awt.Dimension(680, 40));
        htmlNav.setMinimumSize(new java.awt.Dimension(680, 40));
        htmlNav.setPreferredSize(new java.awt.Dimension(710, 50));
        htmlNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPrev.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonPrev.setText("Previous");
        buttonPrev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPrev.setEnabled(false);
        buttonPrev.setMaximumSize(new java.awt.Dimension(100, 30));
        buttonPrev.setMinimumSize(new java.awt.Dimension(100, 30));
        buttonPrev.setPreferredSize(new java.awt.Dimension(100, 30));
        buttonPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrevActionPerformed(evt);
            }
        });
        htmlNav.add(buttonPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        buttonNext.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        buttonNext.setText("Next");
        buttonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonNext.setMaximumSize(new java.awt.Dimension(100, 30));
        buttonNext.setMinimumSize(new java.awt.Dimension(100, 30));
        buttonNext.setPreferredSize(new java.awt.Dimension(100, 30));
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });
        htmlNav.add(buttonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        htmlRight.add(htmlNav, java.awt.BorderLayout.PAGE_END);

        htmlViewer.setMaximumSize(new java.awt.Dimension(680, 40));
        htmlViewer.setPreferredSize(new java.awt.Dimension(680, 510));
        htmlViewer.setLayout(new java.awt.CardLayout());

        htmlOverview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        htmlOverview.setMaximumSize(new java.awt.Dimension(680, 40));
        htmlOverview.setPreferredSize(new java.awt.Dimension(680, 514));
        htmlOverview.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel42.setText("Instructor's Note");
        htmlOverview.add(jLabel42);

        jLabel40.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel40.setText("<html>\n<style> p {   text-transform: uppercase; text-align: justify;} </style> </head>\n<p>\nWelcome to the HTML pathway! So you’ve decided you want to learn some HTML? Well, you have come to the right place! Learning HTML is something every web developer should learn. After all, HTML is the basic skeleton of all web pages. Without HTML skills, web developers wouldn’t be able to add text, add images, or even add videos to your favorite websites. HTML is the very foundation of everything you need to know in order to create an engaging web page!\n<br><br>\nIn this pathway, you will learn all the common HTML tags used to structure HTML pages. You will also learn how to add links and images to your web pages. Plus, some basics on how to create HTML tables, forms, lists, and iFrames. \n<br><br>\nIf ever you encountered some issues, have inquiries or suggestions, please do not hesitate to get in touch with our support team in the contact us section. We would love to hear from you!\n<br><br>\nWhat website do you wish existed but doesn't yet? Whatever that may be, hopefully, by the end of this pathway, you will be able to create your very own web page! Goodluck on starting your HTML journey and continue building your imagination!\n\n</p>\n\n\n</html>");
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel40.setPreferredSize(new java.awt.Dimension(710, 500));
        htmlOverview.add(jLabel40);

        htmlViewer.add(htmlOverview, "html");

        htmlLesson.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        htmlLesson.setLayout(new java.awt.BorderLayout());
        htmlViewer.add(htmlLesson, "html1");

        htmlRight.add(htmlViewer, java.awt.BorderLayout.CENTER);

        studyHTML.add(htmlRight, java.awt.BorderLayout.CENTER);

        dashStudy.add(studyHTML, "studyHTML");

        dashMain.add(dashStudy, "dashStudy");

        jPanel22.setPreferredSize(new java.awt.Dimension(800, 560));
        jPanel22.setLayout(new java.awt.BorderLayout(20, 0));

        profileInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileInfo.setPreferredSize(new java.awt.Dimension(280, 550));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/school_director_96px.png"))); // NOI18N
        profileInfo.add(jLabel37);

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("JUAN DELA CRUZ");
        jLabel31.setPreferredSize(new java.awt.Dimension(276, 14));
        profileInfo.add(jLabel31);

        jPanel6.setPreferredSize(new java.awt.Dimension(260, 100));

        jLabel36.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel36.setText("Email: ");

        jLabel38.setText("Neilriego3@gmail.com");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel36))
                .addGap(80, 80, 80))
        );

        profileInfo.add(jPanel6);

        jPanel22.add(profileInfo, java.awt.BorderLayout.LINE_START);

        jPanel17.setPreferredSize(new java.awt.Dimension(300, 570));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        profileOverall.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileOverall.setPreferredSize(new java.awt.Dimension(690, 90));
        profileOverall.setLayout(new java.awt.BorderLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/futures_96px.png"))); // NOI18N
        profileOverall.add(jLabel9, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        profileOverall.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel17.add(profileOverall);

        jPanel28.setPreferredSize(new java.awt.Dimension(100, 25));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel28);

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel29.setText(" Specific Pathway Progress");
        jLabel29.setPreferredSize(new java.awt.Dimension(696, 30));
        jPanel17.add(jLabel29);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLong.png"))); // NOI18N
        jLabel30.setPreferredSize(new java.awt.Dimension(680, 10));
        jPanel17.add(jLabel30);

        jPanel18.setPreferredSize(new java.awt.Dimension(100, 10));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel18);

        profileOverall2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileOverall2.setPreferredSize(new java.awt.Dimension(690, 90));
        profileOverall2.setLayout(new java.awt.BorderLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/html_5_96px.png"))); // NOI18N
        profileOverall2.add(jLabel32, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        profileOverall2.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel17.add(profileOverall2);

        jPanel21.setPreferredSize(new java.awt.Dimension(100, 10));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel21);

        profileOverall3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileOverall3.setPreferredSize(new java.awt.Dimension(690, 90));
        profileOverall3.setLayout(new java.awt.BorderLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/css3_logo_96px.png"))); // NOI18N
        profileOverall3.add(jLabel33, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        profileOverall3.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel17.add(profileOverall3);

        jPanel24.setPreferredSize(new java.awt.Dimension(100, 10));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel24);

        profileOverall4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileOverall4.setPreferredSize(new java.awt.Dimension(690, 90));
        profileOverall4.setLayout(new java.awt.BorderLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/node_js_96px.png"))); // NOI18N
        profileOverall4.add(jLabel34, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        profileOverall4.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel17.add(profileOverall4);

        jPanel26.setPreferredSize(new java.awt.Dimension(100, 10));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel26);

        profileOverall5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileOverall5.setPreferredSize(new java.awt.Dimension(690, 90));
        profileOverall5.setLayout(new java.awt.BorderLayout());

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/database_import_72px_1.png"))); // NOI18N
        jLabel35.setPreferredSize(new java.awt.Dimension(96, 96));
        profileOverall5.add(jLabel35, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        profileOverall5.add(jPanel27, java.awt.BorderLayout.CENTER);

        jPanel17.add(profileOverall5);

        jPanel22.add(jPanel17, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout dashProfileLayout = new javax.swing.GroupLayout(dashProfile);
        dashProfile.setLayout(dashProfileLayout);
        dashProfileLayout.setHorizontalGroup(
            dashProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashProfileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dashProfileLayout.setVerticalGroup(
            dashProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashProfileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dashMain.add(dashProfile, "dashProfile");

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

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(997, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(997, 850));
        jPanel1.setRequestFocusEnabled(false);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/jP0gVmpXQruvR0jfNGlu_contactuswhite_1.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(997, 330));
        jPanel1.add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1_images/LineLongGrey.png"))); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanel1.add(jLabel13);

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("<html> \n<head>\n <style> p {   text-transform: uppercase; text-align: justify;} </style> </head>\n<p>\n<font size = 30> Hi! Having troubles using the app? </font> <br>\nHorrible experience? Bug reports? Complaints?<br><br>\n\nNo Worries. Hang in there, we got you covered. <br>\nAs much as we want a smooth sailing experience to our users, issues are inevitable. <br>\nLet us know by sending an email on example@gmail.com and we’ll get down to business. <br><br><br>\n<font size = 30> No troubles? </font> <br>\nGreat. Send us your feedback on example2@gmail.com. Every feedback counts. <br><br>\n\nWe appreciate your time sending comprehensive feedback as this will guarantee quality<br>\nimprovements in the future. We ensure every feedbacks are evaluated because we value <br>\nyour time and effort on this matter. We hope to provide you a better experience in the future. \n</p> </html>");
        jLabel26.setToolTipText("");
        jLabel26.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel1.add(jLabel26);

        jScrollPane2.setViewportView(jPanel1);

        dashContact.add(jScrollPane2);

        dashMain.add(dashContact, "dashContact");

        dashBoard.add(dashMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(dashBoard, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1040, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void controllerNext(CardLayout controlLayout, String card, JPanel containerParent, String[] lesson,int max,JButton next, JButton prev){
        controlLayout = (CardLayout) (containerParent.getLayout());
        if (i != max){
            i = i+1;
            if (i == 0) {
                controlLayout.show(containerParent,card);
                ctrl.openDocument(lesson[i]);
                prev.setEnabled(true);
            } else if (i <= max) {
                ctrl.openDocument(lesson[i]);
                if (i == max) {
                    next.setEnabled(false);
                }  
            } 
        }
    } 
    
    public void controllerPrev(CardLayout controlLayout, String card, JPanel containerParent, String[] lesson,int max,JButton next, JButton prev){
        controlLayout = (CardLayout) (containerParent.getLayout());
        if (i != -1) {
            i = i-1;
            if (i > -1) {
                ctrl.openDocument(lesson[i]);
                if (i == max)
                    next.setEnabled(true);  
            }
            if (i == -1) {
                prev.setEnabled(false);
                controlLayout.show(containerParent,card);                
            }
        }
    }

    public void controllerShow(CardLayout controlLayout,int state, String card, JPanel containerParent){
        controlLayout = (CardLayout) (containerParent.getLayout());
        if (state == -1) {
            controlLayout.show(containerParent,card);
        } else if (state >=0) {
            controlLayout.show(containerParent,card);
            ctrl.openDocument(htmlArray[state]);
        }
    }
    public void dashHover (JPanel state, JPanel side,Color mousestate,int frame) {
        if (state != viewHtml && frame == 1 ) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);
        } else if (state != viewCss && frame == 2) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);
        } else if (state != viewJs && frame == 3) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);            
        } else if (state != viewSql && frame == 4) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);            
        }
    }
           
    public void dashSelect (JPanel state, JPanel side,int frame) {
        if (state != viewHtml && frame == 1) {
            viewHtml.setBackground(colorSelected);
            sideHtml.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);
            viewHtml = state;
            sideHtml = side;
        } else if (state != viewCss && frame == 2) {
            viewCss.setBackground(colorSelected);
            sideCss.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);
            viewCss = state;
            sideCss = side;
        } else if (state != viewJs && frame == 3) {
            viewJs.setBackground(colorSelected);
            sideJs.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);   
            viewJs = state;
            sideJs = side;
        } else if (state != viewSql && frame == 4) {
            viewSql.setBackground(colorSelected);
            sideSql.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);  
            viewSql = state;
            sideSql = side;
        }
    }
    
    public void openpdf (JPanel dashboardview){
        try {
            // build a component controller   
            PropertiesManager properties =
                new PropertiesManager(System.getProperties(),
                               ResourceBundle.getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_UTILITY, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_UTILITYPANE_ANNOTATION, Boolean.FALSE);
            properties.setBoolean(PropertiesManager.PROPERTY_SHOW_TOOLBAR_ANNOTATION, Boolean.FALSE);
            SwingViewBuilder vb = new SwingViewBuilder(ctrl,properties);
            ctrl.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(
                    ctrl.getDocumentViewController()));
            JPanel s = vb.buildViewerPanel();
            dashboardview.add(s);                     
        }
        catch (Exception e){
            
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
            Logger.getLogger(jframeGuestLogin.class.getName()).log(Level.SEVERE, null, ex);
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
//        cardLayout.show(dashMain,"dashProfile");
//        selectShow(buttonProfile, buttonProfile,buttonProfile1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonProfile1MouseClicked

    private void buttonProfile1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProfile1MouseEntered
        hoverShow(buttonProfile,buttonProfile,buttonProfile1,colorHover);
    }//GEN-LAST:event_buttonProfile1MouseEntered

    private void buttonProfile1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonProfile1MouseExited
        hoverShow(buttonProfile,buttonProfile,buttonProfile1,colorNormal);
    }//GEN-LAST:event_buttonProfile1MouseExited

    private void buttonDiscussion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiscussion1MouseClicked
//        cardLayout.show(dashMain,"dashDiscussion");
//        selectShow(buttonDiscussion, buttonDiscussion,buttonDiscussion1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonDiscussion1MouseClicked

    private void buttonDiscussion1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiscussion1MouseEntered
        hoverShow(buttonDiscussion,buttonDiscussion,buttonDiscussion1,colorHover);
    }//GEN-LAST:event_buttonDiscussion1MouseEntered

    private void buttonDiscussion1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDiscussion1MouseExited
        hoverShow(buttonDiscussion,buttonDiscussion,buttonDiscussion1,colorNormal);
    }//GEN-LAST:event_buttonDiscussion1MouseExited

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
//        cardLayout.show(dashMain,"dashStudy");
//        selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal);
    }//GEN-LAST:event_buttonStudy1MouseClicked

    private void videoCSSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoCSSMouseClicked
        desktopLink("https://www.youtube.com/watch?v=D-h8L5hgW-w&t=4s");
    }//GEN-LAST:event_videoCSSMouseClicked

    private void videoSQL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoSQL2MouseClicked
        desktopLink("https://www.youtube.com/watch?v=zbMHLJ0dY4w");
    }//GEN-LAST:event_videoSQL2MouseClicked

    private void videoCSS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoCSS2MouseClicked
        desktopLink("https://www.youtube.com/watch?v=Tfjd5yzCaxk");
    }//GEN-LAST:event_videoCSS2MouseClicked

    private void videoJS2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoJS2MouseClicked
        desktopLink("https://www.youtube.com/watch?v=NibsUd_InPU");
    }//GEN-LAST:event_videoJS2MouseClicked

    private void videoHTML2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoHTML2MouseClicked
        desktopLink("https://www.youtube.com/watch?v=PlxWf493en4");
    }//GEN-LAST:event_videoHTML2MouseClicked

    private void videoSQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoSQLMouseClicked
        desktopLink("https://www.youtube.com/watch?v=bEtnYWuo2Bw");
    }//GEN-LAST:event_videoSQLMouseClicked

    private void videoJSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoJSMouseClicked
        desktopLink("https://www.youtube.com/watch?v=vEROU2XtPR8&t=1s");
    }//GEN-LAST:event_videoJSMouseClicked

    private void videoHTMLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoHTMLMouseClicked
        desktopLink("https://www.youtube.com/watch?v=idHyruXhXhA&t=5s");
    }//GEN-LAST:event_videoHTMLMouseClicked

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        controllerNext(cardLayout2,"html1",htmlViewer,htmlArray,6,buttonNext,buttonPrev);
        switch(i) {
            case -1: dashSelect(htmlView,htmlSelect,1); break;
            case 0: dashSelect(htmlWeek1,htmlSelect1,1); break;
            case 1: dashSelect(htmlWeek2,htmlSelect2,1); break;
            case 2: dashSelect(htmlWeek3,htmlSelect3,1); break;
            case 3: dashSelect(htmlWeek4,htmlSelect4,1); break;
            case 4: dashSelect(htmlWeek5,htmlSelect5,1); break;
            case 5: dashSelect(htmlWeek6,htmlSelect6,1); break;
            case 6: dashSelect(htmlWeek7,htmlSelect7,1); break;
            default: break;
        }
    }//GEN-LAST:event_buttonNextActionPerformed

    private void htmlViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlViewMouseClicked
        dashSelect(htmlView,htmlSelect,1);
        buttonPrev.setEnabled(false);
        buttonNext.setEnabled(true);
        i = -1;
        controllerShow(cardLayout2,i,"html",htmlViewer);
        
    }//GEN-LAST:event_htmlViewMouseClicked

    private void htmlViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlViewMouseEntered
        dashHover(htmlView,htmlSelect,colorHover,1);
    }//GEN-LAST:event_htmlViewMouseEntered

    private void htmlViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlViewMouseExited
        dashHover(htmlView,htmlSelect,colorSelected,1);
    }//GEN-LAST:event_htmlViewMouseExited

    private void buttonPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrevActionPerformed
        controllerPrev(cardLayout2,"html",htmlViewer,htmlArray,6,buttonNext,buttonPrev);
        switch(i) {
            case -1: dashSelect(htmlView,htmlSelect,1); break;
            case 0: dashSelect(htmlWeek1,htmlSelect1,1); break;
            case 1: dashSelect(htmlWeek2,htmlSelect2,1); break;
            case 2: dashSelect(htmlWeek3,htmlSelect3,1); break;
            case 3: dashSelect(htmlWeek4,htmlSelect4,1); break;
            case 4: dashSelect(htmlWeek5,htmlSelect5,1); break;
            case 5: dashSelect(htmlWeek6,htmlSelect6,1); break;
            case 6: dashSelect(htmlWeek7,htmlSelect7,1); break;
            default: break;
        }
    }//GEN-LAST:event_buttonPrevActionPerformed

    private void htmlWeek1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek1MouseClicked
        dashSelect(htmlWeek1,htmlSelect1,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(true);
        i=0;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek1MouseClicked

    private void htmlWeek1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek1MouseEntered
        dashHover(htmlWeek1,htmlSelect1,colorHover,1);
    }//GEN-LAST:event_htmlWeek1MouseEntered

    private void htmlWeek1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek1MouseExited
        dashHover(htmlWeek1,htmlSelect1,colorSelected,1);
    }//GEN-LAST:event_htmlWeek1MouseExited

    private void htmlWeek2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek2MouseClicked
        dashSelect(htmlWeek2,htmlSelect2,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(true);
        i=1;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek2MouseClicked

    private void htmlWeek2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek2MouseEntered
        dashHover(htmlWeek2,htmlSelect2,colorHover,1);
    }//GEN-LAST:event_htmlWeek2MouseEntered

    private void htmlWeek2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek2MouseExited
        dashHover(htmlWeek2,htmlSelect2,colorSelected,1);
    }//GEN-LAST:event_htmlWeek2MouseExited

    private void htmlWeek3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek3MouseClicked
        dashSelect(htmlWeek3,htmlSelect3,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(true);
        i=2;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek3MouseClicked

    private void htmlWeek3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek3MouseEntered
        dashHover(htmlWeek3,htmlSelect3,colorHover,1);
    }//GEN-LAST:event_htmlWeek3MouseEntered

    private void htmlWeek3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek3MouseExited
        dashHover(htmlWeek3,htmlSelect3,colorSelected,1);
    }//GEN-LAST:event_htmlWeek3MouseExited

    private void htmlWeek4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek4MouseClicked
        dashSelect(htmlWeek4,htmlSelect4,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(true);
        i=3;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek4MouseClicked

    private void htmlWeek4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek4MouseEntered
        dashHover(htmlWeek4,htmlSelect4,colorHover,1);
    }//GEN-LAST:event_htmlWeek4MouseEntered

    private void htmlWeek4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek4MouseExited
        dashHover(htmlWeek4,htmlSelect4,colorSelected,1);
    }//GEN-LAST:event_htmlWeek4MouseExited

    private void htmlWeek5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek5MouseClicked
        dashSelect(htmlWeek5,htmlSelect5,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(true);
        i=4;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek5MouseClicked

    private void htmlWeek5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek5MouseEntered
        dashHover(htmlWeek5,htmlSelect5,colorHover,1);
    }//GEN-LAST:event_htmlWeek5MouseEntered

    private void htmlWeek5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek5MouseExited
        dashHover(htmlWeek5,htmlSelect5,colorSelected,1);
    }//GEN-LAST:event_htmlWeek5MouseExited

    private void htmlWeek6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek6MouseClicked
        dashSelect(htmlWeek6,htmlSelect6,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(true);
        i=5;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek6MouseClicked

    private void htmlWeek6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek6MouseEntered
        dashHover(htmlWeek6,htmlSelect6,colorHover,1);
    }//GEN-LAST:event_htmlWeek6MouseEntered

    private void htmlWeek6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek6MouseExited
        dashHover(htmlWeek6,htmlSelect6,colorSelected,1);
    }//GEN-LAST:event_htmlWeek6MouseExited

    private void htmlWeek7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek7MouseClicked
        dashSelect(htmlWeek7,htmlSelect7,1);
        buttonPrev.setEnabled(true);
        buttonNext.setEnabled(false);
        i=6;
        controllerShow(cardLayout2,i,"html1",htmlViewer);
    }//GEN-LAST:event_htmlWeek7MouseClicked

    private void htmlWeek7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek7MouseEntered
        dashHover(htmlWeek7,htmlSelect7,colorHover,1);
    }//GEN-LAST:event_htmlWeek7MouseEntered

    private void htmlWeek7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek7MouseExited
        dashHover(htmlWeek7,htmlSelect7,colorSelected,1);
    }//GEN-LAST:event_htmlWeek7MouseExited

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icoApplication.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonContact;
    private javax.swing.JPanel buttonContact1;
    private javax.swing.JPanel buttonDiscussion;
    private javax.swing.JPanel buttonDiscussion1;
    private javax.swing.JPanel buttonHome;
    private javax.swing.JPanel buttonHome1;
    private javax.swing.JPanel buttonHover;
    private javax.swing.JPanel buttonLogout;
    private javax.swing.JPanel buttonLogout1;
    private javax.swing.JLabel buttonMenu;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonPrev;
    private javax.swing.JPanel buttonProfile;
    private javax.swing.JPanel buttonProfile1;
    private javax.swing.JPanel buttonStudy;
    private javax.swing.JPanel buttonStudy1;
    private javax.swing.JPanel dashBoard;
    private javax.swing.JPanel dashContact;
    private javax.swing.JPanel dashDiscussion;
    private javax.swing.JPanel dashHeader;
    private javax.swing.JPanel dashHome;
    private javax.swing.JPanel dashMain;
    private javax.swing.JPanel dashProfile;
    private javax.swing.JPanel dashSpace;
    private javax.swing.JPanel dashStudy;
    private javax.swing.JLabel dashTitleHeader;
    private javax.swing.JPanel homePathway;
    private javax.swing.JPanel homeSpace;
    private javax.swing.JPanel homeSpace1;
    private javax.swing.JPanel homeTitlePath;
    private javax.swing.JPanel htmlLesson;
    private javax.swing.JPanel htmlMenu;
    private javax.swing.JPanel htmlNav;
    private javax.swing.JPanel htmlOverview;
    private javax.swing.JPanel htmlRight;
    private javax.swing.JPanel htmlSelect;
    private javax.swing.JPanel htmlSelect1;
    private javax.swing.JPanel htmlSelect2;
    private javax.swing.JPanel htmlSelect3;
    private javax.swing.JPanel htmlSelect4;
    private javax.swing.JPanel htmlSelect5;
    private javax.swing.JPanel htmlSelect6;
    private javax.swing.JPanel htmlSelect7;
    private javax.swing.JPanel htmlView;
    private javax.swing.JPanel htmlViewer;
    private javax.swing.JPanel htmlWeek1;
    private javax.swing.JPanel htmlWeek2;
    private javax.swing.JPanel htmlWeek3;
    private javax.swing.JPanel htmlWeek4;
    private javax.swing.JPanel htmlWeek5;
    private javax.swing.JPanel htmlWeek6;
    private javax.swing.JPanel htmlWeek7;
    private javax.swing.JPanel htmlmenuTitle;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSpace;
    private javax.swing.JPanel profileInfo;
    private javax.swing.JPanel profileOverall;
    private javax.swing.JPanel profileOverall2;
    private javax.swing.JPanel profileOverall3;
    private javax.swing.JPanel profileOverall4;
    private javax.swing.JPanel profileOverall5;
    private javax.swing.JPanel studyHTML;
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
