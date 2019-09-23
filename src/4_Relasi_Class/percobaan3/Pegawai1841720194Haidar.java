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
public class Pegawai1841720194Haidar {
    private String nip;
    private String nama;

    public Pegawai1841720194Haidar(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public Pegawai1841720194Haidar() {
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String  info(){
        String info = "\n";
        info += "nip: " + this.nip +"\n";
        info += "nama: " + this.nama +"\n";
        return info;
    }
}
