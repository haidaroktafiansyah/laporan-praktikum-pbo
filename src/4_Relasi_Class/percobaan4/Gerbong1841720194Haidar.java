/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author Haidar
 */
public class Gerbong1841720194Haidar {

    private String kode;
    Kursi1841720194Haidar arrayKursi[];

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi1841720194Haidar(String.valueOf(i + 1));
        }
    }

    public Gerbong1841720194Haidar(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi1841720194Haidar[jumlah];
        this.initKursi();
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi1841720194Haidar kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang1841720194Haidar penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
}
