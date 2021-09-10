package com.example.calculator_123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num_1;
    EditText num_2;
    TextView total;
    Button bt1;
    Button  bt2;
    Button  bt3;
    Button  bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num_1 = findViewById(R.id.my_input);
        num_2 = findViewById(R.id.my_input_2);
        total = findViewById(R.id.output);
        bt1 = findViewById(R.id.My_button_1);
        bt2 = findViewById(R.id.My_button_2);
        bt3 = findViewById(R.id.My_button_3);
        bt4 = findViewById(R.id.My_button_4);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double userinput_3 = getInput(num_1) + getInput(num_2);
                total.setText(getInput(num_1)+" + "+getInput(num_2)+ " : = "+ userinput_3);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double userinput_3 = getInput(num_1) - getInput(num_2);
                total.setText(getInput(num_1)+" - "+getInput(num_2) +" : = "+ userinput_3);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double userinput_3 = getInput(num_1) * getInput(num_2);
                total.setText(getInput(num_1)+" * "+getInput(num_2) +"  : = "+ userinput_3);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double userinput_3 = getInput(num_1) / getInput(num_2);
                total.setText(getInput(num_1)+" / "+getInput(num_2) +"  : = "+ userinput_3);
            }
        });
    }
    public  int getInput(EditText editText){

        return Integer.parseInt(editText.getText().toString());
    }

}