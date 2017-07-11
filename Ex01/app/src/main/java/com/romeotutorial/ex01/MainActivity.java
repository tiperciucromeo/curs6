package com.romeotutorial.ex01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    public static Integer [] MyImages = {R.drawable.romania,R.drawable.franta,R.drawable.italia,R.drawable.grecia,R.drawable.spania,
            R.drawable.anglia,R.drawable.germania,R.drawable.ungaria,R.drawable.bulgaria,R.drawable.croatia};
    public static String [] MyTexts = {"Romania", "Franta", "Italia","Grecia", "Spania", "Anglia","Germania","Ungaria",
            "Bulgaria","Croatia"};


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(this,MyTexts,MyImages);
        listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}