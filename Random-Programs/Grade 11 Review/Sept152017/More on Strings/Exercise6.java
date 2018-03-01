import hsa.*;
public class Exercise6{
    public static void main(String argsp[]){
	Stdout.print("Character: ");
	char word = Stdin.readChar();
	System.out.println((char)((int) word + 2));
    }
}
