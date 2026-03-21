package lr2;

import java.util.Scanner;

/*Напишите программу, которая проверяет, попадает ли введение пользователем число в 
 * диапазон от 5 до 10 включительно.*/

public class Example4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Введите число, чтобы проверить удовлетворяет ли оно некоторым критериям");
		num = scan.nextInt();
		
		if(num >= 5 && num <= 10 ) {
			
			System.out.println("Ваше прекрасное число подходит");
			
		} else {
			
			System.out.println("К сожалению ваше число не подходит под условия");
			
		}

	}

}

