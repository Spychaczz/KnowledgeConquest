/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.knowledgeconquest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Spychacz
 */
public class Player extends JComponent{
    private String name;
    private int index;
    private int score;
    private int position;
    private Color color;
    private static ArrayList<Player> playerList = new ArrayList<>();
    
    Player(String name, int index){
        this.name = name;
        this.index = index;
        playerList.add(this);
        if(index == 0){ // 
            color = Color.RED;
        
        }
        if(index == 1){
            color = Color.BLUE;
        }
        if(index == 3){
            color = Color.GREEN;
        }
        if(index == 4){
            color = Color.MAGENTA;
        }
    }
    
    

    
    
    public String getName(){
        return name;
    }
    
    public int getIndex(){
        return index;
    }
    
    public int getPosition(){
        return position;
    }

    public void setPosition(int pos){
        position =  pos;
    }
    
    public Color getColor(){
        return color;
    }
    
    public static ArrayList<Player> getPlayerList(){
        return playerList;
    }

}

