package com.example.kassa.bmr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.defaultValue;

public class PhysicalActivity extends AppCompatActivity {

    ImageButton l1, l2, l3, l4, l5;
    TextView t1;
    TextView units, calorieText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.physical_activity);

        l1 = (ImageButton)findViewById(R.id.etL1);
        l2 = (ImageButton)findViewById(R.id.etL2);
        l3 = (ImageButton)findViewById(R.id.etL3);
        l4 = (ImageButton)findViewById(R.id.etL4);
        l5 = (ImageButton)findViewById(R.id.etL5);

        calorieText = (TextView)findViewById(R.id.calorieText);
        t1 = (TextView)findViewById(R.id.etTextview);
        units = (TextView)findViewById(R.id.etUnits);

        Intent intent = this.getIntent();
        final double rmr = intent.getDoubleExtra("Rmr", defaultValue);



        //Toast.makeText(getApplicationContext(), "RMR = " + rmr, Toast.LENGTH_LONG).show();

        // t1.setText(Double.toString(rmr));

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double L1 = rmr*1.2;
                int X1 = (int)Math.round(L1);
                t1.setText(String.valueOf(X1));
                calorieText.setVisibility(View.VISIBLE);
                units.setVisibility(View.VISIBLE);

            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double L2 = rmr*1.375;
                int X2 = (int)Math.round(L2);
                t1.setText(String.valueOf(X2));
                calorieText.setVisibility(View.VISIBLE);
                units.setVisibility(View.VISIBLE);
            }
        });

        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double L3 = rmr*1.55;
                int X3 = (int)Math.round(L3);
                t1.setText(String.valueOf(X3));
                calorieText.setVisibility(View.VISIBLE);
                units.setVisibility(View.VISIBLE);
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double L4 = rmr*1.725;
                int X4 = (int)Math.round(L4);
                t1.setText(String.valueOf(X4));
                calorieText.setVisibility(View.VISIBLE);
                units.setVisibility(View.VISIBLE);
            }
        });

        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double L5 = rmr*1.9;
                int X5 = (int)Math.round(L5);
                t1.setText(String.valueOf(X5));
                calorieText.setVisibility(View.VISIBLE);
                units.setVisibility(View.VISIBLE);
            }
        });


    }


}
