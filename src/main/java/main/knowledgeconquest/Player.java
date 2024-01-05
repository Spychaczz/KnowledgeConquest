/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.knowledgeconquest;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 *
 * @author Spychacz
 */
public class Player extends JComponent{
    private String name;
    private int index;
    
    private int goodAnswers = 0;
    private int badAnswers = 0;
    private String score = "<html>Good answers: " + goodAnswers + "<br>Bad answers: " + badAnswers;
    
    private int position = 0;
    private int oldPosition = 0;
    private CellPanel positionPanel;
    
    private Color color;
    private static ArrayList<Player> playerList = new ArrayList<>();
    
    Player(String name, int index){
        this.name = name;
        this.index = index;
        playerList.add(this);
        this.positionPanel = CellPanel.getFieldList().get(0);
    }
    
    public String getName(){
        return name;
    }
    
    public CellPanel getPositionPanel(){
        return positionPanel;
    }
    
    public Color getColor(){
        return color;
    }
    public String getScore(){
        return score;
    }
    
    public void addGoodAnswer(int g){
        goodAnswers += g;
    }
    
    public void addBadAnswer(int b){
        badAnswers += b;
    }
    
    public int getPosition(){
        return position;
    }
    public void setPosition(int pos){
        position = pos;
    }
    
    
    public int getOldPosition(){
        return oldPosition;
    }
    public void setOldPosition(int x){
        oldPosition = x;
    }
    
    public static ArrayList<Player> getPlayerList(){
        return playerList;
    }
    public void refreshScore () {
        score = "<html>Good answers: " + goodAnswers + "<br>Bad answers: " + badAnswers;
    }  
}

