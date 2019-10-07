/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Haidar
 */
public class Laptop1841720194Haidar extends Komputer1841720194Haidar {

    public String mJnsBatrai;

    public Laptop1841720194Haidar() {
    }

    public Laptop1841720194Haidar(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrai) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.mJnsBatrai = mJnsBatrai;
    }

    public void tampilLaptopHaidar() {
        super.tampilDataHaidar();
        System.out.println("Jns Batrai      : " + mJnsBatrai);
    }
}
