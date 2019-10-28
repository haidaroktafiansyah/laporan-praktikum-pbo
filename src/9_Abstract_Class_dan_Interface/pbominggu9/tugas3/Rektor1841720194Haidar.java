/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import interfacelatihan.*;

/**
 *
 * @author Haidar
 */
public class Rektor1841720194Haidar {
    public void beriSertif(ICumlaude mahasiswa){
        System.out.println("rektor memberi sertif cumlaude");
        System.out.println("selamat, Bagaimana bisa cumlaude?");
        
        mahasiswa.perkenalan();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("--------------------------------------");
    }

    void beriSertif(Mahasiswa1841720194Haidar biasa) {
        System.out.println("");
    }
    
    void berisertifmawa(IBerprestasi maha){
        System.out.println("rektor memberi sertif mawapres");
        System.out.println("bagaimana anda berprestasi ?");
        maha.menjuaraiKompetisi();
        maha.membuatPublikasiIlmiah();
    }

    void berisertifmawa(tugas3.Sarjana1841720194Haidar cumalude) {
        System.out.println("");
    }
}
