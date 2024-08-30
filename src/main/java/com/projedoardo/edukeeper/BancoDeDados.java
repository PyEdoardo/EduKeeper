/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
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
    public void inserirAluno(String nome, String cpf, int idade, double nota1, double nota2, String aprovado){
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
        }
               
           }catch(SQLException e){
               System.err.println(e);
           }
        }
        
}
