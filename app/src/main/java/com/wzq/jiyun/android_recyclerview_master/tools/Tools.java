package com.wzq.jiyun.android_recyclerview_master.tools;

import android.util.SparseArray;
import android.view.View;

/**
 * author:Created by WangZhiQiang on 2017/4/30.
 */

public class Tools {
    public static class ViewHolder {
        public static <T extends View> T get(View view, int id) {
            SparseArray<View> sparseArray = (SparseArray<View>) view.getTag();
            if (sparseArray == null) {
                sparseArray = new SparseArray<View>();
                view.setTag(sparseArray);
            }
            View childView = sparseArray.get(id);
            if (childView == null) {
                childView = view.findViewById(id);
                //把每个childView存数spaserArray
                sparseArray.put(id, childView);
            }
            return (T) childView;
        }
    }

}
