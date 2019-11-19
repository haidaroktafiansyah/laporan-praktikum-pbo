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
public class ArrayList {
    public static void main(String[] args) {
        List mListCountry = new java.util.ArrayList();
        mListCountry.add("indonesia");
        mListCountry.add("malaysia");
        mListCountry.add("german");
        
        System.out.println(mListCountry);
        System.out.format("list index 0 = %s\n",mListCountry.get(0));
        System.out.format("list index 2 = %s\n",mListCountry.get(2));

        System.out.println("Country List loop");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.printf("%S",element+"\n");
        }
    }
}
