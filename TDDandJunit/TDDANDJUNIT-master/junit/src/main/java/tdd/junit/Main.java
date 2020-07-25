package tdd.junit;
import java.util.Scanner;
public class Main extends RemoveCharacters{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		RemoveCharacters r=new RemoveCharacters();
		System.out.println("String After Modification is "+r.modified(s));

	}

}
