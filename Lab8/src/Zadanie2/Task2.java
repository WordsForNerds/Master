package Zadanie2;

import java.io.*;
import java.util.Arrays;

public class Task2{

    public static void main (String[] args) {

        FileReader fileRead = null;
        BufferedReader buffRead = null;

        FileWriter fileWrite = null;
        BufferedWriter buffWrite = null;

        try {

            fileRead = new FileReader("C:/Users/Phobophile/Desktop/ProgLabs/1 курс, 1 полугодие/Lab8/Zadanie2Input.txt");
            buffRead = new BufferedReader(fileRead);

            fileWrite = new FileWriter("C:/Users/Phobophile/Desktop/ProgLabs/1 курс, 1 полугодие/Lab8/Zadanie2Output.txt");
            buffWrite = new BufferedWriter(fileWrite);

            //Считывание и переписывание только 2 строки
            for (int i = 0; i < 2; i++){

                if (i < 1){

                    buffRead.readLine();
                } else {

                    buffWrite.write(buffRead.readLine());
                    buffWrite.write("\n");
                }
            }
            //Записывание строки с числами и нахождение положительных
            String [] split = buffRead.readLine().split(" ");
            for (int i = 0; i < split.length; i++){

                if (Double.parseDouble(split[i]) > 0){

                    buffWrite.write(split[i] + " ");
                }
            }

        } catch (Exception e){

            e.printStackTrace();
        } finally {

            try {

                buffRead.close();
            } catch (IOException e){

                e.printStackTrace();
            }
            try {

                buffWrite.close();
            } catch (IOException e){

                e.printStackTrace();
            }

        }
    }
}
