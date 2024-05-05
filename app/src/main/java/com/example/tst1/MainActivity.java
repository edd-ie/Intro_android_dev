package com.example.tst1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.submitBtn), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


    }

    @SuppressLint("SetTextI18n")
    public void handleBtnClick(View view) {
        TextView txt = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);

        EditText name = findViewById(R.id.nameTab);
        EditText pass = findViewById(R.id.passTab);
        EditText mail = findViewById(R.id.emailTab);

        String[] data = {name.getText().toString(), pass.getText().toString(), mail.getText().toString()};

        if (data[0].isEmpty()||data[1].isEmpty()||data[2].isEmpty()){
            txt.setText("Error!!");
            txt2.setText("Please fill in all the fields");
        }
        else{
            txt.setText("Hello "+data[0]);
            txt2.setText("Mail: "+data[2]);
        }


    }
}