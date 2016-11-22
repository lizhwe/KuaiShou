package com.lzw.kuaishou.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.lzw.kuaishou.R;

/**
 * Created by 李志伟 on 2016/9/5 18:05
 * E-mail: 913582589@qq.com
 */
public class ActionBarAll extends RelativeLayout {

    //自定义控件
    ImageView left_icon;
    TextView left_tv;

    //自定义控件属性
    String leftText;
    int leftTextColor;
    float leftTextSize;
    int leftTextPadding;
    Drawable leftIcon;
    int leftIconPadding;

    //将一个控件放到Layout中
    LayoutParams leftParams_tv, leftParams_icon;

    //需要自定义控件调用一个参数的构造方法即可
    public ActionBarAll(Context context) {
        this(context, null);
    }
    //需要自定义控件、自定义属性调用两个参数的构造方法即可
    public ActionBarAll(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    //需要自定义控件、自定义属性还有自定义样式需要用到三个参数构造方法
    public ActionBarAll(final Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //获取自定义属性
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.ActionBarAll);
        leftText = ta.getString(R.styleable.ActionBarAll_left_text);
        leftTextSize = ta.getDimension(R.styleable.ActionBarAll_left_text_size, 0f);
        leftTextColor = ta.getColor(R.styleable.ActionBarAll_left_text_color, 0);
        leftTextPadding = (int) ta.getDimension(R.styleable.ActionBarAll_left_text_padding, leftTextPadding);
        leftIcon = ta.getDrawable(R.styleable.ActionBarAll_left_icon);
        leftIconPadding = (int) ta.getDimension(R.styleable.ActionBarAll_left_icon_padding, leftIconPadding);
        ta.recycle();

        //实例化相应控件
        left_icon = new ImageView(context);
        left_tv = new TextView(context);

        //赋值给相应控件
        left_tv.setText(leftText);
        left_tv.setTextSize(leftTextSize);
        left_tv.setTextColor(leftTextColor);
        left_tv.setPadding(leftTextPadding, 0, 0, 0);
        left_icon.setImageDrawable(leftIcon);
        left_icon.setPadding(leftIconPadding, 0, 0, 0);

        //给左侧图标添加单击事件
        left_icon.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "选择返回", Toast.LENGTH_SHORT).show();
            }
        });

        //设置左侧图标以及文字的相关参数以及位置
        leftParams_icon = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        leftParams_icon.addRule(RelativeLayout.CENTER_VERTICAL, TRUE);//添加控件对其规则
        addView(left_icon, leftParams_icon);//将ImageView添加到布局中
        leftParams_tv = new LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        leftParams_tv.addRule(RelativeLayout.CENTER_VERTICAL, RelativeLayout.END_OF);//添加控件对其规则
        addView(left_tv, leftParams_tv); //将TextView添加到布局中


    }
}