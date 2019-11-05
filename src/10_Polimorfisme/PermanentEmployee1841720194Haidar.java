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
public class PermanentEmployee1841720194Haidar extends Employee1841720194Haidar implements  IPayable1841720194Haidar{
    
    private int mSalary;
    
    public PermanentEmployee1841720194Haidar(String name, int Salary){
        this.mSalary = Salary;
        this.mName= name;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmount() {
        return (int) (mSalary + 0.5 * mSalary);
    }

    @Override
    public String getEmployeeInfoHaidar() {
        String info = super.getEmployeeInfoHaidar()+"\n";
        info += "registered as permanent employee with salary "+ mSalary + "month/s\n";
        return info;
    }
    
    
}
