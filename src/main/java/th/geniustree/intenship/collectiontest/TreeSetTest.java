/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intenship.collectiontest;

import java.util.TreeSet;

/**
 *
 * @author M6500
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> times = new TreeSet<>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);
        TreeSet<Integer> subset = new TreeSet<>();
        subset = (TreeSet)times.headSet(1600);
        System.out.println("J5 - last before 4pm is: "+subset.last());
        TreeSet<Integer> sub2 = new TreeSet<>();
        sub2 = (TreeSet)times.tailSet(2000);
        System.out.println("J5 - first after 8pm is: "+sub2.first());
        System.out.println("J6 - last before 4pm is: "+times.lower(1600));
        System.out.println("J6 = first after 8pm is: "+times.higher(2000));
        
    }
}
