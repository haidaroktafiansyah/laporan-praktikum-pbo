/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1;

/**
 *
 * @author Haidar
 */
public class SepedaGunung1841720194Haidar extends Sepeda1841720194Haidar{
    private String mTipeSuspensi;
    
    public void setTipeSuspensiHaidar(String newValue){
        mTipeSuspensi = newValue;
    }
    
    public void cetakStatusHaidar(){
        super.cetakStatusHaidar();
        System.out.println("Tipe suspensi : "+ mTipeSuspensi);
    }
}
