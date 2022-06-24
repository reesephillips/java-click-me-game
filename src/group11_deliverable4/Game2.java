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
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Game2 extends JPanel implements ActionListener {
    
    JButton rock, paper, scissors;
    String playerPlay; 
    String virtualPlay = " ";
    String respond;
    int compInt = (int)(Math.random()*3)+1;
        
        
    
    public Game2() {
     
        super();
        
        JLabel jl1 = new JLabel("Play rock paper scissors against the computer!");
        jl1.setFont(new Font ("Serif", Font.PLAIN, 20));
        add(jl1);
        
        setBackground(Color.white);
        rock = new JButton("Rock");
        paper = new JButton("Paper");
        scissors = new JButton("Scissors");
        add(rock);
        add(paper);
        add(scissors);
        
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissors.addActionListener(this);
        
    
    }
    
    
                
    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        
        if (obj == rock) {
            JButton jb1 = new JButton("Rock beats scissors, you win!");
            
            add(jb1);
              
        }
        
        if (obj == paper) {
            JLabel jl1 = new JLabel("Scissors beat paper, you lose");
            add(jl1);
        }
        
        if (obj == scissors) {
            JLabel jl1 = new JLabel("Scissors beat paper, you win!");
            add(jl1);
        }
    }
    
}
