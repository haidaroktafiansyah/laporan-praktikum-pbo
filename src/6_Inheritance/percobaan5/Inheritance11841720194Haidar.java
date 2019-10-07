/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan5;

/**
 *
 * @author Haidar
 */
public class Inheritance11841720194Haidar {

    public static void main(String[] args) {
        Manager1841720194Haidar M = new Manager1841720194Haidar();
        M.mNama = "Vivin";
        M.mAlamat = "Jl. Vinolia";
        M.mUmur = 25;
        M.mJk = "Perempuan";
        M.mGaji = 3000000;
        M.mTunjangan = 1000000;
        M.tampilDataManagerHaidar();
        System.out.println("");
        Staff1841720194Haidar S = new Staff1841720194Haidar();
        S.mNama = "Lestari";
        S.mAlamat = "JMalang";
        S.mUmur = 25;
        S.mJk = "Perempuan";
        S.mGaji = 2000000;
        S.mLembur = 500000;
        S.mPotongan = 250000;
        S.tampilDataStaffHaidar();
    }
}
