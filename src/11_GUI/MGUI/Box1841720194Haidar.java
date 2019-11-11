/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MGUI;

import javax.swing.*;

/**
 *
 * @author Haidar
 */
public class Box1841720194Haidar extends JFrame{
    private JPanel panel;
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    
    public Box1841720194Haidar(){
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        
        add(panel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Box Layout Demo");
    }
    
}
