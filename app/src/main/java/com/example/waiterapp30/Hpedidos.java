package com.example.waiterapp30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Hpedidos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hpedidos);
    }

    public void pagar(View view) {
        startActivity(new Intent(getApplicationContext(), Pagar.class));
        finish();
    }

    public void cancelar(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }
}
