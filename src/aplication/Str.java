package aplication;

import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������");
		String string =scn.nextLine();
		System.out.println("������� ����� � ������ ��������  ");
 String a=scn.nextLine();
 System.out.println("������� ����� � ������� ��������  ");
 String aa=scn.nextLine();
 System.out.println("�������� ����� � ������ ��������  ");
 String b=scn.nextLine();
 System.out.println("�������� ����� � ������� ��������  ");
 String bb=scn.nextLine();
 String q=(string.replace(a, b));

 String s=(q.replace(aa, bb));
 System.out.println(s);
 scn.close();
	}

}