/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomor5;

import java.util.ArrayList;

public class Kotak {
    static ArrayList<Kotak> arrayList = new ArrayList<>();
    String warna;
    int panjang;
    int lebar;

    public Kotak() {
    }

    public Kotak(String warna, int panjang, int lebar) {
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
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

    @Override
    public String toString() {
        return "Kotak{" + "warna=" + warna + ", panjang=" + panjang + ", lebar=" + lebar + '}';
    }
    
    
}
