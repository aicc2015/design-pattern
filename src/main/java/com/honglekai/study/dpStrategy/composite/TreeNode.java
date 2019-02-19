package com.honglekai.study.dpStrategy.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * description 组合模式
 * 1.将多个对象组合在一起使用
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 17:04
 * modifyTime
 */
public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    //添加节点
    public void add(TreeNode node){
        children.add(node);
    }

    //删除节点
    public void remove(TreeNode node){
        children.remove(node);
    }

    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
