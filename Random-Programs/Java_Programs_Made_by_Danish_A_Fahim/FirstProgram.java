import hsa.*;
public class FirstProgram {
    public static void main(String[] args) {
	Console window = new Console();
	Console monkey = new Console();
	
	/* System.out.println("Hello Nigga, Sup");
	System.out.println(123);
	System.out.println(984*5+3%6);
	System.out.println(0x3846);
	System.out.println("Hello" + " DickHead");
	System.out.println("This is called Concatination");
	System.out.println(2 + 3 + "Hello");
	System.out.println("Hello " + 2 + 3);
	System.out.println("Hello " + (2 + 3));
	System.out.println(10 / 4.0); */
	
	Stdout.println(10 / 3.0, 3, 7); 
	window.println(10 / 3.0, 8, 2);
	monkey.println("This is the window where monkeys live");
    }
}

