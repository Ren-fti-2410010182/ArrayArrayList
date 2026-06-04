package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
    // Membuat objek pengelola
    Perpustakaan perpus = new Perpustakaan();
    // Membuat objek Buku lalu memasukkannya ke koleksi
    perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata",2004));
    perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya",2003));
    perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi",2005));
    
    perpus.tampilkanKoleksi();
    
    System.out.println();
    perpus.pinjamBuku("Bumi Manusia");
    perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
    
    System.out.println();
    perpus.tampilkanKoleksi();
    System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    
    //kembalikan buku
    System.out.println();
    System.out.println("======== proses pengembalian buku===================");
    
    // method kembalikan buku
    perpus.kembalikanBuku("Bumi Manusia");
    
    System.out.println();
    perpus.tampilkanKoleksi();
    System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    
    //mencari nama penulis ada
    System.out.println();
    perpus.cariPenulis("Andrea Hirata");
    
    //mencari nama penulis tidak ada
    System.out.println();
    perpus.cariPenulis("reno");
    }
    
}
