package stu_demo;

import java.util.Scanner;

public class dynamic_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		double b;
		String str;
		byte y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value a:");
		a=sc.nextInt();
		System.out.println("Enter value b(double):");
		b=sc.nextDouble();
		System.out.println("Enter value str:(string)");
		str=sc.next();
		System.out.println("Enter value y:(byte)");
		y=sc.nextByte();
		System.out.println("a is "+a+"b is "+b+"String is "+ str+"y is "+y);
	}

}
