package Example4;

import java.io.*;
import java.util.Scanner;

public class FilesData {

    public static void main(String[] args) throws IOException {

        try {
            //Создание исходного файла numIsh.txt и запись в него чисел типа float

            //Я так понимаю мы создаём объект, которые показывает путь и тип файла, а уже после можем создавать или делать что угодно с ним
            File f1 = new File("C:\\Users\\Phobophile\\Desktop\\ProgLabs\\1 курс, 1 полугодие\\Lab8\\numIsh.txt");
            f1.createNewFile();

            //Добавляем новый сканер для открытия потока ввода
            Scanner scan = new Scanner(System.in, "cp1251");

            /*DataOutputStream writer = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));*/
            //Это значит, что мы работаем с этим файлом и будем что то туда записывать
            PrintWriter pw = new PrintWriter(f1);
            System.out.println("Сколько вещественных числе записать в файл ?");
            int count = scan.nextInt();

            //Тут мы считываем столько вещественных чисел, сколько указали до этого
            System.out.println("Введите числа");
            for (int i = 0; i < count; i++) {

                pw.println(scan.nextFloat());

            }
            pw.flush();
            pw.close();

            //Создание файла numRez.txt и переписывание в него чисел из numIsh.txt
            File f2 = new File("C:\\Users\\Phobophile\\Desktop\\ProgLabs\\1 курс, 1 полугодие\\Lab8\\numRez.txt");
            f2.createNewFile();

            //Поток для чтения из исходного файла numIsh.txt
            DataInputStream rd = new DataInputStream(new FileInputStream(f1.getAbsolutePath()));

            //Поток для записи в результирующий файл numRez.txt
            PrintWriter wr = new PrintWriter(f2);

            try {

                String number = rd.readLine();
                wr.println(number);
                System.out.println("Число" + number);

            } catch (EOFException e){}

            wr.flush();
            wr.close();
            rd.close();

        } catch(IOException e) {

            System.out.println("End of file");

        }


    }

}
