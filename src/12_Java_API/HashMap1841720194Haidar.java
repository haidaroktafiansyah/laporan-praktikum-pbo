/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan123;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Haidar
 */
public class HashMap1841720194Haidar {

    public static void main(String[] args) {
        HashMap haha = new HashMap();

        haha.put("1", "Biskuit");
        haha.put("2", "Shampoo");
        haha.put("3", "soap");
        System.out.println(haha);
        
        Collection mhaha = haha.values();
        Iterator mIterator = mhaha.iterator();
        
        while(mIterator.hasNext()){
            System.out.println(mIterator.next());
        }
        
        System.out.printf("haha total : %d\n",haha.size());
        
        Object ohaha = haha.remove("1");
        System.out.format("%s removed\n",ohaha);
        System.out.printf("haha total : %d\n",haha.size());
        System.out.println(haha);
        
        haha.clear();
        System.out.printf("haha total : %d\n",haha.size());
    }
}
