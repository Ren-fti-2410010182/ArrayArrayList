 package bagian1.array;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        //array berisi 5 nama hari
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.println("=== Hari yang memiliki lebih dari 5 huruf ===");
        
        //for-each untuk memeriksa setiap hari
        for (String h : hari) {
            //Cek apakah jumlah huruf > 5
            if (h.length() > 5) {
                System.out.println("- " + h + " (" + h.length() + " huruf)");
            }
        }
    }
}
