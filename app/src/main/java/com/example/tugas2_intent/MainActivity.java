package com.example.tugas2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Main Activity");

        Button click = findViewById(R.id.btnClickMe);
        EditText editNameReceive = findViewById(R.id.editName);

        click.setOnClickListener(view -> {
            if (editNameReceive.length() == 0)
                Toast.makeText(this, "Username belum diinput", Toast.LENGTH_LONG).show();
            else {
                Toast.makeText(this, "Haiii...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, SecondActivity.class);
                String users = editNameReceive.getText().toString();
                intent.putExtra("Name", users);
                startActivity(intent);
            }
        });
    }

}