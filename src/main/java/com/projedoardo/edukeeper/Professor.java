/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.awt.image.BufferedImage;
import java.util.List;
/**
 *
 * @author edoar
 */
public class Professor {
    private String cpf;
    private String nome;
    private List<String> materias;
    private BufferedImage foto;
    
    public Professor(String cpf, String nome, List<String> materias, BufferedImage foto){
        this.cpf = cpf;
        this.nome = nome;
        this.materias = materias;
        this.foto = foto;
    }
    
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public List<String> getMaterias(){
        return materias;
    }
    public BufferedImage getFoto(){
        return foto;
    }
    
    //
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMaterias(List<String> materias){
        this.materias = materias;
    }
    public void setFoto(BufferedImage foto){
        this.foto = foto;
    }
}
