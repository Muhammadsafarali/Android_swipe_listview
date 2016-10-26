package ru.norbit.myswipelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by safarali.alisultanov on 26.10.2016.
 */

public class mAdapter extends BaseAdapter {

    private String[] countries;
    private LayoutInflater inflater;

    public mAdapter(Context context) {
        inflater = LayoutInflater.from(context);
        countries = context.getResources().getStringArray(R.array.countries);
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int i) {
        return countries[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = inflater.inflate(R.layout.row, parent, false);
        }
        TextView txView = (TextView)view.findViewById(R.id.text);
        txView.setText(countries[position]);

        return view;
    }
}
