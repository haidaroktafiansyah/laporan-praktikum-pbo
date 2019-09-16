/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
import java.util.Scanner;
/**
 *
 * @author Haidar
 */
public class MainTugas41841720194 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String KTP, nama; 
        boolean loop = true;
        int pilih, temp;
        
        System.out.println("No KTP: ");
        KTP = sc.nextLine();
        System.out.println("Nama Anggota: ");
        nama = sc.nextLine();
        
        Anggota1841720194Haidar donny = new Anggota1841720194Haidar(KTP, nama, 5000000);
        System.out.println("Nama : "+donny.getNama());
        System.out.println("Limit Peminjaman : "+donny.getLimitPinjaman());
        
        while(loop){
            donny.menuHaidar();
            pilih = sc.nextInt();
            if(pilih == 1 ){
                System.out.println("yang mau di pinjam RP ?");
                temp = sc.nextInt();
                donny.pinjam(temp);
            }
            else{
                if(pilih==2){
                    System.out.println("duit yang di pinjam RP : "+donny.getJumlahPinjaman());
                }
                else{
                    if(pilih==3){
                        System.out.println("limit yang bisa di pinjam RP : "+donny.getLimitPinjaman());
                    }
                    else{
                        if(pilih==4){
                            System.out.println("yang mau di bayar ?");
                            temp = sc.nextInt();
                            donny.angsur(temp);
                            System.out.println("sisa pinjaman RP : "+donny.getJumlahPinjaman());
                        }
                        else{
                            loop=false;
                        }
                    }
                }
            }
        }
        
    }
    
}
