import java.util.*;
public class Strings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int flag=0;
		String str = sc.nextLine();
		char[] cArray = str.toCharArray();
		int length = str.length();
		for(int i=0; i<length/2; i++)
		{
			if(cArray[i]==cArray[length-1-i])
			{
				continue;
			}
			else
				flag=1;;
		}
		if(flag==0)
		{
			System.out.print("palindrome");
		}
		else
			System.out.print("Not Palindrome");
		
 	}
	

}
