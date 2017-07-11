package com.romeotutorial.ex2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btn1 = (Button) findViewById(R.id.button21);
        Button btn2 = (Button) findViewById(R.id.button22);
        Button btn3 = (Button) findViewById(R.id.button23);
        TextView textView = (TextView) findViewById(R.id.textview3);

        String text = getIntent().getStringExtra("text");
        textView.setText("Am venit de pe activitatea " + text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(activity_third.this,MainActivity.class);
                int1.putExtra("text","third");
                startActivity(int1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(activity_third.this,second.class);
                int2.putExtra("text","third");
                startActivity(int2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(activity_third.this,activity_four.class);
                int3.putExtra("text","third");
                startActivity(int3);
            }
        });
    }
}