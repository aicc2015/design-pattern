package com.honglekai.principle.liskovsubstitution.methodout;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 15:34
 * modifyTime
 */
public class Child extends Base {

    /**
     * 遵守里氏替换原则，子类的出参或返回值比父类更严格或相等
     * @return
     */
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("---子类返回HashMap---");
        hashMap.put("hashmap","子类返回hashmap");
        return hashMap;
    }
}
