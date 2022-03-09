package com.example.pracc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TextView tv = findViewById(R.id.textView1);
    Button b1 =findViewById(R.id.button2);
    Button b =findViewById(R.id.button3);
    Button b3 =findViewById(R.id.button1);
    Button b2 =findViewById(R.id.button);
    Button b4 =findViewById(R.id.button4);
    Button b5 =findViewById(R.id.button5);
    EditText et = findViewById(R.id.editText1);

    b1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),
                    MainActivity2.class);
            startActivity(i);
        }
    });

    b.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),
                    MainActivity3.class);
            startActivity(i);
        }
    });

    b2.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            String s= et.getText().toString();

            Intent intent = new Intent(getApplicationContext(), MainActivity1.class);

            intent.putExtra("message_key", s);
            startActivity(intent);
        }
    });

    b3.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(intent);
        }
    });

    b4.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
            startActivity(intent);
        }
    });

    b5.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            startActivity(intent);
        }
    });
    }

}