package com.example.landscapelist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    String[] listLandscapes;
    int[] listImages;
    LayoutInflater inflater;
    public CustomBaseAdapter(Context ctx, String [] landscapeList, int[] landscapeImages)
    {
        this.context = ctx;
        this.listLandscapes = landscapeList;
        this.listImages = landscapeImages;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_landscape_list, null);
        TextView landscapeTextView = (TextView)convertView.findViewById(R.id.landscapeText);
        ImageView landscapeImageView = (ImageView) convertView.findViewById(R.id.imageIcon);

        landscapeTextView.setText(listLandscapes[position]);
        landscapeImageView.setImageResource(listImages[position]);
        return convertView;
    }
}
