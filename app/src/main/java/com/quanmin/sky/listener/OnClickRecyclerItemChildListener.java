package com.quanmin.sky.listener;

import android.view.View;

/**
 * xiao
 *
 * 2017-01-07
 *
 */
public interface OnClickRecyclerItemChildListener {
    /**
     * item view 回调方法
     * @param view  被点击的view
     * @param position 索引值
     */
    void onItemChildClick(View view, int position);
}
