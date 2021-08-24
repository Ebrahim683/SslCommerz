package com.example.sslcommerze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText et;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et = findViewById(R.id.ed);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(v->{
            String amount = et.getText().toString().trim();
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("amount",amount);
            startActivity(intent);
        });
    }
}