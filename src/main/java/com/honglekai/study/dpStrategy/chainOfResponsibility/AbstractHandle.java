package com.honglekai.study.dpStrategy.chainOfResponsibility;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/1 16:48
 * modifyTime
 */
public abstract  class AbstractHandle {

    private Handle handle;

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }
}
