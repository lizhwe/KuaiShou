package com.lzw.kuaishou.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.lzw.kuaishou.R;
import com.lzw.kuaishou.adapter.ViewPagerAdapter;
import com.lzw.kuaishou.fragment.CollectionFragment;
import com.lzw.kuaishou.fragment.LoveFragment;
import com.lzw.kuaishou.fragment.MineFragment;
import com.lzw.kuaishou.fragment.QuickFragment;

import java.util.ArrayList;
import java.util.List;

public class DefaultActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener{

    ViewPager mViewPager;
    List<Fragment> fragmentList;
    RadioButton rb_love, rb_quick, rb_collection, rb_mine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        //初始化组件
        initWidget();
        //初始化fragment
        initFragments();
        //设置组件监听
        setWidgetListener();
        //进行绑定
        viewPagerBinding();

    }

    /**
     *  功能：将ViewPager和ViewPagerAdapter进行绑定
     */
    private void viewPagerBinding() {
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        mViewPager.setAdapter(mViewPagerAdapter); //二者关联
        rb_love.setChecked(true); //第一项默认选中
    }

    /**
     * 功能：为控件设置监听事件
     */
    private void setWidgetListener() {
        rb_love.setOnClickListener(this);
        rb_quick.setOnClickListener(this);
        rb_collection.setOnClickListener(this);
        rb_mine.setOnClickListener(this);
        mViewPager.setOnPageChangeListener(this);
    }

    /**
     * 功能：初始化fragment并添加到fragment容器中
     */
    private void initFragments() {
        LoveFragment loveFragment = new LoveFragment();
        QuickFragment quickFragment = new QuickFragment();
        CollectionFragment collectionFragment = new CollectionFragment();
        MineFragment mineFragment = new MineFragment();
        fragmentList.add(loveFragment);
        fragmentList.add(quickFragment);
        fragmentList.add(collectionFragment);
        fragmentList.add(mineFragment);
    }

    /**
     * 功能：初始化控件
     */
    private void initWidget() {
        rb_love = (RadioButton) findViewById(R.id.default_01);
        rb_quick= (RadioButton) findViewById(R.id.default_02);
        rb_collection= (RadioButton) findViewById(R.id.default_03);
        rb_mine= (RadioButton) findViewById(R.id.default_04);
        fragmentList = new ArrayList<>();
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    /**
     *  功能：viewPage切换，选中对应的radioButton
     * @param position viewPage的位置
     */
    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                ((RadioButton)(findViewById(R.id.default_01))).setChecked(true);
                break;
            case 1:
                ((RadioButton)(findViewById(R.id.default_02))).setChecked(true);
                break;
            case 2:
                ((RadioButton)(findViewById(R.id.default_03))).setChecked(true);
                break;
            case 3:
                ((RadioButton)(findViewById(R.id.default_04))).setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     *  功能：点击radioButton，进行ViewPage的切换
     * @param view 容器中的fragment
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.default_01:
                mViewPager.setCurrentItem(0);
                break;
            case R.id.default_02:
                mViewPager.setCurrentItem(1);
                break;
            case R.id.default_03:
                mViewPager.setCurrentItem(2);
                break;
            case R.id.default_04:
                mViewPager.setCurrentItem(3);
                break;
        }
    }
}









