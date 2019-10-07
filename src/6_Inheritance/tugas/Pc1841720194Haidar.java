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
public class Pc1841720194Haidar extends Komputer1841720194Haidar{
    public int mUkuranMonitor;

    public Pc1841720194Haidar() {
    }

    public Pc1841720194Haidar(String mMerk, int mKecProsesor, int mSizeMemory, String mJnsProsesor, int mUkuranMonitor) {
        super(mMerk, mKecProsesor, mSizeMemory, mJnsProsesor);
        this.mUkuranMonitor = mUkuranMonitor;
    }
    public void tampilPCHaidar(){
        super.tampilDataHaidar();
        System.out.println("Ukuran Monitor      : "+mUkuranMonitor);
    }
}
