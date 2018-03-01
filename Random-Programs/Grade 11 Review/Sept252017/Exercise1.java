public class Exercise1{
    public static void main(String args[]){
	int[] a = new int[50];
	int[] b = new int[50];
	for(int i = 0; i < a.length; i++){
	    a[i] = (int) (Math.random() * 100);
	    b[i] = -1;
	    System.out.println(a[i]);
	}
	arrayCopy(a, b);
	System.out.println("");
	for(int i = 0; i < b.length; i++ ){
	    System.out.println(b[i]);
	}
    }
    public static void arrayCopy(int[] source, int[] destination){
	for(int i = 0; i < source.length; i++){
	    destination[i] = source[i];     
	}
    }
}
