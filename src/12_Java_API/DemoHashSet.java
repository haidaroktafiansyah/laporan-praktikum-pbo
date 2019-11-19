/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan123;
import java.util.*;
/**
 *
 * @author Haidar
 */
public class DemoHashSet {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("Bandung");
        mSetCity.add("malang");
        mSetCity.add("Surabaya");
        mSetCity.add("Banyuwangi");
        mSetCity.add("Jogjakarta");
        mSetCity.add("Batu");
        
        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        
        while(mIterator.hasNext()){
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
