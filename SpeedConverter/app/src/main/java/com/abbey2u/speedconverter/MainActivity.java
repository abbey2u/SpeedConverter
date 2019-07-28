package com.abbey2u.speedconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.valueOf;

public class MainActivity extends AppCompatActivity {

     EditText enterNumber;
     TextView resultTextView;

    public void convertSpeed(View view){
        enterNumber = findViewById(R.id.editText);
        long miles = toMilesPerHour(Integer.valueOf(enterNumber.getText().toString()));
        resultTextView.setText("Miles = " + miles);
        printConversion(10.5);

    }

    public static long toMilesPerHour(double kilometersPerHour){

            if (kilometersPerHour <0){
                return -1;

            }else {

                return Math.round(kilometersPerHour/1.609);

            }
    }

        public static void printConversion(double kilometersPerHours){
            String result = "";

            if (kilometersPerHours <0){
                result.equals("Invalid Value") ;
            }else {
                long milesPerHour = toMilesPerHour(kilometersPerHours);
                System.out.println(kilometersPerHours + " km/h =  " + milesPerHour + " mi/h");
            }

        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

    }
}
