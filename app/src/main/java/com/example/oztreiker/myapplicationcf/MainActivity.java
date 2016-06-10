package com.example.oztreiker.myapplicationcf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    TextView campo_texto;
    EditText editable;
    Button boton,botontoasting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * El campo_texto se va convertir en el R.id.texto que tengo en el activity_main.xml
         */
        campo_texto = (TextView) findViewById(R.id.texto);
        //Con esta linea estamos editando lo que ya se tenia predeterminado en string.xml
        ////campo_texto.setText("Hola de nuevo Oztreiker");
        /**
         *El editable se va convertir en el R.id.edittext que tengo en el activity_main.xml
         */
        editable = (EditText) findViewById(R.id.edittext);
        //obtendra el texto
        editable.setText("Cambiamos texto");
        /**
         *
         */
        boton = (Button) findViewById(R.id.boton);
        //botonN = (Button) findViewById(R.id.botonN);
        boton.setOnClickListener(this);
        //botonN.setOnClickListener(this);
        /**
         *
         */
        botontoasting = (Button) findViewById(R.id.botontoast);
        botontoasting.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:
                //recuperamos el texto que contiene el editable y lo convertimos en cadena.
                String dato = editable.getText().toString();
                campo_texto.setText(dato);
                Toast.makeText(getApplicationContext(),"SERA QUE SE MUESTRA ESTE TOAST",Toast.LENGTH_LONG).show();

                break;
            //scase R.id.botonN:
                //campo_texto.setText("Boton 2!!!");
                //break;
            case R.id.botontoast:
                //Toast.makeText(getApplicationContext(),"Esto es un toast de prueba",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Second_Activity.class);
                startActivity(intent);
                break;
        }
    }
}
