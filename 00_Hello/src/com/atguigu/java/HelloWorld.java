package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
    
    private static final double PI = 3.14;
    public static final int U = 5;
    public static final String CON = "China";

    /**
     * 客户的id
     */
    private int id;
    private int id2;
    private int id3;
    private String name;
    private double salary;


    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        ArrayList<String> strings = new ArrayList<>();
        Date date = new Date();
        strings.add("try");
        strings.add("red");

        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println();
        System.out.println("HelloWorld.main");
        System.out.println("date = " + date);
        System.out.println("strings = " + strings);
        System.out.println(date);
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            cnt += i;
        }
        System.out.println(cnt);

        for (String string : strings) {
            System.out.println("string = " + string);
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        for (Integer li : list) {
            System.out.println(li);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }

    }

    public void method(){
        System.out.println("Ha");
    }
    
    public void testUpdate(){
        // 测试方法
    }
}
