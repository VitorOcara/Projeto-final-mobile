package com.ufc.projetofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.ufc.projetofinal.model.Medico;
import com.ufc.projetofinal.model.PostoSaude;


import java.util.ArrayList;
public class UserView extends AppCompatActivity {
    Medico medico;

    PostoSaude p1, p2, p3;
    ArrayList<PostoSaude> postosDeSaude;

    ListView listaConteudo;
    ArrayAdapter<PostoSaude> adapterP;
    TextView nomeProfissional, ocupacao, horario, nomeDentista, horarioDente;

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public ArrayList<PostoSaude> load(PostoSaude p){


        p2 = new PostoSaude();
        p3 = new PostoSaude();

        p2.setId(1);
        p2.setName("Antoio Marcos");
        p2.setCoord("000002");
        p3.setId(1);
        p3.setName("Antoio Cezar");
        p3.setCoord("000003");
        postosDeSaude.add(p1);
        postosDeSaude.add(p2);
        postosDeSaude.add(p3);
        return postosDeSaude;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        medico = new Medico();
        super.onCreate(savedInstanceState);
        postosDeSaude = new ArrayList<>();
        setContentView(R.layout.activity_user_view);
        p1 = new PostoSaude();
        p1.setId(1);
        p1.setName("Antoio Carlos");
        p1.setCoord("000001");
        postosDeSaude = load(p1);

        listaConteudo = findViewById(R.id.listaRecycle);
        adapterP = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, postosDeSaude );
        listaConteudo.setAdapter(adapterP);

        nomeProfissional= findViewById(R.id.nomeProfissional);
        ocupacao = findViewById(R.id.ocupacao);
        horario = findViewById(R.id.horario);
        nomeDentista = findViewById(R.id.nomeDentista);
        horarioDente = findViewById(R.id.horarioDente);


        nomeProfissional.setText(medico.getName());
        ocupacao.setText(medico.getOcupacao());
        horario.setText(medico.getName());
//
//        nomeDentista.setText("Rafael");
//        horarioDente.setText("13:00-17:00");
    }
}