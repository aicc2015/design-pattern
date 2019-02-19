package com.honglekai.principle.singleresponsibility;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/12 16:49
 * modifyTime
 */
public interface ICourse {

    String getName();
    Integer getId();

    void payCource();
    void returnCourse();
}
