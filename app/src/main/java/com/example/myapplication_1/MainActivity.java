package com.example.myapplication_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用onCreat()");
        button1=(Button)findViewById(R.id.button_layout);
        button1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent intent=new Intent(MainActivity.this,Main2Activity.class);
               startActivity(intent);
           }
        });
        button2=(Button)findViewById(R.id.button_ListView);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main5Activity_SimpleAdapter.class);
                startActivity(intent);
            }
        });
        button3=(Button)findViewById(R.id.button_AlertDialog);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main6Activity_AlertDialog.class);
                startActivity(intent);
            }
        });
        button4=(Button)findViewById(R.id.button_MenuTest);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main7Activity_MenuTest.class);
                startActivity(intent);
            }
        });
        button5=(Button)findViewById(R.id.button_ActionMode);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main8Activity_ActionMode.class);
                startActivity(intent);
            }
        });
        button6=(Button)findViewById(R.id.button_Preference);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main9Activity_Settings.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivityLife","调用onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivityLife","调用onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivityLife","调用onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivityLife","调用onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivityLife","调用onDestroy()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivityLife","调用onRestart()");
    }

}
