package com.ufc.projetofinal.model;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Medico> medicos;
    private ArrayList<Dentista> dentistas;

    public DataBase() {
        medicos = new ArrayList<>();
        dentistas = new ArrayList<>();
    }

    public void AddMedico(Medico m){
        medicos.add(m);
    }

    public void AddDentista(Dentista d){
        dentistas.add(d);
    }

}
