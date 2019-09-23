/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author Haidar
 */
public class MainPercobaan21841720194Haidar {

    public static void main(String[] args) {
        Mobil1841720194Haidar m = new Mobil1841720194Haidar();
        m.setmMerk("Avanza");
        m.setmBiaya(350000);
        Sopir1841720194Haidar s = new Sopir1841720194Haidar();
        s.setmNama("John Doe");
        s.setmBiaya(200000);
        Pelanggan1841720194Haidar p = new Pelanggan1841720194Haidar();
        p.setmNama("Jane Doe");
        p.setmMobil(m);
        p.setmSopir(s);
        p.setmHari(2);
        System.out.println("Biaya Total = " + p.hitungBiayaTotalHaidar());
    }
}
