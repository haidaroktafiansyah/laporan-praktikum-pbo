/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Haidar
 */
public class game1841720194Haidar {
    public String mNamaGame;
    public int mHarga;
    public int mPilih;
    public String mMember;
    public int mLamaHari;
    
    public void showMenuHaidar(){
        System.out.println("1.game 1 2000/day");
        System.out.println("2.game 2 3000/day");
        System.out.println("3.game 3 4000/day");
        System.out.println("1 / 2 / 3 only");
    }
    
    public int bayarHaidar(){
        if(mPilih==1){
            if(mMember.equals("yes")){
                return 2000 * mLamaHari /2;
            }else{
                return 2000 * mLamaHari;
            }
        }else{
            if(mPilih==2){
                if(mMember.equals("yes")){
                    return 3000 * mLamaHari /2;
                }else{
                    return 3000 * mLamaHari;
                }
            }else{
                if(mMember.equals("yes")){
                    return 4000 * mLamaHari /2;
                }else{
                    return 4000 * mLamaHari;
                }
            }
        }
    }
}
