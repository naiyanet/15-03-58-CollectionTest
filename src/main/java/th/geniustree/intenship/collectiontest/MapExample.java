/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.collectiontest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author User
 */
public class MapExample {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "1st");
        map.put(2, new Integer(2));
        map.put(3, "3rd");
        System.out.println(map);
    }
}
  