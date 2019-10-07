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
public class StaffHarian1841720194Haidar extends Staff1841720194Haidar {

    public int mJmlJamKerja;

    public StaffHarian1841720194Haidar() {
    }

    public StaffHarian1841720194Haidar(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan, int mJmlJamKerja) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mJmlJamKerja = mJmlJamKerja;
    }

    public void tampilStaffHarianRizal() {
        System.out.println("==============Data Staff Harian==============");
        super.tampilDataStaffHaidar();
        System.out.println("Jumlah Jam Kerja= " + mJmlJamKerja);
        System.out.println("Gaji Bersih     = " + (mGaji * mJmlJamKerja + mLembur - mPotongan));
    }
}
