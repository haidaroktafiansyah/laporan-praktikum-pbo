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
public class Kursi1841720194Haidar {

    private String nomor;
    Penumpang1841720194Haidar penumpang;

    public Kursi1841720194Haidar(String nomor) {
        this.nomor = nomor;
    }

    public Kursi1841720194Haidar() {
    }

    public String getNomor() {
        return nomor;
    }

    public Penumpang1841720194Haidar getPenumpang() {
        return penumpang;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public void setPenumpang(Penumpang1841720194Haidar penumpang) {
        this.penumpang = penumpang;
    }
    
    

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
