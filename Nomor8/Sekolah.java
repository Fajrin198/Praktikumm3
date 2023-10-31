/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor8;

/**
 *
 * @author MY ASUS
 */
public class Sekolah {
    String namaSekolah;
    int peringkat;
    char Akreditasi;

    @Override
    public String toString() {
        return "Sekolah{" + "namaSekolah=" + namaSekolah + ", peringkat=" + peringkat + ", Akreditasi=" + Akreditasi + '}';
    }
    
    
    
    public class Guru extends Sekolah{
        
    }
    
    public class Siswa extends Sekolah{
        
    }
}
