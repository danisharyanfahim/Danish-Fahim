import hsa.*;
public class Exercise3{
    public static void main(String args[]){
	Stdout.println("Please enter your first and last name with a space inbetween.");
	String fullName = Stdin.readLine();
	String firstName = fullName.substring(0, fullName.indexOf(' '));
	String lastName = fullName.substring(fullName.indexOf(' ') + 1);
	Stdout.println(firstName);
	Stdout.println(lastName);
    }
}

