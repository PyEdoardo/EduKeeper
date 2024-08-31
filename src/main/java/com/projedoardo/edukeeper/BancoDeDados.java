/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author edoar
 */
public class BancoDeDados {
    
    Connection conexao = null;
    
    
    public void iniciarBanco(){
        try{
        conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
        Statement statement = conexao.createStatement();
        statement.setQueryTimeout(30);  // Espera só por 30 segundos para conectar
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    //////// Parte Aluno
    public void inserirAluno(String cpf, String nome, int idade, double nota1, double nota2, String aprovado){
           try{
               conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
               Statement statement = conexao.createStatement();
               statement.setQueryTimeout(30);
               
               String sql = "INSERT INTO Aluno(cpf, nome, idade, nota1, nota2, aprovado) VALUES(?, ?, ?, ?, ?, ?)";
               
               try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
                pstmt.setString(1, cpf);
                pstmt.setString(2, nome);
                pstmt.setInt(3, idade);
                pstmt.setDouble(4, nota1);
                pstmt.setDouble(5, nota2);
                pstmt.setString(6, aprovado);
                pstmt.executeUpdate();
                statement.close();
                conexao.close();
                pstmt.close();
        }
           }catch(SQLException e){
               System.err.println(e);
           }
        }
    
    public void removerAluno(String cpf){
        try{
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            Statement statement = conexao.createStatement();
            statement.setQueryTimeout(30);
            String sql = "DELETE FROM Aluno WHERE cpf = ?";
            try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
                pstmt.setString(1, cpf);
                int rowsAffected = pstmt.executeUpdate();
                
                if (rowsAffected > 0){
                    System.out.println("Aluno Removido com Sucesso!");
                    JOptionPane.showMessageDialog(null, "Aluno Removido com Sucesso!");
                }else{
                    System.out.println("");
                    JOptionPane.showMessageDialog(null, "Aluno não encontrado com o CPF Especificado!");
                }
            }
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    public Aluno procurarAluno(String id, boolean tipo){
        // tipo se for true, é o CPF, se for falso é o nome
        
        Aluno aluno = new Aluno();
        
        if (tipo){
            try{
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            Statement statement = conexao.createStatement();
            statement.setQueryTimeout(30);
            
            String sql = "SELECT cpf, nome, idade, nota1, nota2, aprovado FROM Aluno WHERE cpf = ?";
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, id);
            
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                aluno.setCpf(rs.getString("cpf"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setNota1(rs.getDouble("nota1"));
                aluno.setNota2(rs.getDouble("nota2"));
                aluno.setAprovado(rs.getBoolean("aprovado"));
                System.err.println("ERRO PROCURA, APROVADO: " + aluno.getAprovado());
                rs.close();
                conexao.close();
                pstmt.close();
                return new Aluno(aluno.getCpf(), aluno.getNome(), aluno.getIdade(), aluno.getNota1(), aluno.getNota2(), aluno.getAprovado());
            }
            
            }catch(SQLException e){
                System.err.println(e);
            }
            
        }else{
            try{
            conexao = DriverManager.getConnection("jdbc:sqlite:banco.db");
            Statement statement = conexao.createStatement();
            statement.setQueryTimeout(30);
            
            String sql = "SELECT cpf, nome, idade, nota1, nota2, aprovado FROM Aluno WHERE nome = ?";
            
            PreparedStatement pstmt = conexao.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                aluno.setCpf(rs.getString("cpf"));
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(rs.getInt("idade"));
                aluno.setNota1(rs.getDouble("nota1"));
                aluno.setNota2(rs.getDouble("nota2"));
                aluno.setAprovado(rs.getBoolean("aprovado"));
                rs.close();
                conexao.close();
                pstmt.close();
                return aluno;
            }
            
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        return aluno;
    }
    public void realocarAluno(){
        
    }
    /////////////////////////////////////// Parte Professor
    public void inserirProfessor(){
        
    }
    public void removerProfessor(){
        
    }
    public void realocarProfessor(){
        
    }
    public void procurarProfessor(){
        
    }
        
}
