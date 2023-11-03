/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author MY ASUS
 */
public class Mobil {
    String warna = "Merah";
    double kapasitasBahanBakar = 50;
    double kecepatan;
    
    public void speedUp(double increment){
        kecepatan += increment;
    }
    
    public void applyBrakes(double decrement){
        kecepatan -= decrement;
    }
    
    public void printStates(){
        System.out.println("Warna = "+warna);
        System.out.println("Kapasitas bahan bakar = "+kapasitasBahanBakar+" Liter");
        System.out.println("Kecepatan = "+kecepatan);
    }
}
