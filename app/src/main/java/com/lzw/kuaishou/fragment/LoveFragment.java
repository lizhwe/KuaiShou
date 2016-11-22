package com.lzw.kuaishou.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lzw.kuaishou.R;
import com.lzw.kuaishou.adapter.LoveRecyclerViewAdapter;
import com.lzw.kuaishou.datamodel.LoveDataModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoveFragment extends Fragment {

    List<LoveDataModel> loveDataModels;
    LoveRecyclerViewAdapter loveRecyclerViewAdapter;
    RecyclerView recyclerView;

    public LoveFragment() {
        // Required empty public constructor
    }

    /**
     *  功能：将数据和视图进行关联、并设置layoutManager为瀑布流
     * @param inflater inflater
     * @param container 容器
     * @param savedInstanceState 数据
     * @return 视图
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.fragment_love, container, false);
        initLayout(mView);
        return mView;
    }

    /**
     * 功能：布局的初始化
     * @param mView 视图
     */
    private void initLayout(View mView) {
        recyclerView = (RecyclerView) mView.findViewById(R.id.recyclerView_love);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        initDataModel();
        loveRecyclerViewAdapter = new LoveRecyclerViewAdapter(loveDataModels);
        recyclerView.setAdapter(loveRecyclerViewAdapter);
    }

    /**
     * 数据模型初始化
     */
    private void initDataModel() {
        loveDataModels = new ArrayList<>();
        LoveDataModel data_01 = new LoveDataModel("积分变现", R.drawable.default_image_01);
        loveDataModels.add(data_01);
        LoveDataModel data_02 = new LoveDataModel("加入环保团队", R.drawable.default_image_02);
        loveDataModels.add(data_02);
        LoveDataModel data_03 = new LoveDataModel("赚取积分", R.drawable.default_image_03);
        loveDataModels.add(data_03);
        LoveDataModel data_04 = new LoveDataModel("预约兑换", R.drawable.default_image_04);
        loveDataModels.add(data_04);
    }

}
















