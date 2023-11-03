/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor12;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        SpaceCraft kordinat = new SpaceCraft();
        for (int i = 0; i < 5; i++) {
            kordinat.right();
        }
        for (int i = 0; i < 10; i++) {
            kordinat.down();
        }
        System.out.println(kordinat);
    }
}
