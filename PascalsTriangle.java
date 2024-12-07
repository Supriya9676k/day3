import java.util.*;
import java.math.*;
public class PascalsTriangle{
	public static void main(String[] args)
	{
		int a,i,rem;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		double count=0;
		for(int k=0;k<a;k++){
			
		for(i=a-k;i>0;i--){
		System.out.print(" ");
		}
		int value=(int)(Math.pow(11,count));
		while(value>0){
		rem=value%10;
		System.out.print(rem+" ");
		value=value/10;
	}
	System.out.println();
		count++;
	}
		}}
