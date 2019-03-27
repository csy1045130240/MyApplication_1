package com.example.myapplication_1;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import com.example.myapplication_1.R;


public class Main5Activity_SimpleAdapter extends AppCompatActivity {
    private ListView listView1;
    private Button button5_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5__simple_adapter);
        button5_change=(Button)findViewById(R.id.button5_change);
        button5_change.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Main5Activity_SimpleAdapter.this,MainActivity.class);
                startActivity(intent);
            }
        });
        final Animal animal_data[] = new Animal[]
                {
                        new Animal(R.drawable.cat, "Cat"),
                        new Animal(R.drawable.dog, "Dog"),
                        new Animal(R.drawable.elephant, "Elephant"),
                        new Animal(R.drawable.lion, "Lion"),
                        new Animal(R.drawable.monkey, "Monkey"),
                        new Animal(R.drawable.tiger, "Tiger")
                };

        AnimalAdapter adapter = new AnimalAdapter(this,
                R.layout.layout_listview_row, animal_data);

        String a[]={"Cat","Dog","Elephant","Lion","Monkey","Tiger"};
        listView1 = (ListView)findViewById(R.id.listview);

        View header = (View)getLayoutInflater().inflate(R.layout.layout_listview_row, null);
        listView1.addHeaderView(header);

        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String a[]={"Cat","Dog","Elephant","Lion","Monkey","Tiger"};
                if(i!=0){
                Toast.makeText(Main5Activity_SimpleAdapter.this,a[i-1].toString(),Toast.LENGTH_LONG).show();
            }}
        });
    }

}

