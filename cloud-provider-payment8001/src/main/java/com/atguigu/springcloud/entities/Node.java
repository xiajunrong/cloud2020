package com.atguigu.springcloud.entities;

public class Node {
    public Object e;
    public Node next;
    public Node pre;

    public Node() {

    }

    public Node(Object e) {
        this.e = e;
        next = null;
        pre = null;
    }
}
