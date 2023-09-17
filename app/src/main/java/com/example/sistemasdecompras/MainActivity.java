package com.example.sistemasdecompras;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox_Arroz;
    private CheckBox checkBox_Leite;
    private CheckBox checkBox_Carne;
    private CheckBox checkBox_Feijao;
    private CheckBox checkBox_RefrigeranteCola;
    private double TotalCompra;

    private double valorArroz = 2.69;
    private double valorLeite = 5.0;
    private double valorCarne = 10.0;
    private double valorFeijao = 2.30;
    private double valorRefrigeranteCola = 2.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox_Arroz = findViewById(R.id.checkBox_Arroz);
        checkBox_Leite = findViewById(R.id.checkBox_Leite);
        checkBox_Carne = findViewById(R.id.checkBox_Carne);
        checkBox_Feijao = findViewById(R.id.checkBox_Feijao);
        checkBox_RefrigeranteCola = findViewById(R.id.checkBox_Refrigerante_Cola);

        // Configurar ouvintes de clique para os CheckBox
        checkBox_Arroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });

        checkBox_Leite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });

        checkBox_Carne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });

        checkBox_Feijao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });

        checkBox_RefrigeranteCola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });
    }

    private void calcularTotal() {
        TotalCompra = 0.0;

        if (checkBox_Arroz.isChecked()) {
            TotalCompra += valorArroz;
        }
        if (checkBox_Leite.isChecked()) {
            TotalCompra += valorLeite;
        }
        if (checkBox_Carne.isChecked()) {
            TotalCompra += valorCarne;
        }
        if (checkBox_Feijao.isChecked()) {
            TotalCompra += valorFeijao;
        }
        if (checkBox_RefrigeranteCola.isChecked()) {
            TotalCompra += valorRefrigeranteCola;
        }

        // Formate o valor para exibir apenas 7 caracteres
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotal = df.format(TotalCompra);

        Toast.makeText(this, "Valor total da compra: R$" + formattedTotal, Toast.LENGTH_SHORT).show();
    }
}
