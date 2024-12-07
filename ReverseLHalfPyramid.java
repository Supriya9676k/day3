import java.util.*;
public class ReverseLHalfPyramid{
	public static void main(String[] args)
	{
		int a,i,l;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		l=a;
		for(int k=(a/2)+1;k>0;k--){
			
		for(i=0;i<a-l;i++){
		System.out.print(" ");
		}
		for(int j=l-i;j>0;j--){
		System.out.print("*");
		}
		System.out.print("\n");
		l--;
		}
		}}
