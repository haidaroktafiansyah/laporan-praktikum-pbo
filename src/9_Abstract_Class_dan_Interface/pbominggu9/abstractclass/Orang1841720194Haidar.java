/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu9.abstractclass;

/**
 *
 * @author Haidar
 */
public class Orang1841720194Haidar {
    private String nama;
    private Hewan1841720194Haidar hewanpeliharaan;
    
    public Orang1841720194Haidar(String nama){
        this.nama = nama;
    }
    
    public void PeliharaanHewan(Hewan1841720194Haidar input){
        this.hewanpeliharaan = input;
    }
    
    public void ajakjalan(){
        System.out.println("namaku "+this.nama);
        System.out.println("Hewan Peliharaanku jalan dengan cara : ");
        this.hewanpeliharaan.bergerakHaidar();
        System.out.println("-------------------------------------");
    }
}
