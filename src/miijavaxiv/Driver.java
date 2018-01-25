package miijavaxiv;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author userx
 */
public class Driver {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.setId("123");
        karyawan.setNama("Ryan");
        karyawan.setAlamat("Jalan Rambutan");
        Karyawan.mengajukanResign();
        int r = (int) (40 + Math.random() * 60);
        System.out.println(r);
        int hari=21;
        hari=karyawan.mengajukancuti();
        System.out.println(hari);
        karyawan.mengajukancuti(karyawan);
        System.out.println(karyawan.getId());
        Karyawan k1 = new Karyawan();
        Karyawan k2 = k1;
        k1.setNama("aab");
        k2.setNama("bbg");
        System.out.println(k1.getNama());
        k1.jumlah=50;//static bisa dipanggil di object namun idealnya dipanggil  dari class
        Karyawan k3 = new Karyawan();
        System.out.println(k3.jumlah);
        
        
        
    }
}
