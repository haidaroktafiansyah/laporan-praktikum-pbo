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
public class JumpingZombie1841720194haidar extends Zombie1841720194Haidar{

    public JumpingZombie1841720194haidar(int health, int level) {
        super.health = health;
        super.level = level;
    };

    @Override
    public void destroyedHaidar() {
       super.health = 11;
    }

    @Override
    public String getZombieInfoHaidar() {
        return super.getZombieInfoHaidar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void healHaidar() {
        super.healHaidar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
