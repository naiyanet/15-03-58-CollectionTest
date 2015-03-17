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
 * @author M6500
 */
public class SetTest {
    public static void main(String[] args) {
        boolean[] ba = new boolean[5];
        Set s = new HashSet();
        ba[0] = s.add("a");
        ba[1] = s.add(new Integer(42));
        ba[2] = s.add("b");
        ba[3] = s.add("a");
        ba[4] = s.add(new Object());
        for(int x=0; x<ba.length;x++){
            System.out.println("BA = "+ba[x]+" ");
        }System.out.println( );
        for(Object o:s){
            System.out.println("S = "+o+" ");
        }
    }
}
