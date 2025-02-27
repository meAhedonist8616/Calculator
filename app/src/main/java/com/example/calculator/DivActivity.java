package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1,b2;
    String getNum1,getNum2,quot;
    int num1,num2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);

        et1=(EditText)findViewById(R.id.ndiv1);
        et2=(EditText)findViewById(R.id.ndiv2);
        b1=(Button) findViewById(R.id.div2but);
        b2=(Button) findViewById(R.id.back4but);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et1.getText().toString();
                getNum2=et2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                result=num1/num2;
                quot=String.valueOf(result);
                Toast.makeText(getApplicationContext(),quot,Toast.LENGTH_SHORT).show();
            }
        });
    }
}