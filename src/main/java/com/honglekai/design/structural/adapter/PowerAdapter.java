package com.honglekai.design.structural.adapter;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 10:09
 * modifyTime
 */
public class PowerAdapter implements DC5V {

    private AC200V ac200V = new AC200V();


    @Override
    public int outputDC5V() {
        int adapterInput = ac200V.outputAC220V();

        //变压器...
        int adapterOutput = adapterInput/44;

        System.out.println("使用PowerAdapter输入AC:"+adapterInput+"V,输出DC"+adapterOutput+"V");
        return adapterOutput;
    }
}
