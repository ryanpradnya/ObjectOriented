/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;
/**
 *
 * @author userx
 */
public class Karyawan {
    
    private String id;
    protected String nama;
    public String alamat;
    static int jumlah;
    public static void main(String[] args) {
        
    }
    protected Karyawan(){
        System.out.println("ctor karyawan");
    }

    public Karyawan(String id, String nama, String alamat) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("ctor karyawan parameter");
    }
    
    /**
     * Metod ini untuk mengajukan cuti
     */
    int mengajukancuti(){
        int hari=18; // hari jumlah hari yang diajukan
        return hari;
    }
    void mengajukancuti(Karyawan karyawan){  
        karyawan.setId("3456");
    }
    
    static void mengajukanResign(){
        
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
