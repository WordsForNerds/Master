package lr2;

import java.util.Scanner;

/*Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число 
 * следующим критериям: число делится на 4, и при этом оно не меньше 10.*/

public class Example3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Введите число, чтобы проверить удовлетворяет ли оно некоторым критериям");
		num = scan.nextInt();
		
		if(num % 4 == 0 && num >= 10 ) {
			
			System.out.println("Ваше прекрасное число подходит");
			
		} else {
			
			System.out.println("К сожалению ваше число не подходит под условия");
			
		}

	}

}
