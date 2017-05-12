package com.nabilla.task1;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    EditText edt_income, edt_outcome;
    TextView txtBalance;
    String income;
    String outcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab);

        edt_income = (EditText) findViewById(R.id.edt_income);
        edt_outcome = (EditText) findViewById(R.id.edt_outcome);
        txtBalance = (TextView) findViewById(R.id.tv_balance);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                income = edt_income.getText().toString();
                outcome = edt_outcome.getText().toString();

                if (income.isEmpty()){
                    income = "0";
                }else if(outcome.isEmpty()){
                    outcome = "0";
                }

                if(!income.equals("") && !outcome.equals("")){
                    Long jumlah = Long.parseLong(income) +
                            Long.parseLong(outcome);
                    txtBalance.setText("Balance : "+String.valueOf(jumlah));
                }else{
                    Toast.makeText(MainActivity.this, "Fill data!", Toast.LENGTH_SHORT).show();
                }

            }
        });


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            edt_income.setShowSoftInputOnFocus(false);
            edt_outcome.setShowSoftInputOnFocus(false);
        }
    }

    public void btnDellAll(View view) {
        edt_income.setText("");
        edt_outcome.setText("");
    }

    public void btnDellOne(View view) {
        if (edt_income.hasFocus()){
            String dialled_nos = edt_income.getText().toString();
            int remove_index_position = edt_income.getSelectionStart()-1;
            StringBuilder dialled_nos_builder = new StringBuilder(dialled_nos);
            if(remove_index_position>=0) {
                dialled_nos_builder.deleteCharAt(remove_index_position);
                edt_income.setText(dialled_nos_builder.toString());
                edt_income.setSelection(remove_index_position);
            }
        }else{
            String dialled_nos = edt_outcome.getText().toString();
            int remove_index_position = edt_outcome.getSelectionStart()-1;
            StringBuilder dialled_nos_builder = new StringBuilder(dialled_nos);
            if(remove_index_position>=0) {
                dialled_nos_builder.deleteCharAt(remove_index_position);
                edt_outcome.setText(dialled_nos_builder.toString());
                edt_outcome.setSelection(remove_index_position);
            }
        }

    }

    public void btnOne(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "1");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "1");
        }
    }

    public void btnTwo(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "2");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "2");
        }
    }

    public void btnThree(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "3");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "3");
        }
    }

    public void btnFour(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "4");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "4");
        }
    }

    public void btnFive(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "5");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "5");
        }
    }

    public void btnSix(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "6");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "6");
        }
    }

    public void btnSeven(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "7");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "7");
        }
    }

    public void btnEight(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "8");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "8");
        }
    }

    public void btnNine(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "9");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "9");
        }
    }

    public void btnZero(View view) {
        if (edt_income.hasFocus()){
            edt_income.getText().insert(edt_income.getSelectionStart(), "0");
        }else{
            edt_outcome.getText().insert(edt_outcome.getSelectionStart(), "0");
        }
    }
}
