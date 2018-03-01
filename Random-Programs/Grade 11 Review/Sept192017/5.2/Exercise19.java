public class Exercise19{
    public static void main(String args[]){
	System.out.println(phoneWithoutDashes("416-659-9343"));    
    }
    
    public static String phoneWithoutDashes(String number){
	String phoneNoDashes = "";
	for (int i = 0; i < number.length(); i++){
	    if (number.charAt(i) != '-'){
		phoneNoDashes += number.charAt(i);
	    }
	}
	return phoneNoDashes;
    }
}
