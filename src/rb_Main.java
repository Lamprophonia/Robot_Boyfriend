/*
 * 
 */

//	Imports and global variables
import java.util.Scanner;
import java.util.Random;

/**
 * Main class
 * @author Lamprophonia
 *
 */
public class rb_Main
{
	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args)
	{
		//	Local variables and declarations
		boolean exit = false;
		boolean question;
		int code = 0, count = 0;
		Scanner in = new Scanner(System.in);
		String input, response;
		
		//	Creating class objects
		rb_String_Manipulations objStringManip = new rb_String_Manipulations();
		rb_First_Response firstResponse = new rb_First_Response();
		rb_Early_Response earlyResponse = new rb_Early_Response();
		
		//	WHILE loop to maintain the initial prompt until the response code becomes -100
		while(exit == false)
		{
			
//			Initial prompt
			System.out.printf("\nHello Quenby.  How are you?\n");
					
			//Waits for the user's input
			input = in.nextLine();
			
			/*
			 * 		IF statements to send the program to different classes based on the length
			 * 	of the conversation.  Each IF statement should contain four parts: one to analyze
			 * 	the user input, one to determine if there was a question asked and to respond accordingly,
			 * 	one to respond appropriately, and one to wait for the user to enter new input.
			 */
			if(count == 0)
			{
				//	Initial response
			}
			else if(count > 0 && count <= 10)
			{
				//	Early responses
			}
			else if(count > 10 && count <= 20)
			{
				//	Moderate responses
			}
			else if(count > 20)
			{
				//	Long conversation responses
			}
			
			//	Call to the code finding function within the string manipulation class
			code = objStringManip.responseCodeFinder(input);
			
			if(input.contains("?"))
			{
				//	Call to the function that determines if the user asked a non-redundant question
				question = objStringManip.question(input);
			}
			
			//	Call to the function that will return a response based on the response code
			response = firstResponse.codeResponse(code);
			
			
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
