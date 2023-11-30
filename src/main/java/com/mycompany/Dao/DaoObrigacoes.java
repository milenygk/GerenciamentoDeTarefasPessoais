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
public class DaoObrigacoes {
     private String sql;
    
    public Boolean inserir(int id, String data, String obrigacao){
        try{
            sql =" INSERT INTO OBRIGACOES (ID, ID_CATEGORIA, DATA, OBRIGACAO) VALUES (?, ?, ?, ?) ";
            
           setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(6, id);
           getStatement().setString(1, data);
           getStatement().setString(2, obrigacao);
             
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean alterar(int id, String data, String obrigacao){
        try{ 
            sql = " UPDATE OBRIGACOES SET DATA = ?, OBRIGACAO = ? WHERE ID =  ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(6, id);
            getStatement().setString(1, data);
            getStatement().setString(2, obrigacao);

            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
     
     public Boolean excluir(int id){
        try{
            sql = " DELETE FROM OBRIGACOES WHERE ID = ? ";
            
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
            sql =   " SELECT                      " +
                    " OBRI.ID AS ID,              " +
                    " OBRI.DATA AS DATA,          " +
                    " OBRI.OBRIGACAO AS OBRIGACAO " +
                    " FROM                        " +
                    " OBRIGACOES OBRI             "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }  
     
     public ResultSet listarPorId(int id){
        try{
            sql =   " SELECT                      " +
                    " OBRI.ID AS ID,              " +
                    " OBRI.DATA AS DATA,          " +
                    " OBRI.OBRIGACAO AS OBRIGACAO " +
                    " FROM                        " +
                    " OBRIGACOES OBRI             " +
                    " WHERE                       " +
                    " OBRI.ID = ?                 ";
                   
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
            sql =   " SELECT                      " +
                    " OBRI.ID AS ID,              " +
                    " OBRI.DATA AS DATA,          " +
                    " OBRI.OBRIGACAO AS OBRIGACAO " +
                    " FROM                        " +
                    " OBRIGACOES OBRI             " +
                    " WHERE                       " +
                    " OBRI.DATA LIKE ?            ";
            
        setStatement(getConexao().prepareStatement(sql));
            
        getStatement().setString(1, data);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
      public ResultSet listarPorObrigacao(String obrigacao){
        try{
            sql = 
                    " SELECT                      " +
                    " OBRI.ID AS ID,              " +
                    " OBRI.DATA AS DATA,          " +
                    " OBRI.OBRIGACAO AS OBRIGACAO " +
                    " FROM                        " +
                    " OBRIGACOES OBRI             " +
                    " WHERE                       " +
                    " OBRI.OBRIGACAO LIKE ?       ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, obrigacao + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
        public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = " SELECT IFNULL(MAX(ID), 0) + 1 FROM OBRIGACOES ";
            
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
