import hsa.*;
public class Exercise5{
    public static void main(String argsp[]){
	Stdout.print("Word: ");
	String word = Stdin.readLine();
	for (int i = 0; i < word.length(); i++){
	    Stdout.print((int) word.charAt(i));
	    Stdout.println((int) word.charAt(i) + 1, 8);
	}
    }
}
