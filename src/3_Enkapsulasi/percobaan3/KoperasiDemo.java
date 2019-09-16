/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author Haidar
 */
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota1841720194Haidar anggota1 = new Anggota1841720194Haidar("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+ anggota1.getNamaHaidar()+" : Rp "+anggota1.getSimpananHaidar());
        
        anggota1.setNamaHaidar("Iwan Setiawan");
        anggota1.setAlamatHaidar("Jalan Soekarno Hatta no 10");
        anggota1.setorHaidar(100000);
        System.out.println("Simpanan "+ anggota1.getNamaHaidar()+" : Rp "+anggota1.getSimpananHaidar());
        anggota1.pinjamHaidar(5000);
        System.out.println("Simpanan "+ anggota1.getNamaHaidar()+" : Rp "+anggota1.getSimpananHaidar());
    }
}
