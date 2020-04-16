package com.example.scrolllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seleccion(View view){
        String mensaje = "";
        //Obtener ID de la imagen seleccionada que disparo la accion
        switch (view.getId()){
            case R.id.banana:
                mensaje = "Bananas";
                break;
            case R.id.cereza:
                mensaje= "Cerezas";
                break;
            case R.id.fresas:
                mensaje = "Fresas";
                break;
            case R.id.kiwis:
                mensaje = "Kiwis";
                        break;
            case R.id.mangos:
                mensaje = "Mangos";
                break;
            case R.id.sandia:
                mensaje = "Sandias";
                break;
            case R.id.naranjas:
                mensaje = "Naranjas";
                break;
            case R.id.peras:
                mensaje ="Peras";
                break;
            case R.id.piñas:
                mensaje = "Piñas";
                break;
            case R.id.zarzamora:
                mensaje = "Zarzamoras";
                break;
            default:
                mensaje = "null";
                break;



        }
        Toast.makeText(this, "Esto es una imagen de " + mensaje , Toast.LENGTH_SHORT).show();
    }
}