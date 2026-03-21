package Example2;

import java.io.*;
import java.net.URL;

public class Primer1 {

    //Метод для чтение данных из потока по байтам с выводом
    public static void readAllByByte(InputStream in)  throws IOException { //Принимает на вход поток


        while (true){

            int oneByte = in.read(); //читает один байт
            if (oneByte != -1) { //Признак отсутсвтия конца файла, т.к возвращает -1, когда заканчивается файл
                System.out.print((char) oneByte); //Переделывает из значения байта в чар по номеру

            } else {

                System.out.println("\n" + "end");
                break;

            }

        }

    }

    public static void main(String[] argsS) throws IOException {

        try{

            //С потоком связан файл
            InputStream inFile = new FileInputStream("C:\\Users\\Phobophile\\Desktop\\ProgLabs" +
                    "\\1 курс, 1 полугодие\\Lab8\\text.txt"); //Создаём новым поток данных из файлаы
            readAllByByte(inFile);//Применяем метод, чтобы считать данные из уже созданного файла
            System.out.println("\n\n\n");
                inFile.close();

            /*В каждом последующем дейсвтии мы создаём поток нового вида, после чего кидаем его как параметр для метода,
             который считывает данные*/

            //С потоком связана интернет-страница
            InputStream inUrl = new URL("https://www.google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
                inUrl.close();

            //С потоком связан массив типа byte
            //Тут мы получаем билеберду при считывании, так как метод выдаёт нам данные в чарах, а надо в байтах 14 строка
            InputStream inArray = new ByteArrayInputStream(new byte [] {7,9,3,7,4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
                inArray.close();

        } catch (IOException e){

            System.out.println("Ошибка: " + e);

        }

    }

}
