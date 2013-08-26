
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
		words = input.split(" ");
		
		//	Label for breaking out of FOR loop 
		outLoop:
		for(i = 0; i < words.length; i++)
		{
			//	Switch statement where each case is a potential word to trigger a response code
			switch(words[i].toUpperCase())
			{
				case "GOOD":
				{
					code = 1;
					break outLoop;
				}
				case "GOOD,":
				{
					code = 1;
					break outLoop;
				}
				case "GOOD.":
				{
					code = 1;
					break outLoop;
				}
				case "GOOD!":
				{
					code = 1;
					break outLoop;
				}
				case "GREAT":
				{
					code = 2;
					break outLoop;
				}
				case "GREAT,":
				{
					code = 2;
					break outLoop;
				}
				case "GREAT.":
				{
					code = 2;
					break outLoop;
				}
				case "GREAT!":
				{
					code = 2;
					break outLoop;
				}
				case "OK":
				{
					code = 3;
					break outLoop;
				}
				case "OK;":
				{
					code = 3;
					break outLoop;
				}case "OK.":
				{
					code = 3;
					break outLoop;
				}
				case "OK!":
				{
					code = 3;
					break outLoop;
				}
				case "OKAY":
				{
					code = 3;
					break outLoop;
				}
				case "OKAY,":
				{
					code = 3;
					break outLoop;
				}
				case "OKAY.":
				{
					code = 3;
					break outLoop;
				}
				case "OKAY!":
				{
					code = 3;
					break outLoop;
				}
				case "BAD":
				{
					code = -1;
					break outLoop;
				}
				case "BAD,":
				{
					code = -1;
					break outLoop;
				}
				case "BAD.":
				{
					code = -1;
					break outLoop;
				}
				case "BAD!":
				{
					code = -1;
					break outLoop;
				}
				case "POOR":
				{
					code = -2;
					break outLoop;
				}
				case "POOR,":
				{
					code = -2;
					break outLoop;
				}
				case "POOR.":
				{
					code = -2;
					break outLoop;
				}
				case "POOR!":
				{
					code = -2;
					break outLoop;
				}
				case "POORLY":
				{
					code = -2;
					break outLoop;
				}
				case "POORLY,":
				{
					code = -2;
					break outLoop;
				}
				case "POORLY.":
				{
					code = -2;
					break outLoop;
				}
				case "POORLY!":
				{
					code = -2;
					break outLoop;
				}
				case "SAD":
				{
					code = -3;
					break outLoop;
				}
				case "SAD,":
				{
					code = -3;
					break outLoop;
				}
				case "SAD.":
				{
					code = -3;
					break outLoop;
				}
				case "SAD!":
				{
					code = -3;
					break outLoop;
				}
				case "MEH":
				{
					code = -4;
					break outLoop;
				}
				case "MEH,":
				{
					code = -4;
					break outLoop;
				}
				case "MEH.":
				{
					code = -4;
					break outLoop;
				}
				case "MEH!":
				{
					code = -4;
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
}
