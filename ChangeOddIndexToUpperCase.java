package week1.assignments;
import java.lang.*;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		String test = "excellent";
		
		char[] chArray = test.toCharArray();
		
		for (int i = 0; i < chArray.length; i++) {
			if (i % 2 != 0)
			{
				char ch = Character.toUpperCase(chArray[i]);
				chArray[i] = ch ;
			}
			System.out.print(chArray[i]);
		}

	}

}
