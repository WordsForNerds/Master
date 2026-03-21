package Example3;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {

    //Считывание по 5 символов(буфер)
    public static void readAllByArray(InputStream in) throws IOException{

        byte [] buff = new byte[5]; //Создаём буфер
        while (true){

            int count = in.read(buff); // Когда в параметр read передаётся массив, то он туда записывает считываемые байты
            // а в count записывает их количество, и всё так же -1, когда файл кончается
            if(count != -1){ //Если не конец файла

                System.out.println("Количество = " + count + ",buff = " + Arrays.toString(buff) + ",str = " + new String(buff,0,count,"cp1251") );
                //Тут Array to String выводит числовые значения чаров плюс генерируется новая строка где числа преобразуютс в чары по кодировке cp1251

            } else {

                break;

            }

        }

    }


    public static void main(String[] argsS) throws IOException{

        String fileName = "C:/Users/Phobophile/Desktop/ProgLabs/1 курс, 1 полугодие/Lab8/text.txt";
        //Заранее помещаем путь к файлу в String, а до этого мы напрямую на него указывали в параметре потока
        InputStream inFile = null; //Переменная объявляется до секции try, чтобы не ограничивать область видимости

        try {

            inFile = new FileInputStream(fileName); // Мы уже объявили до этого новый поток, а теперь привязываем его к
            //конретному файлу
            readAllByArray(inFile); //уже как обычно считываем файл через метод

        } catch (IOException e) { //Тут он записывает в e ту ошибку которая она ему выдаст

            System.out.println("Ошибка открытия-закрытия файла " + fileName + e); //Корректное закрытие потока

        } finally { //Это выполняется после корректного или не корректноо закрытия потока

            if (inFile != null) { //Проверяется закрылся ли поток, если нет, то попытатся сделать это

                try {

                    inFile.close();

                } catch (IOException ignore){

                    /*NOP*/ //No OPeration - ничего не делать

                }

            }

        }

    }


}
