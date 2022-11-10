package com.ufc.projetofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.ufc.projetofinal.model.DataBase;
import com.ufc.projetofinal.model.Dentista;
import com.ufc.projetofinal.model.Medico;

public class AdmPanel extends AppCompatActivity {
    EditText medicoName, dentistaName, medicoOcupacao, horarioMedico, horarioDentista;
    Button addDados;
    DataBase db;
    UserView user;
    Medico medico;


    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm_panel);
        db = new DataBase();
        user  = new UserView();

        medicoName = findViewById(R.id.nomeProfissional);
        dentistaName = findViewById(R.id.nomeDentista);
        medicoOcupacao = findViewById(R.id.ocupacao);
        horarioDentista = findViewById(R.id.horarioDente);
        horarioMedico = findViewById(R.id.horario);

    }


    public void addDentista(View view){

        String dentista = dentistaName.getText().toString();
        String horaDentist = horarioDentista.getText().toString();
        db.AddDentista(new Dentista(dentista, horaDentist));
        databaseReference.child("dentistas").child("1").setValue(new Dentista(dentista, horaDentist));


        horarioDentista.setText("");
        dentistaName.setText("");

    }
    public void addMedico(View view){
        String nameMedico = medicoName.getText().toString();
        String ocupacaoMedico = medicoOcupacao.getText().toString();
        String medicoHora = horarioMedico.getText().toString();

        medico = new Medico(nameMedico, ocupacaoMedico, medicoHora);
        user.setMedico(medico);

        medicoName.setText("");
        medicoOcupacao.setText("");
        horarioMedico.setText("");

    }
}