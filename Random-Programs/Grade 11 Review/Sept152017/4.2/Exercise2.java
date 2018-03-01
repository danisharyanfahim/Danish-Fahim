import hsa.*;
public class Exercise2{
    public static void main(String args[]){
	String word1 = Stdin.readString();
	String word2 = Stdin.readString();
	int startPosition = word2.indexOf(word1);
	String contained = startPosition == -1 ? "First word isn't contained" : "First word is contained in second";
	Stdout.println(contained); 
    }
}
