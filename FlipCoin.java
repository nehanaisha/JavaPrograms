package day5;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) 
	{
	int n = 0,h_cnt=0,t_cnt=0;
	double heads,tails;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter");
	n=sc.nextInt();
	for(int j=0;j<n;j++) {
		double random=Math.random();
		if(random<0.5)
			t_cnt++;
		else
			h_cnt++;
	}
	heads=h_cnt/(double) n *100;
	heads=t_cnt/(double) n *100;
	System.out.println("percntage of heads" + heads + "%");
	System.out.println("percntage of heads" + heads + "%");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
