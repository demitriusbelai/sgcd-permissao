/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.sgcd;

import javax.jnlp.UnavailableServiceException;

/**
 *
 * @author demitrius
 */
public class SgcdPermissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnavailableServiceException {
        Service.init();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordDialog(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
}
