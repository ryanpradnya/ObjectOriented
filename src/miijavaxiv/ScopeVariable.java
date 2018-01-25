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
public class ScopeVariable {
    int z;
    static int y;
    public void methodA(int z){
        this.z = 29;
        y = 14;
    }
    
    public void methodB(){
       int z=20;
       this.z=z;
    }
    public static void methodc(){
        y = 20;
    }
    
    static void methodD(){
        methodc();
    }
}
