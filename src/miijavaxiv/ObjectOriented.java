/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.util.Arrays;

/**
 *
 * @author userx
 */
public class ObjectOriented {

    /**
     * @param args the command line arguments
     */
    public String name;
    
    public void display(){
        System.out.println("Name = " + this.name);
    }
    public static void main(String[] args) {

        int [] arrInt [] = { {1,2}, {4,5,6}};
        System.out.println(arrInt.length);
        for (int[] is : arrInt) {
            for (int i : is) {
                System.out.println(i);
            }
        }
        int [][]z =new int [5][];
        for (int m = 0; m < 5; m++) {
            z[m]= new int[5];
            for (int x = 0; x < 5; x++) {
                z[m][x]=(5*m)+1+x;
                
            }
            System.out.println(Arrays.toString(z[m]));
        }
        System.out.println(" ");
        int [][]a =new int [5][];
        for (int b = 0; b < 5; b++) {
            a[b]= new int[5];
            for (int y = 0; y < 5; y++) {
                a[b][y]=(b+y)%2;  
            }
            System.out.println(Arrays.toString(a[b]));
        }
        System.out.println(" ");
        int[]f=new int [5];
        for (int i = 0; i <5; i++) {
            f[i]=i+1;
            
        }
        System.out.println(Arrays.toString(f));
        
        ObjectOriented Bob = new ObjectOriented();
        ObjectOriented Jian = new ObjectOriented();
        Bob.name = "Bob";
        Jian=Bob;
        Jian.name = "Jian";
        Bob.display();
        
        String[] table = {"aa","bb","cc"};
        int ii =0;
        do {
            while(ii <table.length)
                System.out.println(ii++);
        } while (ii< table.length);
        
        
        
    }
    
}
