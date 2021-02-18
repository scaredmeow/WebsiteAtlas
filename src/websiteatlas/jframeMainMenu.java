
package websiteatlas;

import de.javasoft.plaf.synthetica.io.FileUtils;
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
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.util.PropertiesManager;

public final class jframeMainMenu extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static String[] userQuiz = new String [18];
    String Answer;
    static String name;
    boolean a = false;
    static int i = -1,limit,j,times,count = 0, attempt = 0,  prevcount = 0, no = 0,score = 0,accessID = 0,currentPathway=-1,currentRetry = 0 ;
    static int overall=0,html=0,css=0,js=0,sql=0;
    static double percentage = 0;
    int seconds = 10, secondReattempt = 180;
    CardLayout cardLayout, cardLayout2,cardLayout3;
    JPanel buttonShow, buttonShow2,viewHtml,viewCss,viewJs,viewSql,sideHtml,sideCss,sideJs,sideSql;
    Color colorHover = new Color(212,212,212);
    Color colorNormal = new Color(224,224,224);
    Color colorSelected = new Color(240,240,240);
    Color colorSide = new Color(50,50,250);
    SwingController ctrl = new SwingController(); 
    String[] instructorNote= new String[4],pathway = {"HTML Pathway", "CSS Pathway", "JS Pathway", "SQL Pathway"},cardLayoutStudy = {"studyHtml","studyCss","studyJs","studySql"};
    String[][] pdfStorage, currentWeek,mainTab,sideColor;
    String[][][] question, correct;
    String[][][][] answer;
    /**
     *
     */
    public jframeMainMenu() {
        initComponents();
        setIcon();
        conn = WebsiteAtlas.ConnectDb();
        cardLayout = (CardLayout) (dashMain.getLayout());
        cardLayout3 = (CardLayout) (studyMenu.getLayout());
        this.buttonShow = buttonHome;
        this.buttonShow2 = buttonHome1;  
        this.viewHtml = htmlView;
        this.viewCss = cssView;
        this.viewSql = sqlView;
        this.viewJs = jsView;
        this.sideHtml = htmlSelect;
        this.sideCss = cssView;
        this.sideSql = sqlView;
        this.sideJs = jsView;
        openpdf(lesson);
        getAccessName();
        getStorageArray();
        weekInitialize();
        quizRetry(); 
        progress();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quizChoices = new javax.swing.ButtonGroup();
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
        studyCurrent = new javax.swing.JLabel();
        studyIcon = new javax.swing.JLabel();
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
        htmlButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cssButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jsButton = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        sqlButton = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        homeSpace1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        videoCSS = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        videoSQL2 = new javax.swing.JLabel();
        dashStudy = new javax.swing.JPanel();
        studyHTML = new javax.swing.JPanel();
        studyMenu = new javax.swing.JPanel();
        htmlMenu = new javax.swing.JPanel();
        htmlmenuTitle = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        htmlView = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        htmlSelect = new javax.swing.JPanel();
        htmlWeek1 = new javax.swing.JPanel();
        htmlW1 = new javax.swing.JLabel();
        htmlSelect1 = new javax.swing.JPanel();
        htmlWeek2 = new javax.swing.JPanel();
        htmlW2 = new javax.swing.JLabel();
        htmlSelect2 = new javax.swing.JPanel();
        htmlWeek3 = new javax.swing.JPanel();
        htmlW3 = new javax.swing.JLabel();
        htmlSelect3 = new javax.swing.JPanel();
        htmlWeek4 = new javax.swing.JPanel();
        htmlW4 = new javax.swing.JLabel();
        htmlSelect4 = new javax.swing.JPanel();
        htmlWeek5 = new javax.swing.JPanel();
        htmlW5 = new javax.swing.JLabel();
        htmlSelect5 = new javax.swing.JPanel();
        htmlWeek6 = new javax.swing.JPanel();
        htmlW6 = new javax.swing.JLabel();
        htmlSelect6 = new javax.swing.JPanel();
        htmlWeek7 = new javax.swing.JPanel();
        htmlW7 = new javax.swing.JLabel();
        htmlSelect7 = new javax.swing.JPanel();
        cssMenu = new javax.swing.JPanel();
        cssmenuTitle = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        cssView = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        cssSelect = new javax.swing.JPanel();
        cssWeek1 = new javax.swing.JPanel();
        cssW1 = new javax.swing.JLabel();
        cssSelect1 = new javax.swing.JPanel();
        cssWeek2 = new javax.swing.JPanel();
        cssW2 = new javax.swing.JLabel();
        cssSelect2 = new javax.swing.JPanel();
        cssWeek3 = new javax.swing.JPanel();
        cssW3 = new javax.swing.JLabel();
        cssSelect3 = new javax.swing.JPanel();
        cssWeek4 = new javax.swing.JPanel();
        cssW4 = new javax.swing.JLabel();
        cssSelect4 = new javax.swing.JPanel();
        jsMenu = new javax.swing.JPanel();
        jsmenuTitle = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jsView = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jsSelect = new javax.swing.JPanel();
        jsWeek1 = new javax.swing.JPanel();
        jsW1 = new javax.swing.JLabel();
        jsSelect1 = new javax.swing.JPanel();
        jsWeek2 = new javax.swing.JPanel();
        jsW2 = new javax.swing.JLabel();
        jsSelect2 = new javax.swing.JPanel();
        jsWeek3 = new javax.swing.JPanel();
        jsW3 = new javax.swing.JLabel();
        jsSelect3 = new javax.swing.JPanel();
        jsWeek4 = new javax.swing.JPanel();
        jsW4 = new javax.swing.JLabel();
        jsSelect4 = new javax.swing.JPanel();
        sqlMenu = new javax.swing.JPanel();
        sqlmenuTitle = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        sqlView = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        sqlSelect = new javax.swing.JPanel();
        sqlWeek1 = new javax.swing.JPanel();
        sqlW1 = new javax.swing.JLabel();
        sqlSelect1 = new javax.swing.JPanel();
        sqlWeek2 = new javax.swing.JPanel();
        sqlW2 = new javax.swing.JLabel();
        sqlSelect2 = new javax.swing.JPanel();
        sqlWeek3 = new javax.swing.JPanel();
        sqlW3 = new javax.swing.JLabel();
        sqlSelect3 = new javax.swing.JPanel();
        studyViewer = new javax.swing.JPanel();
        buttonNav = new javax.swing.JPanel();
        buttonPrev = new javax.swing.JButton();
        buttonNext = new javax.swing.JButton();
        lessonViewer = new javax.swing.JPanel();
        overview = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        overviewNote = new javax.swing.JTextArea();
        lesson = new javax.swing.JPanel();
        quiz = new javax.swing.JPanel();
        quizWeek = new javax.swing.JLabel();
        quizTimerLabel = new javax.swing.JLabel();
        quizTimer = new javax.swing.JLabel();
        quizInstructions = new javax.swing.JTextArea();
        quizNo = new javax.swing.JLabel();
        quizQuestion = new javax.swing.JTextArea();
        quizChoiceA = new javax.swing.JRadioButton();
        quizChoiceB = new javax.swing.JRadioButton();
        quizChoiceC = new javax.swing.JRadioButton();
        quizChoiceD = new javax.swing.JRadioButton();
        jPanel19 = new javax.swing.JPanel();
        quizSubmit = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        quizScoreLabel = new javax.swing.JLabel();
        quizScore = new javax.swing.JLabel();
        quizReattemptLabel = new javax.swing.JLabel();
        quizReattempt = new javax.swing.JLabel();
        dashProfile = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        profileInfo = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        profileName = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        profileEmail = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        profileUsername = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        profileActivation = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        profilePathway = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        profileName1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        profileOverall = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        overallProgress = new javax.swing.JProgressBar();
        jPanel28 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        profileOverall2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        htmlProgress = new javax.swing.JProgressBar();
        jPanel21 = new javax.swing.JPanel();
        profileOverall3 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        cssProgress = new javax.swing.JProgressBar();
        jPanel24 = new javax.swing.JPanel();
        profileOverall4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jsProgress = new javax.swing.JProgressBar();
        jPanel26 = new javax.swing.JPanel();
        profileOverall5 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        sqlProgress = new javax.swing.JProgressBar();
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line2.png"))); // NOI18N
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_20px.png"))); // NOI18N
        buttonHome1.add(jLabel5, java.awt.BorderLayout.LINE_START);

        buttonHome.add(buttonHome1);

        panelMenu.add(buttonHome);

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

        studyCurrent.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        studyCurrent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studyCurrent.setText("   CURRENT PATHWAY");
        studyCurrent.setEnabled(false);
        buttonStudy1.add(studyCurrent, java.awt.BorderLayout.CENTER);

        studyIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/study_20px.png"))); // NOI18N
        studyIcon.setEnabled(false);
        buttonStudy1.add(studyIcon, java.awt.BorderLayout.LINE_START);

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile_20px.png"))); // NOI18N
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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/communicate_20px_1.png"))); // NOI18N
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

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file_20px.png"))); // NOI18N
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

        dashHome.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1024, 1024));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(997, 600));
        jScrollPane1.setRequestFocusEnabled(false);

        homePathway.setMaximumSize(new java.awt.Dimension(1024, 1024));
        homePathway.setMinimumSize(new java.awt.Dimension(1024, 151));
        homePathway.setPreferredSize(new java.awt.Dimension(977, 600));

        homeTitlePath.setPreferredSize(new java.awt.Dimension(977, 30));
        homeTitlePath.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel2.setText("PATHWAYS AVAILABLE");
        homeTitlePath.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 21));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLong.png"))); // NOI18N
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

        htmlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoHTML.png"))); // NOI18N
        htmlButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        htmlButton.setEnabled(false);
        htmlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                htmlButtonMouseClicked(evt);
            }
        });
        jPanel2.add(htmlButton);

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

        cssButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoCSS.png"))); // NOI18N
        cssButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cssButton.setEnabled(false);
        cssButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cssButtonMouseClicked(evt);
            }
        });
        jPanel2.add(cssButton);

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

        jsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoJS.png"))); // NOI18N
        jsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsButton.setEnabled(false);
        jsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsButtonMouseClicked(evt);
            }
        });
        jPanel2.add(jsButton);

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

        sqlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icoSQL.png"))); // NOI18N
        sqlButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqlButton.setEnabled(false);
        sqlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sqlButtonMouseClicked(evt);
            }
        });
        jPanel2.add(sqlButton);

        homePathway.add(jPanel2);

        jPanel7.setPreferredSize(new java.awt.Dimension(977, 30));

        jLabel27.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel27.setText("LATEST TUTORIAL VIDEOS");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLong.png"))); // NOI18N
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
        videoCSS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jsthumb1.png"))); // NOI18N
        videoCSS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        videoSQL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sqlthumb1.png"))); // NOI18N
        videoSQL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        videoSQL2.setRequestFocusEnabled(false);
        videoSQL2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videoSQL2MouseClicked(evt);
            }
        });
        jPanel10.add(videoSQL2, java.awt.BorderLayout.PAGE_START);

        homePathway.add(jPanel10);

        jScrollPane1.setViewportView(homePathway);

        dashHome.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        dashMain.add(dashHome, "dashHome");

        dashStudy.setLayout(new java.awt.CardLayout());

        studyHTML.setLayout(new java.awt.BorderLayout(20, 0));

        studyMenu.setPreferredSize(new java.awt.Dimension(250, 570));
        studyMenu.setLayout(new java.awt.CardLayout());

        htmlMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        htmlMenu.setPreferredSize(new java.awt.Dimension(250, 570));
        htmlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        htmlmenuTitle.setPreferredSize(new java.awt.Dimension(246, 85));
        htmlmenuTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jLabel41.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel41.setText("<html> Hypertext Markup<br> Language [HTML] </html>");
        htmlmenuTitle.add(jLabel41);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
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

        htmlW1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW1.setText("  WEEK 1");
        htmlW1.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek1.add(htmlW1, java.awt.BorderLayout.CENTER);

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

        htmlW2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW2.setText("  WEEK 2");
        htmlW2.setEnabled(false);
        htmlW2.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek2.add(htmlW2, java.awt.BorderLayout.CENTER);

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

        htmlW3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW3.setText("  WEEK 3");
        htmlW3.setEnabled(false);
        htmlW3.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek3.add(htmlW3, java.awt.BorderLayout.CENTER);

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

        htmlW4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW4.setText("  WEEK 4");
        htmlW4.setEnabled(false);
        htmlW4.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek4.add(htmlW4, java.awt.BorderLayout.CENTER);

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

        htmlW5.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW5.setText("  WEEK 5");
        htmlW5.setEnabled(false);
        htmlW5.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek5.add(htmlW5, java.awt.BorderLayout.CENTER);

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

        htmlW6.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW6.setText("  WEEK 6");
        htmlW6.setEnabled(false);
        htmlW6.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek6.add(htmlW6, java.awt.BorderLayout.CENTER);

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

        htmlW7.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        htmlW7.setText("  WEEK 7");
        htmlW7.setEnabled(false);
        htmlW7.setPreferredSize(new java.awt.Dimension(104, 20));
        htmlWeek7.add(htmlW7, java.awt.BorderLayout.CENTER);

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

        studyMenu.add(htmlMenu, "studyHtml");

        cssMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cssMenu.setPreferredSize(new java.awt.Dimension(250, 570));
        cssMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        cssmenuTitle.setPreferredSize(new java.awt.Dimension(246, 85));
        cssmenuTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jLabel45.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel45.setText("<html> Cascading Style <br> Sheet [CSS] </html>");
        cssmenuTitle.add(jLabel45);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
        jLabel46.setPreferredSize(new java.awt.Dimension(248, 14));
        cssmenuTitle.add(jLabel46);

        cssMenu.add(cssmenuTitle);

        cssView.setBackground(new java.awt.Color(224, 224, 224));
        cssView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cssView.setPreferredSize(new java.awt.Dimension(246, 40));
        cssView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cssViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cssViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cssViewMouseExited(evt);
            }
        });
        cssView.setLayout(new java.awt.BorderLayout());

        jLabel47.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel47.setText("  OVERVIEW");
        jLabel47.setPreferredSize(new java.awt.Dimension(104, 20));
        cssView.add(jLabel47, java.awt.BorderLayout.CENTER);

        cssSelect.setBackground(new java.awt.Color(50, 50, 250));
        cssSelect.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout cssSelectLayout = new javax.swing.GroupLayout(cssSelect);
        cssSelect.setLayout(cssSelectLayout);
        cssSelectLayout.setHorizontalGroup(
            cssSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cssSelectLayout.setVerticalGroup(
            cssSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        cssView.add(cssSelect, java.awt.BorderLayout.LINE_START);

        cssMenu.add(cssView);

        cssWeek1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cssWeek1.setPreferredSize(new java.awt.Dimension(246, 40));
        cssWeek1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cssWeek1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cssWeek1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cssWeek1MouseExited(evt);
            }
        });
        cssWeek1.setLayout(new java.awt.BorderLayout());

        cssW1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cssW1.setText("  WEEK 1");
        cssW1.setPreferredSize(new java.awt.Dimension(104, 20));
        cssWeek1.add(cssW1, java.awt.BorderLayout.CENTER);

        cssSelect1.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout cssSelect1Layout = new javax.swing.GroupLayout(cssSelect1);
        cssSelect1.setLayout(cssSelect1Layout);
        cssSelect1Layout.setHorizontalGroup(
            cssSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cssSelect1Layout.setVerticalGroup(
            cssSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        cssWeek1.add(cssSelect1, java.awt.BorderLayout.LINE_START);

        cssMenu.add(cssWeek1);

        cssWeek2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cssWeek2.setPreferredSize(new java.awt.Dimension(246, 40));
        cssWeek2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cssWeek2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cssWeek2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cssWeek2MouseExited(evt);
            }
        });
        cssWeek2.setLayout(new java.awt.BorderLayout());

        cssW2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cssW2.setText("  WEEK 2");
        cssW2.setEnabled(false);
        cssW2.setPreferredSize(new java.awt.Dimension(104, 20));
        cssWeek2.add(cssW2, java.awt.BorderLayout.CENTER);

        cssSelect2.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout cssSelect2Layout = new javax.swing.GroupLayout(cssSelect2);
        cssSelect2.setLayout(cssSelect2Layout);
        cssSelect2Layout.setHorizontalGroup(
            cssSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cssSelect2Layout.setVerticalGroup(
            cssSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        cssWeek2.add(cssSelect2, java.awt.BorderLayout.LINE_START);

        cssMenu.add(cssWeek2);

        cssWeek3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cssWeek3.setPreferredSize(new java.awt.Dimension(246, 40));
        cssWeek3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cssWeek3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cssWeek3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cssWeek3MouseExited(evt);
            }
        });
        cssWeek3.setLayout(new java.awt.BorderLayout());

        cssW3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cssW3.setText("  WEEK 3");
        cssW3.setEnabled(false);
        cssW3.setPreferredSize(new java.awt.Dimension(104, 20));
        cssWeek3.add(cssW3, java.awt.BorderLayout.CENTER);

        cssSelect3.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout cssSelect3Layout = new javax.swing.GroupLayout(cssSelect3);
        cssSelect3.setLayout(cssSelect3Layout);
        cssSelect3Layout.setHorizontalGroup(
            cssSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cssSelect3Layout.setVerticalGroup(
            cssSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        cssWeek3.add(cssSelect3, java.awt.BorderLayout.LINE_START);

        cssMenu.add(cssWeek3);

        cssWeek4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cssWeek4.setPreferredSize(new java.awt.Dimension(246, 40));
        cssWeek4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cssWeek4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cssWeek4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cssWeek4MouseExited(evt);
            }
        });
        cssWeek4.setLayout(new java.awt.BorderLayout());

        cssW4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        cssW4.setText("  WEEK 4");
        cssW4.setEnabled(false);
        cssW4.setPreferredSize(new java.awt.Dimension(104, 20));
        cssWeek4.add(cssW4, java.awt.BorderLayout.CENTER);

        cssSelect4.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout cssSelect4Layout = new javax.swing.GroupLayout(cssSelect4);
        cssSelect4.setLayout(cssSelect4Layout);
        cssSelect4Layout.setHorizontalGroup(
            cssSelect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cssSelect4Layout.setVerticalGroup(
            cssSelect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        cssWeek4.add(cssSelect4, java.awt.BorderLayout.LINE_START);

        cssMenu.add(cssWeek4);

        studyMenu.add(cssMenu, "studyCss");

        jsMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jsMenu.setPreferredSize(new java.awt.Dimension(250, 570));
        jsMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jsmenuTitle.setPreferredSize(new java.awt.Dimension(246, 85));
        jsmenuTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jLabel48.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel48.setText("<html> JavaScript <br> [JS] </html>");
        jsmenuTitle.add(jLabel48);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
        jLabel49.setPreferredSize(new java.awt.Dimension(248, 14));
        jsmenuTitle.add(jLabel49);

        jsMenu.add(jsmenuTitle);

        jsView.setBackground(new java.awt.Color(224, 224, 224));
        jsView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsView.setPreferredSize(new java.awt.Dimension(246, 40));
        jsView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jsViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jsViewMouseExited(evt);
            }
        });
        jsView.setLayout(new java.awt.BorderLayout());

        jLabel50.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel50.setText("  OVERVIEW");
        jLabel50.setPreferredSize(new java.awt.Dimension(104, 20));
        jsView.add(jLabel50, java.awt.BorderLayout.CENTER);

        jsSelect.setBackground(new java.awt.Color(50, 50, 250));
        jsSelect.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jsSelectLayout = new javax.swing.GroupLayout(jsSelect);
        jsSelect.setLayout(jsSelectLayout);
        jsSelectLayout.setHorizontalGroup(
            jsSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jsSelectLayout.setVerticalGroup(
            jsSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jsView.add(jsSelect, java.awt.BorderLayout.LINE_START);

        jsMenu.add(jsView);

        jsWeek1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsWeek1.setPreferredSize(new java.awt.Dimension(246, 40));
        jsWeek1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsWeek1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jsWeek1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jsWeek1MouseExited(evt);
            }
        });
        jsWeek1.setLayout(new java.awt.BorderLayout());

        jsW1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jsW1.setText("  WEEK 1");
        jsW1.setPreferredSize(new java.awt.Dimension(104, 20));
        jsWeek1.add(jsW1, java.awt.BorderLayout.CENTER);

        jsSelect1.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jsSelect1Layout = new javax.swing.GroupLayout(jsSelect1);
        jsSelect1.setLayout(jsSelect1Layout);
        jsSelect1Layout.setHorizontalGroup(
            jsSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jsSelect1Layout.setVerticalGroup(
            jsSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jsWeek1.add(jsSelect1, java.awt.BorderLayout.LINE_START);

        jsMenu.add(jsWeek1);

        jsWeek2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsWeek2.setPreferredSize(new java.awt.Dimension(246, 40));
        jsWeek2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsWeek2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jsWeek2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jsWeek2MouseExited(evt);
            }
        });
        jsWeek2.setLayout(new java.awt.BorderLayout());

        jsW2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jsW2.setText("  WEEK 2");
        jsW2.setEnabled(false);
        jsW2.setPreferredSize(new java.awt.Dimension(104, 20));
        jsWeek2.add(jsW2, java.awt.BorderLayout.CENTER);

        jsSelect2.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jsSelect2Layout = new javax.swing.GroupLayout(jsSelect2);
        jsSelect2.setLayout(jsSelect2Layout);
        jsSelect2Layout.setHorizontalGroup(
            jsSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jsSelect2Layout.setVerticalGroup(
            jsSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jsWeek2.add(jsSelect2, java.awt.BorderLayout.LINE_START);

        jsMenu.add(jsWeek2);

        jsWeek3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsWeek3.setPreferredSize(new java.awt.Dimension(246, 40));
        jsWeek3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsWeek3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jsWeek3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jsWeek3MouseExited(evt);
            }
        });
        jsWeek3.setLayout(new java.awt.BorderLayout());

        jsW3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jsW3.setText("  WEEK 3");
        jsW3.setEnabled(false);
        jsW3.setPreferredSize(new java.awt.Dimension(104, 20));
        jsWeek3.add(jsW3, java.awt.BorderLayout.CENTER);

        jsSelect3.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jsSelect3Layout = new javax.swing.GroupLayout(jsSelect3);
        jsSelect3.setLayout(jsSelect3Layout);
        jsSelect3Layout.setHorizontalGroup(
            jsSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jsSelect3Layout.setVerticalGroup(
            jsSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jsWeek3.add(jsSelect3, java.awt.BorderLayout.LINE_START);

        jsMenu.add(jsWeek3);

        jsWeek4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsWeek4.setPreferredSize(new java.awt.Dimension(246, 40));
        jsWeek4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsWeek4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jsWeek4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jsWeek4MouseExited(evt);
            }
        });
        jsWeek4.setLayout(new java.awt.BorderLayout());

        jsW4.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jsW4.setText("  WEEK 4");
        jsW4.setEnabled(false);
        jsW4.setPreferredSize(new java.awt.Dimension(104, 20));
        jsWeek4.add(jsW4, java.awt.BorderLayout.CENTER);

        jsSelect4.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout jsSelect4Layout = new javax.swing.GroupLayout(jsSelect4);
        jsSelect4.setLayout(jsSelect4Layout);
        jsSelect4Layout.setHorizontalGroup(
            jsSelect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jsSelect4Layout.setVerticalGroup(
            jsSelect4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jsWeek4.add(jsSelect4, java.awt.BorderLayout.LINE_START);

        jsMenu.add(jsWeek4);

        studyMenu.add(jsMenu, "studyJs");

        sqlMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sqlMenu.setPreferredSize(new java.awt.Dimension(250, 570));
        sqlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        sqlmenuTitle.setPreferredSize(new java.awt.Dimension(246, 85));
        sqlmenuTitle.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        jLabel51.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel51.setText("<html> Structured Query <br> Language [SQL] </html>");
        sqlmenuTitle.add(jLabel51);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
        jLabel52.setPreferredSize(new java.awt.Dimension(248, 14));
        sqlmenuTitle.add(jLabel52);

        sqlMenu.add(sqlmenuTitle);

        sqlView.setBackground(new java.awt.Color(224, 224, 224));
        sqlView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqlView.setPreferredSize(new java.awt.Dimension(246, 40));
        sqlView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sqlViewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sqlViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sqlViewMouseExited(evt);
            }
        });
        sqlView.setLayout(new java.awt.BorderLayout());

        jLabel53.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel53.setText("  OVERVIEW");
        jLabel53.setPreferredSize(new java.awt.Dimension(104, 20));
        sqlView.add(jLabel53, java.awt.BorderLayout.CENTER);

        sqlSelect.setBackground(new java.awt.Color(50, 50, 250));
        sqlSelect.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout sqlSelectLayout = new javax.swing.GroupLayout(sqlSelect);
        sqlSelect.setLayout(sqlSelectLayout);
        sqlSelectLayout.setHorizontalGroup(
            sqlSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        sqlSelectLayout.setVerticalGroup(
            sqlSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sqlView.add(sqlSelect, java.awt.BorderLayout.LINE_START);

        sqlMenu.add(sqlView);

        sqlWeek1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqlWeek1.setPreferredSize(new java.awt.Dimension(246, 40));
        sqlWeek1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sqlWeek1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sqlWeek1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sqlWeek1MouseExited(evt);
            }
        });
        sqlWeek1.setLayout(new java.awt.BorderLayout());

        sqlW1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        sqlW1.setText("  WEEK 1");
        sqlW1.setPreferredSize(new java.awt.Dimension(104, 20));
        sqlWeek1.add(sqlW1, java.awt.BorderLayout.CENTER);

        sqlSelect1.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout sqlSelect1Layout = new javax.swing.GroupLayout(sqlSelect1);
        sqlSelect1.setLayout(sqlSelect1Layout);
        sqlSelect1Layout.setHorizontalGroup(
            sqlSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        sqlSelect1Layout.setVerticalGroup(
            sqlSelect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sqlWeek1.add(sqlSelect1, java.awt.BorderLayout.LINE_START);

        sqlMenu.add(sqlWeek1);

        sqlWeek2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqlWeek2.setPreferredSize(new java.awt.Dimension(246, 40));
        sqlWeek2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sqlWeek2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sqlWeek2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sqlWeek2MouseExited(evt);
            }
        });
        sqlWeek2.setLayout(new java.awt.BorderLayout());

        sqlW2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        sqlW2.setText("  WEEK 2");
        sqlW2.setEnabled(false);
        sqlW2.setPreferredSize(new java.awt.Dimension(104, 20));
        sqlWeek2.add(sqlW2, java.awt.BorderLayout.CENTER);

        sqlSelect2.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout sqlSelect2Layout = new javax.swing.GroupLayout(sqlSelect2);
        sqlSelect2.setLayout(sqlSelect2Layout);
        sqlSelect2Layout.setHorizontalGroup(
            sqlSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        sqlSelect2Layout.setVerticalGroup(
            sqlSelect2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sqlWeek2.add(sqlSelect2, java.awt.BorderLayout.LINE_START);

        sqlMenu.add(sqlWeek2);

        sqlWeek3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sqlWeek3.setPreferredSize(new java.awt.Dimension(246, 40));
        sqlWeek3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sqlWeek3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sqlWeek3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sqlWeek3MouseExited(evt);
            }
        });
        sqlWeek3.setLayout(new java.awt.BorderLayout());

        sqlW3.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        sqlW3.setText("  WEEK 3");
        sqlW3.setEnabled(false);
        sqlW3.setPreferredSize(new java.awt.Dimension(104, 20));
        sqlWeek3.add(sqlW3, java.awt.BorderLayout.CENTER);

        sqlSelect3.setPreferredSize(new java.awt.Dimension(10, 50));

        javax.swing.GroupLayout sqlSelect3Layout = new javax.swing.GroupLayout(sqlSelect3);
        sqlSelect3.setLayout(sqlSelect3Layout);
        sqlSelect3Layout.setHorizontalGroup(
            sqlSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        sqlSelect3Layout.setVerticalGroup(
            sqlSelect3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        sqlWeek3.add(sqlSelect3, java.awt.BorderLayout.LINE_START);

        sqlMenu.add(sqlWeek3);

        studyMenu.add(sqlMenu, "studySql");

        studyHTML.add(studyMenu, java.awt.BorderLayout.LINE_START);

        studyViewer.setMaximumSize(new java.awt.Dimension(680, 197));
        studyViewer.setPreferredSize(new java.awt.Dimension(680, 570));
        studyViewer.setLayout(new java.awt.BorderLayout(0, 10));

        buttonNav.setMaximumSize(new java.awt.Dimension(680, 40));
        buttonNav.setMinimumSize(new java.awt.Dimension(680, 40));
        buttonNav.setPreferredSize(new java.awt.Dimension(710, 50));
        buttonNav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        buttonNav.add(buttonPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        buttonNav.add(buttonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        studyViewer.add(buttonNav, java.awt.BorderLayout.PAGE_END);

        lessonViewer.setMaximumSize(new java.awt.Dimension(680, 40));
        lessonViewer.setPreferredSize(new java.awt.Dimension(680, 510));
        lessonViewer.setLayout(new java.awt.CardLayout());

        overview.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        overview.setMaximumSize(new java.awt.Dimension(680, 40));
        overview.setPreferredSize(new java.awt.Dimension(680, 514));
        overview.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel42.setText("Instructor's Note");
        overview.add(jLabel42);

        overviewNote.setEditable(false);
        overviewNote.setBackground(new java.awt.Color(240, 240, 240));
        overviewNote.setColumns(20);
        overviewNote.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        overviewNote.setLineWrap(true);
        overviewNote.setRows(5);
        overviewNote.setText("Welcome to the HTML pathway! So you’ve decided you want to learn some HTML? Well, you have come to the right place! Learning HTML is something every web developer should learn. After all, HTML is the basic skeleton of all web pages. Without HTML skills, web developers wouldn’t be able to add text, add images, or even add videos to your favorite websites. HTML is the very foundation of everything you need to know in order to create an engaging web page!\n\nIn this pathway, you will learn all the common HTML tags used to structure HTML pages. You will also learn how to add links and images to your web pages. Plus, some basics on how to create HTML tables, forms, lists, and iFrames.\n\nIf ever you encountered some issues, have inquiries or suggestions, please do not hesitate to get in touch with our support team in the contact us section. We would love to hear from you!\n\nWhat website do you wish existed but doesn't yet? Whatever that may be, hopefully, by the end of this pathway, you will be able to create your very own web page! Goodluck on starting your HTML journey and continue building your imagination!  ");
        overviewNote.setWrapStyleWord(true);
        overviewNote.setMaximumSize(new java.awt.Dimension(100, 100));
        overviewNote.setMinimumSize(new java.awt.Dimension(100, 22));
        overviewNote.setPreferredSize(new java.awt.Dimension(710, 450));
        overview.add(overviewNote);

        lessonViewer.add(overview, "overview");

        lesson.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lesson.setLayout(new java.awt.BorderLayout());
        lessonViewer.add(lesson, "lesson");

        quiz.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        quiz.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        quizWeek.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizWeek.setText("Week 1 - Quiz");
        quizWeek.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizWeek.setPreferredSize(new java.awt.Dimension(160, 30));
        quiz.add(quizWeek);

        quizTimerLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizTimerLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        quizTimerLabel.setText("Timer:");
        quizTimerLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizTimerLabel.setPreferredSize(new java.awt.Dimension(500, 30));
        quiz.add(quizTimerLabel);

        quizTimer.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizTimer.setText("10");
        quizTimer.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizTimer.setPreferredSize(new java.awt.Dimension(40, 30));
        quiz.add(quizTimer);

        quizInstructions.setEditable(false);
        quizInstructions.setBackground(new java.awt.Color(240, 240, 240));
        quizInstructions.setColumns(20);
        quizInstructions.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        quizInstructions.setLineWrap(true);
        quizInstructions.setRows(1);
        quizInstructions.setText("All of the quizzes will have a timer per number in order for you not to cheat and apply your learnings from the lesson created by the instructors for you. \n\nIn order to assess your learning in this week you must pass the quiz with a score of above 70%. You will be given three (3) attempts to answer the quiz. In the event that you fail all of the three attempts, there will be a time penalty which is approximately 3 minutes before you can reattempt to answer again.\n\nNote: Closing the app while the reattempt timer is not done will reset it back to 3 minutes.\n\n");
        quizInstructions.setWrapStyleWord(true);
        quizInstructions.setMaximumSize(new java.awt.Dimension(710, 50));
        quizInstructions.setMinimumSize(new java.awt.Dimension(710, 50));
        quizInstructions.setPreferredSize(new java.awt.Dimension(710, 170));
        quizInstructions.setRequestFocusEnabled(false);
        quiz.add(quizInstructions);

        quizNo.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        quizNo.setText("Question ");
        quizNo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizNo.setPreferredSize(new java.awt.Dimension(710, 30));
        quiz.add(quizNo);

        quizQuestion.setEditable(false);
        quizQuestion.setBackground(new java.awt.Color(240, 240, 240));
        quizQuestion.setColumns(20);
        quizQuestion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        quizQuestion.setLineWrap(true);
        quizQuestion.setRows(1);
        quizQuestion.setText("Once you click the start button, the question will appear in this part.");
        quizQuestion.setWrapStyleWord(true);
        quizQuestion.setMaximumSize(new java.awt.Dimension(710, 50));
        quizQuestion.setMinimumSize(new java.awt.Dimension(710, 50));
        quizQuestion.setPreferredSize(new java.awt.Dimension(710, 40));
        quiz.add(quizQuestion);

        quizChoices.add(quizChoiceA);
        quizChoiceA.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        quizChoiceA.setText("Choice A");
        quizChoiceA.setEnabled(false);
        quizChoiceA.setPreferredSize(new java.awt.Dimension(710, 23));
        quiz.add(quizChoiceA);

        quizChoices.add(quizChoiceB);
        quizChoiceB.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        quizChoiceB.setText("Choice B");
        quizChoiceB.setEnabled(false);
        quizChoiceB.setPreferredSize(new java.awt.Dimension(710, 23));
        quiz.add(quizChoiceB);

        quizChoices.add(quizChoiceC);
        quizChoiceC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        quizChoiceC.setText("Choice C");
        quizChoiceC.setEnabled(false);
        quizChoiceC.setPreferredSize(new java.awt.Dimension(710, 23));
        quiz.add(quizChoiceC);

        quizChoices.add(quizChoiceD);
        quizChoiceD.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        quizChoiceD.setText("Choice D");
        quizChoiceD.setEnabled(false);
        quizChoiceD.setPreferredSize(new java.awt.Dimension(710, 23));
        quiz.add(quizChoiceD);

        jPanel19.setPreferredSize(new java.awt.Dimension(710, 20));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        quiz.add(jPanel19);

        quizSubmit.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        quizSubmit.setText("Start");
        quizSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quizSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizSubmitActionPerformed(evt);
            }
        });
        quiz.add(quizSubmit);

        jPanel29.setPreferredSize(new java.awt.Dimension(600, 30));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        quiz.add(jPanel29);

        quizScoreLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizScoreLabel.setText("Score:");
        quizScoreLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizScoreLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        quiz.add(quizScoreLabel);

        quizScore.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizScore.setText("0");
        quizScore.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizScore.setPreferredSize(new java.awt.Dimension(40, 30));
        quiz.add(quizScore);

        quizReattemptLabel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizReattemptLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        quizReattemptLabel.setText("Reattempt Timer:");
        quizReattemptLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizReattemptLabel.setPreferredSize(new java.awt.Dimension(520, 30));
        quiz.add(quizReattemptLabel);

        quizReattempt.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        quizReattempt.setText("180");
        quizReattempt.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        quizReattempt.setPreferredSize(new java.awt.Dimension(55, 30));
        quiz.add(quizReattempt);

        lessonViewer.add(quiz, "quiz");

        studyViewer.add(lessonViewer, java.awt.BorderLayout.CENTER);

        studyHTML.add(studyViewer, java.awt.BorderLayout.CENTER);

        dashStudy.add(studyHTML, "studyHTML");

        dashMain.add(dashStudy, "dashStudy");

        jPanel22.setPreferredSize(new java.awt.Dimension(800, 560));
        jPanel22.setLayout(new java.awt.BorderLayout(20, 0));

        profileInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileInfo.setPreferredSize(new java.awt.Dimension(280, 550));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/school_director_96px.png"))); // NOI18N
        profileInfo.add(jLabel37);

        profileName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        profileName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileName.setText("JUAN DELA CRUZ");
        profileName.setPreferredSize(new java.awt.Dimension(276, 30));
        profileInfo.add(profileName);

        jLabel36.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel36.setText("Email: ");
        jLabel36.setPreferredSize(new java.awt.Dimension(50, 20));
        profileInfo.add(jLabel36);

        profileEmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        profileEmail.setText("Sample@gmail.com");
        profileEmail.setPreferredSize(new java.awt.Dimension(210, 20));
        profileInfo.add(profileEmail);

        jLabel38.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel38.setText("Username: ");
        jLabel38.setPreferredSize(new java.awt.Dimension(80, 20));
        profileInfo.add(jLabel38);

        profileUsername.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        profileUsername.setText("SampleUserName");
        profileUsername.setPreferredSize(new java.awt.Dimension(180, 20));
        profileInfo.add(profileUsername);

        jLabel39.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel39.setText("Activation Key: ");
        jLabel39.setPreferredSize(new java.awt.Dimension(110, 20));
        profileInfo.add(jLabel39);

        profileActivation.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        profileActivation.setText("ABCD-1234-EFGH-56");
        profileActivation.setPreferredSize(new java.awt.Dimension(150, 20));
        profileInfo.add(profileActivation);

        jLabel40.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel40.setText("Current Pathway:");
        jLabel40.setPreferredSize(new java.awt.Dimension(120, 20));
        profileInfo.add(jLabel40);

        profilePathway.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        profilePathway.setText("None");
        profilePathway.setPreferredSize(new java.awt.Dimension(140, 20));
        profileInfo.add(profilePathway);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(260, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        profileInfo.add(jPanel6);

        profileName1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        profileName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profileName1.setText("PROFILE BADGE");
        profileName1.setPreferredSize(new java.awt.Dimension(276, 30));
        profileInfo.add(profileName1);

        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        profileInfo.add(jSeparator1);

        jPanel22.add(profileInfo, java.awt.BorderLayout.LINE_START);

        jPanel17.setPreferredSize(new java.awt.Dimension(300, 570));
        jPanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        profileOverall.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        profileOverall.setPreferredSize(new java.awt.Dimension(690, 90));
        profileOverall.setLayout(new java.awt.BorderLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/futures_96px.png"))); // NOI18N
        profileOverall.add(jLabel9, java.awt.BorderLayout.LINE_START);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setText("Overall Progress");
        jPanel9.add(jLabel16);
        jPanel9.add(jSeparator2);

        overallProgress.setMaximum(180);
        overallProgress.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel9.add(overallProgress);

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

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLong.png"))); // NOI18N
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

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/html_5_96px.png"))); // NOI18N
        profileOverall2.add(jLabel32, java.awt.BorderLayout.LINE_START);

        jPanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel17.setText("HTML Progress");
        jPanel20.add(jLabel17);

        htmlProgress.setMaximum(70);
        htmlProgress.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel20.add(htmlProgress);

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

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/css3_logo_96px.png"))); // NOI18N
        profileOverall3.add(jLabel33, java.awt.BorderLayout.LINE_START);

        jPanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel22.setText("CSS Progress");
        jPanel23.add(jLabel22);

        cssProgress.setMaximum(40);
        cssProgress.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel23.add(cssProgress);

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

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/node_js_96px.png"))); // NOI18N
        profileOverall4.add(jLabel34, java.awt.BorderLayout.LINE_START);

        jPanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel23.setText("JS Progress");
        jPanel25.add(jLabel23);

        jsProgress.setMaximum(40);
        jsProgress.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel25.add(jsProgress);

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
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/database_import_72px_1.png"))); // NOI18N
        jLabel35.setPreferredSize(new java.awt.Dimension(96, 96));
        profileOverall5.add(jLabel35, java.awt.BorderLayout.LINE_START);

        jPanel27.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel24.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel24.setText("SQL Progress");
        jPanel27.add(jLabel24);

        sqlProgress.setMaximum(30);
        sqlProgress.setPreferredSize(new java.awt.Dimension(560, 30));
        jPanel27.add(sqlProgress);

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
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jP0gVmpXQruvR0jfNGlu_contactuswhite_1.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(997, 330));
        jPanel1.add(jLabel12);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LineLongGrey.png"))); // NOI18N
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel13.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanel1.add(jLabel13);

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("<html>  <head>  <style> p {   text-transform: uppercase; text-align: justify;} </style> </head> <p> <font size = 30> Hi! Having troubles using the app? </font> <br> Horrible experience? Bug reports? Complaints?<br><br>  No Worries. Hang in there, we got you covered. <br> As much as we want a smooth sailing experience to our users, issues are inevitable. <br> Let us know by sending an email on neilchristianriego3@gmail.com and we’ll get down to business. <br><br><br> <font size = 30> No troubles? </font> <br> Great. Send us your feedback on neilriego3@gmail.com. Every feedback counts. <br><br>  We appreciate your time sending comprehensive feedback as this will guarantee quality<br> improvements in the future. We ensure every feedbacks are evaluated because we value <br> your time and effort on this matter. We hope to provide you a better experience in the future.  </p> </html>");
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
    
    public void getStorageArray(){
        arrayStorage abc = new arrayStorage();
        pdfStorage = abc.arrayPDFStorage();
        currentWeek = abc.currentWeek();
        question = abc.arrayQuestionStorage();
        correct = abc.arrayCorrect();
        answer = abc.arrayAnswer();
        sideColor = abc.getsideColor();
        mainTab = abc.getmainTab();
        instructorNote = abc.getInstructorNote();
    }  
     
    public void getAccessName(){
        jframeLogin abc = new jframeLogin();
        String userInfo[] = abc.getuserArray();
        userQuiz = abc.getScore();
        name = userInfo[0];
        profileName.setText(name);
        profileEmail.setText(userInfo[1]);
        profileUsername.setText(userInfo[2]);
        profileActivation.setText(userInfo[3]);    
        currentPathway = Integer.valueOf(userInfo[4]);
        currentRetry = Integer.valueOf(userInfo[5]);
        choicePathway();
    }
    
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            seconds --;
            if (seconds <=0){
                quizChoices.clearSelection();
                timer.stop();
                if (question[currentPathway][i].length > (no+1)){
                    pause.setRepeats(false);
                    pause.start(); 
                } else 
                    quizReset();    
            }
            quizTimer.setText(String.valueOf(seconds));
        }
    });

    Timer reattempt = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            secondReattempt --;
            quizReattempt.setText(String.valueOf(secondReattempt));
            if (secondReattempt <= 0){
                reattempt.stop();
                attempt = 0;
                sqlUpdateRetry();
                quizReattempt.setText("180");
                quizSubmit.setEnabled(true);
            }
        }
    });
    
    Timer pause = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            no ++;
            quizPrinting();  
            seconds = 10;
            quizTimer.setText(String.valueOf(seconds));
        }
    });
    
    public void progress() {
        overall=html=js=css=sql=0;
        for (int progress = 0; progress < 18; progress++ ){
            if (Integer.valueOf(userQuiz[progress]) > 0 && progress <=6){
                html += 10;
                overall +=10;
            }
            if (Integer.valueOf(userQuiz[progress]) > 0 && (progress <=10 && progress >=7)){
                js += 10;
                overall +=10;
            }            
            if (Integer.valueOf(userQuiz[progress]) > 0 && (progress <=14 && progress >=11)){
                css += 10;
                overall +=10;
            }
            if (Integer.valueOf(userQuiz[progress]) > 0 && (progress <=17 && progress >=15)){
                sql += 10;
                overall +=10;
            }            
        }
        overallProgress.setValue(overall);
        htmlProgress.setValue(html);
        cssProgress.setValue(css);
        jsProgress.setValue(js);
        sqlProgress.setValue(sql);
    }
    
    public void quizReset() {
        timer.stop();
        quizSubmit.setText("Start");
        quizChoices.clearSelection();
        quizChoiceA.setEnabled(false);
        quizChoiceB.setEnabled(false);
        quizChoiceC.setEnabled(false);
        quizChoiceD.setEnabled(false);   
        quizNo.setText("Question");
        quizQuestion.setText("Once you click the start button, the question will appear in this part.");
        quizChoiceA.setText("Choice A");
        quizChoiceB.setText("Choice B");
        quizChoiceC.setText("Choice C");
        quizChoiceD.setText("Choice D");  
        seconds = 10;
        quizTimer.setText(String.valueOf(seconds));
        attempt ++;
        percentage = (percentage + score) / (no+1);
        no = 0;       
            if (attempt != 3){
                if (percentage >= .7 ){
                    //sql
                    sqlUpdateScore(score);
                    userQuiz[i] = String.valueOf(score);
                    weekInitialize();
                    buttonScoreInit();
                } else {
                    score = 0; 
                    quizScore.setText(String.valueOf(score));
                }
            } else {
                quizSubmit.setEnabled(false);
                currentRetry = 1;
                sqlUpdateRetry();
                reattempt.start();                
            }
        score = 0; 
        percentage = 0;  
        
    }
    
    public void weekInitialize() {
        int ctr = 0,stop=0;
        if (currentPathway != -1){
            while (stop == 0) {
                if (Integer.valueOf(userQuiz[ctr]) == 0 && ctr <=6 && currentPathway == 0){
                    switch(ctr){
                        case 0: stop = 1; break;
                        case 1:{
                            htmlW2.setEnabled(true);
                            stop = 1;
                        } break;
                        case 2:{
                            htmlW2.setEnabled(true);
                            htmlW3.setEnabled(true);
                            stop = 1;
                        } break;
                        case 3:{
                            htmlW2.setEnabled(true);
                            htmlW3.setEnabled(true);                        
                            htmlW4.setEnabled(true);
                            stop = 1;
                        } break;
                        case 4:{
                            htmlW2.setEnabled(true);
                            htmlW3.setEnabled(true);                        
                            htmlW4.setEnabled(true);                        
                            htmlW5.setEnabled(true);
                            stop = 1;
                        } break;
                        case 5:{
                            htmlW2.setEnabled(true);
                            htmlW3.setEnabled(true);                        
                            htmlW4.setEnabled(true);   
                            htmlW5.setEnabled(true);
                            htmlW6.setEnabled(true);
                            stop = 1;
                        } break;
                        case 6:{
                            htmlW2.setEnabled(true);
                            htmlW3.setEnabled(true);                        
                            htmlW4.setEnabled(true);   
                            htmlW5.setEnabled(true);
                            htmlW6.setEnabled(true);
                            htmlW7.setEnabled(true);
                            stop = 1;
                        } break;
                    }
                } else if (Integer.valueOf(userQuiz[ctr]) != 0 && ctr ==6 && currentPathway == 0){
                        htmlW2.setEnabled(true);
                        htmlW3.setEnabled(true);                        
                        htmlW4.setEnabled(true);   
                        htmlW5.setEnabled(true);
                        htmlW6.setEnabled(true);
                        htmlW7.setEnabled(true);
                        stop = 1;
                }
                if (Integer.valueOf(userQuiz[ctr]) == 0 && (ctr <=10 && ctr >=7) && currentPathway == 1){
                    switch(ctr){
                        case 7: stop = 1; break;
                        case 8:{
                            cssW2.setEnabled(true);
                            stop = 1;
                        } break;
                        case 9:{
                            cssW2.setEnabled(true);
                            cssW3.setEnabled(true);
                            stop = 1;
                        } break;
                        case 10:{
                            cssW2.setEnabled(true);
                            cssW3.setEnabled(true);                        
                            cssW4.setEnabled(true);
                            stop = 1;
                        } break;        
                    }
                } else if (Integer.valueOf(userQuiz[ctr]) != 0 && ctr ==10 && currentPathway == 1){
                        cssW2.setEnabled(true);
                        cssW3.setEnabled(true);                        
                        cssW4.setEnabled(true);   
                        stop = 1;
                }
                if (Integer.valueOf(userQuiz[ctr]) == 0 && (ctr <=14 && ctr >= 11) && currentPathway == 2){
                    switch(ctr){
                        case 11: stop = 1; break;
                        case 12:{
                            jsW2.setEnabled(true);
                            stop = 1;
                        } break;
                        case 13:{
                            jsW2.setEnabled(true);
                            jsW3.setEnabled(true);
                            stop = 1;
                        } break;
                        case 14:{
                            jsW2.setEnabled(true);
                            jsW3.setEnabled(true);                        
                            jsW4.setEnabled(true);
                            stop = 1;
                        } break;
                    }
                } else if (Integer.valueOf(userQuiz[ctr]) != 0 && ctr ==14 && currentPathway == 2){
                        jsW2.setEnabled(true);
                        jsW3.setEnabled(true);                        
                        jsW4.setEnabled(true);   
                        stop = 1;
                }
                if (Integer.valueOf(userQuiz[ctr]) == 0 && (ctr <=17 && ctr >=15) && currentPathway == 3){
                    switch(ctr){
                        case 15: stop = 1; break;
                        case 16:{
                            sqlW2.setEnabled(true);
                            stop = 1;
                        } break;
                        case 17:{
                            sqlW2.setEnabled(true);
                            sqlW3.setEnabled(true);
                            stop = 1;
                        } break;
                    }
                } else if (Integer.valueOf(userQuiz[ctr]) != 0 && ctr ==17 && currentPathway == 3){
                        sqlW2.setEnabled(true);
                        sqlW3.setEnabled(true);                        
                        stop = 1; 
                }
                ctr ++;
            }            
        }
    }
    
    public void buttonScoreInit() {
        switch(currentPathway){
            case 0:{
                switch(i) {
                    case 0: {
                        if (htmlW2.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else 
                             quizScore.setText("0");
                    } break;
                    case 1: {
                        if (htmlW3.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 2: {
                        if (htmlW4.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 3: {
                        if (htmlW5.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 4: {
                        if (htmlW6.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 5: {
                        if (htmlW7.isEnabled()){
                            quizScore.setText(userQuiz[i]);
                            buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 6: quizScore.setText(userQuiz[i]); break;
                    default:break;
                }                
            } break;
            case 1: {
                i += 7;
                switch(i) {
                    case 7: {
                        if (cssW2.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else 
                             quizScore.setText("0");
                    } break;
                    case 8: {
                        if (cssW3.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 9: {
                        if (cssW4.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 10: quizScore.setText(userQuiz[i]); break;
                    default: break;
                }
            i -=7;
            } break;
            case 2: {
                i += 11;
                switch(i) {
                    case 11: {
                        if (jsW2.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else 
                             quizScore.setText("0");
                    } break;
                    case 12: {
                        if (jsW3.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 13: {
                        if (jsW4.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 14: quizScore.setText(userQuiz[i]); break;
                    default: break;
                }
                i -= 11;
            } break;
            case 3:{
                i += 15;
                switch(i+15) {
                    case 15: {
                        if (sqlW2.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else 
                             quizScore.setText("0");
                    } break;
                    case 16: {
                        if (sqlW3.isEnabled()){
                           quizScore.setText(userQuiz[i]);
                           buttonNext.setEnabled(true);
                        } else
                             quizScore.setText("0");
                    } break;
                    case 17: quizScore.setText(userQuiz[i]); break;
                    default: break;
                } 
                i -= 15;
            } break;
        }
        
    }
    
    public void quizRetry() {
        if (currentRetry == 1){
            quizSubmit.setEnabled(false);
            currentRetry = 0; 
            reattempt.start();   
        }        
    }
    
    public void quizPrinting() {
        timer.start();
        if (!quizChoiceA.isEnabled()){
            quizChoiceA.setEnabled(true);
            quizChoiceB.setEnabled(true);
            quizChoiceC.setEnabled(true);
            quizChoiceD.setEnabled(true);   
        }
        quizNo.setText("Question No. " + (no+1));
        quizQuestion.setText(question[currentPathway][i][no]);
        quizChoiceA.setText(answer[currentPathway][i][no][0]);
        quizChoiceB.setText(answer[currentPathway][i][no][1]);
        quizChoiceC.setText(answer[currentPathway][i][no][2]);
        quizChoiceD.setText(answer[currentPathway][i][no][3]);
    }
    
    public void quizSelection () {       
        if (quizChoiceA.isSelected()){
            Answer = "A";
        } else if (quizChoiceB.isSelected()){
            Answer = "B";
        } else if (quizChoiceC.isSelected()){
            Answer = "C";
        } else if (quizChoiceD.isSelected()){
            Answer = "D";
        } else {
            Answer = " ";
        }
    }
    
    public void quizLogic() {
        quizSelection();
        if (Answer.equals(correct[currentPathway][i][no])) {
            score ++;
            quizScore.setText(String.valueOf(score));
        }
    }     
    
    public void choicePathway() {
       switch(currentPathway) {
            case -1: {
                profilePathway.setText("None");
                htmlButton.setEnabled(true);
                cssButton.setEnabled(true);
                jsButton.setEnabled(true);
                sqlButton.setEnabled(true);
            } break;
            case 0: {
                studyCurrent.setEnabled(true);
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                studyIcon.setEnabled(true);
                profilePathway.setText(pathway[currentPathway]);
                htmlButton.setEnabled(true);
            } break;
            case 1: {
                studyCurrent.setEnabled(true);
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                studyIcon.setEnabled(true);
                profilePathway.setText(pathway[currentPathway]);
                cssButton.setEnabled(true);
            } break;
            case 2: {
                studyCurrent.setEnabled(true);
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                studyIcon.setEnabled(true);
                profilePathway.setText(pathway[currentPathway]);
                jsButton.setEnabled(true);
            } break;
            case 3: {
                studyCurrent.setEnabled(true);
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                studyIcon.setEnabled(true);
                profilePathway.setText(pathway[currentPathway]);
                sqlButton.setEnabled(true);
            } break;
            default: break;
        }        
    }   
    
    public void sqlUpdateScore (int weekScore) {          
        String sql = "UPDATE userQuiz SET "+ currentWeek[currentPathway][i] +" = ? WHERE name = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, String.valueOf(weekScore));
            pst.setString(2, name);
            pst.execute();
        } catch(HeadlessException |SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }         
    }
    
    public void sqlUpdateRetry() {          
        String sql = "UPDATE userInfo SET retry = ? WHERE name = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, String.valueOf(currentRetry));
            pst.setString(2, name);
            pst.execute();
        } catch(HeadlessException |SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }         
    }
    
    public void sqlUpdatePathway (int updateValue) {     
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to pick " + String.valueOf(pathway[updateValue]));
        if (confirm == JOptionPane.YES_OPTION) {
            String sql = "UPDATE userInfo SET pathchoice = ? WHERE name = ?";
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, String.valueOf(updateValue));
                pst.setString(2, name);
                pst.execute();
                currentPathway = updateValue;
                choicePathway();
            } catch(HeadlessException |SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }          
        }
    } 
    
    
    public void controllerNext(CardLayout controlLayout, String card, String card2, JPanel containerParent,int max,JButton next, JButton prev){
        controlLayout = (CardLayout) (containerParent.getLayout());     
            i = i+1;
            if (i == 0) {
                controlLayout.show(containerParent,card);
                if (count == 0){
                    InputStream url = getClass().getResourceAsStream(pdfStorage[currentPathway][i]);
                    ctrl.openDocument(url,"PDF",null);
                    prev.setEnabled(true);
                    count = 1;  
                    prevcount = 0;
                } else if (count == 1) {
                    next.setEnabled(false);                 
                    controlLayout.show(containerParent,card2);
                    count = 0;
                    prevcount = 1;
                    i = i -1;
                    buttonScoreInit();
                }

            } else if (i <= max) {
                if (count == 0){
                    controlLayout.show(containerParent,card);
                    InputStream url = getClass().getResourceAsStream(pdfStorage[currentPathway][i]);
                    ctrl.openDocument(url,"PDF",null);
                    count = 1;
                    prevcount = 0;
                } else if (count == 1) {
                    next.setEnabled(false); 
                    controlLayout.show(containerParent,card2);
                    quizWeek.setText("Week " + i + " - Quiz");
                    count = 0;
                    prevcount = 1;
                    i = i -1;
                    buttonScoreInit();
                } 
            }       
    } 
        
    public void controllerPrev(CardLayout controlLayout, String card, String card2,JPanel containerParent,int max,JButton next, JButton prev){
        controlLayout = (CardLayout) (containerParent.getLayout());
        if (i != -1) {
            i = i-1;
            if (i > -1) {
                if (prevcount == 1) {
                    controlLayout.show(containerParent,card2);
                    prevcount = 0;
                    count = 1;
                    i = i+1; 
                    next.setEnabled(true);
                    InputStream url = getClass().getResourceAsStream(pdfStorage[currentPathway][i]);
                    ctrl.openDocument(url,"PDF",null);
                } else if (prevcount == 0) {
                    InputStream url = getClass().getResourceAsStream(pdfStorage[currentPathway][i]);
                    ctrl.openDocument(url,"PDF",null);
                    count = 1;
                }
            }
            if (i == -1) {
                if (prevcount == 1) {
                    controlLayout.show(containerParent,card2);
                    prevcount = 0;
                    count = 1;
                    i = i+1;
                    next.setEnabled(true);
                } else if (prevcount == 0) {
                    prev.setEnabled(false);
                    controlLayout.show(containerParent,card);  
                    count = 0;
                }
             
            }
        }
    }

    public void controllerShow(CardLayout controlLayout,int state, String card, JPanel containerParent){
        controlLayout = (CardLayout) (containerParent.getLayout());
        if (state == -1) {
            controlLayout.show(containerParent,card);
        } else if (state >=0) {
            controlLayout.show(containerParent,card);
            InputStream url = getClass().getResourceAsStream(pdfStorage[currentPathway][i]);
            ctrl.openDocument(url,"PDF",null);
        }
    }
    
    public void dashHover (JPanel state, JPanel side,Color mousestate,int frame) {
        if (state != viewHtml && frame == 0 ) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);
        } else if (state != viewCss && frame == 1) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);
        } else if (state != viewJs && frame == 2) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);            
        } else if (state != viewSql && frame == 3) {
            state.setBackground(mousestate);
            side.setBackground(mousestate);            
        }
    }
           
    public void dashSelect (JPanel state, JPanel side,int frame) {
        if (state != viewHtml && frame == 0) {
            viewHtml.setBackground(colorSelected);
            sideHtml.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);
            viewHtml = state;
            sideHtml = side;
        } else if (state != viewCss && frame == 1) {
            viewCss.setBackground(colorSelected);
            sideCss.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);
            viewCss = state;
            sideCss = side;
        } else if (state != viewJs && frame == 2) {
            viewJs.setBackground(colorSelected);
            sideJs.setBackground(colorSelected);
            state.setBackground(colorNormal);
            side.setBackground(colorSide);   
            viewJs = state;
            sideJs = side;
        } else if (state != viewSql && frame == 3) {
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

    private void buttonStudy1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStudy1MouseExited
        hoverShow(buttonStudy,buttonStudy,buttonStudy1,colorNormal);
    }//GEN-LAST:event_buttonStudy1MouseExited

    private void buttonStudy1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStudy1MouseEntered
        hoverShow(buttonStudy,buttonStudy,buttonStudy1,colorHover);
    }//GEN-LAST:event_buttonStudy1MouseEntered

    private void buttonStudy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonStudy1MouseClicked
        if (studyCurrent.isEnabled()){
            cardLayout.show(dashMain,"dashStudy");
            overviewNote.setText(instructorNote[currentPathway]);
            cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
            selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal); 
            progress();
        }

    }//GEN-LAST:event_buttonStudy1MouseClicked
    public static void copyInputStreamToFile(InputStream input, File file) {  

        try (OutputStream output = new FileOutputStream(file)) {
            input.transferTo(output);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
    private void videoCSSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoCSSMouseClicked
        try {
            InputStream link1 =  getClass().getResourceAsStream("JavaScriptVideo.wmv"); 
            File link = new File ("JavaScriptVideo.wmv");
            copyInputStreamToFile(link1, link);
            Desktop.getDesktop().open(link);
        } catch (IOException ex) {
            Logger.getLogger(jframeMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_videoCSSMouseClicked

    private void videoSQL2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videoSQL2MouseClicked
        try {
            InputStream link1 =  getClass().getResourceAsStream("SQLVideo.wmv"); 
            File link = new File ("SQLVideo.wmv");
            copyInputStreamToFile(link1, link);
            Desktop.getDesktop().open(link);
        } catch (IOException ex) {
            Logger.getLogger(jframeMainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_videoSQL2MouseClicked

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        controllerNext(cardLayout2,"lesson","quiz",lessonViewer,question[currentPathway].length,buttonNext,buttonPrev);
        if (count == 1){
            switch (currentPathway) {
                case 0:
                    switch(i) {
                        case -1: dashSelect(htmlView,htmlSelect,currentPathway); break;
                        case 0: dashSelect(htmlWeek1,htmlSelect1,currentPathway); break;
                        case 1: dashSelect(htmlWeek2,htmlSelect2,currentPathway); break;
                        case 2: dashSelect(htmlWeek3,htmlSelect3,currentPathway); break;
                        case 3: dashSelect(htmlWeek4,htmlSelect4,currentPathway); break;
                        case 4: dashSelect(htmlWeek5,htmlSelect5,currentPathway); break;
                        case 5: dashSelect(htmlWeek6,htmlSelect6,currentPathway); break;
                        case 6: dashSelect(htmlWeek7,htmlSelect7,currentPathway); break;
                        default: break;
                    }   break;
                case 1:
                    switch(i) {
                        case -1: dashSelect(cssView,cssSelect,currentPathway); break;
                        case 0: dashSelect(cssWeek1,cssSelect1,currentPathway); break;
                        case 1: dashSelect(cssWeek2,cssSelect2,currentPathway); break;
                        case 2: dashSelect(cssWeek3,cssSelect3,currentPathway); break;
                        case 3: dashSelect(cssWeek4,cssSelect4,currentPathway); break;
                        default: break;
                    }   break;
                case 2:
                    switch(i) {
                        case -1: dashSelect(jsView,jsSelect,currentPathway); break;
                        case 0: dashSelect(jsWeek1,jsSelect1,currentPathway); break;
                        case 1: dashSelect(jsWeek2,jsSelect2,currentPathway); break;
                        case 2: dashSelect(jsWeek3,jsSelect3,currentPathway); break;
                        case 3: dashSelect(jsWeek4,jsSelect4,currentPathway); break;
                        default: break;
                    }   break;
                case 3:
                    switch(i) {
                        case -1: dashSelect(sqlView,sqlSelect,currentPathway); break;
                        case 0: dashSelect(sqlWeek1,sqlSelect1,currentPathway); break;
                        case 1: dashSelect(sqlWeek2,sqlSelect2,currentPathway); break;
                        case 2: dashSelect(sqlWeek3,sqlSelect3,currentPathway); break;
                        default: break;                   
                    }   break;
                default:
                    break;
            }
          
        }

    }//GEN-LAST:event_buttonNextActionPerformed

    private void htmlViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlViewMouseClicked
        dashSelect(htmlView,htmlSelect,currentPathway);
        buttonPrev.setEnabled(false);
        buttonNext.setEnabled(true);
        i = -1;
        count = 0;
        controllerShow(cardLayout2,i,"overview",lessonViewer);       
    }//GEN-LAST:event_htmlViewMouseClicked

    private void htmlViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlViewMouseEntered
        dashHover(htmlView,htmlSelect,colorHover,currentPathway);
    }//GEN-LAST:event_htmlViewMouseEntered

    private void htmlViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlViewMouseExited
        dashHover(htmlView,htmlSelect,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlViewMouseExited

    private void buttonPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrevActionPerformed
        controllerPrev(cardLayout2,"overview","lesson",lessonViewer,question[currentPathway].length,buttonNext,buttonPrev);
        switch (currentPathway) {
            case 0:
                switch(i) {
                    case -1: dashSelect(htmlView,htmlSelect,currentPathway); break;
                    case 0: dashSelect(htmlWeek1,htmlSelect1,currentPathway); break;
                    case 1: dashSelect(htmlWeek2,htmlSelect2,currentPathway); break;
                    case 2: dashSelect(htmlWeek3,htmlSelect3,currentPathway); break;
                    case 3: dashSelect(htmlWeek4,htmlSelect4,currentPathway); break;
                    case 4: dashSelect(htmlWeek5,htmlSelect5,currentPathway); break;
                    case 5: dashSelect(htmlWeek6,htmlSelect6,currentPathway); break;
                    case 6: dashSelect(htmlWeek7,htmlSelect7,currentPathway); break;
                    default: break;
                }
                break;
            case 1:
                switch(i) {
                    case -1: dashSelect(cssView,cssSelect,currentPathway); break;
                    case 0: dashSelect(cssWeek1,cssSelect1,currentPathway); break;
                    case 1: dashSelect(cssWeek2,cssSelect2,currentPathway); break;
                    case 2: dashSelect(cssWeek3,cssSelect3,currentPathway); break;
                    case 3: dashSelect(cssWeek4,cssSelect4,currentPathway); break;
                    default: break;
                }
                break;
            case 2:
                switch(i) {
                    case -1: dashSelect(jsView,jsSelect,currentPathway); break;
                    case 0: dashSelect(jsWeek1,jsSelect1,currentPathway); break;
                    case 1: dashSelect(jsWeek2,jsSelect2,currentPathway); break;
                    case 2: dashSelect(jsWeek3,jsSelect3,currentPathway); break;
                    case 3: dashSelect(jsWeek4,jsSelect4,currentPathway); break;
                    default: break;
                }
                break;
            case 3:
                switch(i) {
                    case -1: dashSelect(sqlView,sqlSelect,currentPathway); break;
                    case 0: dashSelect(sqlWeek1,sqlSelect1,currentPathway); break;
                    case 1: dashSelect(sqlWeek2,sqlSelect2,currentPathway); break;
                    case 2: dashSelect(sqlWeek3,sqlSelect3,currentPathway); break;
                    default: break;
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_buttonPrevActionPerformed

    private void htmlWeek1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek1MouseClicked
        if (htmlW1.isEnabled()) {
            dashSelect(htmlWeek1,htmlSelect1,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=0;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_htmlWeek1MouseClicked

    private void htmlWeek1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek1MouseEntered
        dashHover(htmlWeek1,htmlSelect1,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek1MouseEntered

    private void htmlWeek1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek1MouseExited
        dashHover(htmlWeek1,htmlSelect1,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek1MouseExited

    private void htmlWeek2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek2MouseClicked
        if (htmlW2.isEnabled()){
            dashSelect(htmlWeek2,htmlSelect2,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=1;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);            
        }
    }//GEN-LAST:event_htmlWeek2MouseClicked

    private void htmlWeek2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek2MouseEntered
        dashHover(htmlWeek2,htmlSelect2,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek2MouseEntered

    private void htmlWeek2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek2MouseExited
        dashHover(htmlWeek2,htmlSelect2,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek2MouseExited

    private void htmlWeek3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek3MouseClicked
        if (htmlW3.isEnabled()) {
            dashSelect(htmlWeek3,htmlSelect3,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=2;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);            
        }
    }//GEN-LAST:event_htmlWeek3MouseClicked

    private void htmlWeek3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek3MouseEntered
        dashHover(htmlWeek3,htmlSelect3,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek3MouseEntered

    private void htmlWeek3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek3MouseExited
        dashHover(htmlWeek3,htmlSelect3,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek3MouseExited

    private void htmlWeek4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek4MouseClicked
        if (htmlW4.isEnabled()) {
            dashSelect(htmlWeek4,htmlSelect4,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=3;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);
        }
    }//GEN-LAST:event_htmlWeek4MouseClicked

    private void htmlWeek4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek4MouseEntered
        dashHover(htmlWeek4,htmlSelect4,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek4MouseEntered

    private void htmlWeek4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek4MouseExited
        dashHover(htmlWeek4,htmlSelect4,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek4MouseExited

    private void htmlWeek5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek5MouseClicked
        if (htmlW5.isEnabled()) {
            dashSelect(htmlWeek5,htmlSelect5,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=4;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);
        }
    }//GEN-LAST:event_htmlWeek5MouseClicked

    private void htmlWeek5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek5MouseEntered
        dashHover(htmlWeek5,htmlSelect5,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek5MouseEntered

    private void htmlWeek5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek5MouseExited
        dashHover(htmlWeek5,htmlSelect5,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek5MouseExited

    private void htmlWeek6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek6MouseClicked
        if (htmlW6.isEnabled()) {
            dashSelect(htmlWeek6,htmlSelect6,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=5;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);
        }
    }//GEN-LAST:event_htmlWeek6MouseClicked

    private void htmlWeek6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek6MouseEntered
        dashHover(htmlWeek6,htmlSelect6,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek6MouseEntered

    private void htmlWeek6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek6MouseExited
        dashHover(htmlWeek6,htmlSelect6,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek6MouseExited

    private void htmlWeek7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek7MouseClicked
        if (htmlW7.isEnabled()) {
            dashSelect(htmlWeek7,htmlSelect7,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=6;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);
        }
    }//GEN-LAST:event_htmlWeek7MouseClicked

    private void htmlWeek7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek7MouseEntered
        dashHover(htmlWeek7,htmlSelect7,colorHover,currentPathway);
    }//GEN-LAST:event_htmlWeek7MouseEntered

    private void htmlWeek7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlWeek7MouseExited
        dashHover(htmlWeek7,htmlSelect7,colorSelected,currentPathway);
    }//GEN-LAST:event_htmlWeek7MouseExited

    private void htmlButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_htmlButtonMouseClicked
        if (!name.equals("Developer")) {
            if (htmlButton.isEnabled() && currentPathway == -1){
                sqlUpdatePathway(0); 
                weekInitialize();
            }       
            if (htmlButton.isEnabled() && currentPathway == 0){
                cardLayout.show(dashMain,"dashStudy");
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                cardLayout2 = (CardLayout) (lessonViewer.getLayout());
                cardLayout2.show(lessonViewer, "overview");
                selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal);                       
            }            
        } else {
            currentPathway = 0;
            weekInitialize();
            cardLayout.show(dashMain,"dashStudy");
            overviewNote.setText(instructorNote[currentPathway]);
            cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
            cardLayout2 = (CardLayout) (lessonViewer.getLayout());
            cardLayout2.show(lessonViewer, "overview");
            selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal); 
        }
    }//GEN-LAST:event_htmlButtonMouseClicked

    private void quizSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizSubmitActionPerformed
        if (!quizChoiceA.isEnabled()){
            quizSubmit.setText("Submit");       
        }
        if (seconds == 10){
            quizPrinting();
        }
        else if (seconds < 10) {
            quizLogic();
            if (question[currentPathway][i].length == (no+1))
                quizReset();
            else {
                timer.stop();
                quizChoices.clearSelection();
                pause.setRepeats(false);
                pause.start();                    
            }
        }
    }//GEN-LAST:event_quizSubmitActionPerformed

    private void cssButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssButtonMouseClicked
        if (!name.equals("Developer")) {
            if (cssButton.isEnabled() && currentPathway == -1){
                sqlUpdatePathway(1);    
                weekInitialize();          
            }          
            if (cssButton.isEnabled() && currentPathway == 1){
                cardLayout.show(dashMain,"dashStudy");
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                cardLayout2 = (CardLayout) (lessonViewer.getLayout());
                cardLayout2.show(lessonViewer, "overview");             
                selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal);                       
            }            
        } else {
            currentPathway = 1;
            weekInitialize();
            overviewNote.setText(instructorNote[currentPathway]);
            cardLayout.show(dashMain,"dashStudy");
            cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
            cardLayout2 = (CardLayout) (lessonViewer.getLayout());
            cardLayout2.show(lessonViewer, "overview");
            selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal); 
        }
    }//GEN-LAST:event_cssButtonMouseClicked

    private void jsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsButtonMouseClicked
        if (!name.equals("Developer")) {
            if (jsButton.isEnabled() && currentPathway == -1){  
                sqlUpdatePathway(2); 
                weekInitialize(); 
            }
                              
            if (jsButton.isEnabled() && currentPathway == 2){
                cardLayout.show(dashMain,"dashStudy");
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                cardLayout2 = (CardLayout) (lessonViewer.getLayout());
                cardLayout2.show(lessonViewer, "overview");
                selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal);                       
            }            
        } else {
            currentPathway = 2;
            weekInitialize();
            cardLayout.show(dashMain,"dashStudy");
            overviewNote.setText(instructorNote[currentPathway]);
            cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
            cardLayout2 = (CardLayout) (lessonViewer.getLayout());
            cardLayout2.show(lessonViewer, "overview");
            selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal); 
        }        
    }//GEN-LAST:event_jsButtonMouseClicked

    private void sqlButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlButtonMouseClicked
        if (!name.equals("Developer")) {
            if (sqlButton.isEnabled() && currentPathway == -1){
                sqlUpdatePathway(3);  
                weekInitialize(); 
            }
                             
            if (sqlButton.isEnabled() && currentPathway == 3){
                cardLayout.show(dashMain,"dashStudy");
                overviewNote.setText(instructorNote[currentPathway]);
                cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
                cardLayout2 = (CardLayout) (lessonViewer.getLayout());
                cardLayout2.show(lessonViewer, "overview");
                selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal);                       
            }            
        } else {
            currentPathway = 3;
            weekInitialize();
            overviewNote.setText(instructorNote[currentPathway]);
            cardLayout.show(dashMain,"dashStudy");
            cardLayout3.show(studyMenu, cardLayoutStudy[currentPathway]);
            cardLayout2 = (CardLayout) (lessonViewer.getLayout());
            cardLayout2.show(lessonViewer, "overview");
            selectShow(buttonStudy, buttonStudy,buttonStudy1,colorSelected,colorNormal); 
        }        
    }//GEN-LAST:event_sqlButtonMouseClicked

    private void cssViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssViewMouseClicked
        dashSelect(cssView,cssSelect,currentPathway);
        buttonPrev.setEnabled(false);
        buttonNext.setEnabled(true);
        i = -1;
        controllerShow(cardLayout2,i,"overview",lessonViewer);
    }//GEN-LAST:event_cssViewMouseClicked

    private void cssViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssViewMouseEntered
        dashHover(cssView,cssSelect,colorHover,currentPathway);
    }//GEN-LAST:event_cssViewMouseEntered

    private void cssViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssViewMouseExited
        dashHover(cssView,cssSelect,colorSelected,currentPathway);
    }//GEN-LAST:event_cssViewMouseExited

    private void cssWeek1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek1MouseClicked
        if (cssW1.isEnabled()) {
            dashSelect(cssWeek1,cssSelect1,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=0;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_cssWeek1MouseClicked

    private void cssWeek1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek1MouseEntered
        dashHover(cssWeek1,cssSelect1,colorHover,currentPathway);
    }//GEN-LAST:event_cssWeek1MouseEntered

    private void cssWeek1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek1MouseExited
        dashHover(cssWeek1,cssSelect1,colorSelected,currentPathway);
    }//GEN-LAST:event_cssWeek1MouseExited

    private void cssWeek2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek2MouseClicked
        if (cssW2.isEnabled()) {
            dashSelect(cssWeek2,cssSelect2,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=1;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_cssWeek2MouseClicked

    private void cssWeek2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek2MouseEntered
        dashHover(cssWeek2,cssSelect2,colorHover,currentPathway);
    }//GEN-LAST:event_cssWeek2MouseEntered

    private void cssWeek2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek2MouseExited
        dashHover(cssWeek2,cssSelect2,colorSelected,currentPathway);
    }//GEN-LAST:event_cssWeek2MouseExited

    private void cssWeek3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek3MouseClicked
        if (cssW3.isEnabled()) {
            dashSelect(cssWeek3,cssSelect3,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=2;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_cssWeek3MouseClicked

    private void cssWeek3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek3MouseEntered
        dashHover(cssWeek3,cssSelect3,colorHover,currentPathway);
    }//GEN-LAST:event_cssWeek3MouseEntered

    private void cssWeek3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek3MouseExited
        dashHover(cssWeek3,cssSelect3,colorSelected,currentPathway);
    }//GEN-LAST:event_cssWeek3MouseExited

    private void cssWeek4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek4MouseClicked
        if (cssW4.isEnabled()) {
            dashSelect(cssWeek4,cssSelect4,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=3;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_cssWeek4MouseClicked

    private void cssWeek4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek4MouseEntered
        dashHover(cssWeek4,cssSelect4,colorHover,currentPathway);
    }//GEN-LAST:event_cssWeek4MouseEntered

    private void cssWeek4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cssWeek4MouseExited
        dashHover(cssWeek4,cssSelect4,colorSelected,currentPathway);
    }//GEN-LAST:event_cssWeek4MouseExited

    private void jsViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsViewMouseClicked
        dashSelect(jsView,jsSelect,currentPathway);
        buttonPrev.setEnabled(false);
        buttonNext.setEnabled(true);
        i = -1;
        controllerShow(cardLayout2,i,"overview",lessonViewer);
    }//GEN-LAST:event_jsViewMouseClicked

    private void jsViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsViewMouseEntered
        dashHover(jsView,jsSelect,colorHover,currentPathway);
    }//GEN-LAST:event_jsViewMouseEntered

    private void jsViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsViewMouseExited
        dashHover(jsView,jsSelect,colorSelected,currentPathway);
    }//GEN-LAST:event_jsViewMouseExited

    private void jsWeek1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek1MouseClicked
        if (jsW1.isEnabled()) {
            dashSelect(jsWeek1,jsSelect1,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=0;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_jsWeek1MouseClicked

    private void jsWeek1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek1MouseEntered
        dashHover(jsWeek1,jsSelect1,colorHover,currentPathway);
    }//GEN-LAST:event_jsWeek1MouseEntered

    private void jsWeek1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek1MouseExited
        dashHover(jsWeek1,jsSelect1,colorSelected,currentPathway);
    }//GEN-LAST:event_jsWeek1MouseExited

    private void jsWeek2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek2MouseClicked
        if (jsW2.isEnabled()) {
            dashSelect(jsWeek2,jsSelect2,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=1;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_jsWeek2MouseClicked

    private void jsWeek2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek2MouseEntered
        dashHover(jsWeek2,jsSelect2,colorHover,currentPathway);
    }//GEN-LAST:event_jsWeek2MouseEntered

    private void jsWeek2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek2MouseExited
        dashHover(jsWeek2,jsSelect2,colorSelected,currentPathway);
    }//GEN-LAST:event_jsWeek2MouseExited

    private void jsWeek3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek3MouseClicked
        if (jsW3.isEnabled()) {
            dashSelect(jsWeek3,jsSelect3,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=2;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_jsWeek3MouseClicked

    private void jsWeek3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek3MouseEntered
        dashHover(jsWeek3,jsSelect3,colorHover,currentPathway);
    }//GEN-LAST:event_jsWeek3MouseEntered

    private void jsWeek3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek3MouseExited
        dashHover(jsWeek3,jsSelect3,colorSelected,currentPathway);
    }//GEN-LAST:event_jsWeek3MouseExited

    private void jsWeek4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek4MouseClicked
        if (jsW4.isEnabled()) {
            dashSelect(jsWeek4,jsSelect4,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=3;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_jsWeek4MouseClicked

    private void jsWeek4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek4MouseEntered
        dashHover(jsWeek4,jsSelect4,colorHover,currentPathway);
    }//GEN-LAST:event_jsWeek4MouseEntered

    private void jsWeek4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsWeek4MouseExited
        dashHover(jsWeek4,jsSelect4,colorSelected,currentPathway);
    }//GEN-LAST:event_jsWeek4MouseExited

    private void sqlViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlViewMouseClicked
        dashSelect(sqlView,sqlSelect,currentPathway);
        buttonPrev.setEnabled(false);
        buttonNext.setEnabled(true);
        i = -1;
        controllerShow(cardLayout2,i,"overview",lessonViewer);
    }//GEN-LAST:event_sqlViewMouseClicked

    private void sqlViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlViewMouseEntered
        dashHover(sqlView,sqlSelect,colorHover,currentPathway);
    }//GEN-LAST:event_sqlViewMouseEntered

    private void sqlViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlViewMouseExited
        dashHover(sqlView,sqlSelect,colorHover,currentPathway);
    }//GEN-LAST:event_sqlViewMouseExited

    private void sqlWeek1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek1MouseClicked
        if (sqlW1.isEnabled()) {
            dashSelect(sqlWeek1,sqlSelect1,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=0;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_sqlWeek1MouseClicked

    private void sqlWeek1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek1MouseEntered
        dashHover(sqlWeek1,sqlSelect1,colorHover,currentPathway);
    }//GEN-LAST:event_sqlWeek1MouseEntered

    private void sqlWeek1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek1MouseExited
        dashHover(sqlWeek1,sqlSelect1,colorSelected,currentPathway);
    }//GEN-LAST:event_sqlWeek1MouseExited

    private void sqlWeek2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek2MouseClicked
        if (sqlW2.isEnabled()) {
            dashSelect(sqlWeek2,sqlSelect2,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=1;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_sqlWeek2MouseClicked

    private void sqlWeek2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek2MouseEntered
        dashHover(sqlWeek2,sqlSelect2,colorHover,currentPathway);

    }//GEN-LAST:event_sqlWeek2MouseEntered

    private void sqlWeek2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek2MouseExited
        dashHover(sqlWeek2,sqlSelect2,colorSelected,currentPathway);
    }//GEN-LAST:event_sqlWeek2MouseExited

    private void sqlWeek3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek3MouseClicked
        if (sqlW3.isEnabled()) {
            dashSelect(sqlWeek3,sqlSelect3,currentPathway);
            buttonPrev.setEnabled(true);
            buttonNext.setEnabled(true);
            i=2;
            count = 1;
            controllerShow(cardLayout2,i,"lesson",lessonViewer);   
        }
    }//GEN-LAST:event_sqlWeek3MouseClicked

    private void sqlWeek3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek3MouseEntered
        dashHover(sqlWeek3,sqlSelect3,colorHover,currentPathway);
    }//GEN-LAST:event_sqlWeek3MouseEntered

    private void sqlWeek3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sqlWeek3MouseExited
        dashHover(sqlWeek3,sqlSelect3,colorSelected,currentPathway);
    }//GEN-LAST:event_sqlWeek3MouseExited

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
    private javax.swing.JPanel buttonNav;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonPrev;
    private javax.swing.JPanel buttonProfile;
    private javax.swing.JPanel buttonProfile1;
    private javax.swing.JPanel buttonStudy;
    private javax.swing.JPanel buttonStudy1;
    private javax.swing.JLabel cssButton;
    private javax.swing.JPanel cssMenu;
    private javax.swing.JProgressBar cssProgress;
    private javax.swing.JPanel cssSelect;
    private javax.swing.JPanel cssSelect1;
    private javax.swing.JPanel cssSelect2;
    private javax.swing.JPanel cssSelect3;
    private javax.swing.JPanel cssSelect4;
    private javax.swing.JPanel cssView;
    private javax.swing.JLabel cssW1;
    private javax.swing.JLabel cssW2;
    private javax.swing.JLabel cssW3;
    private javax.swing.JLabel cssW4;
    private javax.swing.JPanel cssWeek1;
    private javax.swing.JPanel cssWeek2;
    private javax.swing.JPanel cssWeek3;
    private javax.swing.JPanel cssWeek4;
    private javax.swing.JPanel cssmenuTitle;
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
    private javax.swing.JLabel htmlButton;
    private javax.swing.JPanel htmlMenu;
    private javax.swing.JProgressBar htmlProgress;
    private javax.swing.JPanel htmlSelect;
    private javax.swing.JPanel htmlSelect1;
    private javax.swing.JPanel htmlSelect2;
    private javax.swing.JPanel htmlSelect3;
    private javax.swing.JPanel htmlSelect4;
    private javax.swing.JPanel htmlSelect5;
    private javax.swing.JPanel htmlSelect6;
    private javax.swing.JPanel htmlSelect7;
    private javax.swing.JPanel htmlView;
    private javax.swing.JLabel htmlW1;
    private javax.swing.JLabel htmlW2;
    private javax.swing.JLabel htmlW3;
    private javax.swing.JLabel htmlW4;
    private javax.swing.JLabel htmlW5;
    private javax.swing.JLabel htmlW6;
    private javax.swing.JLabel htmlW7;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jsButton;
    private javax.swing.JPanel jsMenu;
    private javax.swing.JProgressBar jsProgress;
    private javax.swing.JPanel jsSelect;
    private javax.swing.JPanel jsSelect1;
    private javax.swing.JPanel jsSelect2;
    private javax.swing.JPanel jsSelect3;
    private javax.swing.JPanel jsSelect4;
    private javax.swing.JPanel jsView;
    private javax.swing.JLabel jsW1;
    private javax.swing.JLabel jsW2;
    private javax.swing.JLabel jsW3;
    private javax.swing.JLabel jsW4;
    private javax.swing.JPanel jsWeek1;
    private javax.swing.JPanel jsWeek2;
    private javax.swing.JPanel jsWeek3;
    private javax.swing.JPanel jsWeek4;
    private javax.swing.JPanel jsmenuTitle;
    private javax.swing.JPanel lesson;
    private javax.swing.JPanel lessonViewer;
    private javax.swing.JProgressBar overallProgress;
    private javax.swing.JPanel overview;
    private javax.swing.JTextArea overviewNote;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSpace;
    private javax.swing.JLabel profileActivation;
    private javax.swing.JLabel profileEmail;
    private javax.swing.JPanel profileInfo;
    private javax.swing.JLabel profileName;
    private javax.swing.JLabel profileName1;
    private javax.swing.JPanel profileOverall;
    private javax.swing.JPanel profileOverall2;
    private javax.swing.JPanel profileOverall3;
    private javax.swing.JPanel profileOverall4;
    private javax.swing.JPanel profileOverall5;
    private javax.swing.JLabel profilePathway;
    private javax.swing.JLabel profileUsername;
    private javax.swing.JPanel quiz;
    private javax.swing.JRadioButton quizChoiceA;
    private javax.swing.JRadioButton quizChoiceB;
    private javax.swing.JRadioButton quizChoiceC;
    private javax.swing.JRadioButton quizChoiceD;
    private javax.swing.ButtonGroup quizChoices;
    private javax.swing.JTextArea quizInstructions;
    private javax.swing.JLabel quizNo;
    private javax.swing.JTextArea quizQuestion;
    private javax.swing.JLabel quizReattempt;
    private javax.swing.JLabel quizReattemptLabel;
    private javax.swing.JLabel quizScore;
    private javax.swing.JLabel quizScoreLabel;
    private javax.swing.JButton quizSubmit;
    private javax.swing.JLabel quizTimer;
    private javax.swing.JLabel quizTimerLabel;
    private javax.swing.JLabel quizWeek;
    private javax.swing.JLabel sqlButton;
    private javax.swing.JPanel sqlMenu;
    private javax.swing.JProgressBar sqlProgress;
    private javax.swing.JPanel sqlSelect;
    private javax.swing.JPanel sqlSelect1;
    private javax.swing.JPanel sqlSelect2;
    private javax.swing.JPanel sqlSelect3;
    private javax.swing.JPanel sqlView;
    private javax.swing.JLabel sqlW1;
    private javax.swing.JLabel sqlW2;
    private javax.swing.JLabel sqlW3;
    private javax.swing.JPanel sqlWeek1;
    private javax.swing.JPanel sqlWeek2;
    private javax.swing.JPanel sqlWeek3;
    private javax.swing.JPanel sqlmenuTitle;
    private javax.swing.JLabel studyCurrent;
    private javax.swing.JPanel studyHTML;
    private javax.swing.JLabel studyIcon;
    private javax.swing.JPanel studyMenu;
    private javax.swing.JPanel studyViewer;
    private javax.swing.JPanel titleMenu;
    private javax.swing.JPanel titleMenu1;
    private javax.swing.JLabel videoCSS;
    private javax.swing.JLabel videoSQL2;
    // End of variables declaration//GEN-END:variables
}
