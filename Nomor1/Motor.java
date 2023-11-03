package Nomor1;

public class Motor {
    String warna = "Hitam";
    String jenisTransmisi = "Otomatis";
    double kapasitasBahanBakar = 8;
    double kecepatan;
    
    public void speedUp(double increment){
        kecepatan += increment;
    }
    
    public void applyBrakes(double decrement){
        kecepatan -= decrement;
    }
    
    public void printStates(){
        System.out.println("Warna = "+warna);
        System.out.println("Jenis Transmisi = "+jenisTransmisi);
        System.out.println("Kapasitas bahan bakar = "+kapasitasBahanBakar+" Liter");
        System.out.println("Kecepatan = "+kecepatan);
    }
}
