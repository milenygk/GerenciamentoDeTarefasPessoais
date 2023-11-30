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
public class DaoAnotacoes {
     private String sql;
    
    public Boolean inserir(int id, String data, String anotacoes){
        try{
            sql =" INSERT INTO ANOTACOES (ID, DATA, ANOTACOES) VALUES (?, ?, ?, ?) ";
            
           setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(6, id);
           getStatement().setString(1, data);
           getStatement().setString(2, anotacoes);
             
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean alterar(int id, String data, String anotacoes){
        try{ 
            sql = " UPDATE ANOTACOES SET DATA = ?, ANOTACOES = ? WHERE ID = ? ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setString(1, data);
            getStatement().setString(2, anotacoes);

            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
     public Boolean excluir(int id){
        try{
            sql = " DELETE FROM ANOTACOES WHERE ID = ? ";
            
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
            sql =   " SELECT                     " +
                    " ANO.ID AS ID,              " +
                    " ANO.DATA AS DATA,          " +
                    " ANO.ANOTACOES AS ANOTACOES " +
                    " FROM                       " +
                    " ANOTACOES ANO              "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }  
     
     public ResultSet listarPorId(int id){
        try{
            sql =   " SELECT                     " +
                    " ANO.ID AS ID,              " +
                    " ANO.DATA AS DATA,          " +
                    " ANO.ANOTACOES AS ANOTACOES " +
                    " FROM                       " +
                    " ANOTACOES ANO              " +
                    " WHERE                      " +
                    " ANO.ID = ?                 ";
                   
         setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
     public ResultSet listarPorData(String pData){
        try{ 
            sql =   " SELECT                     " +
                    " ANO.ID AS ID,              " +
                    " ANO.DATA AS DATA,          " +
                    " ANO.ANOTACOES AS ANOTACOES " +
                    " FROM                       " +
                    " ANOTACOES ANO              " +
                    " WHERE                      " +
                    " ANO.DATA LIKE ?            ";
                   
            
        setStatement(getConexao().prepareStatement(sql));
            
        getStatement().setString(1, pData);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
      public ResultSet listarPorAnotacoes(String anotacoes){
        try{
            sql =   " SELECT                     " +
                    " ANO.ID AS ID,              " +
                    " ANO.DATA AS DATA,          " +
                    " ANO.ANOTACOES AS ANOTACOES " +
                    " FROM                       " +
                    " ANOTACOES ANO              " +
                    " WHERE                      " +
                    " ANO.ANOTACOES LIKE ?       ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, anotacoes + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
        public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = " SELECT IFNULL(MAX(ID), 0) + 1 FROM ANOTACOES ";
            
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
