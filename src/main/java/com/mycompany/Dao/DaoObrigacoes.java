/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

/**
 *
 * @author mileny.1948
 */
public class DaoObrigacoes {
     private String sql;
    
    public Boolean inserir(int id, int idcategoria, String data, String rotinaManha, String rotinaTarde,
           String rotinaNoite, String tarfasPontuais){
        try{
            sql ="INSERT INTO OBRIGACOES (ID, ID_CATEGORIA, DATA, OBRIGACAO) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
           setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setInt(2, idcategoria);
           getStatement().setString(3, data);
           getStatement().setString(4, rotinaManha);
           getStatement().setString(5, rotinaTarde);
           getStatement().setString(6, rotinaNoite);
           getStatement().setString(7, tarfasPontuais);
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        }
    
     public Boolean alterar(int id, int idcategoria, String data, String rotinaManha, String rotinaTarde,
           String rotinaNoite, String tarfasPontuais){
        try{ 
            sql = "UPDATE OBRIGACOES SET DATA = ?, ROTINA_MANHA = ?,"
                    + " ROTINA_TARDE = ?, ROTINA_NOITE = ?, TAREFAS_PONTUAIS = ? WHERE ID = ?";
            
             setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(6, id);
           getStatement().setString(1, data);
           getStatement().setString(2, rotinaManha);
           getStatement().setString(3, rotinaTarde);
           getStatement().setString(4, rotinaNoite);
           getStatement().setString(5, tarfasPontuais);
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        }
     
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM OBRIGACOES WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
}
