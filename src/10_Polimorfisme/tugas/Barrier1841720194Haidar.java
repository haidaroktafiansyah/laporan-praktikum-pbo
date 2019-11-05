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
public class Barrier1841720194Haidar implements Destroyable1841720194Haidar{
    private int strength;

    public Barrier1841720194Haidar(int strength) {
        this.strength = strength;
    };

    public void setStrength(int strength) {
        this.strength = strength;
    };

    public int getStrength() {
        return strength;
    };

    @Override
    public void destroyedHaidar() {
        strength -= 9;
    };
    
    public String getBarierinfoHaidar(){
        return "barier strength = "+strength;
    };
}
