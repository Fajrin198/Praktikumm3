package Nomor1;

public class Burung {
    String warna_bulu = "Dominan ke warna Kuning";
    String jenis = "Burung Kenari";
    String bentuk_paruh = "Kecil dan tajam";
    double berat_badan = 2.5;
    int usia = 6;
    
    public void berkicau(){
        System.out.println("Burung itu berkicau");
    }
    
    public void tampilkanDataBurung(){
        System.out.println("Jenis = "+jenis);
        System.out.println("Warna Bulu = "+warna_bulu);
        System.out.println("Berat_badan = "+berat_badan+"kg");
        System.out.println("Usia = "+usia+" bulan");
    }
}
