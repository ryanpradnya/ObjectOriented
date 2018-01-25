/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miijavaxiv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author userx
 */
public class HandlingExeception {

    //throws method lain yang menghadle method bacaFile
    static void bacaFile(String namaFile) throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("D:\\input.txt");

        int i;
        while ((i = reader.read()) > 0) {
            System.out.print((char) i);
        }
    }

    public static void main(String[] args) {
        try {
            int c = -1;
            assert c > 0;
            if (c == 0) {
                throw new CustomException("c tidak boleh 0");
            }
            int y = 10 / c;
            bacaFile(args[0]);
        } catch (IOException ex) {
            Logger.getLogger(HandlingExeception.class.getName
        ()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(HandlingExeception.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Error er) {
            System.out.println(er.getMessage());
        }
    }

}
