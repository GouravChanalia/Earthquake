package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentItem = getItem(position);

        TextView magTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magTextView.setText("" + currentItem.getmMagnitude());

        TextView locTextView = (TextView) listItemView.findViewById(R.id.location);
        locTextView.setText("" + currentItem.getmLocation());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time);
        timeTextView.setText("" + currentItem.getmTime());

        return listItemView;
    }
}
