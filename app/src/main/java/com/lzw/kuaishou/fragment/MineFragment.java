package com.lzw.kuaishou.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzw.kuaishou.R;
import com.lzw.kuaishou.adapter.MineRecyclerViewAdapter;
import com.lzw.kuaishou.datamodel.MineDataModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MineFragment extends Fragment {

    List<MineDataModel> mineDataModel;
    RecyclerView recyclerView;
    MineRecyclerViewAdapter mineRecyclerViewAdapter;


    public MineFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_mine);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(layoutManager);
        initData();
        mineRecyclerViewAdapter = new MineRecyclerViewAdapter(mineDataModel);
        recyclerView.setAdapter(mineRecyclerViewAdapter);
        return view;
    }

    private void initData() {
        mineDataModel = new ArrayList<>();
        MineDataModel data_01 = new MineDataModel("账户名称",R.drawable.default_rb_01);
        mineDataModel.add(data_01);
        MineDataModel data_02 = new MineDataModel("环保资产",R.drawable.default_rb_02);
        mineDataModel.add(data_02);
        MineDataModel data_03 = new MineDataModel("环保事迹",R.drawable.default_rb_03);
        mineDataModel.add(data_03);
        MineDataModel data_04 = new MineDataModel("收藏",R.drawable.default_rb_03);
        mineDataModel.add(data_04);
        MineDataModel data_05 = new MineDataModel("设置收货地址",R.drawable.default_rb_04);
        mineDataModel.add(data_05);
        MineDataModel data_06 = new MineDataModel("设置夜间模式",R.drawable.default_rb_04);
        mineDataModel.add(data_06);
        MineDataModel data_07 = new MineDataModel("设置",R.drawable.default_rb_03);
        mineDataModel.add(data_07);
        MineDataModel data_08 = new MineDataModel("帮助与反馈",R.drawable.default_rb_03);
        mineDataModel.add(data_08);
    }

}












