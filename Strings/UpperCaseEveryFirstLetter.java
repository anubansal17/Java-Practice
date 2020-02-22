import java.util.*;
public class Strings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String upperCase = "";
		Scanner scr = new Scanner(str);
		while(scr.hasNext())
		{
			String word = scr.next();
			upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1)+ " ";
		}
		System.out.println(str);
		System.out.println(upperCase);
		
 	}
	

}
