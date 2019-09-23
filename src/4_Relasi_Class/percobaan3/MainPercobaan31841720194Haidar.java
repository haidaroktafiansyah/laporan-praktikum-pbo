/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author Haidar
 */
public class MainPercobaan31841720194Haidar {

    public static void main(String[] args) {
        Pegawai1841720194Haidar masinis = new Pegawai1841720194Haidar("1234", "Spongebob Squarepants");
        Pegawai1841720194Haidar asisten = new Pegawai1841720194Haidar("4567", "Patrick Star");
        KeretaApi1841720194Haidar keretaApi = new KeretaApi1841720194Haidar("Gaya Baru", "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}
