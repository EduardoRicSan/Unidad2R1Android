package mx.edu.utng.unidad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jesús Eduardo Rico Sandoval on 19/01/2017.
 */

public class SecondActivity extends AppCompatActivity {
    private EditText edtNumber1;
    private EditText edtNumber2;
    private Button btnCalculate;

    private TextView txvResult;
    private Button btnSecond;
    private Button btnFirst;
    private Button btnThird;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_two);

        edtNumber1=(EditText) findViewById(R.id.edt_valX);
        edtNumber2=(EditText) findViewById(R.id.edt_valY);
        btnCalculate=(Button)findViewById(R.id.btn_calculate);

        txvResult=(TextView) findViewById(R.id.txv_result);
        btnFirst=(Button)findViewById(R.id.btn_first);
        btnThird=(Button)findViewById(R.id.btn_third);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1=Double.parseDouble(edtNumber1.getText().toString());
                double number2=Double.parseDouble(edtNumber2.getText().toString());
                double result=0;

                result=(5*number1-2)*(2*number2-5) ;

                txvResult.setText(""+result);
            }
        });
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, ThirdActivity.class));
            }
        });

    }

}
