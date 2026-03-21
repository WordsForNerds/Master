package lr2;

import java.util.Scanner;

/*Напишите программу, которая проверяет, сколько тысяч во введенном пользователем числе 
 * (определяется четвертая цифра справа в десятичном представлении числа)*/

public class Example5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int thousands;
		
		System.out.println("Введите число, чтобы узнать сколько в нём тысяч");
		num = scan.nextInt();
		
		if (num < 1000) {
			
			System.out.println("Ваше число меньше тысячи!");
			System.exit(0);
		}
		
		if (num >= 10000) {
			
			/*Так как в дополнительном условии задачи не подразумевается число более 10000, то
			я написал для этого случая отдельный кусок кода*/
			
			thousands = num / 1000;
			
			System.out.println("В вашем числе" + " " + thousands + " " + "тысяч." );
			System.exit(0);
			
		}
		
		//Преобразовываем число в строку
		String strNum = String.valueOf(num);
		
		//Находим нужную нам цифру вычитая из общей длинны 4, чтобы записать этот символ в чар
		char charThousands = strNum.charAt(strNum.length() - 4);
		
		//Преобразовываем полученный чар в число		
		thousands = charThousands - '0';
		
		
					
		System.out.println("В вашем числе" + " " + thousands + " " + "тысяч." );
			
	}

}