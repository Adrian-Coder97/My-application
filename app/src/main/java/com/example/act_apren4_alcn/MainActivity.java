package com.example.act_apren4_alcn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtNombre1);
        et2 = (EditText) findViewById(R.id.txtCalif1);
        tv1 = (TextView) findViewById(R.id.txtResul);
    }

    //METODO
    public void Evaluar(View view) {
        String st1 = et1.getText().toString();
        String st2 = et2.getText().toString();
        // si el campo esta vacio mandar error
        if (st1.trim().equalsIgnoreCase("")) {
            et1.setError("Llenar este campo");
        }
        if (st2.trim().equalsIgnoreCase("")) {
            et2.setError("Llenar este campo");
        } else if (!st1.trim().equalsIgnoreCase("") && !st2.trim().equalsIgnoreCase("")) {
            double cal = Double.parseDouble(st2);
            if (cal <= 10.5 && cal >= 0) {
                String a = "Hola " + st1 + " tu calificacion de " + cal + " es mala";
                tv1.setText(a);
            } else if (cal <= 14 && cal > 10.5) {
                String a = "Hola " + st1 + " tu calificacion de " + cal + " es regular";
                tv1.setText(a);
            } else if (cal <= 18 && cal > 14) {
                String a = "Hola " + st1 + " tu calificacion de " + cal + " es buena!";
                tv1.setText(a);
            } else if (cal <= 20 && cal > 18) {
                String a = "Hola " + st1 + " tu calificacion de " + cal + " es excelente!";
                tv1.setText(a);
            } else if (cal < 0 || cal > 20) {
                String a = "ERROR Ingresa un numero valido";
                tv1.setText(a);
            }
        }


    }
}