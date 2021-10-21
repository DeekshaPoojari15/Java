import java.util.*;
public class switchDemo {

	public static void add(int n1,int n2) {
		System.out.println("Result : "+(n1+n2));
	}
	
	public static void avg(int n1,int n2) {
		System.out.println("Result : "+((n1+n2)/2));
	}
	
	public static void oddEven(int n) {
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	
	public static void positiveNegative(int n) {
		if(n>0)
			System.out.println("Positive");
		else
			System.out.println("Negative");
	}
	
	public static void prime(int p) {
		int count=0;
		for(int i=2;i<p/2;i++)
			if(p%i==0)
				count+=1;
			else
				continue;
		if(count==0)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int value=0;
		do {
			System.out.println("\nOPTIONS : \n1.Add 2 nos\n2.Find average of 2 nos\n3.Check even/odd\n4.Check positive/negative number\n"
					+ "5.Check prime\n6.Quit\nSelect a case:");
			value=sc.nextInt();
			switch(value) {
			case 1:
				System.out.println("Enter num1");
				int n1=sc.nextInt();
				System.out.println("Enter num2");
				int n2=sc.nextInt();
				add(n1,n2);
				break;
			case 2:
				System.out.println("Enter num1");
				int a1=sc.nextInt();
				System.out.println("Enter num2");
				int a2=sc.nextInt();
				avg(a1,a2);
				break;
			case 3:
				System.out.println("Enter num");
				int n=sc.nextInt();
				oddEven(n);
				break;
			case 4:
				System.out.println("Enter num");
				int a=sc.nextInt();
				positiveNegative(a);
				break;
			case 5:
				System.out.println("Enter num");
				int p=sc.nextInt();
				prime(p);
				break;
			case 6:System.exit(0);			
			}

		}while(true);
		
	}

}
