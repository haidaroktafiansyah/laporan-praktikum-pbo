/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan3;

/**
 *
 * @author Haidar
 */
public class Tabung1841720194Haidar extends Bangun1841720194Haidar{

    protected int mT;

    public void setSupermPhiRizal(double mPhi) {
        super.mPhi = mPhi;
    }

    public void setSupermR(int mR) {
        super.mR = mR;
    }

    public void setmT(int mT) {
        this.mT = mT;
    }

    public void volume() {
        System.out.println("Volume tabung adalah: " + (super.mPhi * super.mR * super.mR * this.mT));
    }
}
