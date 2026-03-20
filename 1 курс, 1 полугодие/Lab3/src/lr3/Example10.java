package lr3;

/*10.	Напишите программу, в которой создается целочисленный массив,
        заполняется случайными числами и после этого значения элементов в массиве сортируются в порядке убывания значений*/

import java.util.Random;
import java.util.Arrays;

public class Example10 {

    public static void main(String[] args){

        Random random = new Random();

        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++ ){

            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] = " + nums[i]);

        }

        System.out.println("А теперь рассортируем их в порядке убывания: ");

        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 0; i--){

            if (i > 1 ){

                System.out.print(nums[i] + " " + "," + " ");

            } else {

                System.out.print(nums[i] + "]");

            }

        }

    }

}