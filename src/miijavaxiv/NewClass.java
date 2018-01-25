package miijavaxiv;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author userx
 */
public class NewClass {

    public static void main(String[] args) {
        
        
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Bulan");
        BULAN  bulan = BULAN.valueOf(scanner.next());
        //int bulan= scanner.nextInt();
        System.out.println("Masukkan Tahun");
        int tahun= scanner.nextInt();
        int JumlahHari = 0;
            switch (bulan) {
                case JANUARI:
                case MARET:
                case MEI:
                case JULI:
                case AGUSTUS:
                case OKTOBER:
                case DESEMBER:
                    JumlahHari = 31;
                    break;
                case FEBRUARI:
                    JumlahHari = tahun % 4 == 0 ? 29 : 28;
                    break;
                case APRIL:
                case JUNI:
                case SEPTEMBER:
                case NOVEMBER:
                    JumlahHari = 30;
                    break;
                default:
                    System.out.println("Inputan JANUARI - DESEMBER");
                    
            }
            System.out.println("Jumlah Hari " + JumlahHari);
            
        }
        
    }
}
enum BULAN{
    JANUARI, FEBRUARI, MARET, APRIL, MEI, JUNI, JULI, AGUSTUS, SEPTEMBER, OKTOBER, NOVEMBER, DESEMBER;
}