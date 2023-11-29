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
public class DaoMetas {
    String sql;
    
    public Boolean inserir(int id, String meta, int ano, String categoria){
         try{
            sql = "INSERT INTO METAS (ID, META, ANO, "
                    + "CATEGORIA) VALUES (?, ?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setString(2, meta);
           getStatement().setInt(3, ano);
           getStatement().setString(4, categoria);

           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, String meta, int ano, String categoria){
         try{
               sql = "UPDATE METAS SET META = ?, ANO = ?,"
                    + " CATEGORIA = ? WHERE ID = ?";
            
           setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(6, id);
           getStatement().setString(1, meta);
           getStatement().setInt(2, ano);
           getStatement().setString(3, categoria);
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean excluir(int id){
        try{
            sql = "DELETE FROM METAS WHERE ID = ?";
            
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
            sql =   " SELECT                    " +
                    "MET.ID AS ID,              " +
                    "MET.META AS META,          " +
                    "MET.ANO AS ANO,            " + 
                    "MET.CATEGORIA AS CATEGORIA " +
                    "FROM                       " +
                    "METAS MET                  ";
                    
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
                    " SELECT                    " +
                    "MET.ID AS ID,              " +
                    "MET.META AS META,          " +
                    "MET.ANO AS ANO,            " + 
                    "MET.CATEGORIA AS CATEGORIA " +
                    "FROM                       " +
                    "METAS MET                  " +
                    "WHERE                      " +
                    "MET.ID = ?                 ";
            
              setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorMeta(String meta){
        try{
            sql =   " SELECT                    " +
                    "MET.ID AS ID,              " +
                    "MET.META AS META,          " +
                    "MET.ANO AS ANO,            " + 
                    "MET.CATEGORIA AS CATEGORIA " +
                    "FROM                       " +
                    "METAS MET                  " +
                    "WHERE                      " +
                    "MET.META LIKE              ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, meta + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
    public ResultSet listarPorAno(int pAno){
        try{
            sql =  
                    " SELECT                    " +
                    "MET.ID AS ID,              " +
                    "MET.META AS META,          " +
                    "MET.ANO AS ANO,            " + 
                    "MET.CATEGORIA AS CATEGORIA " +
                    "FROM                       " +
                    "METAS MET                  " +
                    "WHERE                      " +
                    "MET.ANO = ?                ";
            
              setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, pAno);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
    public ResultSet listarPorCategoria(String categoria){
        try{
            sql =   " SELECT                    " +
                    "MET.ID AS ID,              " +
                    "MET.META AS META,          " +
                    "MET.ANO AS ANO,            " + 
                    "MET.CATEGORIA AS CATEGORIA " +
                    "FROM                       " +
                    "METAS MET                  " +
                    "WHERE                      " +
                    "MET.CATEGORIA LIKE         ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, categoria + "%");
            
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
