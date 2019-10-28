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
public class Main1841720194Haidar {
    public static void main(String[] args) {
        Kucing1841720194Haidar kampung = new Kucing1841720194Haidar();
        Ikn1841720194Haidar lumba = new Ikn1841720194Haidar();
        
        Orang1841720194Haidar ani = new Orang1841720194Haidar("ani");
        Orang1841720194Haidar budi = new Orang1841720194Haidar("budi");
        
        
        ani.PeliharaanHewan(kampung);
        budi.PeliharaanHewan(lumba);
        
        ani.ajakjalan();
        budi.ajakjalan();
    }
}
