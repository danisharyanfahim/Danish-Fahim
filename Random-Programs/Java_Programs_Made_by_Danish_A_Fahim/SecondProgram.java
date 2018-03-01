import hsa.*;
public class SecondProgram {
    public static void main(String[] args) {
	Stdout.print("One", 20); 
	Stdout.println(1, 10);
	Stdout.print("Ten", 20);
	Stdout.println(10, 10);
	Stdout.print("Hundred", 20);
	Stdout.println(100, 10);
	Stdout.print("Hundred", 20);
	Stdout.println(100, 13, 2);
	Stdout.print("Thousand", 20);
	Stdout.println(3645.08, 12, 1);
	Stdout.print("Thousandths", 20);
	Stdout.println(0.3419, 14, 3);
	Stdout.println();
	Stdout.print("Two hot dogs", 20);
	Stdout.print("$");
	Stdout.println(3.45, 12, 2);
	Stdout.print("Two soft drinks", 20);
	Stdout.print("$");
	Stdout.println(2.76, 12, 2);
	Stdout.print("Shit Biscuits", 20);
	Stdout.print("$");
	Stdout.println(6.69, 12, 2);
	Stdout.print("Full meal", 20);
	Stdout.print("$");
	Stdout.println(12.59, 12, 2);
    }
}

