import java.util.Scanner;

public class rb_String_Manipulations
{
	/**
	 * Function to analyze the initial response and return a response code based on the
	 * results.
	 * @param input
	 * @return the response code used to determine initial response
	 */
	public int responseCodeFinder(String input)
	{
		int i, code = 0;
		//	String array to split the sentence into individual words
		String[] words;
		
		//	splitting the words by spaces
		words = input.split(" |,|\\.|!|\\?");
		
		//	Label for breaking out of FOR loop 
		outLoop:
		for(i = 0; i < words.length; i++)
		{
			//	Switch statement where each case is a potential word to trigger a response code
			switch(words[i].toUpperCase())
			{
				case "NOT":
				{
					switch(words[i + 1].toUpperCase())
					{
						case "SO":
						{
							switch(words[i + 2].toUpperCase())
							{
								case "GOOD":
								{
									System.out.printf("NOT SO GOOD\n");
									code = -1;
									break outLoop;
								}
								case "GREAT":
								{
									System.out.printf("NOT SO GREAT\n");
									code = -2;
									break outLoop;
								}
							}
							break;
						}
						case "GOOD":
						{
							System.out.printf("NOT GOOD\n");
							code = -1;
							break outLoop;
						}
						case "GREAT":
						{
							System.out.printf("NOT GREAT\n");
							code = -2;
							break outLoop;
						}
						case "OK":
						{
							System.out.printf("NOT OK\n");
							code = -3;
							break outLoop;
						}
						case "OKAY":
						{
							System.out.printf("NOT OKAY\n");
							code = -3;
							break outLoop;
						}
						case "BAD":
						{
							System.out.printf("NOT BAD\n");
							code = 4;
							break outLoop;
						}
					}
					break;
				}
				case "GOOD":
				{
					System.out.print("Booga booga booga\n");
					code = 1;
					break outLoop;
				}
				case "GREAT":
				{
					code = 2;
					break outLoop;
				}
				case "OK":
				{
					code = 3;
					break outLoop;
				}
				case "OKAY":
				{
					code = 3;
					break outLoop;
				}
				case "BAD":
				{
					code = -4;
					break outLoop;
				}
				case "POOR":
				{
					code = -5;
					break outLoop;
				}
				case "POORLY":
				{
					code = -5;
					break outLoop;
				}
				case "SAD":
				{
					code = -6;
					break outLoop;
				}
				case "MEH":
				{
					code = -7;
					break outLoop;
				}
				default:
				{
					code = 0;
					break;
				}
			}
		}
		
		return code;
	}
	
	/**
	 * Private function that prompts the user to end the program
	 * @param code
	 * @return the response codeIO go
	 */
	public int cont(int code)
	{
		String cont;
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want to continue? (yes or no)\n");
		cont = in.next();
		
		if(cont.toUpperCase().contains("NO"))
		{
			code = -100;
		}
		
		return code;
	}
}
