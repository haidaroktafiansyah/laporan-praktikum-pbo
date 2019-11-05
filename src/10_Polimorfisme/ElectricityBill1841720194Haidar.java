/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Locale;

/**
 *
 * @author Haidar
 */
public class ElectricityBill1841720194Haidar implements IPayable1841720194Haidar{
    private int mKwh;
    private String mCategory;

    public ElectricityBill1841720194Haidar(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwh() {
        return mKwh;
    }

    public void setmKwh(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmount() {
        return mKwh * getBasePrice();
    }
    
    public int getBasePrice(){
        int bPrice = 0;
        switch(mCategory){
            case "R-1" : bPrice = 100; break;
            case "R-2" : bPrice = 200; break;
        }
        return bPrice;
    }
    
    public String getBillInfo(){
        return "kWH = "+ mKwh+ "\n"+ "category = "+mCategory+"("+getBasePrice()+"per kWh\n";
    }
}
