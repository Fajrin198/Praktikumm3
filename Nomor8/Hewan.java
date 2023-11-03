package Nomor8;

public class Hewan {
    
}

class Ayam {
    String warna_bulu = "Coklat";
    String jenis_ras = "Ayam Brahma";
    double berat_badan = 10.3;
    int usia = 4;
    
    public void berkokok(){
        System.out.println("Ayam itu berkokok");
    }
    
    public void tampilkanDataAyam(){
        System.out.println("Jenis Ras = "+jenis_ras);
        System.out.println("Warna Bulu = "+warna_bulu);
        System.out.println("Berat_badan = "+berat_badan+"kg");
        System.out.println("Usia = "+usia+" tahun");
    }
}

class Anjing {
    String warna_bulu = "Coklat";
    String jenis_ras = "Bulldog";
    double berat_badan = 25.3;
    int usia = 6;
    
    public void lari(){
        System.out.println("Anjing itu berlari");
    }
    
    public void tampilkanDataAnjing(){
        System.out.println("Jenis Ras = "+jenis_ras);
        System.out.println("Warna Bulu = "+warna_bulu);
        System.out.println("Berat_badan = "+berat_badan+"kg");
        System.out.println("Usia = "+usia+" tahun");
    }
}