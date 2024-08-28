/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projedoardo.edukeeper;

import java.util.List;

/**
 *
 * @author edoar
 */
public class SalaDeAula {
    private String idSala;
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;
    
    public SalaDeAula(String idSala, String nome, Professor professor, List<Aluno> alunos){
        this.idSala = idSala;
        this.nome = nome;
        this.professor = professor;
        this.alunos = alunos;
    }
    
    public String getIdSala(){
        return idSala;
    }
    public String getNome(){
        return nome;
    }
    public Professor getProfessor(){
        return professor;
    }
    public List<Aluno> getAlunos(){
        return alunos;
    }
    
    //
    
    public void setIdSala(String idSala){
        this.idSala = idSala;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
}
