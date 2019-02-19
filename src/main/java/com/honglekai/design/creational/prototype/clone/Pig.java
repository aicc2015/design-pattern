package com.honglekai.design.creational.prototype.clone;

import java.io.*;
import java.util.Date;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 17:22
 * modifyTime
 */
public class Pig implements Cloneable, Serializable{

    private String name;

    private Date birthDate;


    public Pig(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       /* Pig pig = (Pig) super.clone();

        //深克隆 引用类型对象需要深克隆
        pig.birthDate = (Date) pig.birthDate.clone();
        return pig;*/

        Object obj = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            obj = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {

        }

        return obj;

    }
}
