package Example7;

import java.io.*;
import java.util.Scanner;

public class Buf_RW_3 {

    public static void main (String[] args){

        BufferedReader br = null;
        BufferedWriter out=null;

        try {

            br = new BufferedReader( new FileReader("E:\\MyFilel.txt" ), 1024);
            out = new BufferedWriter( new FileWriter( "E:\\MyFile2.txt" ));

            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){

                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){

            System.out.println("Ошибка !!!!!!!!");
        } finally {

            try {

                br.close();
                out.flush();
                out. close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
