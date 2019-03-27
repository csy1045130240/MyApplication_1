package com.example.myapplication_1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity_AlertDialog extends AppCompatActivity {
    private Button button6_change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6__alert_dialog);
        button6_change=(Button)findViewById(R.id.button6_change);
        button6_change.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Main6Activity_AlertDialog.this,MainActivity.class);
                startActivity(intent);
            }
        });
        // 创建对话框构建器
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 获取布局
        View view2 = View.inflate(Main6Activity_AlertDialog.this, R.layout.activity_mian_6_login, null);
        // 获取布局中的控件
        final EditText username = (EditText) view2.findViewById(R.id.Username);
        final EditText password = (EditText) view2.findViewById(R.id.Password);
        final Button button = (Button) view2.findViewById(R.id.Login);
        // 设置参数
        builder.setView(view2);
        // 创建对话框
        final AlertDialog alertDialog = builder.create();
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String uname = username.getText().toString().trim();
                String psd = password.getText().toString().trim();
                if (uname.equals("1") && psd.equals("1")) {
                    Toast.makeText(Main6Activity_AlertDialog.this, "登录成功", Toast.LENGTH_SHORT).show();
                    View view3 = View.inflate(Main6Activity_AlertDialog.this, R.layout.activity_main6__alert_dialog, null);
                    TextView username =(TextView)findViewById(R.id.Username_Success);
                    TextView password =(TextView)findViewById(R.id.Password_Success);
                    username.setText("用户名："+uname);
                    password.setText("密码："+psd);
                    alertDialog.dismiss();
                }
                else
                    Toast.makeText(Main6Activity_AlertDialog.this, "登录失败", Toast.LENGTH_SHORT).show();
                //alertDialog.dismiss();// 对话框消失
            }

        });
        alertDialog.show();
    }
}
