/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author Haidar
 */
public class Laptop1841720194Haidar {
    private String mMerk;
    private Processor184170194Haidar proc;

    public Laptop1841720194Haidar() {
    }

    public Laptop1841720194Haidar(String mMerk, Processor184170194Haidar proc) {
        this.mMerk = mMerk;
        this.proc = proc;
    }

    public String getmMerk() {
        return mMerk;
    }

    public Processor184170194Haidar getProc() {
        return proc;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setProc(Processor184170194Haidar proc) {
        this.proc = proc;
    }
    
    public void infoHaidar(){
        System.out.println("Merk Laptop = "+mMerk);
        proc.infoHaidar();
    }
}
