/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.util.ArrayList;
/**
 *
 * @author edoar
 */
public class Professor {
    private String cpf;
    private String nome;
    private ArrayList<String> materias;
    
    public Professor(){
        this.cpf = null;
        this.nome = null;
        this.materias = null;
    }
    
    public Professor(String cpf, String nome, ArrayList<String> materias){
        this.cpf = cpf;
        this.nome = nome;
        this.materias = materias;
    }
    
    public String getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public ArrayList<String> getMaterias(){
        return materias;
    }
    
    //
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMaterias(ArrayList<String> materias){
        this.materias = materias;
    }
}
