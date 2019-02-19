package com.honglekai.design.structural.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/18 16:46
 * modifyTime
 */
public class CourseCatlog extends CatlogComponent {

    private List<CatlogComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CourseCatlog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatlogComponent catlogComponent) {
        items.add(catlogComponent);
    }

    @Override
    public void remove(CatlogComponent catlogComponent) {
        items.remove(catlogComponent);
    }

    @Override
    public String getName(CatlogComponent catlogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatlogComponent catlogComponent : items){
            if (this.level != null){
                for (int i=0;i<this.level;i++){
                    System.out.print("-");
                }
            }
            catlogComponent.print();
        }
    }
}
