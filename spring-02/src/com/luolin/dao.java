package com.luolin;

import java.util.ArrayList;
import java.util.List;

public class dao {
    public static void main(String[] args) {
       test1();
    }

    public void  method1(String  xx){
        if (xx == null) {
            System.out.println("luolin");
        }
    }


    public static void test1(){
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
