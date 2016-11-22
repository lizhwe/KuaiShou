package com.lzw.kuaishou.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by 李志伟 on 2016/11/16 08:49
 * E-mail: 913582589@qq.com
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    /**
     *  功能：在Activity中调用，将fragment与ViewPagerAdapter进行绑定
     * @param fm fragment管理器
     * @param fragment fragment容器中的fragment
     */
    public ViewPagerAdapter(FragmentManager fm, List<Fragment> fragment) {
        super(fm);
        this.fragmentList = fragment;
    }

    /**
     *  功能：获取指定位置的fragment
     * @param position  fragment位置
     * @return  返回fragment
     */
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    /**
     *  功能：获取fragment个数
     * @return 返回fragment个数
     */
    @Override
    public int getCount() {
        return fragmentList.size();
    }


}
