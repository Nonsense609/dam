package com.example.calci;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,bmul,bplus,beql,bclr,bdot,bdiv,bminus;
    EditText et_result;
    float v1,v2,v3,v4,v5;
    boolean add,div,sub,mul;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        bclr=(Button) findViewById(R.id.bclr);
        beql=(Button) findViewById(R.id.beql);
        bminus=(Button)findViewById(R.id.bminus);
        bplus=(Button) findViewById(R.id.bplus);
        bmul=(Button) findViewById(R.id.bmul);
        bdiv=(Button) findViewById(R.id.bdiv);
        bdot=(Button) findViewById(R.id.bdot);
        et_result=(EditText) findViewById(R.id.et_result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(et_result.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(et_result.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(et_result.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(et_result.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(et_result.getText()+"5");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(et_result.getText()+".");
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_result.setText(null);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Float.parseFloat(et_result.getText()+"");
                add=true;
                et_result.setText(null);
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v4=Float.parseFloat(et_result.getText()+"");
                add=false;
                sub=true;

                et_result.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v5=Float.parseFloat(et_result.getText()+"");
                add=false;
                sub=false;
                mul=true;
                et_result.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Float.parseFloat(et_result.getText()+"");
                add=false;
                sub=false;
                mul=false;
                div=true;
                et_result.setText(null);
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v3=Float.parseFloat(et_result.getText()+"");
                if(add){
                    et_result.setText(v1+v3+"");
                } else if (sub) {
                    et_result.setText(v4-v3+"");

                } else if (mul) {
                    et_result.setText(v5*v3+"");



                } else if(div){
                    et_result.setText(v2/v3+"");
                }
            }
        });

    }
}