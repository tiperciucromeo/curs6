package com.romeotutorial.ex03;

/**
 * Created by romeotiperciuc on 10/07/2017.
 */

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragment1 extends android.app.Fragment {

    FragmentManager manager;

    Button button1;
    Button button2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment,container,false);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        manager = getFragmentManager();
        button1 = getActivity().findViewById(R.id.button2);
        button2 = getActivity().findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                MyFragment2 myFragment2 = new MyFragment2();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.group,myFragment2,"2");

                transaction.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyFragment3 myFragment3 = new MyFragment3();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.group,myFragment3,"3");

                transaction.commit();
            }
        });
    }


}
