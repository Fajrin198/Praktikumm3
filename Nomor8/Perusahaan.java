/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor8;

/**
 *
 * @author MY ASUS
 */
public class Perusahaan {
    private String namaPerusahaan;

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    public class Karyawan extends Perusahaan{
        String namaKaryawan;
        
        public void printState(){
            System.out.println("Nama Perusahaan = "+namaPerusahaan);
            System.out.println("Nama Karyawan = "+namaKaryawan);
        }
    }
    public class Meneger extends Perusahaan{
        String namaMeneger;
        
        public void printState(){
            System.out.println("Nama Perusahaan = "+namaPerusahaan);
            System.out.println("Nama Karyawan = "+namaMeneger);
        }
    }
    
    
}
