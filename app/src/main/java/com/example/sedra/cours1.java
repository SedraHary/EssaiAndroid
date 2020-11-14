package com.example.sedra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cours1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours1);

        final Button b2 = findViewById(R.id.insere1);
        final EditText e1 = findViewById(R.id.text1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String valeur = e1.getText().toString();
                //Toast.makeText(getApplicationContext(),"Vous avez saisie "+valeur, Toast.LENGTH_LONG).show();
                AlertDialog alertDialog = new AlertDialog.Builder(cours1.this).create();
                alertDialog.setTitle("Information");
                alertDialog.setMessage("Etes-vous sur de taper." +valeur);

                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                });
                alertDialog.show();
            }
        });


    }
}
