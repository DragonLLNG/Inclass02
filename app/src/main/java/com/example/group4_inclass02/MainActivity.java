package com.example.group4_inclass02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.fivePercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText priceInput = findViewById(R.id.ticketPrice);
                String input = priceInput.getText().toString();
                TextView discountPercent = findViewById(R.id.percent);
                discountPercent.setText("5%");
                if (input.isEmpty() || Integer.parseInt(input) < 0) {
                    // toast error : incorrect value
                    Toast.makeText(MainActivity.this,"Enter valid price",Toast.LENGTH_LONG).show();
                }
                try {
                    double finalPrice = Double.parseDouble(input)*0.95;
                    TextView discountPrice = findViewById(R.id.discountPrice);
                    discountPrice.setText(String.format("%.2f",finalPrice));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.tenPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText priceInput = findViewById(R.id.ticketPrice);
                String input = priceInput.getText().toString();
                TextView discountPercent = findViewById(R.id.percent);
                discountPercent.setText("10%");
                if (input.isEmpty() || Integer.parseInt(input) < 0) {
                    // toast error : incorrect value
                    Toast.makeText(MainActivity.this,"Enter valid price",Toast.LENGTH_LONG).show();
                }
                try {
                    double finalPrice = Double.parseDouble(input)*0.90;
                    TextView discountPrice = findViewById(R.id.discountPrice);
                    discountPrice.setText(String.format("%.2f",finalPrice));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.fifteenPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText priceInput = findViewById(R.id.ticketPrice);
                String input = priceInput.getText().toString();
                TextView discountPercent = findViewById(R.id.percent);
                discountPercent.setText("15%");
                if (input.isEmpty() || Integer.parseInt(input) < 0) {
                    // toast error : incorrect value
                    Toast.makeText(MainActivity.this,"Enter valid price",Toast.LENGTH_LONG).show();
                }
                try {
                    double finalPrice = Double.parseDouble(input)*0.85;
                    TextView discountPrice = findViewById(R.id.discountPrice);
                    discountPrice.setText(String.format("%.2f",finalPrice));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.twentyPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText priceInput = findViewById(R.id.ticketPrice);
                String input = priceInput.getText().toString();
                TextView discountPercent = findViewById(R.id.percent);
                discountPercent.setText("20%");
                if (input.isEmpty() || Integer.parseInt(input) < 0) {
                    Toast.makeText(MainActivity.this,"Enter valid price",Toast.LENGTH_LONG).show();
                }
                try {
                    double finalPrice = Double.parseDouble(input)*0.80;
                    TextView discountPrice = findViewById(R.id.discountPrice);
                    discountPrice.setText(String.format("%.2f",finalPrice));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.fiftyPercent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText priceInput = findViewById(R.id.ticketPrice);
                String input = priceInput.getText().toString();
                TextView discountPercent = findViewById(R.id.percent);
                discountPercent.setText("50%");
                if (input.isEmpty() || Integer.parseInt(input) < 0) {
                    // toast error : incorrect value
                    Toast.makeText(MainActivity.this,"Enter valid price",Toast.LENGTH_LONG).show();
                }
                try {
                    double finalPrice = Double.parseDouble(input)*0.50;
                    TextView discountPrice = findViewById(R.id.discountPrice);
                    discountPrice.setText(String.format("%.2f",finalPrice));

                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
        findViewById(R.id.clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText priceInput = findViewById(R.id.ticketPrice);
                priceInput.setText("");
                TextView discountPercent = findViewById(R.id.percent);
                discountPercent.setText("");
                TextView discountPrice = findViewById(R.id.discountPrice);
                discountPrice.setText("");


            }
        });


    }


}