/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author Haidar
 */
public class MotorDemo21841720194Haidar {

    public static void main(String[] args) {
        Motor21841720194Haidar motor = new Motor21841720194Haidar();
        
        motor.printStatusHaidar();
        motor.tambahKecepatanHaidar();
        
        motor.nyalakanMesinHaidar();
        motor.printStatusHaidar();
        
        motor.tambahKecepatanHaidar();
        motor.printStatusHaidar();
        
        System.out.println("tambah kecepatan 20x");
        for(int i =0; i<20; i++){
            motor.tambahKecepatanHaidar();
        }
        motor.printStatusHaidar();
        
        motor.matikanMesinHaidar();
        motor.printStatusHaidar();
    }
}
