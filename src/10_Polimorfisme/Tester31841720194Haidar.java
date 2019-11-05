/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Haidar
 */
public class Tester31841720194Haidar {
    public static void main(String[] args) {
        PermanentEmployee1841720194Haidar pEmp = new PermanentEmployee1841720194Haidar("dedik", 500);
        IntershipEmployee1841720194Haidar iEmp = new IntershipEmployee1841720194Haidar("sunarto", 5);
        ElectricityBill1841720194Haidar eBill = new ElectricityBill1841720194Haidar(5, "A-1");
        
        Employee1841720194Haidar e[] = {pEmp,iEmp};
        IPayable1841720194Haidar p[] = {pEmp,eBill};
        //Employee1841720194Haidar e2[] = {pEmp,iEmp,eBill};
    }
}
