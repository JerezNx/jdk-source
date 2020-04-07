package com.lql.test;

import java.util.HashMap;

/**
 * @author LQL
 * @description
 * @date Create in 2020/4/7 21:06
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","a");
        map.put("3","a");
        map.put("1","b");
        System.out.println(map);
    }
}
