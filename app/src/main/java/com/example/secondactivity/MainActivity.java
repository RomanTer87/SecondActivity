package com.example.secondactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextname;
    EditText editTextage;
    Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       button = findViewById(R.id.button);
       editTextname = findViewById(R.id.edit_text_name);
       editTextage = findViewById(R.id.edit_text_age);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            String strName = editTextname.getText().toString();
            String age = editTextage.getText().toString();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("name", strName);
            intent.putExtra("age", age);
            startActivity(intent);
           }
       });

    }
}