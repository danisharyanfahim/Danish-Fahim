import hsa.*;
public class Question1{
    public static void main(String[] args){
	calculate(400000, 25, 0.0299);
    }
    
    public static void calculate(double initialPayment, int years, double interest){
	double payment = (initialPayment * interest)/(12 * (1 -(Math.pow(1 + (interest/12), -12 * years)))); //Payment calculation
	double balance = initialPayment; //Monthly balance
	for (int i = 1; i <= (12 * years); i++){ //Runs loop for 12 times the year for every month
	    Stdout.print("Month " + i + ": "); 
	    Stdout.println(balance, 5, 2); //Format to dollars and cents
	    balance = ((1+(interest/12)) * balance) - payment; //Reduces the balance by the appropiate ammount
	}  
    }
}
