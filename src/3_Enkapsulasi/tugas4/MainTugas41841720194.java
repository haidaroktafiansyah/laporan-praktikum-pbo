/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Haidar
 */
public class MainTugas41841720194 {


        public static void main(String[] args) {
            Anggota1841720194Haidar donny = new Anggota1841720194Haidar("111333444", "Donny", 5000000);
            System.out.println("Nama Anggota: " + donny.getNama());
            System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
            System.out.println("\nMeminjam uang 10.000.000...");
            donny.pinjam(10000000);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            System.out.println("\nMeminjam uang 4.000.000...");
            donny.pinjam(4000000);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            System.out.println("\nMembayar angsuran 400");
            donny.angsur(400);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
            System.out.println("\nMembayar angsuran 3.000.000");
            donny.angsur(3000000);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        }
    
}
