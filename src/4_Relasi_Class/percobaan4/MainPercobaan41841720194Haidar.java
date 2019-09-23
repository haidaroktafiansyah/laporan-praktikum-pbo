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
public class MainPercobaan41841720194Haidar {
    public static void main(String[] args) {
        Penumpang1841720194Haidar p = new Penumpang1841720194Haidar("12345", "Mr. Krab");
        Gerbong1841720194Haidar gerbong = new Gerbong1841720194Haidar("A", 10);
        gerbong.setPenumpang(p,1);
        System.out.println(gerbong.info());
    }
}
