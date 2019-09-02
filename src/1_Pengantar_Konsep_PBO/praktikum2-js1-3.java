/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Haidar
 */
public class sepedaGunung extends sepeda{
    private String TipeSuspensi;
    
    public void setTipeSuspensiHaidar(String newValue){
        TipeSuspensi = newValue;
    }
    
    public void cetakStatusHaidar(){
        super.cetakStatusHaidar();
        System.out.println("Tipe suspensi : "+TipeSuspensi);
    }
}
