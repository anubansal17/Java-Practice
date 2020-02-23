import java.util.*;
public class Strings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("Not Anagram");
		}
		 char[] strArray1 = str1.toCharArray();
		 char[] strArray2 = str2.toCharArray();
		 
		 Arrays.sort(strArray1);
		 Arrays.sort(strArray2);
		 
		 String sortedString1 = new String(strArray1);
		 String sortedString2 = new String(strArray2);
		 
		 if(sortedString1.equals(sortedString2))
		 {
			 System.out.println("Anagram");
		 }
		 else
			 System.out.println("Not anagram");

}
}
