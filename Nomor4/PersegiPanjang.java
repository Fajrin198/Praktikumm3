package Nomor4;

public class PersegiPanjang {
    static int panjang;
    static int lebar;

    public static void setPanjang(int panjang) {
        PersegiPanjang.panjang = panjang;
    }

    public static void setLebar(int lebar) {
        PersegiPanjang.lebar = lebar;
    }

    

    public static int getPanjang() {
        return panjang;
    }

    public static int getLebar() {
        return lebar;
    }
    
    public static void Hitungluas(){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }
    
    public static void Hitungkeliling(){
        int keliling = (2*panjang) + (2*lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }
    
    public static void printState(){
        System.out.println("Panjang = "+panjang);
        System.out.println("Lebar   = "+lebar);
    }
}