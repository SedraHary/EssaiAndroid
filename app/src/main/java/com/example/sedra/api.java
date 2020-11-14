package com.example.sedra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class api extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);

        final EditText a1 = findViewById(R.id.api1);
        final EditText a2 = findViewById(R.id.api2);
        final Button a3 = findViewById(R.id.enregistre4);
        final TextView text = findViewById(R.id.resultat);

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue( api.this);
                String url = "https://api.lyrics.ovh/v1/"+a1.getText().toString()+"/"+a2.getText().toString();

                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>(){
                    @Override
                            public void onResponse(String response) {
                        //Display the first 500 characters of the response string.
                        text.setText("Response is: "+ response.substring(0,550));
                        System.out.println("quertyuip" +response);
                    }
                        }, new Response.ErrorListener(){
                    @Override
                    public  void  onErrorResponse(VolleyError error){
                        text.setText("Ne marche pas");
                    }
                        });
                queue.add(stringRequest);
            }
        });
    }
}
