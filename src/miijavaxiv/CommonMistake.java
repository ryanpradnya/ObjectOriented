/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author userx
 */
public class CommonMistake {
    public static void main(String[] args) {
        int [] x = {1,3,2,1,1,4};
        List<Integer> tujuan = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            
            tujuan.add(x[i]);
            
        }
        System.out.println(tujuan.size());
        Karyawan karyawan;
        List<Karyawan> karyawans = new ArrayList<>();
        String [] alamats = {"Bandung","Jakarta", "Yogya", "Klaten"};
        for (int i = 0; i < alamats.length; i++) {
            karyawan = new Karyawan();
            karyawan.setAlamat(alamats[i]);
            karyawans.add(karyawan);
            
        }
        for (Karyawan k : karyawans) {
            System.out.println(k.getAlamat());
        }
        // string menggunakan equals karena membantingkan isinya
        StringBuilder builder = new StringBuilder();
        builder.append("solo");
        String a1 = new String ("solo");
        String a2 = "solo";
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1 == builder.toString());
        System.out.println(a1.equals(builder.toString()));
        
        System.out.println( 2 + 5 + "jumlah");
        System.out.println("jumlah" + 2 + 5);
        System.out.println("jumlah" +(2+5));
    }
            
}
