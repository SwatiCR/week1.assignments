package week1.assignments;

public class IsArmstrong {

	public static void main(String[] args) {
		boolean var = isArmStrong(153);
		System.out.println(var);
		
	}
		public static boolean isArmStrong(int num) {
	      int number = num;
	      int sum = 0 ;
	      int cube = 1 ;
	      String tmp = Integer.toString(number);
	      int[] tempNum = new int[tmp.length()];
	      
	      for (int i = 0 ; i < tmp.length() ; i++){
	    	  tempNum[i] = tmp.charAt(i) - '0';
	        for (int j = 1 ; j <= tmp.length() ; j++){
	          int nPower = cube*tempNum[i];
	 			cube = nPower ; 	 			
	        }
	        System.out.println("cube value"+cube);
	 			sum = sum + cube ;
	 			cube  = 1;
	      }
	      if (sum == number){
	        return true;
	      }
	      else{
	        return false;
	      }	        
		}
	}


