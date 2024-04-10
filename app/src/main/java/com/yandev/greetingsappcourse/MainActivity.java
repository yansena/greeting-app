package com.yandev.greetingsappcourse;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button myButton;
    TextView title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        myButton = findViewById(R.id.button);
        title = findViewById(R.id.title);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                String inputName = editText.getText().toString();

                Toast.makeText(MainActivity.this, "Wellcome " + inputName + " to our app", Toast.LENGTH_SHORT).show();
            }
        });

    }
}