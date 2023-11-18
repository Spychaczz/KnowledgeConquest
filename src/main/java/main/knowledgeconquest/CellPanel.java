/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.knowledgeconquest;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Spychacz
 */
public class CellPanel extends JPanel{
    private JPanel[][] boardTable;
    
    public CellPanel(){// dodać kod aby każdy tworzony cellpanel dodawał się do tablicy boardTable!!!
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
     g.setColor(Color.red);
        g.fillRect(25,25,10,10);
     g.setColor(Color.BLUE);
        g.fillOval(25, 50, 10, 10);
      
    }
    
    
    public void drawPion(Graphics g){
        g.setColor(Color.red);
        g.fillRect(0,0,5,5);
    }//((CellPanel)jPanel1).drawPion(jPanel1.getGraphics());
}
