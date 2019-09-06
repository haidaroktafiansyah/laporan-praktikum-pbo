/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Haidar
 */
public class main1841720194Haidar {
    public static void main(String[] args) {
        lingkaran1841720194Haidar sLr = new lingkaran1841720194Haidar();
        Scanner sSc = new Scanner(System.in);
        
        System.out.println(" R ?");
        sLr.mR = sSc.nextDouble();
        
        System.out.println("luas    : "+sLr.hitungLuasHaidar());
        System.out.println("keliling    : "+sLr.hitungKelilingHaidar());
    }
}
