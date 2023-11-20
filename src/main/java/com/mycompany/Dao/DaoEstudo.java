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
public class DaoEstudo {
    private String sql;
    
    public Boolean inserir(int id, int idcategoria, String data, String materia, String conteudo,
            String tempodeEstudo){
        try{
            sql = "INSERT INTO ESTUDO (ID, ID_CATEGORIA, DATA, MATERIA, "
                    + "CONTEUDO, TEMPO_ESTUDO) VALUES (?, ?, ?, ?, ?, ?)";
            
          setStatement(getConexao().prepareStatement(sql));
            
           getStatement().setInt(1, id);
           getStatement().setInt(2, idcategoria);
           getStatement().setString(3, data);
           getStatement().setString(4, materia);
           getStatement().setString(5, conteudo);
           getStatement().setString(6, tempodeEstudo);

            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }  
    
    public Boolean alterar(int id, int idcategoria, String data, String materia, String conteudo,
            String tempodeEstudo){
         
          try{
            sql = "UPDATE ESTUDO SET DATA = ?, METERIA = ?,"
                    + " CONTEUDO = ?, TEMPO_ESTUDO = ? WHERE ID = ?";
            
             setStatement(getConexao().prepareStatement(sql));
             
           getStatement().setInt(5, id);
           getStatement().setString(1, data);
           getStatement().setString(2, materia);
           getStatement().setString(3, conteudo);
           getStatement().setString(4, tempodeEstudo);
           
           getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
      public Boolean excluir(int id){
        try{
            sql = "DELETE FROM ESTUDO WHERE ID = ?";
            
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
            sql =   " SELECT                               " +
                    "EST.ID AS ID,                         " +
                    "EST.DATA AS DATA,                     " +
                    "EST.MATERIA  AS MATERIA,              " + 
                    "EST.CONTEUDO AS CONTEUDO,             " +
                    "EST.TEMPO_ESTUDO AS TEMPO_ESTUDO      " +
                    "FROM                                  " +
                    "ESTUDO EST                            ";
                    
        setStatement(getConexao().prepareStatement(sql));
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }  
    
     public ResultSet listarPorId(int id){
        try{
            sql =   " SELECT                               " +
                    "EST.ID AS ID,                         " +
                    "EST.DATA AS DATA,                     " +
                    "EST.MATERIA  AS MATERIA,              " + 
                    "EST.CONTEUDO AS CONTEUDO,             " +
                    "EST.TEMPO_ESTUDO AS TEMPO_ESTUDO      " +
                    "FROM                                  " +
                    "ESTUDO EST                            " +
                    "WHERE                                 " +
                    "EST.ID = ?                            "; 
                    
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
            sql =   " SELECT                               " + 
                    "EST.ID AS ID,                         " +
                    "EST.DATA AS DATA,                     " +
                    "EST.MATERIA  AS MATERIA,              " + 
                    "EST.CONTEUDO AS CONTEUDO,             " +
                    "EST.TEMPO_ESTUDO AS TEMPO_ESTUDO      " +
                    "FROM                                  " +
                    "ESTUDO EST                            " +
                    "WHERE                                 " +
                    "EST.DATA  LIKE ?                      "; 
            
        setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, data);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
      
      public ResultSet listarPorMateria(String materia){
        try{
            sql =   " SELECT                               " + 
                     " SELECT                               " + 
                    "EST.ID AS ID,                         " +
                    "EST.DATA AS DATA,                     " +
                    "EST.MATERIA  AS MATERIA,              " + 
                    "EST.CONTEUDO AS CONTEUDO,             " +
                    "EST.TEMPO_ESTUDO AS TEMPO_ESTUDO      " +
                    "FROM                                  " +
                    "ESTUDO EST                            " +
                    "WHERE                                 " +
                    "EST.MATERIA  LIKE ?                   "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, materia + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
     public ResultSet listarPorConteudo(String pConteudo){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.CONTEUDO  LIKE ?                 "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, pConteudo + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
     
      public ResultSet listarPorTempodeEstudo(String tempodeEstudo){
        try{
            sql =   " SELECT                               " + 
                    "FIN.ID as ID,                         " +
                    "FIN.data as DATA_COMPRA,              " +
                    "FIN.DESCRICAO as DESCRICAO_COMPRA,    " +
                    "FIN.CATEGORIA as CATEGORIA_COMPRA,    " +
                    "FIN.VALOR as VALOR_PRODUTO,           " +
                    "FIN.quantidade as QUANTIDADE_PRODUTO, " +
                    "FIN.QUANTIDADE * FIN.VALOR as TOTAL   " +
                    "FROM                                  " +
                    "FIANANCEIRO FIN                       " +
                    "WHERE                                 " +
                    "FIN.TEMPO_ESTUDO  LIKE ?                 "; 
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, tempodeEstudo + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return getResultado();
    }
      
       public int buscarProximoId(){
        int id = -1;
        
        try{
            sql = "SELECT MAX(ID) + 1 FROM ESTUDO";
            
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
