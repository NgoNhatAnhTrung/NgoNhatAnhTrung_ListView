package com.example.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvNgonNgu;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvNgonNgu = (ListView) findViewById(R.id.listviewNgonNgu);
        arrayCourse= new ArrayList<>();

        arrayCourse.add("Tieng Anh");
        arrayCourse.add("Tieng Viet");
        arrayCourse.add("Tieng Trung Quoc");
        arrayCourse.add("Tieng Phap");
        arrayCourse.add("Tieng Duc");

        ArrayAdapter adapter= new ArrayAdapter(MainActivity.this,
                android.R.layout.simple_list_item_1,
                arrayCourse);

        lvNgonNgu.setAdapter(adapter);

        lvNgonNgu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayCourse.get(i),Toast.LENGTH_SHORT).show();
            }
        });
        lvNgonNgu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    startActivity(new Intent(MainActivity.this,TiengAnh.class));
                }else if(i==1){
                    startActivity(new Intent(MainActivity.this,TiengViet.class));
                }else{

                }
            }
        });
    }
}