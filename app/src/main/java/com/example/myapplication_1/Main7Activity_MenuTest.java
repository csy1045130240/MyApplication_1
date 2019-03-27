package com.example.myapplication_1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main7Activity_MenuTest extends AppCompatActivity {
    private Button button7_change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7__menu_test);
        button7_change=(Button)findViewById(R.id.button7_change);
        button7_change.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Main7Activity_MenuTest.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menutest, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView tv=(TextView)findViewById(R.id.testContext);
        switch (item.getItemId()) {
            case R.id.TextSize_10: {
                tv.setTextSize(10);
                return true;
            }
            case R.id.TextSize_16: {
                tv.setTextSize(16);
                return true;
            }
            case R.id.TextSize_20: {
                tv.setTextSize(20);
                return true;
            }
            case R.id.Common: {
                Toast.makeText(this, "普通菜单项" , Toast.LENGTH_SHORT).show();
                return true;
            }
            case R.id.red: {
                tv.setTextColor(Color.parseColor("#FF0000"));
                return true;
            }
            case R.id.black: {
                tv.setTextColor(Color.parseColor("#000000"));
                return true;
            }

        }
    return true;
    }
}
