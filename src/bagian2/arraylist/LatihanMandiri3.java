package bagian2.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        //array kosong
        ArrayList<String> nama = new ArrayList<>();
        
        String[] data = {"Reno", "reja", "Agus", "Citra", "Dono", "Andri"};
        

        
        nama.addAll(Arrays.asList(data));
        
        System.out.println("list nama" + Arrays.toString(data));
        
        System.out.println("======== Nama Awal A ==========");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
    }
}
