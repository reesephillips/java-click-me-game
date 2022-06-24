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

public class MainFrame extends JFrame {
    myJTabbedPane mjp;
    
    public MainFrame()
    {
        super("Welcome to our game");
        mjp = new myJTabbedPane();
		getContentPane().add(mjp,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (1200, 650);
		setVisible(true);
    }
    public void MacLayoutSetup()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear 
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    

    }
    }
