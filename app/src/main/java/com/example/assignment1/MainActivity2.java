package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText t,t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t=(EditText) findViewById(R.id.editTextTextPersonName);
        t1=(EditText) findViewById(R.id.editTextTextEmailAddress);
        t2=(EditText) findViewById(R.id.editTextPhone);
        t3=(EditText) findViewById(R.id.editTextTextPersonName3);
        t4=(EditText) findViewById(R.id.editTextTextPersonName5);
        t5=(EditText) findViewById(R.id.editTextTextPersonName6);
        t6=(EditText) findViewById(R.id.editTextTextPersonName7);
    }

    public void onc(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        intent.putExtra("Name",t.getText().toString());
        intent.putExtra("Email",t1.getText().toString());
        intent.putExtra("P_no",t2.getText().toString());
        intent.putExtra("Desc",t3.getText().toString());
        intent.putExtra("f_d",t4.getText().toString());
        intent.putExtra("skill",t5.getText().toString());
        intent.putExtra("exp",t6.getText().toString());
        startActivity(intent);
    }
}