package com.romeotutorial.ex03;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        MyFragment1 myFragment1 = new MyFragment1();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, myFragment1, "1");
        transaction.commit();

    }
}
