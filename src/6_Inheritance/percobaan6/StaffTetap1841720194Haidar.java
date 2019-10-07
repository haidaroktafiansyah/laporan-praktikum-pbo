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
public class StaffTetap1841720194Haidar extends Staff1841720194Haidar {

    public String mGolongan;
    public int mAsuransi;

    public StaffTetap1841720194Haidar() {
    }

    public StaffTetap1841720194Haidar(String mNama, String mAlamat, String mJk, int mUmur, int mGaji, int mLembur, int mPotongan, String mGolongan, int mAsuransi) {
        super(mNama, mAlamat, mJk, mUmur, mGaji, mLembur, mPotongan);
        this.mGolongan = mGolongan;
        this.mAsuransi = mAsuransi;
    }

    public void tampilStaffTetapRizal() {
        System.out.println("==============Data Staff Tetap==============");
        super.tampilDataStaffHaidar();
        System.out.println("Golongan        = " + mGolongan);
        System.out.println("Jumlah Asuransi = " + mAsuransi);
        System.out.println("Gaji Bersih     = " + (mGaji + mLembur - mPotongan - mAsuransi));
    }
}
