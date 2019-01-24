package com.naman.mcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class EntryForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }
    public void buttonClicked(View v){
        EditText prinView = (EditText) findViewById(R.id.prinBox);
        String prin = prinView.getText().toString();
        EditText amortView = (EditText) findViewById(R.id.amortBox);
        String amort = amortView.getText().toString();
        EditText intrestView = (EditText) findViewById(R.id.intrestBox);
        String intrest = intrestView.getText().toString();

        MortgageModel myModel = new MortgageModel(prin,amort,intrest);
        String myMortgage = myModel.computePayment();

        ((TextView)findViewById(R.id.answer)).setText(myMortgage);

    }
}
