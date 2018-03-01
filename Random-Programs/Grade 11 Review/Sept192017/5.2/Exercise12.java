public class Exercise12{
	public static void main(String args[]){
		System.out.println(removeSpaces("Nigerian penguins are the rulers of uranus."));        
	}
	
	public static String removeSpaces(String message){
		String newMessage = "";
		for (int i = 0; i < message.length(); i++){
			if (message.charAt(i) != ' '){
				newMessage += message.charAt(i); 
			}
		}
		return newMessage;
	}
}
