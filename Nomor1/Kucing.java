/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author MY ASUS
 */
public class Kucing {
    String warna_bulu = "Puting";
    String jenis_ras = "Persia";
    double berat_badan = 16.3;
    int usia = 4;
    
    void lari(){
        System.out.println("Kucing itu berlari");
    }
    
    void tampilkanDataKucing(){
        System.out.println("Jenis Ras = "+jenis_ras);
        System.out.println("Warna Bulu = "+warna_bulu);
        System.out.println("Berat_badan = "+berat_badan+"kg");
        System.out.println("Usia = "+usia+" tahun");
    }
}
