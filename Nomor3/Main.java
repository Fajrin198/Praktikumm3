/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor3;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        BangunDatar.Persegi persegi = bd.new Persegi();
        persegi.setPanjang_sisi(5);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.printState();
        System.out.println("");
        
        BangunDatar.PersegiPanjang pp = bd.new PersegiPanjang();
        pp.setLebar(10);
        pp.setPanjang(5);
        pp.Hitungluas();
        pp.Hitungkeliling();
        pp.printState();
        System.out.println("");
    }
}
