package Nomor1;

public class BelahKetupat {
    double d1;
    double d2;
    double s;

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public void setS(double s) {
        this.s = s;
    }
    
    public void hitungLuas(){
        double luas = 0.5*d1*d2;
        System.out.println("Luas Belah Ketupat = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = 4*s;
        System.out.println("Keliling Belah Ketupat = "+keliling);
    }
    
    public void printState(){
        System.out.println("Panjang Diagonal 1 = "+d1);
        System.out.println("Panjang Diagonal 2 = "+d2);
        System.out.println("Panjang Sisi       = "+s);
    }
}
