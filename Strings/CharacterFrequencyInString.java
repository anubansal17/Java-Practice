public class Strings {
	static final int SIZE = 26;
	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		int size = str.length();
		int[] count = new int[SIZE];
		for (int i=0; i<size; i++)
		{
			count[str.charAt(i) - 'a']++;
		}
		
		for(int j=0; j<size; j++)
		{
			if(count[str.charAt(j)-'a']!=0)
			{
				System.out.print(str.charAt(j));
				System.out.print(count[str.charAt(j)-'a'] + " ");
				
				count[str.charAt(j)-'a'] = 0;
			}
			
		}
 	}

}
