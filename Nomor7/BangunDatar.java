/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor7;

/**
 *
 * @author MY ASUS
 */
public class BangunDatar {
    public double panjangSisi;

    public void setPanjangSisi(double panjangSisi) {
        this.panjangSisi = panjangSisi;
    }   
    
}

class Persegi extends BangunDatar{
        public void hitungLuas(){
            double luas = panjangSisi*panjangSisi;
            System.out.println("Luas = "+luas);
        }
    }
