/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.text.SimpleDateFormat;
import java.util.Date; 
/**
 *
 * @author ViniCarol
 */
public class Hora {
    
      public String MostraData(){
       //pega data do computador
       Date data = new Date();
       //cria o formatador
       SimpleDateFormat dformatador = new SimpleDateFormat("dd/MM/yyyy");
       // cria a string para armazenar data
       String sData = dformatador.format(data);

       //retorna o pedido
        return sData;
    }
    public String MostraHora(){
       //pega data para converter em horas
       Date data = new Date();
       //cria o formatador
       SimpleDateFormat hformatador = new SimpleDateFormat("HH:mm:ss");
       // cria a string
       String sHora = hformatador.format(data);
       return sHora;
    }
    
}
   
