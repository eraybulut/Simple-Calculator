package com.eraybulut.learninv1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.eraybulut.learninv1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim= DataBindingUtil.setContentView(this,R.layout.activity_main);

        tasarim.result.setText("0");

    }
    public void plus(View view){

        if(tasarim.numberTwo.getText().toString().matches("")&&tasarim.numberTwo.getText().toString().matches("")){
            tasarim.result.setText("Don't leave blank");
        }
        else{
        String s1=tasarim.numberOne.getText().toString();
        String s2=tasarim.numberTwo.getText().toString();

        int sa1=Integer.parseInt(s1);
        int sa2=Integer.parseInt(s2);

        int sonuc=sa1+sa2;

        tasarim.result.setText(String.valueOf(sonuc));}
    }
    public void multi(View view){
        if(tasarim.numberTwo.getText().toString().matches("")&&tasarim.numberTwo.getText().toString().matches("")){
            tasarim.result.setText("Don't leave blank");
        }else {

            String c1 = tasarim.numberOne.getText().toString();
            String c2 = tasarim.numberTwo.getText().toString();

            int ca1 = Integer.parseInt(c1);
            int ca2 = Integer.parseInt(c2);
            int sonucc = ca1 * ca2;
            tasarim.result.setText(String.valueOf(sonucc));
        }
    }
    public void dvide(View view){
        if(tasarim.numberTwo.getText().toString().matches("")&&tasarim.numberTwo.getText().toString().matches("")){
            tasarim.result.setText("Don't leave blank");
        }else {
        String b1=tasarim.numberOne.getText().toString();
        String b2=tasarim.numberTwo.getText().toString();

        int bo1=Integer.parseInt(b1);
        int bo2=Integer.parseInt(b2);

        int sonucb=bo1/bo2;

        tasarim.result.setText(String.valueOf(sonucb));}
    }
    public void minus(View view){
        if(tasarim.numberTwo.getText().toString().matches("")&&tasarim.numberTwo.getText().toString().matches("")){
            tasarim.result.setText("Don't leave blank");
        }else {

        String c1=tasarim.numberOne.getText().toString();
        String c2=tasarim.numberTwo.getText().toString();

        int ci1=Integer.parseInt(c1);
        int ci2=Integer.parseInt(c2);

        int sonucb=ci1-ci2;

        tasarim.result.setText(String.valueOf(sonucb));}
    }

    public void help(View view){
        AlertDialog.Builder alert =new AlertDialog.Builder(this);
        alert.setTitle("Help ?");
        alert.setMessage("Only Simple Calculator you can do");
        alert.show();
    }
    public void tr(View view){
        tasarim.buttonTo.setText("TOPLAMA");
        tasarim.buttonCar.setText("ÇARPMA");
        tasarim.buttonTo2.setText("ÇIKARMA");
        tasarim.buttonTo3.setText("BÖLME");
    }
    public void en(View view){
        tasarim.buttonTo.setText("PLUS");
        tasarim.buttonCar.setText("MULTİPLY");
        tasarim.buttonTo2.setText("MİNUS");
        tasarim.buttonTo3.setText("DVİDED");

    }

}