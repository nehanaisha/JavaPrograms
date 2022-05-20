package day5;

import java.util.Scanner;

public class PowerOfNumber {
		public static void main(String[] args) {
			int b,e;
			Scanner sc=new Scanner(System.in);
			System.out.print("enter base");
			b=sc.nextInt();
			System.out.print("enter exponent");
			e=sc.nextInt();
			double power=Math.pow(b,e);
			System.out.println(b+"to the power"+e+"is"+power);
		}
}
