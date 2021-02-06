/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1_websiteatlas;
import de.javasoft.plaf.synthetica.SyntheticaLookAndFeel;
import de.javasoft.synthetica.aluoxide.SyntheticaAluOxideLookAndFeel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Other
 */
public class Project1_WebsiteAtlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /* Set the Nimbus look and feel */
            UIManager.setLookAndFeel("de.javasoft.synthetica.simple2d.SyntheticaSimple2DLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Project1_WebsiteAtlas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Project1_WebsiteAtlas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Project1_WebsiteAtlas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Project1_WebsiteAtlas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        java.awt.EventQueue.invokeLater(() -> {
            new jframeLogin().setVisible(true);
        });
        
    }
    
}
