/*
 * 
 */

//	Imports and global variables
import java.util.Scanner;

public class rb_Main
{
	public static void main(String[] args)
	{
		//	Local variables and declarations
		boolean exit = false;
		int code = 0, count = 0;
		Scanner in = new Scanner(System.in);
		String input, response;
		
		rb_String_Manipulations objStringManip = new rb_String_Manipulations();
		rb_First_Response objResponse = new rb_First_Response();
		
//		Initial prompt
				System.out.printf("\nHello Quenby.  How are you?\n");
		
		//	WHILE loop to maintain the initial prompt until the response code becomes -100
		while(exit == false)
		{
			//Waits for the user's input
			input = in.nextLine();
			
			//	Call to the code finding function within the string manipulation class
			code = objStringManip.responseCodeFinder(input);
			
			//	Call to the function that will return a response based on the response code
			response = objResponse.codeResponse(code);
			
			//	Printing out the response
			System.out.printf("%s\n", response);
			count++;
			
			//	Calling the function to prompt the user to continue every 5 responses
			if(count % 5 == 0)
			{
				code = objStringManip.cont(code);
			}
			
			//	Testing for exit code (-100)
			if (code == -100)
			{
				exit = true;
			}
		}
		
				//	Test printing the count #
				System.out.printf("You recieved %d responses.\n", count);
	}
}

/*

TODO:
	- Separate introductory response from first series of responses
	-	

*/
