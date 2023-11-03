/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor12;

public class SpaceCraft {
    private int xPos = 0;
    private int yPos = 0;

    public void up(){
        yPos -= 1;
    }
    public void down(){
        yPos += 1;
    }
    public void left(){
        xPos -= 1;
    }
    public void right(){
        xPos += 1;
    }

    @Override
    public String toString() {
        return "Kordinat{" +xPos + "," + yPos + '}';
    }
    
    
}
