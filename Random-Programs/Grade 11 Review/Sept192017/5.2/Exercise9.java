public class Exercise9{
	public static void main(String args[]){
		System.out.println(generateCode(9));	
	}
	
	public static String generateCode(int number){
		String code = "";
		for (int i = 0; i < number; i++){
			code += (int) (Math.random() * 10); 
		}	
		return code;
	}
}