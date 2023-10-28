package Nomor1;

public class JajarGenjang {
    double alas;
    double tinggi;
    double sisiMiring;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
    
    public void hitungLuas(){
        double luas = alas*tinggi;
        System.out.println("Luas Jajar Genjang = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = (2*alas)+(2*tinggi);
        System.out.println("Luas Jajar Genjang = "+keliling);
    }
    public void printState(){
        System.out.println("Sisi Miring = "+sisiMiring);
        System.out.println("Tinggi      =  "+tinggi);
        System.out.println("Alas        = "+alas);
        
    }
}
