/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getConexao;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getResultado;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.getStatement;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.setResultado;
import static com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql.setStatement;
import java.sql.ResultSet;

/**
 *
 * @author mileny.1948
 */
public class DaoHabitos {
     String sql;
    
    public Boolean inserir(int id, String novoHabito){
         try{
            sql = "INSERT INTO HABITOS (ID, ID_CATEGORIA, NOVO_HABITO (?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
//           getStatement().setInt(2, idCategoria);
           getStatement().setString(3, novoHabito);             
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean alterar (int id, String novoHabito){
         try{
               sql = "UPDATE HABITOS SET NOVO_HABITO = ? WHERE ID = ?";
            
           setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(2, id);
           getStatement().setString(1, novoHabito);
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM HABITOS WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
       public ResultSet listarTodos(){
        try{
            sql =   " SELECT                                                     " +
                    "HAB.ID AS ID,                                               " +
                    "HAB.NOVO_HABITO AS NOVO_HABITO                              " +
                    "FROM                                                        " +
                    "HABITOS HAB                                                 ";
                    
                     setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }  
       
    public ResultSet listarPorId(int id){
        try{
            sql =  
                    " SELECT                                                     " +
                    "HAB.ID AS ID,                                               " +
                    "HAB.NOVO_HABITO AS NOVO_HABITO                              " +
                    "FROM                                                        " +
                    "HABITOS HAB                                                 " +
                    "WHERE                                                       " +
                    "HAB.ID = ?                                                  "; 
            
              setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorHabito(String pHabito){
        try{
            sql =   " SELECT                                                     " +
                    "HAB.ID AS ID,                                               " +
                    "HAB.NOVO_HABITO AS NOVO_HABITO                              " +
                    "FROM                                                        " +
                    "HABITOS HAB                                                 " +
                    "WHERE                                                       " +
                    "HAB.NOVO_HABITO LIKE ?                                                  "; 
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, pHabito + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
     }
     
         public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT MAX(ID) + 1 FROM TRABALHO";
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
            
            getResultado().next();
            
            id = getResultado().getInt(1); 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return id;        
    }
}
