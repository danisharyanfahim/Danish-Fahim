public class ErrorReport{
    public static void report(int errorNumber){
    String errorMessage = "";
    switch(errorNumber){
	case 00: errorMessage = "Error initializing system.";
		 break;
	case 01: errorMessage = "E01 Error opwning message file.";
		 break;
	case 02: errorMessage = "02 Error opening messages file.";
		 break;
	default: errorMessage = "Unknown error.";
		 break;
	}
	System.out.println(errorMessage);
    }
}
