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
public class tester1841720194Haidar {
    public static void main(String[] args) {
        WalkingZombie1841720194Haidar wz = new WalkingZombie1841720194Haidar(100, 1);
        JumpingZombie1841720194haidar jz = new JumpingZombie1841720194haidar(100, 2);
        Barrier1841720194Haidar b = new Barrier1841720194Haidar(100);
        Plant1841720194Haidar p = new Plant1841720194Haidar();
        System.out.println(""+wz.getZombieInfoHaidar());
        System.out.println(""+jz.getZombieInfoHaidar());
        System.out.println(""+b.getBarierinfoHaidar());
        System.out.println("----------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoHaidar());
        System.out.println(""+jz.getZombieInfoHaidar());
        System.out.println(""+b.getBarierinfoHaidar());
    }
}
