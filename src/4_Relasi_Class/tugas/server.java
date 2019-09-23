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
public class server {
    private String kode;
    player player[];

    private void initPlayer() {
        for (int i = 0; i < player.length; i++) {
            this.player[i] = new player(String.valueOf(i + 1));
        }
    }

    public server(String kode, int jumlah) {
        this.kode = kode;
        this.player = new player[jumlah];
        this.initPlayer();
    }

    public String info() {
        String info = "";
        info += "Kode Server : " + kode + "\n";
        for (player playerall : player) {
            info += playerall.info();
        }
        return info;
    }
    

    public void setaccount(account account, int nomor) {
        if(this.player[nomor-1].getpemain()==null){
            this.player[nomor - 1].setpemain(account);
        }
        else{
            System.out.println("server player is slotted");
        }
    }
}
