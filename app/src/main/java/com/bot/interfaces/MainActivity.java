package com.bot.interfaces;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bot.interfaces.entity.Automobile;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText textInputValuePeople, textInputDistance;
    TextView textViewResult;
    Automobile automobileLight, automobileFreight, miniBus;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonResult);

        textInputDistance = findViewById(R.id.textInputDistance);
        textInputValuePeople = findViewById(R.id.textInputValuePeople);
        textViewResult = findViewById(R.id.textViewResult);
        button.setOnClickListener(listener);

        automobileLight = new Automobile(5, 1200,210);
        automobileFreight = new Automobile(3, 3000,170);
        miniBus = new Automobile(8, 1600,180);
    }

     private View.OnClickListener listener = new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             int distance = Integer.parseInt(textInputDistance.getText().toString());
             int valuePeople = Integer.parseInt(textInputValuePeople.getText().toString());
             textViewResult.setText(" Легкий автомобиль перевезет пассаживор за "+
                    automobileLight.timeDistance(valuePeople,distance) + "\n грузовой автомобиль за:"+ automobileFreight.timeDistance(valuePeople,distance)+
                     "\n микроавтобус  за:"+miniBus.timeDistance(valuePeople,distance));
         }
     };
}