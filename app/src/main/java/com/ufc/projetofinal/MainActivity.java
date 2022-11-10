package com.ufc.projetofinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button admPanel, userPanel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admPanel = findViewById(R.id.btn_painelADM);
        userPanel = findViewById(R.id.btn_painelUser);


    }


    public void viewUserPanel(View v){
        Intent in = new Intent(MainActivity.this, UserView.class);
        startActivity(in);

    }

    public void entrar(View v) {
        Intent in =  new Intent(MainActivity.this, AdmPanel.class);
        startActivity(in);
    }
}