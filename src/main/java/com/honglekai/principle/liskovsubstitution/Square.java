package com.honglekai.principle.liskovsubstitution;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:08
 * modifyTime
 */
public class Square implements Quadrangle{

    private long sideLength;


    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
