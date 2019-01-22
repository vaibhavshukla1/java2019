import java.util.*;
public class PascalTriangle {
	public static void main(String[] args)
	{
		System.out.println("Enter length of triangle :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i;
		System.out.println("1");
		double j;
		for(i=2;i<=a;i++)
		{
			j=Math.pow(11,i);
			System.out.println((int)j);
		}
		System.out.println("Enter coordinates");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
	}
	

}
