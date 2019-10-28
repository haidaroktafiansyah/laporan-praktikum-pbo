/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Haidar
 */
public class PascaSarjana1841720194Haidar extends Mahasiswa1841720194Haidar implements  ICumlaude,IBerprestasi{

    public PascaSarjana1841720194Haidar(String nama){
        super(nama);
    }
    
    @Override
    public void lulus() {
        System.out.println("Selesai Tesis");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println(" IP lebih dari 3,71");
    }

    @Override
    public void perkenalan() {
        kuliahDiKampus();
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("menjuarai Internasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("terbit di jurnal Internasional");
    }
    
}
