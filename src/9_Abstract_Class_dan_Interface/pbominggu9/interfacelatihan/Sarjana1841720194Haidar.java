/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author Haidar
 */
public class Sarjana1841720194Haidar extends Mahasiswa1841720194Haidar implements ICumlaude{

    public Sarjana1841720194Haidar(String nama){
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku Sudah Menyelesaikan Skripsi");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku Lebih Dari 3,51");
    }
    
}
