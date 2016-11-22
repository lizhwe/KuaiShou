package com.lzw.kuaishou.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzw.kuaishou.R;
import com.lzw.kuaishou.datamodel.MineDataModel;
import com.lzw.kuaishou.viewholder.MineViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李志伟 on 2016/11/16 17:58
 * E-mail: 913582589@qq.com
 */

public class MineRecyclerViewAdapter extends RecyclerView.Adapter {

    private List<MineDataModel> mineDataModels = new ArrayList<>();

    public MineRecyclerViewAdapter(List<MineDataModel> mineDataModels) {
        this.mineDataModels = mineDataModels;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = (LayoutInflater.from(parent.getContext())).inflate(R.layout.mine_recyclerview_item, parent, false);
        return new MineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((MineViewHolder)holder).getmMineImage().setImageResource(mineDataModels.get(position).getMineItemImage());
        ((MineViewHolder)holder).getmMineTV().setText(mineDataModels.get(position).getMineItemName());
    }

    @Override
    public int getItemCount() {
        return mineDataModels.size();
    }
}
