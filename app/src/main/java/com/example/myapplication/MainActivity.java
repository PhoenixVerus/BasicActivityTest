package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewCount;
    Integer count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewCount = findViewById(R.id.textViewShowCount);
    }

    public void showToast(View view){
        Toast toast = Toast.makeText(this,"Hello There", Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view){
        count = count + 1;
        textViewCount.setText(count.toString());
    }
}