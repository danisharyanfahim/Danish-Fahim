import hsa.*;
public class Exercise8{
    public static void main(String args[]){
	int[] list = new int[50];
	for(int i = 0; i < list.length; i++){
	    list[i] = (int) (Math.random() / 2 * 100);
	    System.out.println(list[i]);
	}
	int userNumber = Stdin.readInt();
	int location = -1;
	for(int i = 0; i < list.length; i++){
	    if (userNumber == list[i]){
		 location = i;
	    }
	} 
	Stdout.println("Index location: " + location);
    }
}
