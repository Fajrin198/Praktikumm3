package Nomor5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kotak kotak1 = new Kotak("Merah",10,15);
        Kotak kotak2 = new Kotak("Merah",10,15);
        Kotak kotak3 = new Kotak("Merah",10,15);
        ArrayList<Kotak> arrayList = new ArrayList<>();
        arrayList.add(kotak1);
        arrayList.add(kotak2);
        arrayList.add(kotak3);
        
        arrayList.get(1).setPanjang(20);
        System.out.println(arrayList);
    }
}
