package Zadanie3;

import java.io.*;

public class Task3 {

    //Метод для сравнения первого символа каждого слова с согласными буквами алфавита
    public static boolean Compare (String str){

        String [] letters = {"б", "в" , "г" , "д" , "ж" , "з" , "й" , "к" , "л" , "м" ,
                "н" , "п" , "р" , "с" , "т" , "ф" , "х" , "ц" , "ч" , "ш" , "щ" };

        for (int i = 0; i < letters.length; i++){

            if (str.equals(letters[i])){

                return true;
            }
        }
        return false;
    }

    public static void main (String[] args) {

        int numLine = 1;
        int count = 0;
        String current;

        FileReader fileRead = null;
        BufferedReader buffRead = null;

        FileWriter fileWrite = null;
        BufferedWriter buffWrite = null;

        try {

            fileRead = new FileReader("C:/Users/Phobophile/Desktop/ProgLabs/1 курс, 1 полугодие/Lab8/Zadanie3Input.txt");
            buffRead = new BufferedReader(fileRead);

            fileWrite = new FileWriter("C:/Users/Phobophile/Desktop/ProgLabs/1 курс, 1 полугодие/Lab8/Zadanie3Output.txt");
            buffWrite = new BufferedWriter(fileWrite);

            //Считыаем файл построчно и обрабатываем каждую строку
            while ((current = buffRead.readLine()) != null){

                String [] split = current.split(" ");

                for (int i = 0; i < split.length; i++){

                    /*if(split[i].substring(0,1).equals("с")){

                        buffWrite.write(split[i]);
                    }*/
                    if (Compare(split[i].substring(0,1))) {

                        buffWrite.write(split[i] + " ");
                        count++;
                    }
                }
                if (count > 0){

                    buffWrite.write("---" + " " + "СТРОКА: " + "[" + numLine + "]" + " " + "---" + "  " + "ВЫБРАНО СЛОВ: " + "(" + count + ")"  + "\n");
                }
                numLine++;
                count = 0;
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
