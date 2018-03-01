public class Recursion{
    public static void main(String args[]){
	System.out.println(pascalsTriangle(4, 2));
    }
    
    public static long factorial(int n){
	return n == 0 ? 1 : n * factorial(n - 1);
    }
    
    public static long fibonacci(int n){
	return n <= 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
	//return n == 1 || n == 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static double ballDistance(int n){
	return n == 0 ? 0 : 16 + 0.7 * ballDistance(n - 1);
    }
    
    public static long pascalsTriangle(int row, int col){
	/*if(col == 0 || col == row){
	    return 1;
	}
	else{
	    return pascalsTriangle(row - 1, col - 1) + pascalsTriangle(row - 1, col);
	}*/
	return col == 0 || col == row ? 1 : pascalsTriangle(row - 1, col - 1) + pascalsTriangle(row - 1, col);
    }
}
