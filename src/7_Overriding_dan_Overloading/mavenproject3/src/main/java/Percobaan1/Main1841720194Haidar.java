/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author Haidar
 */
public class Main1841720194Haidar {
    public static void main(String[] args) {
        System.out.println("program test");
        Manager1841720194Haidar man[] = new Manager1841720194Haidar[2];
        Staff1841720194Haidar staff1[] = new Staff1841720194Haidar[2];
        Staff1841720194Haidar staff2[] = new Staff1841720194Haidar[3];
        
        man[0] = new Manager1841720194Haidar();
        man[0].setmNamaHaidar("tedjo");
        man[0].setmNipHaidar("101");
        man[0].setmGolonganHaidar("1");
        man[0].setmTunjanganHaidar(5000000);
        man[0].setmBagianHaidar("Administrasi");
        
        man[1] = new Manager1841720194Haidar();
        man[1].setmNamaHaidar("atika");
        man[1].setmNipHaidar("102");
        man[1].setmGolonganHaidar("1");
        man[1].setmTunjanganHaidar(25000000);
        man[1].setmBagianHaidar("Pemasaran");
        
        staff1[0] = new Staff1841720194Haidar();
        staff1[0].setmNamaHaidar("Usman");
        staff1[0].setmNipHaidar("0003");
        staff1[0].setmGolonganHaidar("2");
        staff1[0].setmLemburHaidar(10);
        staff1[0].setGajiLemburHaidar(10000);
        
        staff1[1] = new Staff1841720194Haidar();
        staff1[1].setmNamaHaidar("Anugrah");
        staff1[1].setmNipHaidar("0005");
        staff1[1].setmGolonganHaidar("2");
        staff1[1].setmLemburHaidar(10);
        staff1[1].setGajiLemburHaidar(55000);
        man[0].setmSt(staff1);
        
        staff2[0] = new Staff1841720194Haidar();
        staff2[0].setmNamaHaidar("Hendra");
        staff2[0].setmNipHaidar("0004");
        staff2[0].setmGolonganHaidar("3");
        staff2[0].setmLemburHaidar(15);
        staff2[0].setGajiLemburHaidar(5500);
        
        staff2[1] = new Staff1841720194Haidar();
        staff2[1].setmNamaHaidar("Arie");
        staff2[1].setmNipHaidar("0006");
        staff2[1].setmGolonganHaidar("4");
        staff2[1].setmLemburHaidar(5);
        staff2[1].setGajiLemburHaidar(100000);
        
        staff2[2] = new Staff1841720194Haidar();
        staff2[2].setmNamaHaidar("Mentari");
        staff2[2].setmNipHaidar("0007");
        staff2[2].setmGolonganHaidar("3");
        staff2[2].setmLemburHaidar(6);
        staff2[2].setGajiLemburHaidar(20000);
        man[1].setmSt(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatInfoHaidar();
        man[1].lihatInfoHaidar();
    }
}
