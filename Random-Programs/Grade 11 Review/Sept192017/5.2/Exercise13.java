public class Exercise13{
	public static void main(String args[]){
		System.out.println((isbn10("842199820X")));     
	}
	
	public static boolean isbn10(String code){
		boolean valid = false;
		boolean lastDigit = false;
		boolean firstDigits = false;
		int equation =0;
		if (code.length() == 10){
			for (int i = 0; i < 10; i++){
				if (i < 9){
					if (((int) (code.charAt(i)) >= 48 && ((int) code.charAt(i)) <= 57)){
						firstDigits = true;    
					} 
				}
				else{
					if (((int) (code.charAt(i)) >= 48 && ((int) code.charAt(i)) <= 57) || code.charAt(i) == 'X'){
						lastDigit = true;
					}       
				}
			}
		}

		if (lastDigit == true && firstDigits == true){
			for (int i = 0; i < 9; i++){
				equation += (i + 1) * (Integer.parseInt(code.charAt(i) + ""));
			}       
		}
		if (code.charAt(9) == 'X'){
		    if (equation % 11 == 10){
			valid = true;
		    } 
		}
		else if(equation % 11 == Integer.parseInt(code.charAt(9) + "")){
			valid = true;
		} 
		return valid;
	}
}
