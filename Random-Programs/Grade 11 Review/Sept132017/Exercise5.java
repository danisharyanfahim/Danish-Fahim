import hsa.*;
public class Exercise5{
    public static void main(String args[]){
	Stdout.print("p");
	Stdout.print("q", -10);
	Stdout.println("(p   xor   q)", -22);
	Stdout.println("---------------------------------");

	while (true) {
	    boolean p = Stdin.readBoolean();
	    boolean q = Stdin.readBoolean();
	    if (p == true){
		if (q == true){
		    Stdout.print(p, 10);
		    Stdout.print(q, 10);
		    Stdout.println("false");
		}
		else{
		    Stdout.print(p, 10);
		    Stdout.print(q, 10);
		    Stdout.println("true");
		} 
	    }
	    else{
		if (q == true){
		    Stdout.print(p, 10);
		    Stdout.print(q, 10);
		    Stdout.println("true");
		}
		else{
		    Stdout.print(p, 10);
		    Stdout.print(q, 10);
		    Stdout.println("false");
		}
	    }
	}
    }
}
