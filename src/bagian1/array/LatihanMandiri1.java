package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        //Buat array bertipe double berisi 6 suhu harian
        double[] suhu = {32.5, 31.0, 33.2, 29.8, 34.1, 30.5};
        
        //Set patokan awal
        double suhuTertinggi = suhu[0];
        double suhuTerendah = suhu[0];
        
        //perulangan untuk mengecek sisa elemen
        //mulai dari indeks 1 karena indeks 0 sudah jadi patokan
        for (int i = 1; i < suhu.length; i++) {
            // Jika suhu saat ini lebih besar dari patokan tertinggi, ubah nilainya
            if (suhu[i] > suhuTertinggi) {
                suhuTertinggi = suhu[i];
            }
            
            // Jika suhu saat ini lebih kecil dari patokan terendah, ubah nilainya
            if (suhu[i] < suhuTerendah) {
                suhuTerendah = suhu[i];
            }
        }
        
        //Tampilan array menggunakan for-each
        System.out.println("=========== Data Suhu Harian ============");
        for (double s : suhu) {
            System.out.print(s + " | ");
        }
        
        System.out.println("\n");
        System.out.println("Suhu Tertinggi : " + suhuTertinggi);
        System.out.println("Suhu Terendah  : " + suhuTerendah);
    }
}
