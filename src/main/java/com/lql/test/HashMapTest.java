package com.lql.test;

import com.lql.my.MyHashMap;

import java.util.HashMap;

/**
 * @author LQL
 * @description
 * @date Create in 2020/4/7 21:06
 */
public class HashMapTest {
    public static void main(String[] args) {
        MyHashMap<String,String> map = new MyHashMap<>();
        map.put("1","a");
        map.put("2","a");
        map.put("3","a");
        map.put("1","b");
        map.get("1");
        System.out.println(map);
    }
}
