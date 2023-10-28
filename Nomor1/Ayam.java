/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor1;

/**
 *
 * @author MY ASUS
 */
public class Ayam {
    String warna_bulu = "Coklat";
    String jenis_ras = "Ayam Brahma";
    double berat_badan = 10.3;
    int usia = 4;
    
    void berkokok(){
        System.out.println("Ayam itu berkokok");
    }
    
    void tampilkanDataAyam(){
        System.out.println("Jenis Ras = "+jenis_ras);
        System.out.println("Warna Bulu = "+warna_bulu);
        System.out.println("Berat_badan = "+berat_badan+"kg");
        System.out.println("Usia = "+usia+" tahun");
    }
}
