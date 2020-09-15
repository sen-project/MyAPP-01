package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bt_login;  //编译变量
    Button bt_lx;
    EditText editTextName;
    String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        bt_login=findViewById(R.id.bt_login); //绑定id  初始化
        editTextName=findViewById(R.id.zhanghao);
        bt_lx=findViewById(R.id.bt_lx);


        bt_login.setOnClickListener(new View.OnClickListener() {   //获取输入内容
            @Override
            public void onClick(View view) {
                message=editTextName.getText().toString();

                Toast.makeText(MainActivity.this,message+"欢迎登入",Toast.LENGTH_SHORT).show();



            }
        });
        bt_lx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message=editTextName.getText().toString();

                Toast.makeText(MainActivity.this,message+"QQ:2079224061",Toast.LENGTH_SHORT).show();
            }
        });
    }
}