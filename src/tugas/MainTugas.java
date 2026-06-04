package tugas;
//NAMA  : Ahmad Reno Irawan
//NPM   : 2410010182
public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Basis Data", "Struktur Data"};
        System.out.println("=== DAFTAR MATA KULIAH ===");
            for (int i = 0; i < mataKuliah.length; i++) {
                System.out.println((i + 1) + ". " + mataKuliah[i]);
            }   
        System.out.println();
        
        KelasKuliah kelas = new KelasKuliah();
        
        //daftar mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Muda", "231002", 55.5));
        kelas.tambahMahasiswa(new Mahasiswa("Reno", "231003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "231004", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Jeje", "231005", 48.0));
        
        //data awal mahasiswa
        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();
        System.out.println();
        
        //rata-rata nilai dan mahasiswa lulus
        System.out.println("Rata-rata Nilai Kelas          : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa yang Lulus    : " + kelas.jumlahLulus());
        System.out.println("Total Data Mahasiswa Saat Ini  : " + kelas.getJumlahData());
        System.out.println();
        
        //Tambah mahasiswa baru
        System.out.println(">>> Menambahkan 1 Mahasiswa Baru");
        kelas.tambahMahasiswa(new Mahasiswa("budi", "231006", 65.0));
        
        //data tambahan siswa
        System.out.println("Total Data Mahasiswa Terbaru   : " + kelas.getJumlahData());
        System.out.println();
        
        // Menampilkan ulang data
        System.out.println("=== DATA MAHASISWA AKHIR ===");
        kelas.tampilkanSemua();
    }
    
}
