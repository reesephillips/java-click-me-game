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
import java.awt.event.*;

public class Instructions extends JPanel {
    public Instructions() {
        super();
        setBackground(Color.white);
        
        
        
    }
        
    @Override
       public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
                
        //paintComponent will be useful in this lab.
        //read more about it in the paiting the screen lesson 
        //and also the keyboard listener method
        
        g.drawString("Game 1 current score: " + Game1.score, 500, 50);
        g.drawString("Game 2 current score: ", 500, 90);
        g.drawString("Game 3 current score: ", 500, 130);
        
        
        
    }
        
    }
    

