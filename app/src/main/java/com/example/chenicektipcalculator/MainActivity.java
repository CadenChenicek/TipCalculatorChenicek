package com.example.chenicektipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTip(View v){
        DecimalFormat hundreth = new DecimalFormat("##.00");
        EditText numTotalBill = (EditText) findViewById(R.id.billTotal);
        EditText numPercent = (EditText) findViewById(R.id.tipPercent);
        TextView tipText = (TextView) findViewById(R.id.tipText);
        TextView totalText = (TextView) findViewById(R.id.totalText);
        RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.simpleRatingBar);

        double numTotal = Double.parseDouble(numTotalBill.getText().toString());
        double percent = Integer.parseInt(numPercent.getText().toString());

        double tip = (percent/100) * numTotal;
        double afterTip = numTotal + tip;

        tipText.setText("Tip: $" + hundreth.format(tip));
        totalText.setText("Total: $" + hundreth.format(afterTip));
    }
}
