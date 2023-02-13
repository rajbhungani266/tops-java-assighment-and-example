import java.util.Scanner;

public class alphabererror {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("a TO z 5 VOWEL:");
		char ch=Sc.next().charAt(0);
		if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' ) {
			System.out.println("this is a vowel character");
		}
		else {
			System.out.println("this is not vowel");
		}
				
	}
}

