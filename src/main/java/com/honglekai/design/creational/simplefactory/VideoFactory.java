package com.honglekai.design.creational.simplefactory;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 18:17
 * modifyTime
 */
public class VideoFactory  {

    /**
     * 也可以用静态方法，但是静态方法无法用继承去改变
     */
    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 通过 java的反射来满足开闭原则，不需要修改工厂方法
     * @param c
     * @return
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
