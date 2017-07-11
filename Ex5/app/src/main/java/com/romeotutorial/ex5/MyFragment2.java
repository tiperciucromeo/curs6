package com.romeotutorial.ex5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by romeotiperciuc on 10/07/2017.
 */

public class MyFragment2 extends Fragment {

    private String title;
    private int page;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment2,container,false);
        return view;
    }

    public static MyFragment2 newInstance(int page, String title) {
        MyFragment2 fragment = new MyFragment2();
        Bundle args = new Bundle();
        args.putInt("someInt",page);
        args.putString("someTitle",title);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt",0);
        title = getArguments().getString("someTitle");
    }
}

