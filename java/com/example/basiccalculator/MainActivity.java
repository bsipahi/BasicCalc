package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Number1Text;
    EditText Number2Text;
    TextView ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number1Text = findViewById(R.id.Number1Text);
        Number2Text = findViewById(R.id.Number2Text);
        ResultText = findViewById(R.id.ResultText);
    }

    public void cikarma(View view) {
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")) {
            ResultText.setText("Numara Giriniz!");
        } else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 - number2;
            ResultText.setText("Sonuç: "+result);
        }


    }
    public void toplama(View view) {
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")) {
            ResultText.setText("Numara Giriniz!");
        } else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 + number2;
            ResultText.setText("Sonuç: " + result);
        }


    }
    public void carpma(View view) {
        if(Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")) {
            ResultText.setText("Numara Giriniz!");
        } else if(Integer.parseInt(Number1Text.getText().toString())==0 || Integer.parseInt(Number2Text.getText().toString())==0) {
            ResultText.setText("O iş öyle olmuyor canım :)");
        }
        else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 * number2;
            ResultText.setText("Sonuç: " + result);
        }

    }
    public void bolme(View view) {
        if (Number1Text.getText().toString().matches("") || Number2Text.getText().toString().matches("")) {
            ResultText.setText("Numara Giriniz!");
        }else if (Integer.parseInt(Number1Text.getText().toString()) == 0 || Integer.parseInt(Number2Text.getText().toString())==0) {
            ResultText.setText("Sıfıra Bölünemez!");
        }
        

        else {
            int number1 = Integer.parseInt(Number1Text.getText().toString());
            int number2 = Integer.parseInt(Number2Text.getText().toString());
            int result = number1 / number2;
            ResultText.setText("Sonuç: " + result);
        }

    }
}