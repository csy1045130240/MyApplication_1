package com.example.myapplication_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity_TableLayout extends AppCompatActivity {
    private Button button4_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button4_change=(Button)findViewById(R.id.button4_change);
        button4_change.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Main4Activity_TableLayout.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
