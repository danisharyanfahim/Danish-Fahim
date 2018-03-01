public class Exercise2{
    public static void main(String args[]){
	int[] a = new int[50];
	for(int i = 0; i < a.length; i++){
	    a[i] = (int) (Math.random() * 100);
	    System.out.println(a[i]);
	}
	System.out.println("");
	arrayShift(a, -2);
	for(int i = 0; i < a.length; i++){
	    System.out.println(a[i]);
	}
    }
    public static void arrayShift(int[] numbers, int shift){
	for (int i = 0; i < numbers.length; i++){
	    if (i + shift < numbers.length){
		numbers[i] = numbers[i + shift];
	    }
	    else{
		numbers[i] = numbers[i + shift - numbers.length]; 
	    } 
	}
    }
}
