/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor8;

/**
 *
 * @author MY ASUS
 */
public class BangunDatar {
    private double panjangSisi;
    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }
    
    public class Persegi extends BangunDatar{
        public void hitungLuas(){
            double luas = panjangSisi*panjangSisi;
            System.out.println("Luas = "+luas);
        }
    }
    
    public class PersegiPanjang extends BangunDatar{
        double lebar;

        public void setLebar(double lebar) {
            this.lebar = lebar;
        }
        
        public void hitungLuas(){
            double luas = panjangSisi*lebar;
            System.out.println("Luas = "+luas);
        }
    }
}
