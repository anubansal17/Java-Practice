public class ReversingWordsOfString {

	public static void main(String[] args) {
		String str = "First Java Code";
		String[] strArray = str.split(" ");
		
		for (int i=0; i<3; i++)
		{
			char[] string = strArray[i].toCharArray();
			for(int j= string.length-1;j>=0;j--)
			{
				System.out.print(string[j]);
			}
			System.out.print(" ");
		}

	}

}
