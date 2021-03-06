package com.alanlomeli.volunteer;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class activity_RegistroVoluntario extends AppCompatActivity {

    public Spinner spinnerDia;
    public Spinner spinnerMes;
    public Spinner spinnerCiudad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__registro_voluntario);

        spinnerDia=(Spinner)findViewById(R.id.spnDia);
        spinnerMes=(Spinner)findViewById(R.id.spnMes);
        spinnerCiudad=(Spinner) findViewById(R.id.spnCiudad);

        String[] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        //Agregando el arreglo a los Spinner
        ArrayAdapter<String> adapter =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, meses);
        spinnerMes.setAdapter(adapter);

        String[] dia={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ArrayAdapter<String> adapterdia =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dia);
        spinnerDia.setAdapter(adapterdia);

        String[] ciudades={"Guadalajara", "Culiacan", "Monterrey", "Tijuana", "Cancun", "CDMX", "Mexicalli", "Tepic", "Merida", "Torreon"};
        //Agregando el arreglo a los Spinner
        ArrayAdapter<String> adapterciudad =new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, ciudades);
        spinnerCiudad.setAdapter(adapterciudad);
    }



}
