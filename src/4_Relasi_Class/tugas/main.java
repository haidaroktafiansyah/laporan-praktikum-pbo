/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Haidar
 */
public class main{
    public static void main(String[] args) {
        
        server server1 = new server("ABCDEFG", 10);
        
        account p1 = new account("12345");
        server1.setaccount(p1,1);
        market b1 = new market(5);
        
        account p2 = new account("12346");
        server1.setaccount(p2,2);
        
        System.out.println(server1.info());
        System.out.println("balance player 1: "+b1.getBalance());
    }
}
