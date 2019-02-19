package com.honglekai.design.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * description
 * 学习多线程debug调试
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/13 18:20
 * modifyTime
 */
public class Test {

    /*public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
    }*/

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, CloneNotSupportedException {
        /*Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T1());
        t1.start();
        t2.start();

        System.out.println("program end");*/

        //序列化和反序列化破坏单例模式解决方法
        /*HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("singleton_file")));
        oos.writeObject(hungrySingleton);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton_file")));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();

        System.out.println(hungrySingleton);
        System.out.println(newInstance);

        System.out.println(newInstance == hungrySingleton);*/


        //利用反射破坏单例模式(饿汉式) 饿汉式可以避免反射调用，因为饿汉式在类加载的时候初始化的
        /*HungrySingleton instance = HungrySingleton.getInstance();

        Class objectClass = HungrySingleton.class;
        Constructor[] constructors = objectClass.getDeclaredConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }

//        Constructor constructor = objectClass.getConstructor();
        constructors[0].setAccessible(true);//
        HungrySingleton newInstance = (HungrySingleton) constructors[0].newInstance();


        System.out.println(instance);
        System.out.println(newInstance);

        System.out.println(newInstance == instance);*/

        //利用反射破坏单例模式(懒汉式)， 懒汉式无法避免发射调用，因为懒汉式在调用的时候初始化的
       /* Class objectClass = LazySingleton.class;
        Constructor[] constructors = objectClass.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);

        LazySingleton instance = LazySingleton.getInstance();

        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance,true);

        LazySingleton newInstance = (LazySingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);*/


       //枚举类的单例模式 序列化和反序列化破坏单例模式失败
        /*EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("singleton_file")));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton_file")));
        EnumInstance newInstance = (EnumInstance) ois.readObject();
        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(newInstance.getData() == instance.getData());*/


        //枚举类的单例模式 反射破坏失败
        /*EnumInstance instance = EnumInstance.getInstance();
        Class objClass = EnumInstance.class;
        Constructor constructor = objClass.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        constructor.newInstance("hcc",666);
        EnumInstance newInstance = (EnumInstance) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);*/

        //jad 反编译工具
        //下载地址 https://varaneckas.com/jad/

        /*EnumInstance instance = EnumInstance.getInstance();
        instance.printTest();*/

        //容器单例模式
        /*Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T1());
        t1.start();
        t2.start();

        System.out.println("容器单例模式结束");*/

        //ThreadLocal "单例模式"
        /*System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        System.out.println("main thread"+ThreadLocalInstance.getInstance());
        Thread t1 = new Thread(new T1());
        Thread t2 = new Thread(new T1());
        t1.start();
        t2.start();
        System.out.println("结束");*/


        //原型破坏单例
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);

        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);
    }
}
