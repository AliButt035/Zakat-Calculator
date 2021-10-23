package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e=(EditText)findViewById(R.id.editTextNumber);
                EditText e1=(EditText)findViewById(R.id.editTextNumber2);
                EditText e2=(EditText)findViewById(R.id.editTextNumber6);
                EditText e3=(EditText)findViewById(R.id.editTextNumber5);
                EditText e4=(EditText)findViewById(R.id.editTextNumber3);
                double n= Double.parseDouble(e.getText().toString());
                double n1=Double.parseDouble(e1.getText().toString());
                double n2=Double.parseDouble(e2.getText().toString());
                double n3=Double.parseDouble(e3.getText().toString());
                double n4=Double.parseDouble(e4.getText().toString());
                double total=0;
                n=n*118000;
                if(n>885000)
                {
                    total+=(n/100)*2.5;
                }
                n1=n1*1400;
                if(n1>73500)
                {
                    total+=(n1/100)*2.5;
                }
                if(n2>885000)
                {
                    total+=(n2/100)*2.5;
                }
                if(n3>885000)
                {
                    total+=(n3/100)*2.5;
                }
                if(n4>885000)
                {
                    total-=(n4/100)*2.5;
                }

                Toast toast= Toast. makeText(getApplicationContext(),"Total Zakat "+Double.toString(total)+" rupees",Toast. LENGTH_SHORT);
                toast. show();
            }
        });


    }
}