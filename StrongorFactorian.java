import java.util.*;
public class StrongorFactorian{
	public static void main(String[] args)
	{
		int a,sum=0,temp,rem,fact=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		temp=a;
		while(a>0){
			fact=1;
			rem=a%10;
		for(int i=1;i<=rem;i++){
			fact=fact*i;
			
		}
		sum=sum+fact;
		a=a/10;
	}
	System.out.print(sum);
		if(sum==temp)
		System.out.print("Strong");
		else
				System.out.print("Not Strong");

	}
}
