/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Models.*;
import Views.*;
import Controllers.*;
import javax.swing.ImageIcon;

/**
 * Classe Main
 *
 * Aplicació que permet gestionar les dades de persones físiques i guardar-les
 * en un fitxer separat per punts i comes (CSV)
 *
 * @author Francesc Gallart
 * @version 1.00 12/01/2014
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GestioPersones model = new GestioPersones();
                FormPrincipal view = new FormPrincipal();
                Controller controller = new Controller(model, view);
                view.setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
                view.setLocationRelativeTo(null);
                view.setVisible(true);
                controller.control();
            }
        });
    }
}
