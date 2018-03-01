import hsa.*;
public class Exercise2{
    public static void main(String[] args){
	int userNumber = 0;
	int sum = 0;
	while (userNumber != -99){
		sum += userNumber;
	    userNumber = Stdin.readInt();
	}
	Stdout.println(sum);
    }
}
