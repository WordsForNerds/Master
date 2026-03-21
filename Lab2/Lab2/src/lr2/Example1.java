package lr2;

import java.util.Scanner;

/*1. Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3*/

public class Example1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Введите число, чтобы проверить делится ли оно на три");
		num = scan.nextInt();
		
		if(num % 3 == 0) {
			
			System.out.println("Ваше число делится на три");
			
		} else {
			
			System.out.println("Ваше число не делится на три");
			
		}
		

	}

}
