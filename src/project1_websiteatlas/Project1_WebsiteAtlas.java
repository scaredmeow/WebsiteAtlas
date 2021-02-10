
package project1_websiteatlas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Project1_WebsiteAtlas {

    public static Connection ConnectDb() {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:javaDatabase.db");
            System.out.println("Connected Successfully to" + conn);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("de.javasoft.synthetica.simple2d.SyntheticaSimple2DLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Project1_WebsiteAtlas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        java.awt.EventQueue.invokeLater(() -> {
            new jframeLogin().setVisible(true);
        });
    } 
}
