package com.ufc.projetofinal.model;

public class Dentista {
    private String  nome, horario;

    public Dentista(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public Dentista(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
