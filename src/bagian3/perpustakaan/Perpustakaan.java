package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    // ArrayList yang menampung objek bertipe Buku
    private ArrayList<Buku> koleksi = new ArrayList<>();
    // Menambah satu buku ke koleksi
    public void tambahBuku(Buku buku) {
    koleksi.add(buku);
    }
    
    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }
    public void cariPenulis(String penulis) {
        boolean ditemukan = false;
    
        System.out.println("- Hasil Pencarian Penulis: " + penulis + " ===");
        
        for (Buku b : koleksi) {
        // perbandingan nama penulis dengan koleksi
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
            
            // Jika cocok print informasi
            System.out.println("- " + b.info());
            
            // Ubah penanda true 
            ditemukan = true;
            }
        }
        //jika buku tidak ketemu di koleksi 
        if (ditemukan == false) {
            System.out.println("Maaf, tidak ada buku karya \"" + penulis + "\" di perpustakaan.");
        }
    }
    
    // Mencari buku berdasarkan judul, lalu menandainya dipinjam
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                System.out.println(judul + " sedang dipinjam.");
                } else {
                b.setDipinjam(true);
                System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
         System.out.println("Buku " + judul + " tidak ditemukan.");
    }
    // Menghitung jumlah buku yang masih tersedia
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
    
    //Method mengembalikan buku
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            //ngecek judul buku
            if (b.getJudul().equals(judul)) {
                // Mengubah status dipinjam menjadi Tersedia 
                b.setDipinjam(false); 
                System.out.println("Buku " + judul +  "telah dikembalikan."); 
                return;
            }
        }
    }
}
    



