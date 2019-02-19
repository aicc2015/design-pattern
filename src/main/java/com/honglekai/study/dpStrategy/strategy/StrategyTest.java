package com.honglekai.study.dpStrategy.strategy;

/**
 * description 策略模式
 * 策略模式定义了使用一系列算法，并将每个算法都封装起来，使他们可以相互转化，
 * 且算法的变化不影响使用算法的客户，需要提供一个借口，为一系列实现类提供统一的方法，多个实现类实现该接口，设计一个抽象类(可有可无，用于辅助类),提供辅助函数
 * 策略模式的决定权在用户，系统本身提供不同的算法的实现，新增和删除算法，对算法进行封装，因此策略模式多应用于在算法决策系统中，外部用户只要决定使用哪个算法既可。
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 14:20
 * modifyTime
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+1";
        ICalculater calculater = new Plus();
        int result = calculater.calculate(exp);

        System.out.println("=======结果========"+result);
    }
}
