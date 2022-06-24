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

public class Game1 extends JPanel implements KeyListener, ActionListener {
    JButton jb1, jb2;
    
    int x = 100;
    int y = 100;
    int s = 100;
    int f = 60;
    static int score = 0;
    Timer tim;
    int delay = 0; 
    JProgressBar pbVertical;
    
    
    
    public Game1() { 
        super();
        setLayout(null);
        setBackground(Color.white);
        jb1 = new JButton("Click me");

        Rectangle ch = new Rectangle(x, y, s, s);
        jb1.addActionListener(this);
        add(jb1);
        jb1.setBounds(ch);
        
        delay = 1000; //milliseconds
        tim = new Timer(delay, this);
        
        jb1.setFocusable(true);
        jb1.addKeyListener(this);
        requestFocusInWindow();
       
        setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        pbVertical = new JProgressBar(JProgressBar.VERTICAL, 0, 60);// 500 the maximun number of intervals that th progress bar will show
        pbVertical.setStringPainted(true);
        pbVertical.setString("TIMER");
        add(p1, "East");
        p1.add(pbVertical);
        
        
    }
    
    
     @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
                
        //paintComponent will be useful in this lab.
        //read more about it in the paiting the screen lesson 
        //and also the keyboard listener method
        g.drawString("score = " + score, 10, 520);
        g.drawString("Press Spacebar to start the game", 10, 540);
        g.drawString("You have 60 seconds to keep clicking on the button to score", 10, 560);
        
        
    }
    
    
    
    @Override
    public void keyPressed(KeyEvent ke) {
        int kk = ke.getKeyCode();
        System.out.println("Key pressed");
        if (kk == ke.VK_SPACE) {
        
            tim.start(); 
        }
    }
    public void keyReleased(KeyEvent ke) { 
        int kk = ke.getKeyCode();
        if (kk == ke.VK_SPACE) {
            score = score - 1;
        }
    
    }
    
    public void keyTyped(KeyEvent ke) {}
   
    private void changeButtonLocation()
    {
        // Use random integers between the bounds of the panel is the button's location
        int xPosition = (int) (Math.random() * 1000);
        int yPosition = (int) (Math.random() * 500);
        jb1.setLocation(xPosition, yPosition);
    }

    public void actionPerformed(ActionEvent event) {
        Object obj = event.getSource();
        
        if (obj == jb1) {
            score = score + 1;
            repaint();
            
        }
        if (obj == tim) {
            changeButtonLocation();
            f = f-1;
            pbVertical.setValue(f);
            pbVertical.setString("" + f);
            
            if (f == 0) {
                tim.stop();
                jb2 = new JButton("GAME OVER Score: " + score);
                Rectangle ch = new Rectangle(x, y, 200, 200);
                add(jb2);
                jb2.setBounds(ch);
                
            }
            
        }
        
        
    }
    
    
}
