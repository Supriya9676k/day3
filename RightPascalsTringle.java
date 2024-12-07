import java.util.*;
public class RightPascalsTringle{
	public static void main(String[] args)
	{
		int a,i,k;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		for(k=1;k<a+1;k++){
			
		for(i=0;i<k;i++){
		System.out.print("*");
		}
		System.out.print("\n");
	}
		for(k=a-1;k>0;k--){
			
		for(i=k;i>0;i--){
		System.out.print("*");
		}
		System.out.print("\n");
	}
		}}
