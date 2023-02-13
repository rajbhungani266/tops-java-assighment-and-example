import java.util.Scanner;

public class first {
public static void main(String[] args) {
	int a,b,c;
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("a:");
	a=Sc.nextInt();

	System.out.println("b:");
	b=Sc.nextInt();
	
	
		System.out.println("c:");
		c=Sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is gretest");
		}
		else if(b>a && b>c) {
			System.out.println("b is gretest ");
			
		}
		else {
			System.out.println("c is gretest");
		}
		}
	
}

