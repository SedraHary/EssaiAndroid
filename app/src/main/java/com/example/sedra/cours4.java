package com.example.sedra;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class cours4 extends AppCompatActivity {
    String [] listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours4);

       ListView l1 = findViewById(R.id.list1);

       listItem = getResources().getStringArray(R.array.liste);
       final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
               android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
       l1.setAdapter(adapter);

       l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               //TODO Auto-generated method stub
               String value=adapter.getItem(position);
               Toast.makeText(getApplicationContext(), value, Toast.LENGTH_SHORT).show();
           }
       });
    }
}
