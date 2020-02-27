package com.pedro.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ViewHolder
        this.mViewHolder.editValue = findViewById(R.id.edit_valor);
        this.mViewHolder.textDolar= findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.button_calculate);
    }

    private static class ViewHolder {
    EditText editValue;
    TextView textDolar;
    TextView textEuro;
    Button buttonCalculate;
    }
}
