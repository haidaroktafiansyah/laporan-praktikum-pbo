/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Haidar
 */
public class InputGui1841720194Haidar extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JLabel dLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton tambutton;
    private JPanel panel;
    
    public InputGui1841720194Haidar(){
        createTextField();
        createButton();
        createPanel();
    }
    
    private void createTextField(){
        aLabel = new JLabel("Nilai A");
        bLabel = new JLabel("Nilai B");
        cLabel = new JLabel("Hasil : ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButton(){
        button = new JButton("Kali");
        tambutton = new JButton("Tambah");
        class AddI implements ActionListener{
           
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c=0;
                if(event.getSource()== button){
                   c = a*b;      
                }
                else{
                   c = a+b;
                }
                cLabel.setText("Hasil : "+ c);
            }
        }
        ActionListener listener = new AddI();
        button.addActionListener(listener);
        tambutton.addActionListener(listener);
    }
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(tambutton);
        panel.add(cLabel);
        add(panel);
    }
    
    public static void main(String[] args) {
        JFrame frame = new InputGui1841720194Haidar();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setLocation(600, 600);
    }
}
