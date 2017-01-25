package mx.edu.utng.unidad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtValX;
    private EditText edtValY;
    private Button btnCalculate;

    private TextView txvResult;
    private Button btnSecond;
    private Button btnThird;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValX=(EditText) findViewById(R.id.edt_valX);
        edtValY=(EditText) findViewById(R.id.edt_valY);
        btnCalculate=(Button)findViewById(R.id.btn_calculate);
        txvResult=(TextView) findViewById(R.id.txv_result);
        btnSecond=(Button)findViewById(R.id.btn_second);
        btnThird=(Button)findViewById(R.id.btn_third);

            btnCalculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    float number1=Float.parseFloat(edtValX.getText().toString());
                    float number2=Float.parseFloat(edtValY.getText().toString());
                    float result=0;

                    result=(2*number1+1)*(3*number2-4) ;

                    txvResult.setText(""+result);
                }
            });

                btnSecond.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                            startActivity(new Intent(MainActivity.this, SecondActivity.class));
                    }
                });
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });


    }
}
