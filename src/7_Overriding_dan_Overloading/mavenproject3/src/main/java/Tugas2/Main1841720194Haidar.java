/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Haidar
 */
public class Main1841720194Haidar {
    public static void main(String[] args) {
        Manusia1841720194Haidar man = new Manusia1841720194Haidar();
        Manusia1841720194Haidar mandmd1 = new Dosen1841720194Haidar();
        Manusia1841720194Haidar mandmd2 = new Mahasiswa1841720194Haidar();
        
        System.out.println("manusia");
        man.bernafas();
        man.makan();
        System.out.println("dosen");
        mandmd1.bernafas();
        mandmd1.makan();
        System.out.println("mahasiswa");
        mandmd2.bernafas();
        mandmd2.makan();
    }
}
