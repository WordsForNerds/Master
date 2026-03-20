package Example1;

import java.io.File;

public class KlassFile1 {

    public static void main(String[] argsS){

        //Обязательно помещать в конструкцию try-catch для отлавливания ошибок
        try {

            //Создание первого файла в текущей папке
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if(f1.exists()){

                System.out.println("Создан!!!!");
                System.out.println("Полный путь1: " + f1.getAbsolutePath());

            }

            //создание второго файла
            File f2 = new File("D:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь2: " + f2.getAbsolutePath());

            //Создание нескольких сложенных папок
            File f3 = new File("D:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь3: " + f3.getAbsolutePath());



        } catch (Exception e){

            System.out.println("Ошибка!!! "+e);

        }



    }

}
