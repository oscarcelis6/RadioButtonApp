package com.oscarcelis.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = findViewById(R.id.rb1);
        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio1();
            }
        });

        rb2 = findViewById(R.id.rb2);
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio2();
            }
        });

        rb3 = findViewById(R.id.rb3);
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio3();
            }
        });

        rb4 = findViewById(R.id.rb4);
        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio4();
            }
        });

        rb5 = findViewById(R.id.rb5);
        rb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radio5();
            }
        });



    }

    private void radio5() {
        Toast.makeText(this, "Su estado civil es " + rb5.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    private void radio4() {
        Toast.makeText(this, "Su estado civil es " + rb4.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    private void radio3() {
        Toast.makeText(this, "Su estado civil es " + rb3.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    private void radio2() {
        Toast.makeText(this, "Su estado civil es " + rb2.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    private void radio1(){
        Toast.makeText(this, "Su estado civil es " + rb1.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
