package com.honglekai.study.dpiterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 17:54
 * modifyTime
 */
public class Test {

    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();

//        LinkedList linkedList = new LinkedList();
        Collection c = new LinkedList();
        for (int i=0; i<15; i++){
            c.add(new Cat(i));
        }

        System.out.println(c.size());

        Iterator iterator = c.itertor();
        while (iterator.hasNext()){
            Cat cat = (Cat) iterator.next();
            System.out.println(cat.toString());
        }
    }
}
