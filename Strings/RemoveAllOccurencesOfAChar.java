//M1- We can also replace the occurences with "" to remove the occurences of guven char in string 
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char c = sc.next().charAt(0);
		int length = str.length();
		int j=0;
		int count = 0;
		char[] t = str.toCharArray();
		for(int i=0; i<length; i++)
		{
			if(t[i]!=c)
				t[j++] = t[i];
			else
				count++;
			
		}
		while(count>0)
		{
			t[j++] = '\0';
			count--;
		}
		System.out.print(t);
 	}
	

}
