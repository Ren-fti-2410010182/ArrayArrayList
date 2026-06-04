package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri1 {
    public static void main(String[] args) {
    
        //array list kosong
        ArrayList<String> BaftarBelanja = new ArrayList<>();
        
        //4 item list
        BaftarBelanja.add("Telur");
        BaftarBelanja.add("Gula");
        BaftarBelanja.add("Minyak Goreng");
        BaftarBelanja.add("Mie Goreng");
        
        System.out.println("==========Daftar Belanja===========");
        System.out.println("ISi daftar"+ BaftarBelanja);
        
        //Hapus item ke 2
        BaftarBelanja.remove(1);
        System.out.println("========Daftar Belanja ke-2 ===========");
        System.out.println("ISi daftar"+ BaftarBelanja);
         
        
    }
    
}
