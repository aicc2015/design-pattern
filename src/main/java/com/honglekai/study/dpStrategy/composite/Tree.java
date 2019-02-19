package com.honglekai.study.dpStrategy.composite;

/**
 * description 组合模式
 * 1.将多个对象组合在一起使用
 * 2.常用于二叉树、数等
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/31 17:10
 * modifyTime
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
       root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");

        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);

        tree.root.add(nodeB);

        System.out.println(" build tree success ");
    }
}
