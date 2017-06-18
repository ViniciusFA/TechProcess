/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import TELAS.TELASPLASH;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Desktop
 */
public class SYSTEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           try {
            //testando a conexão
            JOptionPane.showMessageDialog(null,"Testando a Conexão...");
            Connection con = new JDBC.ConnectionFactory().conecta();
            JOptionPane.showMessageDialog(null,"Está Connectado!");
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro"+e);
        }
        
        
        TELASPLASH tela = new TELASPLASH();
        tela.setVisible(true);
        

        
        
    }
    
}
