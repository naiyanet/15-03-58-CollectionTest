/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.collectiontest;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author User
 */
public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add("World");
        list.add(12345);
        list.add(new Integer(5555));
        list.add("Hello");
        list.add(12345);
        System.out.println("Set ==> "+list);
    }
}
