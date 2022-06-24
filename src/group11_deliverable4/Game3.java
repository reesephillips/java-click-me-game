/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group11_deliverable4;

/**
 *
 * @author reesephillips
 */
import java.awt.*;
import javax.swing.*;
public class Game3 extends JPanel {
    
    public Game3() {
        super();
    setBackground(Color.white);
    JLabel jl1 = new JLabel("Penn State Football Trivia");
    jl1.setFont(new Font ("Serif", Font.PLAIN, 20));
    JLabel jl2 = new JLabel("Penn States all time ;eading rusher?");
    jl2.setFont(new Font ("Serif", Font.PLAIN, 20));
    add(jl1);
    add(jl2);
    
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
    }
    
}
