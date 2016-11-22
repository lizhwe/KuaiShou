package com.lzw.kuaishou.datamodel;

/**
 * Created by 李志伟 on 2016/11/16 11:33
 * E-mail: 913582589@qq.com
 */

/**
 *  "爱环保"模块中瀑布流中的数据源
 * */
public class LoveDataModel {
    private String loveName;
    private int loveImage;

    public LoveDataModel(String loveName, int loveImage) {
        this.loveName = loveName;
        this.loveImage = loveImage;
    }

    public String getLoveName() {
        return loveName;
    }

    public int getLoveImage() {
        return loveImage;
    }

}
