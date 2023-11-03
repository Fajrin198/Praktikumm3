package Nomor5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kotak kotak1 = new Kotak("Merah",10,15);
        Kotak kotak2 = new Kotak("Merah",10,15);
        Kotak kotak3 = new Kotak("Merah",10,15);
        Kotak kotak4 = new Kotak("Merah",10,15);
        Kotak.arrayList.add(kotak1);
        Kotak.arrayList.get(0).setPanjang(8);
        System.out.println(Kotak.arrayList.get(0).getWarna());
        System.out.println(Kotak.arrayList);
        
    }
}
