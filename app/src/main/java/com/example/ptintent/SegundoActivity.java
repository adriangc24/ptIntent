package com.example.ptintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
    }

    //Metodo para boton anterior
    public void anterior(View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
}
