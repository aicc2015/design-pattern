package com.honglekai.design.behavioral.memento;

/**
 * description 备忘录模式
 * 定义：
 * 1.保存一个对象的某个状态，以便在适当的时候恢复对象
 * 2."后悔药"
 *
 * 类型：行为型
 *
 * 适用场景
 * 1.保存及恢复数据相关业务
 * 2.后悔的时候，即想恢复到之前的状态
 *
 * 优点：
 * 1.为用户提供一种可恢复机制
 * 2.存档信息的封装
 *
 * 缺点：
 * 1.资源占用
 *
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/2/20 18:16
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("如影随形设计模式A","内容A","图片A");

        ArticleMemento articleMemento = article.saveToMemento();

        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题 "+articleMemento.getTitle()+" 内容"+articleMemento.getContent()+" 图片"+articleMemento.getImgs());

        System.out.println("手记完整信息"+article);

        System.out.println("修改手记begin");
        article.setTitle("如影随形设计模式B");
        article.setContent("内容B");
        article.setImgs("图片B");
        System.out.println("修改手记end");

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("如影随性设计模式C");
        article.setContent("内容C");
        article.setImgs("图片C");

       /* articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);
*/

        System.out.println("暂存回退begin");

        System.out.println("回退出栈一次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("回退出栈一次后:"+article);

        System.out.println("回退出栈二次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("回退出栈二次后:"+article);

        System.out.println("暂存回退end");


    }
}
