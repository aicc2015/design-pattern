package com.honglekai.study.dpStrategy.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 9:34
 * modifyTime
 */
public class FlyWeightFactory {

    private static Map<String,Shape> shapes = new HashMap<>();

    public static Shape getShape(String key){
        Shape shape = shapes.get(key);
        if (shape == null){
            shape = new Circle(key);
            shapes.put(key,shape);
        }
        return shape;
    }

    public static int getNum(){
        return shapes.size();
    }
}
