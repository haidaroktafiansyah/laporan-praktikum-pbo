/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1;

/**
 *
 * @author Haidar
 */
public class SepedaDemo1841720194Haidar {
    public static void main(String[] args) {
        Sepeda1841720194Haidar spd1 = new Sepeda1841720194Haidar();
        Sepeda1841720194Haidar spd2 = new Sepeda1841720194Haidar();
        SepedaGunung1841720194Haidar spd3 = new SepedaGunung1841720194Haidar();
        
        spd1.setMerekHaidar("polygone");
        spd1.tambahKecepatanHaidar(10);
        spd1.gantiGearHaidar(2);
        spd1.cetakStatusHaidar();
        
        spd2.setMerekHaidar("Wiim Cycle");
        spd2.tambahKecepatanHaidar(10);
        spd2.gantiGearHaidar(2);
        spd2.tambahKecepatanHaidar(10);
        spd2.gantiGearHaidar(3);
        spd2.cetakStatusHaidar();
        
        spd3.setMerekHaidar("kline");
        spd3.tambahKecepatanHaidar(5);
        spd3.gantiGearHaidar(7);
        spd3.setTipeSuspensiHaidar("Gas suspension");
        spd3.cetakStatusHaidar();
    }
}
