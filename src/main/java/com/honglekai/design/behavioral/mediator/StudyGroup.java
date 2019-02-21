package com.honglekai.design.behavioral.mediator;

import java.util.Date;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/21 11:37
 * modifyTime
 */
public class StudyGroup {

    public static void showMessage(User user,String message){
        System.out.println("当前时间"+new Date().toString()+" 用户"+user+" 消息内容:"+message);
    }
}
