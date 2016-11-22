package com.lzw.kuaishou.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lzw.kuaishou.R;

/**
 * Created by 李志伟 on 2016/11/16 17:52
 * E-mail: 913582589@qq.com
 */

public class MineViewHolder extends RecyclerView.ViewHolder{

    private ImageView mMineImage;
    private TextView mMineTV;

    public MineViewHolder(View itemView) {
        super(itemView);

        mMineImage = (ImageView) itemView.findViewById(R.id.mine_item_image);
        mMineTV = (TextView) itemView.findViewById(R.id.mine_item_tv);
    }

    public ImageView getmMineImage() {
        return mMineImage;
    }

    public TextView getmMineTV() {
        return mMineTV;
    }
}
