/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Haidar
 */
public class main1841720194Haidar {
    public static void main(String[] args) {
        Scanner sSc = new Scanner(System.in);
        peminjam1841720194Haidar sRent = new peminjam1841720194Haidar();
        game1841720194Haidar sGame = new game1841720194Haidar();
        
        System.out.println("id ?");
        sRent.mId = sSc.nextLine();
        
        System.out.println("nama ?");
        sRent.mNama = sSc.nextLine();
        
        System.out.println("member ? yes/no");
        sGame.mMember = sSc.nextLine();
        
        sGame.showMenuHaidar();
        sGame.mPilih = sSc.nextInt();
        
        System.out.println("Lama hari ?");
        sGame.mLamaHari = sSc.nextInt();
        
        System.out.println("Total Harga : "+sGame.bayarHaidar());
    }
}
