/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Haidar
 */
public class sepedaDemo {
    public static void main(String[] args) {
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();
        sepedaGunung spd3 = new sepedaGunung();
        
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
