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
public class Mac1841720194Haidar extends Laptop1841720194Haidar{

    public String mSecurity;

    public Mac1841720194Haidar() {
    }

    public Mac1841720194Haidar(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrai, String mSecurity) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrai);
        this.mSecurity = mSecurity;
    }

    public void tampilMacHaidar() {
        System.out.println("============Data Mac============");
        super.tampilLaptopHaidar();
        System.out.println("Security        : " + mSecurity);
    }
}
