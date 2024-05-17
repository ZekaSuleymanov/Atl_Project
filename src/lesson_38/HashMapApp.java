package lesson_38;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.concurrent.TransferQueue;

public class HashMapApp {
    public static void main(String[] args) {
        Hashtable<Long, String> hashtable = new Hashtable<>();
        hashtable.put(1L, "Nihad");
        hashtable.put(2L, "Gunel");
        hashtable.put(3L, "Hasan");
        hashtable.put(4L, "Zeka");
        hashtable.put(5L, "Araz");

        System.out.println(hashtable);

        System.out.println("***********************");

        HashMap<Long, String> hashMap = new HashMap<>();
        hashMap.put(5L,"Zeka");
        hashMap.put(1L, "Nihad");
        hashMap.put(2L, "Hasan");
        hashMap.put(3L, "Araz");
        hashMap.put(null, "Zeka");
        hashMap.put(4L, null);

        System.out.println(hashMap);

        System.out.println("***********************");

        TreeMap<Long, String> treeMap = new TreeMap<>();
        treeMap.put(5L, "Zeka");
        treeMap.put(1L, "Nihad");
        treeMap.put(2L, "Hasan");
        treeMap.put(3L, "Araz");
        treeMap.put(null, "Zeka");
        treeMap.put(4L, null);

        System.out.println(treeMap);

    }
}
