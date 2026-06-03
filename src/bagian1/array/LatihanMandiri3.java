package bagian1.array;

public class LatihanMandiri3 {
   public static void main(String[] args) {
       // Array 
       int[] angka = {4, 8, 15, 16, 23, 42}; 
        
       //variabel genap dimulai  dari 0
        int genap = 0;
        
        //perulangan for-each
        for (int a : angka) { 
            if (a % 2 == 0) genap++; 
        }
        
        System.out.println("Jumlah angka genap: " + genap);
    }
}
