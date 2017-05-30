package com.primawan.pengayaan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterNama extends BaseAdapter {
    Context context;
    ArrayList<String> listNama;

    public AdapterNama(Context context, ArrayList<String> listNama) {
        this.context = context;
        this.listNama = listNama;
    }

    @Override
    public int getCount() {
        return listNama.size();
    }

    @Override
    public Object getItem(int position) {
        return listNama.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewNama = convertView;
        if (viewNama == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewNama = inflater.inflate(R.layout.list_nama, null);
        }

        TextView namaText = (TextView) viewNama.findViewById(R.id.textNama);
        String nama = listNama.get(position);
        namaText.setText(nama);

        return viewNama;
    }

}
