package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView tvUP, tvResult;
    EditText txtFirst, txtSecond, txtThird, txtResult;
    Button btnAdd, btnSub, btnDiv, btnMult, btnRem, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUP=(TextView)findViewById(R.id.tvUP);
        tvResult=(TextView)findViewById(R.id.tvResult);

        txtFirst=(EditText) findViewById(R.id.txtThird);
        txtSecond=(EditText) findViewById(R.id.txtSecond);
        txtThird=(EditText) findViewById(R.id.txtFirst);
        txtResult=(EditText) findViewById(R.id.txtResult);

        btnAdd=(Button) findViewById(R.id.btnAdd);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnDiv=(Button) findViewById(R.id.btnDiv);
        btnMult=(Button) findViewById(R.id.btnMult);
        btnRem=(Button) findViewById(R.id.btnRem);
        btnClose=(Button) findViewById(R.id.btnClose);



        // Addition
        btnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        if (txtFirst.getText().toString().equals("")|| txtSecond.getText().toString().equals("") || txtThird.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this,"Please enter numbers to calculate.", Toast.LENGTH_SHORT).show();
        }
        else{
            txtFirst.getText().toString();
            txtSecond.getText().toString();
            txtThird.getText().toString();
            double n1=Double.valueOf(txtFirst.getText().toString());
            double n2=Double.valueOf(txtSecond.getText().toString());
            double n3=Double.valueOf(txtThird.getText().toString());
            double res;
            res=(n1 + n2) + n3;
            txtResult.setText(String.valueOf(res));


            txtFirst.setText("");
            txtSecond.setText("");
            txtThird.setText("");

        }
        }
    });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtFirst.getText().toString().equals("")|| txtSecond.getText().toString().equals("") || txtThird.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter numbers to calculate.", Toast.LENGTH_SHORT).show();
                }
                else{
                    txtFirst.getText().toString();
                    txtSecond.getText().toString();
                    txtThird.getText().toString();
                    double n1=Double.valueOf(txtFirst.getText().toString());
                    double n2=Double.valueOf(txtSecond.getText().toString());
                    double n3=Double.valueOf(txtThird.getText().toString());
                    double res;
                    res=(n3-n2)-n1;
                    txtResult.setText(String.valueOf(res));

                    txtFirst.setText("");
                    txtSecond.setText("");
                    txtThird.setText("");
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtFirst.getText().toString().equals("")|| txtSecond.getText().toString().equals("") || txtThird.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter numbers to calculate.", Toast.LENGTH_SHORT).show();
                }
                else{
                    txtFirst.getText().toString();
                    txtSecond.getText().toString();
                    txtThird.getText().toString();
                    double n1=Double.valueOf(txtFirst.getText().toString());
                    double n2=Double.valueOf(txtSecond.getText().toString());
                    double n3=Double.valueOf(txtThird.getText().toString());
                    double res;
                    res=(n1*n2)*n3;
                    txtResult.setText(String.valueOf(res));

                    txtFirst.setText("");
                    txtSecond.setText("");
                    txtThird.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtFirst.getText().toString().equals("")|| txtSecond.getText().toString().equals("") || txtThird.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter numbers to calculate.", Toast.LENGTH_SHORT).show();
                }
                else{
                    txtFirst.getText().toString();
                    txtSecond.getText().toString();
                    txtThird.getText().toString();
                    double n1=Double.valueOf(txtFirst.getText().toString());
                    double n2=Double.valueOf(txtSecond.getText().toString());
                    double n3=Double.valueOf(txtThird.getText().toString());
                    double res;
                    res=(n1/n2)/n3;
                    txtResult.setText(String.valueOf(res));

                    txtFirst.setText("");
                    txtSecond.setText("");
                    txtThird.setText("");
                }
            }
        });
        btnRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtFirst.getText().toString().equals("")|| txtSecond.getText().toString().equals("") || txtThird.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this,"Please enter numbers to calculate.", Toast.LENGTH_SHORT).show();
                }
                else{
                    txtFirst.getText().toString();
                    txtSecond.getText().toString();
                    txtThird.getText().toString();
                    double n1=Double.valueOf(txtFirst.getText().toString());
                    double n2=Double.valueOf(txtSecond.getText().toString());
                    double n3=Double.valueOf(txtThird.getText().toString());
                    double res;
                    res=(n1%n2)%n3;
                    txtResult.setText(String.valueOf(res));

                    txtFirst.setText("");
                    txtSecond.setText("");
                    txtThird.setText("");
                }
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack( true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit( 1);
            }
        });
}
}