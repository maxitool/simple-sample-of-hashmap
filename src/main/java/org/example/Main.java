package org.example;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "data1");
        myHashMap.put(2, "data2");
        myHashMap.put(3, "data3");
        myHashMap.put(4, "data4");
        myHashMap.put(5, "data5");
        myHashMap.put(6, "data6");
        System.out.println("Inserted data");
        System.out.println(myHashMap + "\n");
        int key1 = 2, key2 = 4;
        System.out.println("Deleted data");
        System.out.println(key1 + "," + myHashMap.remove(key1));
        System.out.println(key2 + "," + myHashMap.remove(key2));
        System.out.println(myHashMap + "\n");
        System.out.println("Get data with keys 1 (present), 2 (not present), 3 (present)");
        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(2));
        System.out.println(myHashMap.get(3));
        System.out.println("\n" + "Using iterator");
        for (var value : myHashMap.values()) {
            System.out.println(value);
        }
        System.out.println("\nEntry set of map " + myHashMap.entrySet());
        System.out.println("\nhash of 'data' value = " + MyHashMap.hash("data"));
    }
}