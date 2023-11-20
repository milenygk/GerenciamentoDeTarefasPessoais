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
public class DaoViagens {
     String sql;
    
    public Boolean inserir(int id, int idCategoria, String dataDeIda, String pais, String estado,
            String cidade, String dataDeVolta, String detalhes){
         try{
            sql = "INSERT INTO VIAGENS (ID, ID_CATEGORIA, DATA_DE_IDA, PAIS, "
                    + "ESTADO, CIDADE, DATA_DE_VOLTA, DETALHES) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setInt(2, idCategoria);
           getStatement().setString(3, dataDeIda);
           getStatement().setString(4, pais);
           getStatement().setString(5, estado);
           getStatement().setString(6, cidade);
           getStatement().setString(7, dataDeVolta);  
           getStatement().setString(7, detalhes);                
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar (int id, int idCategoria, String dataDeIda, String pais, String estado,
            String cidade, String dataDeVolta, String detalhes){
         try{
               sql = "UPDATE VIAGENS SET DATA_DE_IDA = ?, PAIS = ?,"
                    + " ESTADO = ?, CIDADE = ?, DATA_DE_VOLTA = ?, DETALHES = ? WHERE ID = ?";
            
           setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(6, id);
           getStatement().setString(1, dataDeIda);
           getStatement().setString(2, pais);
           getStatement().setString(3, estado);
           getStatement().setString(4, cidade);
           getStatement().setString(5, dataDeVolta);
           getStatement().setString(8, detalhes);    
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM VIAGENS WHERE ID = ?";
            
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
            sql =   " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    ";
                    
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
                    " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.ID = ?                     ";
            
              setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   public ResultSet listarPorDataDeIda(String dataDeIda){
        try{ 
            sql =   " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.DATA_DE_IDA LIKE ?         ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, dataDeIda);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorPais(String pais){
        try{
            sql =  " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.PAIS LIKE ?                ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, pais + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEstado(String estado){
        try{
            sql =  " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.ESTADO LIKE ?              ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, estado + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorCidade(String cidade){
        try{
            sql =  " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.CIDADE LIKE ?              ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cidade + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDataDeVolta(String dataDeVolta){
        try{ 
            sql =   " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.DATA_VOLTA LIKE ?          ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, dataDeVolta);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorDetalhes(String detalhes){
        try{
            sql =  " SELECT                        " +
                    "VIA.ID AS ID,                  " +
                    "VIA.DATA_DE_IDA AS DATA_DE_IDA," +
                    "VIA.PAIS AS PAIS,              " + 
                    "VIA.ESTADO AS ESTADO,          " +
                    "VIA.CIDADE AS CIDADE,          " + 
                    "VIA.DATA_VOLTA AS DATA_VOLTA   " +
                    "VIA.DETALHES AS DETALHES       " +
                    "FROM                           " +
                    "VIAGENS VIA                    " +
                    "VIA.DETALHES LIKE ?              ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, detalhes + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
        public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT MAX(ID) + 1 FROM VIAGENS";
            
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
