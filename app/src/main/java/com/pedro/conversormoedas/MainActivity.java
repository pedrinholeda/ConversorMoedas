package com.pedro.conversormoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

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

        this.mViewHolder.buttonCalculate.setOnClickListener(this);

        this.clearValues();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_calculate){
            String value = this.mViewHolder.editValue.getText().toString();
            if("".equals(value)) {
                //mostrar mensagem pro usuario
                Toast.makeText(this,this.getString( R.string.informe_valor),Toast.LENGTH_LONG).show();

            } else {

            }
        }
    }

    private void clearValues(){
        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");

    }

    private static class ViewHolder {
    EditText editValue;
    TextView textDolar;
    TextView textEuro;
    Button buttonCalculate;
    }
}
