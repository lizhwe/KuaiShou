package com.lzw.kuaishou.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lzw.kuaishou.R;

/**
 * Created by 李志伟 on 2016/11/16 11:39
 * E-mail: 913582589@qq.com
 */

public class LoveViewHolder extends RecyclerView.ViewHolder{

    private ImageView mLoveImage;
    private TextView mLoveTV;

    /**
     * 功能：item中的控件初始化
     * @param itemView item中的控件
     */
    public LoveViewHolder(View itemView) {
        super(itemView);
        //获取item布局中的控件
        mLoveImage = (ImageView) itemView.findViewById(R.id.love_image);
        mLoveTV = (TextView) itemView.findViewById(R.id.love_tv);
    }

    //获取ImageView
    public ImageView getmLoveImage() {
        return mLoveImage;
    }
    //获取TextView
    public TextView getmLoveTV() {
        return mLoveTV;
    }
}
