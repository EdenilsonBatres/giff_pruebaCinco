package com.example.giff_pruebacinco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText textRecivido;
    private TextView textoMostrar;
    private Context context = MainActivity.this;
    private String exitoUrl = "https://media.giphy.com/media/l0MYzb5tIqufNfDhe/giphy.gif";
    private String failedUrl = "https://media.giphy.com/media/l0MYBYf0kLdkwe2BO/giphy.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//metodo que se accciona al hacer click
    public void buscar(View view)
    {
        textRecivido = (EditText) findViewById(R.id.editText);//cconserva el texto recivido por la interfaz
        String evaluarTexto = textRecivido.getText().toString();//convierte el texto recivido a string
        if (!evaluarTexto.isEmpty())//evalua si el campo esta vacio
        {
            String a = "feliz";//variable string a comparar
            if (evaluarTexto.equals(a))//compara los strings
            {
                Toast.makeText(context, "felicitaciones",Toast.LENGTH_SHORT).show();//muesta un mensaje si son iguales
            }
            else
            {
                Toast.makeText(context,"Exitosamente hay un error", Toast.LENGTH_SHORT).show();//muestra un mensaje si nonson iguales
            }
        }
        else
        {
            Toast.makeText(context, "escribe una palabra", Toast.LENGTH_SHORT).show();//mustra este mensaje si el campo esta vacio
        }
    }
}
