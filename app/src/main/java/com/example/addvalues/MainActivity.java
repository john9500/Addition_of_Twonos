package com.example.addvalues;

//Author : John Sathya Seelan
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a,b;
    Button Add;
    TextView res;
    private int input1,input2,sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.num1);
        b = (EditText) findViewById(R.id.num2);
        res = (TextView) findViewById(R.id.result);
        Add = (Button) findViewById(R.id.addbtn);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = Integer.parseInt(a.getText().toString());
                input2 = Integer.parseInt(b.getText().toString());
                sum = input1 + input2;
                res.setText(Integer.toString(sum));
            }
        });
    }
}