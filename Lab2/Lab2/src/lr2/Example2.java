package lr2;

import java.util.Scanner;

/*2. Напишите программу, которая проверяет, удовлетворяет ли введенное пользователем число следующим критериям: при делении на 
 * 5 в остатке получается 2, а при делении на 7 в остатке получается 1*/

public class Example2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Введите число, чтобы проверить удовлетворяет ли оно некоторым критериям");
		num = scan.nextInt();
		
		if(num % 5 == 2 && num % 7 == 1 ) {
			
			System.out.println("Ваше прекрасное число подходит");
			
		} else {
			
			System.out.println("К сожалению ваше число не подходит под условия");
			
		}

	}

}
