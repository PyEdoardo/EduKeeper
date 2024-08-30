/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.util.List;
import java.awt.image.BufferedImage;
/**
 *
 * @author edoar
 */
public class Coordenador {
    private String cpf;
    private String nome;
    private List<SalaDeAula> salas;
    
    public Coordenador(String cpf, String nome, List<SalaDeAula> salas){
        this.cpf = cpf;
        this.nome = nome;
        this.salas = salas;
    }
    
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public List<SalaDeAula> getSalas(){
        return salas;
    }

    //
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalas(List<SalaDeAula> salas){
        this.salas = salas;
    }
}
