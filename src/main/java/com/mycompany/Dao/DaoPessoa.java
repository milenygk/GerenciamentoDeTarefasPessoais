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
public class DaoPessoa extends ConexaoBancoDeDadosMySql{
    String sql;
    
    public Boolean inserir(int id, String nome, String sobrenome, String cpf, String DataDeNascimento, String genero,
            String telefone, String email, String endereco, String cidade, String estado){
        try{
            sql = "INSERT INTO PESSOA (ID, NOME, SOBRENOME, CPF, DATADENASCIMENTO, GENERO, TELEFONE,"
                    + "EMAIL, ENDERECO, CIDADE, ESTADO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            getStatement().setString(2, nome);
            getStatement().setString(3, sobrenome);
            getStatement().setString(4, cpf);
            getStatement().setString(5, DataDeNascimento);
            getStatement().setString(6, genero);
            getStatement().setString(7, telefone);
            getStatement().setString(8, email);
            getStatement().setString(9, endereco);
            getStatement().setString(10, cidade);
            getStatement().setString(11, estado);
                      
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean alterar(int id, String nome, String sobrenome, String cpf, String DataDeNascimento, String genero,
            String telefone, String email, String endereco, String cidade, String estado){
        try{
            sql = "UPDATE PESSOA SET NOME = ?, SOBRENOME = ?, CPF = ?, DATADENASCIMENTO = ?,"
                    + " GENERO = ?, TELEFONE = ?, EMAIL = ?, ENDERECO = ?, CIDADE = ?, ESTADO = ?, "
                    + "USUARIO = ? WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(12, id);
            getStatement().setString(8, endereco);
            getStatement().setString(9, cidade);
            getStatement().setString(10, estado);
            getStatement().setString(1, nome);
            getStatement().setString(2, sobrenome);
            getStatement().setString(5, genero);
            getStatement().setString(6, telefone);
            getStatement().setString(7, email);
            getStatement().setString(3, cpf);
            getStatement().setString(4, DataDeNascimento);

            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     
      public ResultSet listarTodos(){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                ";
            
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
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.ID = ?                                ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
       
    
     public ResultSet listarPorNome(String nome){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.NOME LIKE ?                           ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, nome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorSobrenome(String sobrenome){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.SOBRENOME LIKE ?                      ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, sobrenome + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorGenero(String genero){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.GENERO LIKE ?                      ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, genero + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorTelefone(String telefone){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.TELEFONE LIKE ?                       ";
             
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, telefone + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
    public ResultSet listarPorEmail(String email){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.EMAIL LIKE ?                          ";
             
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, email + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
   public ResultSet listarPorCpf(String cpf){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.CPF LIKE ?                            ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cpf + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
     
   public ResultSet listarPorDataDeNascimento(String dataDeNascimento){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.DATADENASCIMENTO LIKE ?               ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, dataDeNascimento + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
    
       public ResultSet listarPorEndereco(String endereco){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.ENDERECO LIKE ?                       ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, endereco + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
       
           public ResultSet listarPorCidade(String cidade){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.CIDADE LIKE ?                         ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, cidade + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
       
           public ResultSet listarPorEstado(String estado){
        try{
            sql = 
                " SELECT                                 " +
                "P.ID AS ID,                             " +
                "P.NOME AS NOME,                         " +
                "P.SOBRENOME AS SOBRENOME,               " +
                "P.CPF AS CPF,                           " +
                "P.DATADENASCIMENTO AS DATADENASCIMENTO, " +
                "P.GENERO AS GENERO,                     " +
                "P.TELEFONE AS TELEFONE,                 " + 
                "P.EMAIL AS EMAIL,                       " +
                "P.ENDERECO AS ENDERECO,                 " +
                "P.CIDADE AS CIDADE,                     " +
                "P.ESTADO AS ESTADO                      " +
                "FROM                                    " +
                "PESSOA P                                " +
                "WHERE                                   " +
                "P.ESTADO LIKE ?                         ";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setString(1, estado + "%");
            
            setResultado(getStatement().executeQuery());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return getResultado();
    }
           
     public Boolean excluir(int id){
        try{
            sql = "DELETE FROM PESSOA WHERE ID = ?";
            
            setStatement(getConexao().prepareStatement(sql));
            
            getStatement().setInt(1, id);
            
            getStatement().executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
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
