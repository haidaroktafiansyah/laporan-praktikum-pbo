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
public class TestMahasiswa1841720194Haidar {
    public static void main(String[] args) {
        Mahasiswa1841720194Haidar mhs1 = new Mahasiswa1841720194Haidar();
        mhs1.mNim = 101;
        mhs1.mNama = "Lestari";
        mhs1.mAlamat = "Jl. Vinolia No 1A";
        mhs1.mKelas = "1A";
        mhs1.tampilBiodataHaidar();
        
        System.out.println("");
        Mahasiswa1841720194Haidar mhs2 = new Mahasiswa1841720194Haidar();
        mhs2.mNim = 102;
        mhs2.mNama = "fitri";
        mhs2.mAlamat = "Jl. Tasulum No 3A";
        mhs2.mKelas = "1A";
        mhs2.tampilBiodataHaidar();
        System.out.println("");
        
        Mahasiswa1841720194Haidar mhs3 = new Mahasiswa1841720194Haidar();
        mhs3.mNim = 103;
        mhs3.mNama = "sari";
        mhs3.mAlamat = "Jl. tumbun No 6B";
        mhs3.mKelas = "1A";
        mhs3.tampilBiodataHaidar();
    }
}
