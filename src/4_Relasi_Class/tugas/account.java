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
public class account {
    
    private String ID;

    public account(String ID) {
        this.ID = ID;
    }

    public account() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
    
    public String info() {
        String info = "";
        info += "ID: " + ID + "\n";
 
        return info;
    }
    
}
