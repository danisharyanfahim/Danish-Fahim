import hsa.*;
public class Exercise9{
    public static void main(String args[]){
	Stdout.println("August 2015", -19);
	Stdout.println("Sun Mon Tue Wed Thu Fri Sat");
	for (int i = 1; i <= 31; i++){
	    int indentation = 4;
	    if (i == 1){
		indentation = 27;
	    }
	    else if ((i + 5) % 7 == 0){
		indentation = 3;
	    }
	    if ((i - 1) % 7 == 0){
	      Stdout.println(i, indentation);
	    }
	    else{
		Stdout.print(i, indentation);
	    }
	}
    }
}
