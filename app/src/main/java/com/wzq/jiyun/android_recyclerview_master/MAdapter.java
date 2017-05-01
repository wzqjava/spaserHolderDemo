package com.wzq.jiyun.android_recyclerview_master;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wzq.jiyun.android_recyclerview_master.tools.Tools;

import java.util.ArrayList;

/**
 * author:Created by WangZhiQiang on 2017/4/30.
 */

class MAdapter  extends BaseAdapter{
    private  ArrayList<String> datas;
    private  Context context;

    public MAdapter(Context context, ArrayList<String> datas) {
        this.datas = datas;
        this.context =context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity)context).getLayoutInflater().inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        TextView name = Tools.ViewHolder.get(convertView, android.R.id.text1);
        name.setText(datas.get(position));
        return convertView;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


}
