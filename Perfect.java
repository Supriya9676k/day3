import java.util.*;
public class Perfect{
	public static void main(String[] args)
	{
		int a,sum=0,count=0,j;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=1;i<a;i++){
			if(a%i==0)
			sum=sum+i;
		}
		if(sum==a)
		System.out.print("Perfect");
		else
				System.out.print("Not Perfect");

	}
}
