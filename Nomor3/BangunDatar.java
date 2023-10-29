/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor3;

/**
 *
 * @author MY ASUS
 */
public class BangunDatar {

    public class Persegi {

        int panjang_sisi;

        public void setPanjang_sisi(int panjang_sisi) {
            this.panjang_sisi = panjang_sisi;
        }

        public void hitungLuas() {
            int luas = panjang_sisi * panjang_sisi;
            System.out.println("Luas Persegi = " + luas);
        }

        public void hitungKeliling() {
            int keliling = panjang_sisi * 4;
            System.out.println("Keliling Persegi = " + keliling);
        }

        public void printState() {
            System.out.println("Panjang Sisi = " + panjang_sisi);
        }
    }

    public class PersegiPanjang {

        int panjang;
        int lebar;

        public void setPanjang(int panjang) {
            this.panjang = panjang;
        }

        public void setLebar(int lebar) {
            this.lebar = lebar;
        }

        public void Hitungluas() {
            int luas = panjang * lebar;
            System.out.println("Luas Persegi Panjang = " + luas);
        }

        public void Hitungkeliling() {
            int keliling = (2 * panjang) + (2 * lebar);
            System.out.println("Keliling Persegi Panjang = " + keliling);
        }

        public void printState() {
            System.out.println("Panjang = " + panjang);
            System.out.println("Lebar   = " + lebar);
        }
    }
}
