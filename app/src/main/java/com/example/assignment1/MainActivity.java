package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv,tv1,tv2,tv3,tv4,tv5,tv6,tv7;
    Button b,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView);
        tv1=(TextView) findViewById(R.id.textView2);
        tv2=(TextView) findViewById(R.id.textView5);
        tv3=(TextView) findViewById(R.id.textView8);
        tv4=(TextView) findViewById(R.id.textView3);
        tv5=(TextView) findViewById(R.id.textView9);
        tv6=(TextView) findViewById(R.id.textView4);
        tv7=(TextView) findViewById(R.id.textView10);
        b=(Button) findViewById(R.id.button2);
        b1=(Button) findViewById(R.id.button);

        Intent intent=getIntent();
        String str=intent.getStringExtra("Name");
        tv.setText(str);

        String sr=intent.getStringExtra("Desc");
        tv1.setText(sr);

        String sir=intent.getStringExtra("f_d");
        tv2.setText(sir);

        String skill=intent.getStringExtra("skill");
        tv4.setText(skill);

        String exp=intent.getStringExtra("exp");
        tv6.setText(exp);

    }

    public void dial(View view) {
        Intent intent=getIntent();
        String st=intent.getStringExtra("P_no");
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel: "+st.toString()));
        startActivity(i);
    }

    public void email(View view) {
        Intent i=getIntent();
        String st=i.getStringExtra("Email");
        Intent intent=new Intent();
        intent.setData(Uri.parse("mailto:"+st.toString()));

        Intent chooser=Intent.createChooser(intent,"Send message");
        startActivity(chooser);
    }
}