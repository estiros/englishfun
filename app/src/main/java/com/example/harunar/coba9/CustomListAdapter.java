package com.example.harunar.coba9;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Harun Ar on 10/02/2018.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] textView;
    private final Integer[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, String[] textView, Integer[] imgid) {
        super(context, R.layout.list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.textView=textView;
        this.imgid=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.textView1);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(itemname[position]);
        txtTitle2.setText(textView[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    };
}
