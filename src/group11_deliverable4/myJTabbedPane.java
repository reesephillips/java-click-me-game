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

public class myJTabbedPane extends JTabbedPane{
    
    MainMenu m1;
    Instructions InstructionPanel;
    Game1 g1;
    Game2 g2;
    Game3 g3;
    
    
    public myJTabbedPane() {
    super();
       
        setBackground(Color.gray);
        m1 = new MainMenu();
        InstructionPanel = new Instructions();
        g1 = new Game1();
        g2 = new Game2();
        g3 = new Game3();
        
        addTab("Intro/Main Menu", m1);
        addTab("Instructions and Scores", InstructionPanel);
        addTab("Game 1", g1);
        addTab("Game 2", g2);
        addTab("Game 3", g3);
}
    
}
