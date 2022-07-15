package week1.codeReview;

public class ReverseStringSol {
public static void main(String[] args)
{
	String rev_str_final = reverseStringsol("testleaf");
	
	System.out.println("Reversed String is "+rev_str_final);
}
public static String reverseStringsol(String input) {
		
		String myName = input; 		
		char[] ch = myName.toCharArray();
		String revStr = "";
		
		for (int i = ch.length -1;i >=0 ;i--) {
			revStr += ch[i];
		}
		return revStr;
      
	}

}
