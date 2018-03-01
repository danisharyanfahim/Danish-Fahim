import hsa.*;
public class Exercise10{
    public static void main(String args[]){
	boolean result = false;
	for (int i = 1; i <= 3; i++){
	    Stdout.print("Name " + i + ": ");
	    String word = Stdin.readString();
	    if (!result){
		result = word.equals("Donna") ? true : false ;
	    }
	}
	Stdout.println("");
	Stdout.println(result);
    }
}
