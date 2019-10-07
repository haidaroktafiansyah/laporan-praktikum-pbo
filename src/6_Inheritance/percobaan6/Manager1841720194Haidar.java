/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan6;

/**
 *
 * @author Haidar
 */
public class Manager1841720194Haidar extends Karyawan1841720194Haidar{
     public int mTunjangan;

    public Manager1841720194Haidar() {
    }
    
    public void tampilDataManagerHaidar(){
        super.tampilDataKaryawanHaidar();
        System.out.println("Tunjangan       = "+mTunjangan);
        System.out.println("Total Gaji      = "+super.mGaji+mTunjangan);
    }
}
