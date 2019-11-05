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
public class Plant1841720194Haidar {
    public void doDestroy(Destroyable1841720194Haidar d){
        if(d instanceof WalkingZombie1841720194Haidar){
            ((WalkingZombie1841720194Haidar) d).destroyedHaidar();
        }
        else if(d instanceof JumpingZombie1841720194haidar){
            ((JumpingZombie1841720194haidar) d).destroyedHaidar();
        }
        else{
            ((Barrier1841720194Haidar)d).destroyedHaidar();
        }
    };
}
