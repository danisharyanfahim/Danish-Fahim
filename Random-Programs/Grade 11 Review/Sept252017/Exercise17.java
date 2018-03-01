public class Exercise17{
    public static void main (String args[]){
	int[] numbers = new int[5];
	for (int i = 0; i < numbers.length; i ++){
	    numbers[i] = (int) (Math.random() * 100 / 2);
	    System.out.println(numbers[i]);
	}
	int largest = 0;
	int location = 0;
	for (int i = 0; i < numbers.length; i ++){
	    if (i == 0){
		largest = numbers[i]; 
	    }
	    else if(numbers[i] > largest){
		largest = numbers[i];
		location = i;
	    }
	}
	System.out.println("Largest number: " + largest + "   Location: " + location);
    }
}
