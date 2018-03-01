//Incomplete
public class SearchAndSort{
    public static void main(String args[]){
	int[] numbers = new int[20];
	for (int i = 0; i < numbers.length; i++){
	    numbers[i] = (int) (Math.random()* 50);
	}
    }
    
    public static void printNumbers(int[] numbers){
	for(int i = 0; i < numbers.length; i++){
	    System.out.println(numbers[i]);
	}
    }
    
    public static void swapNumbers(int[] numbers, int i, int j){
	int placeHolder = 0;
	placeHolder = numbers[i];
	numbers[i] = numbers[j];
	numbers[j] = placeHolder;  
    }
    
    public static int indexOfLargest(int[] numbers){
	int largest = 0;
	for (int i = 0; i < numbers.length; i++){
	    if (i == 0){
		largest = 0;
	    }
	    else{
		if(numbers[i] > largest){
		    largest = i;
		}
	    }
	} 
	return largest;
    }
    
    public static void selectionSort(int[] integers){
	int k = 0;
	for (int i = integers.length - 1; i > 0; i--){
	    k = Arrays.copyOfRange(integers,  ;
	    swapNumbers(integers, i, k);
	}
    }  
}
