package com.honglekai.study.dpStrategy.builder;

import com.honglekai.study.dpStrategy.factoryMethod.MailSender;
import com.honglekai.study.dpStrategy.factoryMethod.Sender;
import com.honglekai.study.dpStrategy.factoryMethod.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * description 建造者模式
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/30 17:13
 * modifyTime
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count){
        for (int i=0; i<count; i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
