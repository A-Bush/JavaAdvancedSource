package ua.com.webcamp.JavaAdv.Lesson01.Ex_08Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Artem Vereschaka on 8/5/15.
 */
public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(18,"Artem");
        map.put(20,"Alex");
        map.put(18,"Jake");


        String name = map.get(18);
        System.out.println(name);
        System.out.println();

        map.remove(20);

        Map<Integer, String> newMap = new Hashtable<Integer, String>()
        {
            {
                put(17,"John");
                put(20,"Evgen");
                put(21,"Leonardo");
            }
        };
        map.putAll(newMap);

        boolean result;
        result = map.containsKey(19);
        result = map.containsValue("John");

        System.out.println("Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.printf("Key : %-3s Value : %-10s\n", entry.getKey(), entry.getValue());
        }
    }
}
