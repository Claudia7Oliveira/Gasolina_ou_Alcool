package com.example.claudia.gasxalcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText pAlcool;
    private EditText pGasolina;
    private Button btnCalcula;
    private TextView txtMostra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**/
        pAlcool = findViewById(R.id.alcool);
        pGasolina = findViewById(R.id.gasolina);
        btnCalcula = findViewById(R.id.btnCompara);
        txtMostra = findViewById(R.id.resultado);
        /**/
        btnCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String precoAlcool = pAlcool.getText().toString();
                String precoGas = pGasolina.getText().toString();
                /**/
                double valAcool = Double.parseDouble(precoAlcool);
                double valGas = Double.parseDouble(precoGas);
                /**/
                double resultado;
                resultado = valAcool / valGas;
                /**/
                /*na atual situação economica é mais em conta um cavalo*/
                if (resultado >= 0.7){
                    txtMostra.setText(" GASOLINA ");
                }else {
                    txtMostra.setText(" ÁLCOOL ");
                }

            }
        });



    }
}
