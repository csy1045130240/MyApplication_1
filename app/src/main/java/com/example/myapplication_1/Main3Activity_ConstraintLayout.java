package com.example.myapplication_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity_ConstraintLayout extends AppCompatActivity {
    private Button button3_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3_change=(Button)findViewById(R.id.button3_change);
        button3_change.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Main3Activity_ConstraintLayout.this,Main4Activity_TableLayout.class);
                startActivity(intent);
            }
        });
    }
}
