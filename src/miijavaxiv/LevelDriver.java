/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author userx
 */
public class LevelDriver {
    static void methodZ(int y, Level1 l){
        
    }
    static void methodZ(InterfaceX x){
        
    }
    public static void main(String[] args) {
        
        Level1 level11 = new Level3();
        level11.method1(0);
        System.out.println(level11.getClass());
        System.out.println(level11 instanceof Level1);
        System.out.println(level11 instanceof Level2);
        System.out.println(level11 instanceof Level3);
        Dictionary dictionary = new Hashtable();
        dictionary.put(6, "tampil");
        System.out.println(dictionary.size());
        
        InterfaceX ix = new Level3();
        
        List<Integer> x = new ArrayList();
        x.add(6);
        x.add(99);
        x.add(2);
        x.add(68);
        x.forEach(vx -> System.out.println(vx));
        System.out.println(x);
        
        Map<String, String> map = new Hashtable();
        map.put("indonesia", "jakarta");
        map.put("singapore", "singapore");
        map.put("brunei", "bandar seri begawan");
        map.forEach((k,v) -> System.out.println(k + " ==> " + v)); // Lamda expresition
    }
}
