import java.util.*;
import java.io.*;

public class rb_First_Response
{
	private Scanner fileReader;
	/**
	 * 
	 * @param code
	 * @return the random response
	 */
	public String codeResponse(int code)
	{
		Random rand = new Random();
		//	Declaration of final response string
		String response = null;
		//	String to hold the name of the .txt file based on the response code
		String fileName;
		int x = 0, length = 100;
		//	String array to read in the response lines from the chosen .txt file
		String[] responseList;
		responseList = new String[length];
		
		//	SWITCH case to determine which file to read from based on the response code
		switch(code)
		{
		case 1:
			fileName = "response_files\\responses_code1.txt";
			break;
		case 2:
			fileName = "response_files\\responses_code2.txt";
			break;
		case 3:
			fileName = "response_files\\responses_code3.txt";
			break;
		case 4:
			fileName = "response_files\\responses_code4.txt";
			break;
		case 5:
			fileName = "response_files\\responses_code5.txt";
			break;
		case -1:
			fileName = "response_files\\responses_code-1.txt";
			break;
		case -2:
			fileName = "response_files\\responses_code-2.txt";
			break;
		case -3:
			fileName = "response_files\\responses_code-3.txt";
			break;
		case -4:
			fileName = "response_files\\responses_code-4.txt";
			break;
		case -5:
			fileName = "response_files\\responses_code-5.txt";
			break;
		case -6:
			fileName = "response_files\\responses_code-6.txt";
			break;
		case -7:
			fileName = "response_files\\responses_code-7.txt";
			break;
		case -8:
			fileName = "response_files\\responses_code-8.txt";
			break;
		case -9:
			fileName = "response_files\\responses_code-9.txt";
			break;
		case -10:
			fileName = "response_files\\responses_code-10.txt";
			break;
		case -11:
			fileName = "response_files\\responses_code-11.txt";
			break;
		default:
			fileName = "response_files\\responses_code0.txt";
			break;
		}
		
		//	Checks for the existence of the file selected
		try
		{
			fileReader = new Scanner(new File(fileName));
		}catch(Exception e)
		{
			System.out.printf("ERROR: Could not find file!");
		}
		
		//	Reads the file and puts each line in the string array
		while(fileReader.hasNextLine())
		{
			responseList[x] = fileReader.nextLine();
			x++;
		}
		
		//	Makes sure that the response will not be blank
		while(response == null)
		{
			response = responseList[rand.nextInt(length)];
		}
		
		//	Closing the file
		fileReader.close();
		
		//	returns the appropriate response
		return response;
	}
}