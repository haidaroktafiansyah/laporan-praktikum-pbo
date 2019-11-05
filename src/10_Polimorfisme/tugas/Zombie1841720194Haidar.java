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
public class Zombie1841720194Haidar implements Destroyable1841720194Haidar{
    protected float health;
    protected int level;
    
    public void healHaidar(){
    }
    
    
    public String  getZombieInfoHaidar(){
        return "walking  zombie data = \n"+"health = "+(int)health+" \n"+"level = "+level;
    }

    @Override
    public void destroyedHaidar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    };
}
