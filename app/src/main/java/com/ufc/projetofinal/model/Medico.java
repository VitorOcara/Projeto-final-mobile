package com.ufc.projetofinal.model;

public class Medico {
    private String name, ocupacao, horario;

    public Medico(String name, String ocupacao, String horario) {
        this.name = name;
        this.ocupacao = ocupacao;
        this.horario = horario;
    }

    public Medico() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
