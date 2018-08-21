package com.example.kassa.bmr;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     RadioGroup radioGroup;
     RadioButton male, female;

     EditText weight, height, age;
     ImageButton calculate;

    Double rmr;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        radioGroup = (RadioGroup)findViewById(R.id.radio_grp);
        male = (RadioButton)findViewById(R.id.male);
        female = (RadioButton)findViewById(R.id.female);
        calculate = (ImageButton) findViewById(R.id.calculateBtn);

        weight = (EditText)findViewById(R.id.etWeight);
        height = (EditText)findViewById(R.id.etHeight);
        age = (EditText)findViewById(R.id.etAge);






        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numWeight = weight.getText().toString();
                String numHeight = height.getText().toString();
                String numAge = age.getText().toString();


                if(numWeight.isEmpty()){
                    weight.setError("Weight  is required");
                    weight.requestFocus();
                    return;
                }

                if(numHeight.isEmpty()){
                    height.setError("Height is required");
                    height.requestFocus();
                    return;
                }

                if(numAge.isEmpty()){
                    age.setError("Age is required");
                    age.requestFocus();
                    return;
                }

                String gender = "";


                if(male.isChecked()){
                    gender = "male";
                }
                else {
                    gender = "female";
                }

                if (!male.isChecked() && !female.isChecked()){
                    Toast.makeText(getApplicationContext(), "Select a Gender",
                            Toast.LENGTH_LONG).show();
                    return;
                }






                Double w = Double.parseDouble(numWeight);
                Double h = Double.parseDouble(numHeight);
                Double a = Double.parseDouble(numAge);

                if(gender.equals("male")){
                    rmr = (9.99*w) + (6.25*h) + (4.92*a) + 5;
                }

                if(gender.equals("female")){
                    rmr = (9.99*w) + (6.25*h) - (4.92*a) - 161;
                }






                Intent intent = new Intent(MainActivity.this, PhysicalActivity.class);
                intent.putExtra("Rmr", rmr);
                startActivity(intent);


            }
        });




    }


}
