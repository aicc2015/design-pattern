package com.honglekai.study.dpiterator;

/**
 * description
 * company YH
 *
 * @Author hcc
 * modifyBy
 * createTime 2019/1/7 18:16
 * modifyTime
 */
public class LinkedList implements Collection {

    private Node head = null;

    private Node tail = null;

    private int size = 0;

    public void add(Object o){
        Node n = new Node(o,null);
        if (head == null){
            head = n;
            tail = n;
        }

        tail.setNext(n);

        tail = n;

        size ++;

    }

    public int size(){
        return size;
    }

    @Override
    public Iterator itertor() {
        return new LinkedListItetor();
    }

    class LinkedListItetor implements  Iterator{

        private Node currentNode = head;

        private int nextIndex  = 0;

        @Override
        public Object next() {
            Object o = currentNode.getData();
            currentNode = currentNode.getNext();

            nextIndex  ++;
            return o;
        }

        @Override
        public boolean hasNext() {
            return  nextIndex != size;
        }
    }
}
