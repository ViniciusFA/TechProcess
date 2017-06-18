/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import JDBC.ConnectionFactory;
import Javabeans.Cadastro_Saida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anderson
 */
public class Cadastro_SaidaDAO {
    
    
    private Connection conecta;
    

    //Construtor
    public Cadastro_SaidaDAO(){
     this.conecta = new ConnectionFactory().conecta();
}
   
    // Métodos Cadatrar Ciente
    public void cadastraraSaida(Cadastro_Saida obj){
        try {
             //1 - passo criar comando sql
            String cmdsql = "insert into cadastro_saida(DATA_CS, HORA_CS, FRETE_CS, MOTORISTA_CS, RG_CS, HABILITACAO_CS, VEICULO_CS, RAZAO_SOCIAL_CS, TELEFONE_CS, NOTA_FISCAL_CS, PLACA_CS, DESTINO_CS, AGREGADO_OU_RETIRA_CS, SETOR_CS, OBSERVACAO_CS) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            
            //Organizar o comando sql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            //stmt.setInt(1, obj.getCodigo_cs());  
            stmt.setString(1, obj.getData_cs());
            stmt.setString(2, obj.getHora_cs());
            stmt.setString(3, obj.getFrete_cs());
            stmt.setString(4, obj.getMotorista_cs());
            stmt.setString(5, obj.getRg_cs());
            stmt.setString(6, obj.getHabilitacao_cs());
            stmt.setString(7, obj.getVeiculo_cs());
            stmt.setString(8, obj.getRazao_social_cs());
            stmt.setString(9, obj.getTelefone_cs());
            stmt.setString(10, obj.getNota_fiscal_cs());
            stmt.setString(11, obj.getPlaca_cs());
            stmt.setString(12, obj.getDestino_cs());
            stmt.setString(13, obj.getAgregadoretira_cs());
            stmt.setString(14, obj.getSetor_cs());
            stmt.setString(15, obj.getObservacao_cs());
            
            
            
            //3 - passo Executar o programa
            stmt.execute();
            
            
            //4 - passo fechar a conexao
            stmt.close();
            
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
            
        }
        
        
        
    }
    
}
