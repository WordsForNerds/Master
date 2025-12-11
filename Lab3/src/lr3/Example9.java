package lr3;

/*9.	Напишите программу, в которой создается массив и заполняется случайными числами.
        Массив отображается в консольном окне. В этом массиве необходимо определить элемент с минимальным значением.
        В частности, программа должна вывести значение элемента с минимальным значением и индекс этого элемента.
        Если элементов с минимальным значением несколько, должны быть выведены индексы всех этих элементов.*/

import java.util.Random;
import java.util.Arrays;

public class Example9 {

    public static void main(String[] args){

        Random random = new Random();

        int[] nums = new int[10];
        int index = 0;

        for (int i = 0; i < nums.length; i++ ){

            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);

        }

        Arrays.sort(nums);

        System.out.println(nums[index] + " " + "Минимальный элемент с индексом" + " " + index);

        for (int i = 0; i < nums.length; i ++){

            if (nums[index] == nums[index + 1]){

                index++;
                System.out.println(nums[index] + " " + "Минимальный элемент с индексом" + " " + index);

            } else {

                return;

            }

        }

    }

}