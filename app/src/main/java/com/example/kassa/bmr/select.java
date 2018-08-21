package com.example.kassa.bmr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {

    Button bmiBtn, bmrBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        bmiBtn = (Button)findViewById(R.id.bmiBtn);
        bmrBtn = (Button)findViewById(R.id.bmrBtn);

        bmrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select.this, MainActivity.class);
                startActivity(intent);
            }
        });

        bmiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(select.this, bmiActivity.class);
                startActivity(intent);
            }
        });

    }
}
