/*
 * 
 */

//	Imports and global variables
import java.util.Scanner;

public class rb_Main
{
	//	Variables for the main class
	boolean exit = false;
	
	public static void main(String[] args)
	{
		//	Local variables and declarations
		int responseCode = 0, count = 0;
		Scanner in = new Scanner(System.in);
		rb_String_Manipulations objStringManip = new rb_String_Manipulations();
		String input;
		
		System.out.printf("Hello Quenby.  How are you?\n");
		input = in.nextLine();
		
		//	Call to the code finding function within the string manipulation class
		responseCode = objStringManip.responseCodeFinder(input);
		
		System.out.printf("\n%d", responseCode);
	}
}