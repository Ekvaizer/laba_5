package aplication;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Введите строку");
		String string =scn.nextLine();
		System.out.println("Входная буква в нижнем регистре  ");
		String a=scn.nextLine();
		System.out.println("Входная буква в верхнем регистре  ");
		String aa=scn.nextLine();
		System.out.println("Выходная буква в нижнем регистре  ");
		String b=scn.nextLine();
		System.out.println("Выходная буква в верхнем регистре  ");
		String bb=scn.nextLine();
		String q=(string.replace(a, b));

		String s=(q.replace(aa, bb));
		System.out.println(s);
		scn.close();
	}

}
