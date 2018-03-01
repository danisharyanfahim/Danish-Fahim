import hsa.*;
public class Exercise6{
    public static void main(String aegs[]){
	String word = Stdin.readLine();
	String palindrome = "";
	String noSpaces = "";
	String newChar= "";
	
	for (int i = 0; i < word.length(); i++){
	    if (word.charAt(i) != ' '){ 
		newChar = word.charAt(i) + "";
		noSpaces += newChar ;
	    } 
	}
	newChar = "";
	
	for (int i = noSpaces.length(); i >= 0; i--){
	    if (i == 0){
		newChar = noSpaces.charAt(0) + "";   
	    }
	    else if (i != noSpaces.length()){
		newChar = noSpaces.charAt(i) + "";
	    }
	    palindrome += newChar;
	}

	if (noSpaces.equals(palindrome)){
	    Stdout.println(palindrome + " is a palindrome.");
	}
	else{
	    Stdout.println(palindrome + " isn't a palindrome.");
	}
    }
}
