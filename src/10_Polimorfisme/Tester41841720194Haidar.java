/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.security.acl.Owner;

/**
 *
 * @author Haidar
 */
public class Tester41841720194Haidar {
    public static void main(String[] args) {
        Owner1841720194Haidar ow = new Owner1841720194Haidar();
        ElectricityBill1841720194Haidar eBill = new ElectricityBill1841720194Haidar(5, "R-1");
        ow.pay(eBill);
        System.out.println("----------------------");
        
        PermanentEmployee1841720194Haidar pEmp = new PermanentEmployee1841720194Haidar("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-----------------------");
        
        IntershipEmployee1841720194Haidar iEmp = new IntershipEmployee1841720194Haidar("Sumarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-----------------------");
        ow.showMyEmployee(iEmp);
    }
}
