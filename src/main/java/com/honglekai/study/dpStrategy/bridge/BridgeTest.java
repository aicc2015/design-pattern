package com.honglekai.study.dpStrategy.bridge;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 16:55
 * modifyTime
 */
public class BridgeTest {

    public static void main(String[] args) {
        MyBridg myBridg = new MyBridg();

        SourceSub1 sourceSub1 = new SourceSub1();
        myBridg.setSource(sourceSub1);
        myBridg.method();

        SourceSub2 sourceSub2 = new SourceSub2();
        myBridg.setSource(sourceSub2);
        myBridg.method();
    }
}
