/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author Haidar
 */
public class MainProject11841720194Haidar {
    public static void main(String[] args) {
        Processor184170194Haidar p = new Processor184170194Haidar("intel i5", 3);
        Laptop1841720194Haidar l = new Laptop1841720194Haidar("thinkpad", p);
        
        l.infoHaidar();
        Processor184170194Haidar p1 = new Processor184170194Haidar();
        p1.setmMerk("Intel i5");
        p1.setmCache(4);
        Laptop1841720194Haidar l1 = new Laptop1841720194Haidar();
        l1.setmMerk("Thinkpad");
        l1.setProc(p1);
        l1.infoHaidar();
        
    }
}
