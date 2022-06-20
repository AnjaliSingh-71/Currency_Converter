package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText ed1;
    TextView ed2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ed1=findViewById(R.id.pt1);
        ed1.setOnClickListener(this);
        ed2=findViewById(R.id.pt2);

        b1=findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this,"Successfully Converted",Toast.LENGTH_SHORT).show();
                Double total;
                Double amt=Double.parseDouble(ed1.getText().toString());
                total=amt*77.95;

                ed2.setText("The amount in rs is " + total.toString());

            }
        });

    }

    @Override
    public void onClick(View view) {
        ed1.setText("");
    }


}
