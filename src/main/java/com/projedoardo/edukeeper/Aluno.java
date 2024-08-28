/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;
import java.awt.image.BufferedImage;

/**
 *
 * @author edoar
 */
public class Aluno {
    private String cpf;
    private String nome;
    private int idade;
    private BufferedImage foto;
    private double nota1;
    private double nota2;
    private boolean aprovado;
    
    public Aluno(String cpf, String nome, int idade, BufferedImage foto, double nota1, double nota2, boolean aprovado){
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.foto = foto;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.aprovado = aprovado;
    }
    
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public BufferedImage getFoto(){
        return foto;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public boolean getAprovado(){
        return aprovado;
    }
    
    //
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    } 
    public void setAprovado(boolean aprovado){
        this.aprovado = aprovado;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setFoto(BufferedImage foto){
        this.foto = foto;
    }
}
