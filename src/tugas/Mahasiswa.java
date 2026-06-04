package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;
    // Constructor
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }
    //Getter
    public String getNama() {
        return nama;
    }
    public String getNpm() {
        return npm;
    }
    public double getNilai() {
        return nilai;
    }
    
    //method mengecek lulus
    public boolean lulus() {
        return this.nilai >= 60;
    }
}
