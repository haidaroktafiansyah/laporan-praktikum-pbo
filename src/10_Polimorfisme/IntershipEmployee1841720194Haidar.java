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
public class IntershipEmployee1841720194Haidar extends Employee1841720194Haidar{
    private int mLength;
    
    public IntershipEmployee1841720194Haidar(String name, int length){
        this.mLength = length;
        this.mName = name;
    };

    public int getmLength() {
        return mLength;
    }

    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfoHaidar() {
        String info = super.getEmployeeInfoHaidar()+"\n";
        info += "registered as internship employee for "+ mLength + "month/s\n";
        return info;
    }
    
    
}
