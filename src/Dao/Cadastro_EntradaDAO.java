/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import JDBC.ConnectionFactory;
import Javabeans.Cadastro_Entrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anderson
 */
public class Cadastro_EntradaDAO {
    
    private Connection conecta;
    
    //construtor
    public Cadastro_EntradaDAO(){
        this.conecta = new ConnectionFactory().conecta();
        
    }
    
    // rotina Cadasrar Cliente
    public void cadastraraEntrada(Cadastro_Entrada obj){
        try {
            
            // 1 - passo criar o comando sql
            String cmdsql = "insert into cadastro_entrada(DATA_CE, HORA_CE, FRETE_CE, MOTORISTA_CE, RG_CE, HABILITACAO_CE, VEICULO_CE, RAZAO_SOCIAL_CE, TELEFONE_CE, NOTA_FISCAL_CE, PLACA_CE, AGREGADO_CE, RETIRA_CE, SETOR_CE, OBSERVACAO_CE) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    
           // 2 - passo - Organizar o comando sql e executa-lo
            PreparedStatement stmt = conecta.prepareStatement(cmdsql);
            //stmt.setInt(1, obj.getCodigo_ce());
            stmt.setString(1, obj.getData_ce());
            stmt.setString(2, obj.getHora_ce());
            stmt.setString(3, obj.getFrete_ce());
            stmt.setString(3, obj.getFrete_ce());
            stmt.setString(4, obj.getMotorista_ce());
            stmt.setString(5, obj.getRg_ce());
            stmt.setString(6, obj.getHabilitacao_ce());
            stmt.setString(7, obj.getVeiculo_ce());
            stmt.setString(8, obj.getRazao_social_ce());
            stmt.setString(9, obj.getTelefone_ce());
            stmt.setString(10, obj.getNota_fiscal_ce());
            stmt.setString(11, obj.getPlaca_ce());
            stmt.setString(12, obj.getAgregado_ce());
            stmt.setString(13, obj.getRetira_ce());
            stmt.setString(14, obj.getSetor_ce());
            stmt.setString(15, obj.getObservacao_ce());
            
            //3 - passo executar o comando
            stmt.execute();
            
            //4 - passo Fechar a conexão
            stmt.close();
            
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
            
        }
        
    }

    //public void cadastraraEntrada(Cadastro_Saida obj) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

