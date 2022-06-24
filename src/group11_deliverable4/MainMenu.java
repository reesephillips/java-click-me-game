package group11_deliverable4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reesephillips
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MainMenu extends JPanel implements ActionListener {
    
    int TIME = 0;
    Timer tim;
    
    public MainMenu() {
        super();
        setBackground(Color.white);
        JButton j1 = new JButton("Quit");
        add(j1);
        
        tim = new Timer(1000, this);
        tim.start();
    }
    
    public void paintComponent(Graphics g) {
        
        g.drawString("Current runtime in seconds " + TIME, 500, 50);
       
    }
    
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        if (obj == tim) {
            TIME = TIME +1;
            repaint();
        }
        
      
    }
}
