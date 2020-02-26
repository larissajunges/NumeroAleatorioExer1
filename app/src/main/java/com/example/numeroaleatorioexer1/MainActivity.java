package com.example.numeroaleatorioexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNumeroAleatorio(View view){

        TextView text = (TextView) findViewById(R.id.resultado);
        text.setText("Nenhum valor foi selecionado");

        int inicio = 0 ;
        int fim = 0;

        EditText valorde = (EditText) findViewById(R.id.de);
        EditText valorate = (EditText) findViewById(R.id.ate);
        Button button = (Button) findViewById(R.id.gerar);

        button.setText("Sortear");
        inicio = Integer.parseInt(valorde.getText().toString());
        fim = Integer.parseInt(valorate.getText().toString());
        Random r = new Random();
        int aleatorio = r.nextInt(fim - inicio + 1) + inicio;
        TextView resultado = (TextView) findViewById(R.id.resultado);
        resultado.setText(aleatorio);

        button.setText("");

    }


}
