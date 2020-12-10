package com.atguigu.springcloud.entities;

public class NodeTest {
    public static void main(String[] args) {
        MyList ml = new MyList();
        int i = 0;
        for (; i < 10; i++) {
            ml.add(i);
        }
    }
}
