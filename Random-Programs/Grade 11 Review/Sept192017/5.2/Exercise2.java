public class Exercise2{
	public static void main(String args[]){
		System.out.println(multipleFactors(1, 3, 15));  
	}

	public static boolean multipleFactors(int p, int q, int r){
		boolean Factor = false;
		if (q % p == 0 && r % q == 0){
			Factor = true;
		}
		return Factor;
	}
}
