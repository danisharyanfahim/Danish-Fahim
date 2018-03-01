import hsa.*;
public class Exercise7{
    public static void main(String args[]){
	int sum = 0;
	for (int i = 0; i < 5; i++){
	    Stdout.print("Word: ");
	    String word = Stdin.readString();
	    sum += word.length();
	}
	Stdout.println(sum);
    }
}
