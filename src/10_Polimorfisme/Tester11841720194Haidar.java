/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Haidars
 */
public class Tester11841720194Haidar {
    public static void main(String[] args) {
        
        PermanentEmployee1841720194Haidar Pemp = new PermanentEmployee1841720194Haidar("dedik", 500);
        IntershipEmployee1841720194Haidar Iemp = new IntershipEmployee1841720194Haidar("sunarto", 5);
        ElectricityBill1841720194Haidar eb = new ElectricityBill1841720194Haidar(5, "A-1");
        Employee1841720194Haidar e;
        IPayable1841720194Haidar p;
        e=Pemp;
        e=Iemp;
        p=Pemp;
        p=eb;
    }
}
