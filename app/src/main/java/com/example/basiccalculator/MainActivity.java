package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText num1text, num2text;
    TextView outputview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1text=findViewById(R.id.FirstNumberEditTextID);
        num2text=findViewById(R.id.SecondNumberEditTextID);
        outputview=findViewById(R.id.outputviewId);
    }

    public void CalculateFunction(View view) {
        double num1, num2, result, res;
        num1=Double.parseDouble(num1text.getText().toString());
        num2=Double.parseDouble(num2text.getText().toString());
        if(view.getId()==R.id.addBtnID){
            result=num1+num2;
        }
        else if(view.getId()==R.id.subBtnID){
            result=num1-num2;
        }
        else if(view.getId()==R.id.multiBtnID){
            result=num1*num2;

        }
        else{
            result=num1/num2;
        }
        res =Double.parseDouble(new DecimalFormat("##.##").format(result));
        outputview.setText((""+res));
    }
}