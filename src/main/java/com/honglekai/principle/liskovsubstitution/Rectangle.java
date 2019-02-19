package com.honglekai.principle.liskovsubstitution;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:02
 * modifyTime
 */
public class Rectangle implements Quadrangle{

    private long width;

    private long length;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
