package mx.edu.utng.unidad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jesús Eduardo Rico Sandoval on 24/01/2017.
 */

public class ThirdActivity extends AppCompatActivity{
    private EditText edtNumber1;
    private Button btnCalculate;

    private TextView txvResult;
    private Button btnFirst;
    private Button btnSecond;


    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excersice_three);

        edtNumber1=(EditText) findViewById(R.id.edt_valX);
        btnCalculate=(Button)findViewById(R.id.btn_calculate);

        txvResult=(TextView) findViewById(R.id.txv_result);
        btnFirst=(Button)findViewById(R.id.btn_first);
        btnSecond=(Button)findViewById(R.id.btn_second);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1=Double.parseDouble(edtNumber1.getText().toString());
                double resultF=0;
                double result1=0;
                double result2=0;
                double result3=0;

                result1=(number1 + 2 *(3-5*number1));
                result2=5 * result1;
                result3=(number1*number1) - result2;
                resultF= 3 * result3;


                txvResult.setText(""+resultF);
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, SecondActivity.class));
            }
        });
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThirdActivity.this, MainActivity.class));
            }
        });


    }
    }

