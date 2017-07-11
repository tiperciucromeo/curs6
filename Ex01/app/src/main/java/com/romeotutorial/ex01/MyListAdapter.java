package com.romeotutorial.ex01;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by romeotiperciuc on 05/07/2017.
 */

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] appTexts;
    private final Integer [] appImages;

    public MyListAdapter(Activity context, String[] appTexts, Integer[] appImages) {
        super(context, R.layout.mylist,appTexts);
        this.context = context;
        this.appTexts = appTexts;
        this.appImages = appImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist,null,true);
        TextView txtView = (TextView) rowView.findViewById(R.id.textView);
        ImageView imgView = (ImageView) rowView.findViewById(R.id.imageView);
        txtView.setText(appTexts[position]);
        imgView.setImageResource(appImages[position]);





        return rowView;
    }
}
