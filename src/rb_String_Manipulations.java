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
		
		//	splitting the words by spaces, commas, periods, exclamation points, and question marks.
		words = input.split(" |,|\\.|!");
		
		//	Label for breaking out of FOR loop
		outLoop:
		for(i = 0; i < words.length; i++)
		{
			//	Switch statement where each case is a potential word to trigger a response code
			switch(words[i])
			{
				//	Case looking for a negative trigger word, which will then search a new switch
				//	statement looking for the potential words that could come after it.
				case "NOT":
				{
					switch(words[i + 1])
					{
						//	Looks for a potential intermediate word, 'so'.
						case "SO":
						{
							switch(words[i + 2])
							{
								case "GOOD":
								{
									code = -1;
									break outLoop;
								}
								case "GREAT":
								{
									code = -2;
									break outLoop;
								}
								case "BAD":
								{
									code = 4;
									break outLoop;
								}
							}
							break;
						}
						//	Another potential intermediate word, 'too'.
						case "TOO":
						{
							switch(words[i + 2])
							{
								case "GOOD":
								{
									code = -1;
									break outLoop;
								}
								case "GREAT":
								{
									code = -2;
									break outLoop;
								}
								case "BAD":
								{
									code = 4;
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
				case "FINE":
				{
					code = 5;
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
				case "SHIT":
				{
					code = -8;
					break outLoop;
				}
				case "SHITTY":
				{
					code = -8;
					break outLoop;
				}
				case "POOP":
				{
					code = -9;
					break outLoop;
				}
				case "POOPS":
				{
					code = -9;
					break outLoop;
				}
				case "POOPY":
				{
					code = -9;
					break outLoop;
				}
				case "CRAP":
				{
					code = -10;
					break outLoop;
				}
				case "CRAPPY":
				{
					code = -10;
					break outLoop;
				}
				case "DEPRESSED":
				{
					code = -11;
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
	 * Function that reads the input string and determines whether the user asked a
	 * non-redundant question.
	 * @param input
	 * @return boolean determining whether or not the user asked a question
	 */
	public boolean question(String input)
	{
		boolean question = false;
		
		System.out.printf("I am as good as can be expected, for a robot.  Beep boop!\n");
		
		return question;
	}
	
	/**
	 * Private function that prompts the user to end the program
	 * @param code
	 * @return the response code
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
