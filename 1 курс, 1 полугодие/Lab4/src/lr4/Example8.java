package lr4;

/*8.	Напишите программу «Шифр Цезаря», которая зашифровывает введенный текст.
        Используете кодовую таблицу символов. При запуске программы в консол
        ь необходимо вывести сообщение: «Введите текст для шифрования», после ввода текста,
        появляется сообщение: «Введите ключ». После того как введены все данные, необходимо
        вывести преобразованную строку с сообщением «Текст после преобразования: »
        . Далее необходимо задать вопрос пользователю: «Выполнить обратное преобразование?
        (y/n)», если пользователь вводит «y», тогда выполнить обратное преобразование.
        Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
        Если пользователь вводит что-то другое, отличное от «y» или «n»,
        то программа ему выводит сообщение: «Введите корректный ответ».*/

import java.util.Objects;
import java.util.Scanner;

public class Example8 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String text;
        String x;
        int key;
        int count;

        System.out.println("Введите текст для шифрования :");
        text = scan.nextLine();


        System.out.println("Введите ключ (цифрой) :");
        key = scan.nextInt();
        //Эта дополнительная строчка нужна, чтобы джава не пропускала скан следующей
        // строки после чтения цифр
        x = scan.nextLine();

        //Создаём массив чаров и разбиваем строку в него
        char[] textAr = text.toCharArray();
        char[] cesar = new char[textAr.length];


        //Так как символы могут сдвигаться слишком сильно, то мы убираем лишние обороты
        // путём деления с остатком
        if (key >= textAr.length){

            key = key % textAr.length;

        }

        for (int i = 0; i < textAr.length; i++){

            if (i + key > textAr.length - 1){

                cesar[i+key -textAr.length] = textAr[i];

            } else {

                cesar[i+key] = textAr[i];

            }

        }

        System.out.println();

        System.out.print("Текст после преобразования: ");
        for(int i = 0 ; i < textAr.length; i++){

            System.out.print(cesar[i]);

        }


        System.out.println();

        System.out.println("Выполнить обратное преобразование ?");
        text = scan.nextLine();

        for (int i = 0; i < 1;){


            if (Objects.equals(text, "y")){

                for(int j = 0 ; j < textAr.length; j++){

                    System.out.print(textAr[j]);

                }
                break;

            }
            if (Objects.equals(text, "n")){

                System.out.println("До свидания!");
                break;

            }
            System.out.println("Введите корректное значение");
            text = scan.nextLine();

        }





        }


    }

