package com.example.pracc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        Button b1 =findViewById(R.id.bt1);
        Button b =findViewById(R.id.bt);
        EditText et1 = findViewById(R.id.et);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(i);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String s= et1.getText().toString();
                Pattern p = Pattern.compile("(0|91)?[0-9][0-9]{9}");
                Matcher m = p.matcher(s);

                if (m.find() && m.group().equals(s)){
                Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG)
                        .show();

                Uri u = Uri.parse("tel:" + s);
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Enter correct number", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
    }

}