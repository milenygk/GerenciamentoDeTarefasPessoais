/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Dao;

import com.mycompany.Ferramentas.ConexaoBancoDeDadosMySql;
import java.sql.ResultSet;

/**
 *
 * @author mileny.1948
 */
public class DaoTrabalho extends ConexaoBancoDeDadosMySql {
    String sql;
    
    public Boolean inserir(int id, int idCategoria, String data, String importante, String urgente,
            String importanteUrgente, String naoImportanteNemUrgente){
         try{
            sql = "INSERT INTO TRABALHO (ID, ID_CATEGORIA, DATA, IMPORTANTE, "
                    + "URGENTE, IMPORTANTE_URGENTE, NAO_IMPORTANTE_NEM_URGENTE) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setInt(2, idCategoria);
           getStatement().setString(3, data);
           getStatement().setString(4, importante);
           getStatement().setString(5, urgente);
           getStatement().setString(6, importanteUrgente);
           getStatement().setString(7, naoImportanteNemUrgente);             
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar (int id, int idCategoria, String data, String importante, String urgente,
            String importanteUrgente, String naoImportanteNemUrgente){
         try{
               sql = "UPDATE TRABALHO SET DATA = ?, IMPORTANTE = ?,"
                    + " URGENTE = ?, IMPORTANTE_URGENTE = ?, NAO_IMPORTANTE_NEM_URGENTE = ? WHERE ID = ?";
            
           setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(6, id);
           getStatement().setString(1, data);
           getStatement().setString(2, importante);
           getStatement().setString(3, urgente);
           getStatement().setString(4, importanteUrgente);
           getStatement().setString(5, naoImportanteNemUrgente);
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM TRABALHO WHERE ID = ?";
            
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
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                ";
                    
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
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                " +
                    "WHERE                                                       " +
                    "TRA.ID = ?                                                  ";
            
              setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   public ResultSet listarPorData(String data){
        try{ 
            sql =   " SELECT                                                     " + 
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                " +
                    "WHERE                                                       " +
                    "TRA.DATA LIKE ?                                             ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, data);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorImportante(String importante){
        try{
            sql =   " SELECT                                                     " + 
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                " +
                    "WHERE                                                       " +
                    "TRA.IMPORTANTE LIKE ?                                             ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, importante + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorUgente(String urgente){
        try{
            sql =   " SELECT                                                     " + 
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                " +
                    "WHERE                                                       " +
                    "TRA.URGENTE LIKE ?                                             ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, urgente + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
      public ResultSet listarPorImportanteUrgente(String importanteUrgente){
        try{
            sql =   " SELECT                                                     " + 
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                " +
                    "WHERE                                                       " +
                    "TRA.IMPORTANTE_URGENTE LIKE ?                               ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, importanteUrgente + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
        public ResultSet listarPorNaoImportanteNemUrgente(String naoImportanteNemUrgente){
        try{
            sql =   " SELECT                                                     " + 
                    "TRA.ID AS ID,                                               " +
                    "TRA.data AS DATA,                                           " +
                    "TRA.IMPORTANTE  AS IMPORTANTE,                              " + 
                    "TRA.URGENTE AS UEGENTE,                                     " +
                    "TRA.IMPORTANTE_URGENTE AS IMPORTANTE_URGENTE,               " + 
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE AS NAO_IMPORTANTE_NEM_URGENTE" +
                    "FROM                                                        " +
                    "TRABALHO TRA                                                " +
                    "WHERE                                                       " +
                    "TRA.NAO_IMPORTANTE_NEM_URGENTE LIKE ?                               ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, naoImportanteNemUrgente + "%");
            
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
