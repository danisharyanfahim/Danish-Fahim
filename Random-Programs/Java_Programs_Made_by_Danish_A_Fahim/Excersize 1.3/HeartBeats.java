/* import hsa *;                                --Space between has and *
public class HeartBeats
{
    public void static main (String () args)    --void and static are switched  --round brackets after String rather than square brackets
    {
	console window = new Console ();        --Beginning console not capitalized
	int beats = 72.0;                       --value is int instead of double
	window.print ("The human heart beats ");
	window.print (beats * 60 * 24 * 30);
	window.println (" times in one month")  --No semi-colon at the end, and it should be print not println
    }
}
*/

import hsa.*;
public class HeartBeats
{
    public static void main (String [] args)
    {
	Console window = new Console ();
	int beats = 72;
	window.print ("The human heart beats ");
	window.print (beats * 60 * 24 * 30);
	window.print (" times in one month.");
    }
}
