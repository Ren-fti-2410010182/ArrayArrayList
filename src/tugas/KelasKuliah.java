package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    //method tambah mahasiswa
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }
    //method nilai rata-rata kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0; // Menghindari pembagian dengan angka 0 jika list kosong
        }
        
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai(); // Menjumlahkan semua nilai mahasiswa
        }
        return total / daftarMahasiswa.size();
    }
    //method hitung mahasiswa yg lulus
    public int jumlahLulus() {
        int count = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                count++; // Bertambah jika method lulus() bernilai true
            }
        }
        return count;
    }
    //method tampilan data mahasiswa
    public void tampilkanSemua() {
        System.out.println("=====================================================");
        System.out.println("NPM\t| Nama\t\t| Nilai\t| Status");
        System.out.println("=====================================================");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.println(m.getNpm() + "\t| " + m.getNama() + "\t\t| " + m.getNilai() + "\t| " + status);
        }
        System.out.println("=====================================================");
    }
    public int getJumlahData() {
        return daftarMahasiswa.size();
    }

}
