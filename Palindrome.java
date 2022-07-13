package week1.assignments;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0 ;
		String str1 = "madam";
		char[] charr1 = str1.toCharArray();

		for (int i = 0; i < charr1.length; i++) {
			for (int j = charr1.length -1 ; j > 0 ; j--) {
				if (charr1[i] == charr1[j]) {
					count = 1 ;
				}
				else {
					count = 0;
				}
				}
		}if (count ==1) {
			System.out.println("the given strng is a palindrome");
		}
		else {
			System.out.println("the given strng is not a palindrome");
		}

	}

}
