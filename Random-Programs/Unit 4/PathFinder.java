public class PathFinder
{
    public static void main (String[] args)
    {
	findPath(0,0,"");
    }
    public static int[][] board = new int[4][4];
    public static void findPath (int row, int column, String pathway)
    {
	if (row == board.length -1  && column == board[0].length - 1)
	{
	    System.out.println (pathway);
	}
	else
	{
	    if (row < board.length - 1)
	    {
		findPath (row + 1, column, pathway + "RIGHT:");
	    }
	    if (column < board[0].length - 1)
	    {
		findPath (row, column + 1, pathway + "DOWN:");
	    }
	}
    }
    
}
