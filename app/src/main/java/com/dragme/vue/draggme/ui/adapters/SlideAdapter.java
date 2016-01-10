package com.dragme.vue.draggme.ui.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dragme.vue.draggme.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SlideAdapter extends BaseAdapter {
    LayoutInflater inflater;
    List<String> optionsList;
    public SlideAdapter(LayoutInflater inflater,Context context){
        this.inflater = inflater;
        Resources res = context.getResources();
        optionsList =  Arrays.asList(res.getStringArray(R.array.slider_options));
    }
    @Override
    public int getCount() {
        return optionsList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if(convertView == null){
            holder =new Holder();
            convertView =  inflater.inflate( R.layout.slide_adapter_view,null);
            holder.holderTextView = (TextView)convertView.findViewById(R.id.slide_tv_id);
            convertView.setTag(holder);
        }
        holder = (Holder)convertView.getTag();
        holder.holderTextView.setText(optionsList.get(position));
        return convertView;
    }

    private class Holder{
        TextView holderTextView;
    }
}
