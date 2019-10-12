/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Haidar
 */
public class Segitiga1841720194Haidar {
    
    private static int sudut;
    public static void main(String[] args) {
        sudut=30;
        System.out.println(totalSudutHaidar(sudut));
        System.out.println(totalSudutHaidar(sudut, sudut));
        System.out.println(kelilingHadiar(sudut, sudut, sudut));
        System.out.println(kelilingHadiar(sudut, sudut, sudut));
        
        System.out.println("");
        
        System.out.println(totalSudutHaidar((float)sudut, (float)sudut));
        System.out.println(totalsudutHaidar(sudut));
        System.out.println(kelilingHadiar((float)sudut, sudut, sudut));
        System.out.println(kelilingHaidar((float)sudut, sudut));
        
    }
    
    public static int totalSudutHaidar(int sudutA){
        return 0;
    }
    
    public static int totalSudutHaidar(int sudutA, int sudutB){
        return 0;
    }
    
    public static int kelilingHadiar(int sisiA, int sisiB, int sisiC){
        return 0;
    }
    
    public static double kelilingHaidar(int sisiA, int sisiB){
        return 0;
    }
    
    public static int totalsudutHaidar(float sudutA){
        return (int) ((int)180 - sudutA);
    }
    
    public static int totalSudutHaidar(float sudutA, float sudutB){
        return (int) ((int) 180 - (sudutA+sudutB));
    }
    
    public static int kelilingHadiar(float sisiA, int sisiB, int sisiC){
        return(int) ((int) sisiB+sisiA+sisiC);
    }
    
    public static double kelilingHaidar(float sisiA, int sisiB){
        return Math.pow(Math.sqrt(sisiA),2) + Math.pow(Math.sqrt(sisiA),2);
    }  
}
