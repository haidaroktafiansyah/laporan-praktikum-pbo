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
public class Processor184170194Haidar {
    private String mMerk;
    private double mCache;

    public Processor184170194Haidar(String i1, double i2) {
        this.mMerk = i1;
        this.mCache = i2;
    }

    public Processor184170194Haidar() {
    }

    public String getmMerk() {
        return mMerk;
    }

    public double getmCache() {
        return mCache;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmCache(double mCache) {
        this.mCache = mCache;
    }
    
    public void infoHaidar(){
        System.out.println("Merk Processor = "+mMerk);
        System.out.println("Cache Memory = "+mCache);
    }
}
