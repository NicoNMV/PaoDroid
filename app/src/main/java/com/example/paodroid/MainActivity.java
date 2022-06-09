package com.example.paodroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;

    TextView result;

    int n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.Numero1);

        edit2 = findViewById(R.id.Numero2);

        result = findViewById(R.id.Result);
    }

    public void Calcula(View view) {
        n1 = Integer.parseInt(edit1.getText().toString());

        n2 = Integer.parseInt(edit2.getText().toString());

        int r = n1 + n2;

        result.setText(Integer.valueOf(r));
    }



}