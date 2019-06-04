package com.luolin;

import java.util.HashMap;

public class User {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("11","aa");
        hashMap.put("22","bb");
        hashMap.put("33","cc");
        hashMap.put("44","dd");

        String dd=hashMap.get("44");
        System.out.println("dd"+dd);

        hashMap.remove("22");
        System.out.println(hashMap);

    }
}
