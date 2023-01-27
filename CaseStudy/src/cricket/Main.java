package cricket;
import java.util.Scanner;
public class Main {

	public static <ODI> void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Match match;
		System.out.println("Enter the Cricket Format\n"
				+ "1.ODI\n"
				+ "2.T20\n"
				+ "3.Test\n"
				+ "4");
		int option=sc.nextInt();
		System.out.println("Enter the Current Score\n");
		int currentScore=sc.nextInt();
		System.out.println("Enter the Current Over\n");
		float currentOver=sc.nextFloat();
		System.out.println("Enter the Target Score\n");
		int targetScore=sc.nextInt();
		switch(option) {
		case 1 :match=new ODIMatch(currentScore,currentOver,targetScore);  match.display(currentOver, targetScore) ;break;
		case 2 :match=new T20Match(currentScore,currentOver,targetScore);  match.display(currentOver, targetScore) ;break;
		case 3 :match=new TestMatch(currentScore,currentOver,targetScore); match.display(currentOver, targetScore) ;break;
		case 4: System.out.println("Invalid");break;
		}
		sc.close();
	}

}