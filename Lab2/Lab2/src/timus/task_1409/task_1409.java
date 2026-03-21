package timus.task_1409;

import java.util.Scanner;

public class task_1409 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String stringShot;
		int garr;
		int larr;
		
		System.out.println("Введите через пробел количество простреленных банок Гарри и Ларри соответственно");
		stringShot = scan.nextLine();
		
		//Помещаем числа, которые ввёл пользователь в массив строк
        String[] shot = stringShot.split(" ");
        
      //Преобразуем строки из массива Nab в числа
        larr = Integer.parseInt(shot[0]) - 1;
        garr = Integer.parseInt(shot[1]) - 1;
        
        System.out.println(garr + " " + larr);

	}

}
