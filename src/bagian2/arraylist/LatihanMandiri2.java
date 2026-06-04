package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        //list kosong
        ArrayList<Integer> nilai = new ArrayList<>();
        
        //nambah nilai list 5
        nilai.add(30);
        nilai.add(60);
        nilai.add(75);
        nilai.add(80);
        nilai.add(85);
        
        System.out.println("Nilai Array" + nilai);
        
        //patokan nilai awal
        int max = nilai.get(0);
        //perulanga 
        for (int n : nilai){
            //cek apakah N lebih besar dari max
            if (n > max){
                max = n;
            }
        }
        
        System.out.println("Nilai Terbesar adalah " + max);
    }
}
