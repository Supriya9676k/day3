import java.util.*;
public class AvgEven{
	public static void main(String[] args)
	{
		int n,i,count=0,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] a=new int[n];
		
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			sum=sum+a[i];
		
		count++;
		}
		System.out.println(sum/count);
	
		}}
