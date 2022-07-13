package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] txtarray = test.split(" ");
		
		for (int i = 0; i < txtarray.length; i++) {			
			if (i==0 || i % 2 == 0) {
				System.out.print(txtarray[i]+" ");
			}
			else 
			{
				char[] ch = txtarray[i].toCharArray();
				for (int j = ch.length - 1 ; j >= 0 ; j--) {
					System.out.print(ch[j]);
				}
			}System.out.print(" ");			
		}
	}

}
