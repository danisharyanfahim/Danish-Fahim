import hsa.*;

public class ChallengeQuestion{
	public static void recursion(String s, int n){
		if(s.length() <= n){
			if(s.length() > 0) System.out.println(s);
			recursion(s+"R", n);
			recursion(s+"Y", n);
			recursion(s+"B", n);
		}
	}
	public static void main(String[] args){
		int n = Stdin.readInt();
		recursion("", n);
	}
}
