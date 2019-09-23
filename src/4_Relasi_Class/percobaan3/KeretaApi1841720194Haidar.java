/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author Haidar
 */
public class KeretaApi1841720194Haidar {

    private String nama;
    private String kelas;
    private Pegawai1841720194Haidar masinis;
    private Pegawai1841720194Haidar asisten;

    public KeretaApi1841720194Haidar(String nama, String kelas, Pegawai1841720194Haidar masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720194Haidar(String nama, String kelas, Pegawai1841720194Haidar masinis, Pegawai1841720194Haidar asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public Pegawai1841720194Haidar getMasinis() {
        return masinis;
    }

    public Pegawai1841720194Haidar getAsisten() {
        return asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinis(Pegawai1841720194Haidar masinis) {
        this.masinis = masinis;
    }

    public void setAsisten(Pegawai1841720194Haidar asisten) {
        this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
