public class Exercise10{
    public static void main(String args[]){
	long firstNumber = 0;
	long secondNumber = 1;
	long fibonacciNumber = 0;
	for (int i = 1; i <= 50; i++){
	    if (i > 1){
	       fibonacciNumber = firstNumber + secondNumber; 
	       firstNumber = secondNumber;
	       secondNumber = fibonacciNumber; 
	    }
	    else{
		fibonacciNumber = 1;
	    }
	System.out.println(fibonacciNumber);
	}
    }
}
