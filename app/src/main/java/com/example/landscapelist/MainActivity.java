package com.example.landscapelist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String[] landscapeList = {"Batman","Fantasy World","Japan","Moon","Star Wars","Winter"};
    int[] landscapeImages = {R.drawable.batman,R.drawable.fantasy,R.drawable.japan,R.drawable.moon,R.drawable.star,R.drawable.winter};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.customLandscapeList);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), landscapeList, landscapeImages);
        listView.setAdapter(customBaseAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
                switch(position)
                {
                    case 1:
                        startActivity(new Intent(MainActivity.this, Batman.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, Fantasy.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, Japan.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, Moon.class));
                        break;
                    case 5:
                        startActivity(new Intent(MainActivity.this, StarWars.class));
                        break;
                    case 6:
                        startActivity(new Intent(MainActivity.this, Winter.class));
                        break;
                }
            }
        });

    }
}