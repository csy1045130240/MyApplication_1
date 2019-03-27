package com.example.myapplication_1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalAdapter extends ArrayAdapter<Animal> {
    Context context;
    int layoutResourceId;
    Animal data[] = null;
    public AnimalAdapter(Context context, int layoutResourceId, Animal[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        AnimalHolder holder = null;
        if(row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            holder = new AnimalHolder();
            holder.txtTitle = (TextView) row.findViewById(R.id.txtTitle);
            holder.imgIcon = (ImageView) row.findViewById(R.id.imgIcon);
            row.setTag(holder);
        }else{
            holder = (AnimalHolder)row.getTag();
        }
        Animal animal = data[position];
        holder.txtTitle.setText(animal.name);
        holder.imgIcon.setImageResource(animal.icon);
        return row;
    }
    static class AnimalHolder
    {
        TextView txtTitle;
        ImageView imgIcon;
    }
}
