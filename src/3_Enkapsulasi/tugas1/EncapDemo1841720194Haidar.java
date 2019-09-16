/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import com.sun.tools.attach.AgentLoadException;
import jdk.jfr.Period;

/**
 *
 * @author Haidar
 */
public class EncapDemo1841720194Haidar {
    private String mName;
    private int mAge;
    
    public String getNameHaidar(){
        return mName;
    }
    
    public void setName(String newName){
        mName = newName;
    }
    
    public int getAge(){
        return mAge;
    }
    
    public void setAge(int newAge){
        if(newAge > 30 ) mAge=30;
        else{
            if(newAge<18) mAge=18;
            else{
                mAge = newAge;
            }
        }
    }
}
