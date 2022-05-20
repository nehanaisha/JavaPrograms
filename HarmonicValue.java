package day5;

import java.util.Scanner;

public class HarmonicValue {
public static void main(String[] args) {
double n,i;
double sum=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	sum=sum+(1/i);
}
System.out.println("harmonic value=" + sum);
}
}