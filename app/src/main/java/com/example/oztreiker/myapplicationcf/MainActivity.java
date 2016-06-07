package com.example.oztreiker.myapplicationcf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView campo_texto;
    EditText editable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * El campo_texto se va convertir en el R.id.texto que tengo en el activity_main.xml
         */
        ////campo_texto = (TextView) findViewById(R.id.texto);
        //Con esta linea estamos editando lo que ya se tenia predeterminado en string.xml
        ////campo_texto.setText("Hola de nuevo Oztreiker");
        /**
         *El editable se va convertir en el R.id.edittext que tengo en el activity_main.xml
         */
        editable = (EditText) findViewById(R.id.edittext);
        //obtendra el texto
        editable.setText("Cambiamos texto");
    }
}
