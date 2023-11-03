/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor9;

/**
 *
 * @author MY ASUS
 */
public class BangunDatar{
    int panjang_sisi;

    public void printState(){
        System.out.println("Panjang Sisi = "+panjang_sisi);
    }
    
    public class Persegi extends BangunDatar{

        public Persegi() {
        }
        
        public Persegi(int panjang_sisi) {
            this.panjang_sisi = panjang_sisi;
        }

        public int getPanjang_sisi() {
            return panjang_sisi;
        }

        public void setPanjang_sisi(int panjang_sisi) {
            this.panjang_sisi = panjang_sisi;
        }

        public void hitungLuas() {
            int luas = panjang_sisi * panjang_sisi;
            System.out.println("Luas Persegi = " + luas);
        }

        // Overloading
        public void hitungLuas(int panjang_sisi) {
            int luas = panjang_sisi * panjang_sisi;
            System.out.println("Luas Persegi = " + luas);
        }

        public void hitungKeliling() {
            int keliling = panjang_sisi * 4;
            System.out.println("Keliling Persegi = " + keliling);
        }

        public void printState(){
            
        }

        
    }

    public class PersegiPanjang {

        int panjang;
        int lebar;

        public PersegiPanjang() {
        }

        public PersegiPanjang(int panjang) {
            this.panjang = panjang;
        }

        public PersegiPanjang(int panjang, int lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }

        public int getPanjang() {
            return panjang;
        }

        public void setPanjang(int panjang) {
            this.panjang = panjang;
        }

        public int getLebar() {
            return lebar;
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
        
        // Overloading
        public void Hitungluas(int panjang, int lebar) {
            int luas = panjang * lebar;
            System.out.println("Luas Persegi Panjang = " + luas);
        }

        public void printState(){
            System.out.println("Lebar = "+lebar);
        }
        
    }
}
