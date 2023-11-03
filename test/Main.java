/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.Scanner;
import myprogram.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> data = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Mahasiswa mhs = new Mahasiswa();
            System.out.print("Nama   :");
            String nama = sc.nextLine();
            System.out.print("NIM    :");
            String nim = sc.nextLine();
            System.out.print("Alamat :");
            String alamat = sc.nextLine();
            mhs.setNama(nama);
            mhs.setNim(nim);
            mhs.setAlamat(alamat);
            data.add(mhs);
            System.out.println();
        }
        
        for(Mahasiswa mhs : data){
            System.out.println(mhs);
        }
    }
}