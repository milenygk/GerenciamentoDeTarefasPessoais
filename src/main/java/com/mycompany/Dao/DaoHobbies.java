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
public class DaoHobbies {
     String sql;
    
    public Boolean inserir(int id, String esportes, String jogos, String leitura,
            String filmes, int idCategoria, String series){
         try{
            sql = "INSERT INTO HOBBIES (ID, ESPORTES, JOGOS, "
                    + "LEITURA, FILMES, ID_CATEGORIA, SERIES) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setString(2, esportes);
           getStatement().setString(3,jogos);
           getStatement().setString(4, leitura);
           getStatement().setString(5, leitura);
           getStatement().setInt(6, idCategoria);
           getStatement().setString(7, series);             
             
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean alterar (int id, String esportes, String jogos, String leitura,
            String filmes, int idCategoria, String series){
         try{
               sql = "UPDATE HOBBIES SET ESPORTES = ?, JOGOS = ?,"
                    + " LEITURA = ?, FILMES = ?, SERIES = ? WHERE ID = ?";
            
           setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(6, id);
           getStatement().setString(1, esportes);
           getStatement().setString(2, jogos);
           getStatement().setString(3, leitura);
           getStatement().setString(4, filmes);
           getStatement().setString(5, series);
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM HOBBIES WHERE ID = ?";
            
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
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               "; 
                    
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
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               " +
                    "WHERE                      " +
                    "HOBB.ID = ?                ";
            
              setStatement(getConexao().prepareStatement(sql));
            
         getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorEsportes(String esportes){
        try{
            sql =   " SELECT                    " +
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               " +
                    "WHERE                      " +
                    "HOBB.ESPORTES LIKE ?       ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, esportes + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
     public ResultSet listarPorJogos(String jogos){
        try{
            sql =   " SELECT                    " +
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               " +
                    "WHERE                      " +
                    "HOBB.JOGOS LIKE ?          ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, jogos + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
     public ResultSet listarPorLeitura(String leitura){
        try{
            sql =   " SELECT                    " +
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               " +
                    "WHERE                      " +
                    "HOBB.LEITURA LIKE ?          ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, leitura + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
     public ResultSet listarPorFilmes(String filmes){
        try{
            sql =   " SELECT                    " +
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               " +
                    "WHERE                      " +
                    "HOBB.FILMES LIKE ?          ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, filmes + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
     public ResultSet listarPorSeries(String series){
        try{
            sql =   " SELECT                    " +
                    "HOBB.ID AS ID,             " +
                    "HOBB.ESPORTES AS ESPORTES, " +
                    "HOBB.JOGOS AS JOGOS,       " +
                    "HOBB.LEITURA AS LIVROS,    " +
                    "HOBB.FILMES AS FILMES,     " +
                    "HOBB.SERIES AS SERIES      " +
                    "FROM                       " +
                    "HOBBIES HOBB               " +
                    "WHERE                      " +
                    "HOBB.SERIES LIKE ?          ";
                    
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, series + "%");
            
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
