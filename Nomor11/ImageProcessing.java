package Nomor11;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

public class ImageProcessing {
    public static void main(String[] args) {
        ImageProcessing ip = new ImageProcessing();
        String pathImage = "src/Nomor11/Guci_Gyokko.jpg";
        int[][][] dataImage = ip.imread(pathImage);
        int[][] dataGray = ip.imgToGray(dataImage);

        for (int i = 0; i < dataGray.length; i++) {
            System.out.println(Arrays.toString(dataGray[i]));
        }
    }

    private int[][] imgToGray(int[][][] dataImage) {
        int[][] dataGray = null;
        try{
            dataGray = new int[dataImage.length][dataImage[0].length];
            for (int i = 0; i < dataGray.length; i++) {
                for (int j = 0; j < dataGray[i].length; j++) {
                    int red = dataImage[i][j][0];
                    int green = dataImage[i][j][1];
                    int blue = dataImage[i][j][2];
                    double gray = (double)(red+green+blue)/(double)3;
                    dataGray[i][j] = (int)Math.round(gray);
                }    
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return dataGray;
    }

    private int[][][] imread(String pathImage) {
        int[][][] rgbValue = null;
        try{
            File file = new File(pathImage);
            BufferedImage image = ImageIO.read(file);
            int width = image.getWidth();
            int height = image.getHeight();
            rgbValue = new int[width][height][4];
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int color = image.getRGB(i,j);
                    int red = (color & 0x00ff0000) >> 16;
                    int green = (color & 0x0000ff00) >> 8;
                    int blue = (color & 0x000000ff);
                    rgbValue [i][j][0] = red;
                    rgbValue [i][j][1] = green;
                    rgbValue [i][j][2] = blue;
                }     
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return rgbValue;
    }

}
