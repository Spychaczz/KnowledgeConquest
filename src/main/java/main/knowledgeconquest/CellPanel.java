/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.knowledgeconquest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author Spychacz
 */
public class CellPanel extends JPanel{

    private boolean[] drawPawn = {false, false, false, false};
    private boolean[] deletePawn = {false, false, false, false};
    private Color pawn1Color = Color.RED;
    private Color pawn2Color = Color.GREEN;
    private Color pawn3Color = Color.BLUE;
    private Color pawn4Color = Color.ORANGE;
    
    
    private int index;
    static private ArrayList<CellPanel> fieldList = new ArrayList<>();
    private Player player1;
    
    public CellPanel(){// dodać kod aby każdy tworzony cellpanel dodawał się do tablicy boardTable!!!
        fieldList.add(this);
        this.index = fieldList.size(); // INDEX FROM 1
        
       // fieldList.get(fieldList.size() - 1).set
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        // drawing field numbers
        Font font = new Font("Arial", Font.BOLD, 11);
        String number = Integer.toString(index);
        g.drawString(number, 5, 10);
        /////////////////////////////
        final int x1 = 30;
        final int y1 = 2;
        final int size = 20;
        final int dist = 30;
        if(drawPawn[0]){
            g.setColor(pawn1Color);
            g.fillOval(x1, y1, size, size);
        }
        if(deletePawn[0]){
            g.setColor(this.getBackground());
            g.fillOval(x1, y1, size, size);
        }
        
        if(drawPawn[1]){
            g.setColor(pawn2Color);
            g.fillOval(x1 + dist, y1, size, size);
        }
        if(deletePawn[1]){
            g.setColor(this.getBackground());
            g.fillOval(x1 + dist, y1, size, size);
        }
        
        if(drawPawn[2]){
            g.setColor(pawn3Color);
            g.fillOval(x1, y1 + dist, 20, 20);
        }
        if(deletePawn[2]){
            g.setColor(this.getBackground());
            g.fillOval(x1, y1 + dist, 20, 20);
        }
        
        if(drawPawn[3]){
            g.setColor(pawn4Color);
            g.fillOval(x1 + dist, y1 + dist, 20, 20);
        }
        if(deletePawn[3]){
            g.setColor(this.getBackground());
            g.fillOval(x1 + dist, y1 + dist, 20, 20);
        }
        
    }
    
    
  
    
    
 
    public void drawPawn(int player){
        drawPawn[player] = true;
        repaint();
    }
    public void deletePawn(int player){
        deletePawn[player] = true;
        repaint();
    }
    
    

    public static ArrayList<CellPanel> getFieldList(){
        return fieldList;
    }

}
