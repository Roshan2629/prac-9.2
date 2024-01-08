package com.example.prac92;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.t);
        t1=findViewById(R.id.et1);
        t2=findViewById(R.id.et2);
    }
    public void getResult(View v) {
        int a=Integer.parseInt(t1.getText().toString());
        int b=Integer.parseInt(t2.getText().toString());
        if(v.getId()==R.id.b1){
            tv.setText("Addition : "+(a+b));
        }
        if(v.getId()==R.id.b2){
            tv.setText("Substraction : "+(a-b));
        }
        if(v.getId()==R.id.b3){
            tv.setText("Multiplication : "+(a*b));
        }
        if(v.getId()==R.id.b4){
            tv.setText("Division : "+(a/b));
        }
    }
}