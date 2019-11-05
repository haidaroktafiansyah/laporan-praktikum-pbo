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
public class Owner1841720194Haidar {

    public void pay(IPayable1841720194Haidar p) {
        System.out.println("total payment = " + p.getPaymentAmount());
        if (p instanceof ElectricityBill1841720194Haidar) {
            ElectricityBill1841720194Haidar eb = (ElectricityBill1841720194Haidar) p;
            System.out.println("" + eb.getBillInfo());
        } else if (p instanceof PermanentEmployee1841720194Haidar) {
            PermanentEmployee1841720194Haidar pe = (PermanentEmployee1841720194Haidar) p;
            pe.getEmployeeInfoHaidar();
            System.out.println("" + pe.getEmployeeInfoHaidar());
        }
    }
        

    public void showMyEmployee(Employee1841720194Haidar e) {
        System.out.println("" + e.getEmployeeInfoHaidar());
        if (e instanceof PermanentEmployee1841720194Haidar) {
            System.out.println("You have pay her/him mothly!!!");
        } else {
            System.out.println("No need to pay him/her");
        }
    }

}
