/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GLORY
 */
public class HashMapExample {

    public static void main(String[] args) {

        /*
         * Features of Java Hashmap
         * a) The values can be stored in a map by forming a key-value pair. The value can be retrieved using the key by passing it to the correct method.
         * b) If no element exists in the Map, it will throw a ‘NoSuchElementException’.
         * c) HashMap stores only object references. That is why, it is impossible to use primitive data types like double or int. Use wrapper class (like Integer or Double) instead. 
        
        //Following are the two ways to declare a Hash Map in Java:
         *  HashMap<String, Object> map = new HashMap<String, Object>();
         *   HashMap x  = new HashMap();
         */
        Map<String, String> objMap = new HashMap<>();
        objMap.put("Name", "Suzuki");
        objMap.put("Power", "220");
        objMap.put("Type", "2-wheeler");
        objMap.put("Price", "85000");
        System.out.println("Elements of the Map:");
        System.out.println(objMap);

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "PHP");
        map.put(4, "SQL");
        map.put(5, "C++");
        System.out.println("Tutorial in Behabtu: " + map);
        // Remove value of key 5  
        map.remove(5);
        System.out.println("Tutorial in Behabtu After Remove: " + map);
    }
}
