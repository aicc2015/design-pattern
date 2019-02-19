package com.honglekai.study.dpStrategy.prototype;

import java.io.*;

/**
 * description 原型模式
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 16:26
 * modifyTime
 */
public class Prototype implements Cloneable,Serializable {

    private static final long serialVersionUID = 1L;

    private String string;

    private SerializableObject obj;

    /**
     * 浅复制 1.基本数量类型都会复制，2.引用类型还是指向原对象的指向
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 深复制 不论是基本数据类型还是引用类型都会重新创建
     * @return
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /**
         * 写入当前对象的二进制流
         */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /**
         * 读出二进制流产生的新对象
         */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

    class SerializableObject implements Serializable{
        private static final long serialVersionUID = 1L;
    }
}
