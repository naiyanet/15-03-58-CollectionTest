/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.collectiontest;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Hello");
        set.add("World");
        set.add(12345);
        set.add(new Integer(5555));
        set.add("Hello");
        set.add(12345);
        System.out.println("Set ==> "+set);
    }
    
    
}
