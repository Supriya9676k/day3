import java.util.*;
public class PowerWithout{
	public static void main(String[] args)
	{
		int base,pow,count=1,total=1;
		Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		pow=sc.nextInt();
		while(count<=pow){
			total=total*base;
			count++;
		}
	System.out.print(total);
		

	}
}
