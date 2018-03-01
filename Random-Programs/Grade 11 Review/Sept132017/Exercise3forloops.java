import hsa.*;
public class Exercise3forloops{
    public static void main(String args[]){
	Stdout.print("x", 8);
	Stdout.println("f(x)");
	Stdout.println("------------");
	double y = 0;
	for (int x = -5; x <= 5; x++){
	    y = 2 * Math.pow(x, 3) + Math.pow(x, 2) - x + 6;
	    Stdout.print(x, 2);
	    Stdout.println(y, 10);
	}
    }
}
