/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor11;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author MY ASUS
 */
public class ImageProcessing {
      
    public static void main(String[] args) {
        ImageProcessing ip = new ImageProcessing();
        String pathImage = "src/fosalgo/Guci_Gyokko.jpg";
        int[][][] dataImage = ip.imread(pathImage);
    }

    private int[][][] imread(String pathImage) {
        int[][][] rgbValue = null;
        try{
            File file = new File(pathImage);
            BufferedImage image = ImageIO.read(file);
        }catch(IOException e){
            e.printStackTrace();
        }
        return rgbValue;
    }
    
}
