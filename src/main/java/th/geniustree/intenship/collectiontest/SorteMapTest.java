/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.collectiontest;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author M6500
 */
public class SorteMapTest {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");
        SortedMap<String,String> submap;
        submap = map.subMap("b", "g");
        System.out.println(map+" "+submap);
        map.put("b", "bat");
        submap.put("f", "fish");
        map.put("r", "raccoon");
        System.out.println(map + " "+submap);
    }
}
