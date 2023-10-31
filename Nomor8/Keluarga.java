/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor8;

/**
 *
 * @author MY ASUS
 */
public class Keluarga {
    String namaAyah;
    String namaIbu;

    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }
    
    public void printState(){
        System.out.println("Nama Ayah = "+namaAyah);
        System.out.println("Nama Ibu = "+namaIbu);
    }
    
    public class Ayah extends Keluarga{
    }
    
    public class Ibu extends Keluarga{
    }
    
}
