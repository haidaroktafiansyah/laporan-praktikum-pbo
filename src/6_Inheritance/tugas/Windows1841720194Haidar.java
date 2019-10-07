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
public class Windows1841720194Haidar extends Laptop1841720194Haidar{

    public String mFitur;

    public Windows1841720194Haidar() {
    }

    public Windows1841720194Haidar(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, String mJnsBatrai, String mFitur) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor, mJnsBatrai);
        this.mFitur = mFitur;
    }

    public void tampilWindowsHaidar() {
        System.out.println("============Data Windows============");
        super.tampilLaptopHaidar();
        System.out.println("Fitur           : " + mFitur);
    }
}
