package Nomor1;

public class Persegi {
    int panjang_sisi;

    public void setPanjang_sisi(int panjang_sisi) {
        this.panjang_sisi = panjang_sisi;
    }
    
    public void hitungLuas(){
        int luas = panjang_sisi * panjang_sisi;
        System.out.println("Luas Persegi = "+luas);
    }
    
    public void hitungKeliling(){
        int keliling = panjang_sisi * 4;
        System.out.println("Keliling Persegi = "+keliling);
    }
    
    public void printState(){
        System.out.println("Panjang Sisi = "+panjang_sisi);
    }
}
