package com.lzw.kuaishou.datamodel;

/**
 * Created by 李志伟 on 2016/11/16 17:56
 * E-mail: 913582589@qq.com
 */

public class MineDataModel {
    private String mineItemName;
    private int mineItemImage;

    public MineDataModel(String mineItemName, int mineItemImage) {
        this.mineItemName = mineItemName;
        this.mineItemImage = mineItemImage;
    }

    public String getMineItemName() {
        return mineItemName;
    }

    public int getMineItemImage() {
        return mineItemImage;
    }
}
