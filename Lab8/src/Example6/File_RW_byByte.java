package Example6;

import java.io.*;
import java.util.Scanner;

public class File_RW_byByte {

    public static void main (String[] args){

        Reader in=null;
        Writer out=null;

        try {

            in =  new FileReader("E:\\MyFile1.txt");
            out= new FileWriter("E:\\MyFile2.txt", true);
            int oneByte;
            while ((oneByte = in.read()) != -1){

                out.write((char)oneByte);
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        } catch(IOException e) {

            System.out.println("Ошибка!!!! ");
        } finally {

            try {

                in.close();
                out.close();
            } catch (IOException e){

                System.out.println("Ошибка!!!! ");
            }
        }
    }
}
