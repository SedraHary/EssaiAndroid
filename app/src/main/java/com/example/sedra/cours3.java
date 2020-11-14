package com.example.sedra;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cours3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours3);

        final EditText e2 = findViewById(R.id.nom1);
        final EditText e3 = findViewById(R.id.prenom1);
        final EditText e4 = findViewById(R.id.matricule1);
        final Button b3 = findViewById(R.id.enregistre3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valeur = e2.getText().toString();
                String valeur1 = e3.getText().toString();
                String valeur2 = e4.getText().toString();

                AlertDialog alertDialog = new AlertDialog.Builder(cours3.this).create();
                alertDialog.setMessage("Voulez-vous vraiment continuer avec "+valeur +" " +valeur1 +" " +valeur2 +"?");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OUI", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), cours2.class);
                        startActivity(i);
                    }
                });
                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NON", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), cours3.class);
                    }
                });
                alertDialog.show();
            }
        });
    }
}
