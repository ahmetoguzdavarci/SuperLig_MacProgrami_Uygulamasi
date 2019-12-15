package com.ahmetoguzdavarci.superlig;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TakimAdapter extends BaseAdapter {

    ArrayList<Takim> takimArrayList=new ArrayList<>();
    Activity activity= new Activity();

    public TakimAdapter(ArrayList<Takim> takimArrayList, Activity activity) {
        this.takimArrayList = takimArrayList;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return takimArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return takimArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(activity).inflate(R.layout.custom_listview_row, parent, false);

        TextView tv_takimAdi = convertView.findViewById(R.id.tv_takimAdi);
        TextView tv_teknikDirektor = convertView.findViewById(R.id.tv_teknikDirektor);
        ImageView iv_takimResim = convertView.findViewById(R.id.iv_takimResim);

        Takim takim= takimArrayList.get(position);
        tv_takimAdi.setText(takim.getTakimAdi());
        tv_teknikDirektor.setText(takim.getTeknikDirektor());
        iv_takimResim.setImageResource(takim.getBayrak());

        return convertView;
    }
}
