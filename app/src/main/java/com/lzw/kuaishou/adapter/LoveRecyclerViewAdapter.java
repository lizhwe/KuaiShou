package com.lzw.kuaishou.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzw.kuaishou.R;
import com.lzw.kuaishou.datamodel.LoveDataModel;
import com.lzw.kuaishou.viewholder.LoveViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李志伟 on 2016/11/16 10:46
 * E-mail: 913582589@qq.com
 */

public class LoveRecyclerViewAdapter extends RecyclerView.Adapter{

    private List<LoveDataModel> loveDataModels = new ArrayList<>();

    /**
     *  功能：将adapter和dataModel进行绑定
     * @param dataModel 数据源
     */
    public LoveRecyclerViewAdapter(List<LoveDataModel> dataModel) {
        this.loveDataModels = dataModel;
    }

    /**
     * 功能：创建ViewHolder，并且绑定一个视图
     * @param parent viewGroup
     * @param viewType int类型
     * @return ViewHolder
     */
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = (LayoutInflater.from(parent.getContext())).inflate(R.layout.love_recyclerview_item, parent, false);
        return new LoveViewHolder(view);
    }

    /**
     *  功能：ViewHolder和数据源进行绑定
     * @param holder  自定义的ViewHolder（这里是LoveViewHolder）
     * @param position 数据在List集合中的位置
     */
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((LoveViewHolder)holder).getmLoveImage().setImageResource(loveDataModels.get(position).getLoveImage());
        ((LoveViewHolder)holder).getmLoveTV().setText(loveDataModels.get(position).getLoveName());
    }

    /**
     * 功能：获取具体的item数目
     * @return item数目
     */
    @Override
    public int getItemCount() {
        return loveDataModels.size();
    }

}















