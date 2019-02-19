package com.honglekai.study.dpiterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 17:51
 * modifyTime
 */
public class ArrayList implements Collection{

    private Object[] objects = new Object[10];

    private int index = 0;



    public void add(Object o){
        if (objects.length == index){
            Object[] newObjects = new Object[objects.length*2];
            System.arraycopy(objects,0,newObjects,0,objects.length);
            objects = newObjects;
        }

        objects[index] = o;
        index ++;
    }

    public int size(){
        return index;
    }

    @Override
    public Iterator itertor() {
        return new ArrayListIterator();
    }

    class ArrayListIterator implements Iterator{

        private int currentIndex = 0;
        @Override
        public Object next() {
            Object o = objects[currentIndex];
            currentIndex ++;
            return o;
        }

        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            }else {
                return true;
            }
        }
    }

}
