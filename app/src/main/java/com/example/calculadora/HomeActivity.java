package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        handleOnClick();
    }

    private void handleOnClick() {
        Button buttonAdicao = findViewById(R.id.buttonAdicao);
        buttonAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCalcular = new Intent(HomeActivity.this, CalculaActivity.class);
                startActivity(telaCalcular);
            }
        });

        Button buttonSubtracao = findViewById(R.id.buttonSubtracao);
        buttonSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCalcular = new Intent(HomeActivity.this, CalculaActivity.class);
                startActivity(telaCalcular);
            }
        });

        Button buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);
        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCalcular = new Intent(HomeActivity.this, CalculaActivity.class);
                startActivity(telaCalcular);
            }
        });

        Button buttonDivisao = findViewById(R.id.buttonDivisao);
        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent telaCalcular = new Intent(HomeActivity.this, CalculaActivity.class);
                startActivity(telaCalcular);
            }
        });

    }

}