/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor7;

/**
 *
 * @author MY ASUS
 */
public class RumahSakit {
    private String namaRS;

    public void setNamaRS(String namaRS) {
        this.namaRS = namaRS;
    }
    
    public class Dokter extends RumahSakit{
        String nama;
        String spesialis;

        public Dokter(String nama, String spesialis) {
            this.nama = nama;
            this.spesialis = spesialis;
        }

        @Override
        public String toString() {
            return "Dokter{" + "nama=" + nama + ", spesialis=" + spesialis + '}';
        }
  
    }
    public class Perawat extends RumahSakit{
        String nama;

        public Perawat(String nama) {
            this.nama = nama;
        }

        @Override
        public String toString() {
            return "Dokter{" + "nama=" + nama + '}';
        }
  
    }
}
