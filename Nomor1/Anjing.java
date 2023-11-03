package Nomor1;

public class Anjing {
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
