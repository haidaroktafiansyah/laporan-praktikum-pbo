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
public class Program1841720194Haidar {

    public static void main(String[] args) {
        Rektor1841720194Haidar rek = new Rektor1841720194Haidar();

        //Mahasiswa1841720194Haidar biasa = new Mahasiswa1841720194Haidar("cahrlie");
        Sarjana1841720194Haidar cumalude = new Sarjana1841720194Haidar("Dini");
        PascaSarjana1841720194Haidar Master = new PascaSarjana1841720194Haidar("Haidar");

        //rek.beriSertif(biasa);
        //rek.beriSertif((ICumlaude)cumalude);
        //rek.beriSertif((ICumlaude)Master);
        
        rek.berisertifmawa(cumalude);
        rek.berisertifmawa(Master);
    }
}
