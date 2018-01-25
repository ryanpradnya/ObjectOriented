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
public class Penyelia extends Karyawan{
    
    public Penyelia(){
        System.out.println("ctor penyelia");
    }
    
    public Penyelia(String id, String nama, String alamat){
        //super(id, nama, alamat);
        System.out.println("ctor penyelia parameter");
    }
    
    
    public int methodC(){
        return 0;
    }

    @Override
    public String getAlamat() {
        return "Jakarta"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Nama : ");
        builder.append(nama);
        builder.append(", Alamat : ");
        builder.append(alamat);
        
        return builder.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static void main(String[] args) {
        Penyelia penyelia = new Penyelia();
        penyelia.setAlamat("Bandung");
        System.out.println(penyelia.getAlamat());
        
        Penyelia penyelia1 = penyelia;
        penyelia1.setAlamat("Jogjakarta");
        System.out.println(penyelia1.hashCode());
        System.out.println(penyelia.hashCode());
        
        Karyawan karyawan= new Karyawan("890", "Pradnya", "Jalan jalan");
        
        
    }
    
}
