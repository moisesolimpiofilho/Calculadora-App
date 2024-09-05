package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculaActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewTitulo;
    EditText editTextN1;
    EditText editTextN2;
    Button buttonCalcular;
    Button buttonVoltar;
    private String parametro = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcula);

        textViewTitulo = findViewById(R.id.textViewTitulo);

        editTextN1 = findViewById(R.id.editTextN1);
        editTextN2 = findViewById(R.id.editTextN2);

        buttonCalcular = findViewById(R.id.buttonCalcular);
        buttonCalcular.setOnClickListener(this);

        buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(this);

        Intent telaAnterior = getIntent();
        this.parametro = telaAnterior.getStringExtra("operacao");
        textViewTitulo.setText(this.parametro.toUpperCase().concat(" números"));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonVoltar) {
            finish();
        } else if (v.getId() == R.id.buttonCalcular) {

            int n1 = Integer.parseInt(editTextN1.getText().toString());
            int n2 = Integer.parseInt(editTextN2.getText().toString());
            int resultado = 0;

            switch (this.parametro) {
                case "somar":
                    resultado = n1 + n2;
                    break;
                case "subtrair":
                    resultado = n1 - n2;
                    break;
                case "multiplicar":
                    resultado = n1 * n2;
                    break;
                case "dividir":
                    resultado = n1 / n2;
                    break;
            }
            Toast.makeText(this, "O resultado é " + resultado, Toast.LENGTH_LONG).show();
        }
    }
}