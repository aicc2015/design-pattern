package com.honglekai.design.creational.prototype.clone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/14 18:26
 * modifyTime
 */
public class CacheKey  implements Cloneable, Serializable {

    private int multiplier;
    private int hashcode;
    private long checksum;
    private int count;
    private List<Object> updateList;

    public List<Object> getUpdateList() {
        return updateList;
    }

    public void setUpdateList(List<Object> updateList) {
        this.updateList = updateList;
    }

    public CacheKey() {
        this.hashcode = 17;
        this.multiplier = 37;
        this.count = 0;
        this.updateList = new ArrayList();
    }

    public CacheKey clone() throws CloneNotSupportedException {
        CacheKey clonedCacheKey = (CacheKey) super.clone();
        clonedCacheKey.updateList = new ArrayList(this.updateList);
        return clonedCacheKey;
    }


}
