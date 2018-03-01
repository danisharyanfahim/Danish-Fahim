public class Exercise7{
	public static void main(String args[]){
		System.out.println(derivative("5x^3"));  
	}

	public static String derivative(String monomial){
		int coefficient = Integer.parseInt(monomial.substring(0, monomial.indexOf('x')));
		int exponent = Integer.parseInt(monomial.substring(monomial.indexOf('^') + 1));
		String derivative = ((exponent * coefficient) + "x^" + (exponent - 1)) + "";
		return derivative;
	}
}
