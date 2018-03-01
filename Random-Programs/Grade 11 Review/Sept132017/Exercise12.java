import hsa.*;
public class Exercise12{
    public static void main(String args[]){
	long userNumber = Stdin.readLong();
	boolean prime = true;
	for (long i = userNumber; i > 0; i--){
	    if (userNumber % i == 0 && i != userNumber && i != 1){
		prime = false;
	    }
	}
	if (prime){
	    Stdout.println("This number is prime.");
	}
	else{
	    Stdout.println("This number isn't prime.");
	}
    }
}
