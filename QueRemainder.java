package day5;

import java.util.Scanner;

public class QueRemainder {
	public static void main(String[] args) {
		System.out.println("enter the value of num1 and num2");
		Scanner sc = new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int quo=0,rem=0;
quo=num1/num2;
rem=num1%num2;
System.out.println("quotient when"+num1+"/"+num2+"is:"+quo);
System.out.println("remainder when"+num1+"is divided by"+num2+"is:"+rem);
}
}