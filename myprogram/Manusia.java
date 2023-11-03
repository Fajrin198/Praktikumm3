package myprogram;

public abstract class Manusia {
    private String nama;
    protected String alamat;

    protected String getNama() {
        return nama;
    }

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getAlamat() {
        return alamat;
    }

    protected void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Manusia{" + "nama=" + nama + ", alamat=" + alamat + '}';
    }
    
}