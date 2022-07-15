package week1.codeReview;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bl = isAnagram("stop","post");
		System.out.println(bl);
	}
	public static boolean isAnagram(String input1, String input2) {

		// write your code here
		String s1 = input1;
		String s2 = input2;

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int counter = 0;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (ch1.length != ch2.length)
		{        
			counter =1;        
		}
		else
		{      
			for (int i=0;i<ch1.length;i++){
				if(ch1[i] == ch2[i])
				{
					counter =0;
				}
				else{
					counter = 1;
				}
			}
		}  
		if(counter == 1){
			return false;
		}
		else{
			return true;
		}
	}

}
