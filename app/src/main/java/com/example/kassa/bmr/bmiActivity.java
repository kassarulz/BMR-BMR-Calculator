package com.example.kassa.bmr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class bmiActivity extends AppCompatActivity {

    EditText weight, height;
    TextView bmiText, bmiValue;
    ImageButton calculate;
    Double bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        weight = (EditText)findViewById(R.id.etWeight);
        height = (EditText)findViewById(R.id.etHeight);

        bmiText = (TextView)findViewById(R.id.bmiText);
        bmiValue = (TextView)findViewById(R.id.bmiValue);



        calculate = (ImageButton)findViewById(R.id.calculateBtn);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numWeight = weight.getText().toString();
                String numHeight = height.getText().toString();

                if (numWeight.isEmpty()) {
                    weight.setError("Weight  is required");
                    weight.requestFocus();
                    return;
                }

                if (numHeight.isEmpty()) {
                    height.setError("Height is required");
                    height.requestFocus();
                    return;
                }

                Double w = Double.parseDouble(numWeight);
                Double h = Double.parseDouble(numHeight);

                bmi = w / (h*h);

                bmiValue.setText(Double.toString(Math.round(bmi* 100.0) / 100.0));
                bmiText.setVisibility(View.VISIBLE);



            }
        });


    }
}
