package Example8;

import java.io.*;
import java.util.Scanner;

import static Example2.Primer1.readAllByByte;

public class InConvertOnText {

    public static void readAllByte (Reader in) throws IOException{

        while (true){

            int oneByte = in.read();
            if (oneByte != -1) {

                System.out.print((char) oneByte);
            } else {

                System.out.print("\n" + " конец ");
                break;

            }

        }
    }

    public static void main(String[] args){

        try {

            InputStream inFile	= new FileInputStream("E:\\MyFile1.txt");
            Reader rFile= new InputStreamReader(inFile,"cp1251");
            readAllByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
            InputStream inArray = new ByteArrayInputStream( new byte[] {5, 8, 3, 9, 11});
            Reader rArray=new InputStreamReader(inArray,"cp1251" );
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
