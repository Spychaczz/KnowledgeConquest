/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.knowledgeconquest;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author Adam
 */
public class Pawn extends JComponent {
    private Color color = Color.BLUE;
    private final int x = 10;
    private final int y = 10;
    private final int size = 20;
    private CellPanel currentPanel;
    
    
    public Pawn(Color color, CellPanel startPanel){
        this.currentPanel = startPanel;
        this.color = color;
    }
    
    
        @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(10, 10, size, size);
        
        g.setColor(new Color(187,187,187));
        g.fillOval(10, 10, size, size);
        repaint();
    }
    
    public void movePawn(CellPanel targetPanel){
        currentPanel.remove(this);
        targetPanel.add(this);
        currentPanel = targetPanel;
        repaint();
    }
}
