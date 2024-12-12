package com.example.gradecalculationapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editTextText);
        ed2 = findViewById(R.id.editTextText2);
        ed3 = findViewById(R.id.editTextText3);
        ed4 = findViewById(R.id.editTextText4);
        ed5 = findViewById(R.id.editTextText5);
        ed6 = findViewById(R.id.editTextText6);
        ed7 = findViewById(R.id.editTextText7);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marks();
            }

        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

    }
    public void marks()
    {

        int m1,m2,m3,total;
        double avg;
        String grade;
        m1 = Integer.parseInt(ed2.getText().toString());
        m2 = Integer.parseInt(ed3.getText().toString());
        m3 = Integer.parseInt(ed4.getText().toString());

        total = m1 + m2 + m3;
        ed5.setText(String.valueOf(total));
        avg = total/3;
        ed6.setText(String.valueOf(avg));

        if(avg >= 75)
        {
            ed7.setText("A");
        }
        else if(avg >= 65)
        {
            ed7.setText("B");
        }

        else if(avg >= 55)
        {
            ed7.setText("C");
        }


        else if(avg >= 40)
        {
            ed7.setText("S");
        }

        else
        {
            ed7.setText("Fail");
        }
    }

    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");
        ed7.setText("");

        ed1.requestFocus();

    }

}