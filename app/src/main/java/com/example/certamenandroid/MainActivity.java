package com.example.certamenandroid;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.TextView;

import java.util.Random;



public class MainActivity extends AppCompatActivity{

    private Button btnGenerar;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnC;
    private Button btnMultiplicar;
    private Button btnDividir;
    private Button btnResultadoPar;
    private Button btnResultadoPrimo;

    private String operadorAux = "";
    private Double operatation;


    public Random rm = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rm.nextDouble();
        btnGenerar = (Button) findViewById(R.id.btnGenerar);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnC = (Button) findViewById(R.id.btnC);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnResultadoPar = (Button) findViewById(R.id.btnResultPar);
        btnResultadoPrimo = (Button) findViewById(R.id.btnResultPrimo);

        final TextView contentResult = (TextView) findViewById(R.id.contetResultado);
        final TextView resultadoPrimoPar = (TextView) findViewById(R.id.resultadoPrimoPAr);
        final TextView numRigth = (TextView) findViewById(R.id.numRght);
        final TextView numLeft = (TextView) findViewById(R.id.numLeft);
        final TextView operador = (TextView) findViewById(R.id.operador);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numRigth.setText(String.valueOf(rm.nextDouble()));
                numLeft.setText(String.valueOf(rm.nextDouble()));
            }
        });

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadorAux = "+";
                operador.setText("+");

                if(numRigth.equals("N1") && numLeft.equals("N2")){
                    contentResult.setText("ERROR");
                }else{
                    operatation = Double.parseDouble(String.valueOf(numLeft.getText())) + Double.parseDouble(String.valueOf(numRigth.getText()));
                    contentResult.setText(String.valueOf(operatation));
                }
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadorAux = "+";
                operador.setText("-");

                if(numRigth.equals("N1") && numLeft.equals("N2")){
                    contentResult.setText("ERROR");
                }else{
                    operatation = Double.parseDouble(String.valueOf(numLeft.getText())) - Double.parseDouble(String.valueOf(numRigth.getText()));
                    contentResult.setText(String.valueOf(operatation));
                }
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadorAux = "+";
                operador.setText("X");

                if(numRigth.equals("N1") && numLeft.equals("N2")){
                    contentResult.setText("ERROR");
                }else{
                    operatation = Double.parseDouble(String.valueOf(numLeft.getText())) * Double.parseDouble(String.valueOf(numRigth.getText()));
                    contentResult.setText(String.valueOf(operatation));
                }
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadorAux = "+";
                operador.setText("/");

                if(numRigth.equals("N1") && numLeft.equals("N2")){
                    contentResult.setText("ERROR");
                }else{
                    operatation = Double.parseDouble(String.valueOf(numLeft.getText())) / Double.parseDouble(String.valueOf(numRigth.getText()));
                    contentResult.setText(String.valueOf(operatation));
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadorAux = "";
                operador.setText("?");

                numLeft.setText("N1");
                numRigth.setText("N2");


            }
        });


    }

}
