package com.example.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view)

    {

        EditText dollareditText = (EditText) findViewById(R.id.dollareditText);

        Double dollarAmount = Double.parseDouble(dollareditText.getText().toString());

        Double Rupee = dollarAmount * 60;

        Toast.makeText(this,  Rupee.toString() + " Rupees", Toast.LENGTH_LONG).show();


        Log.i("info", Rupee.toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}