import java.util.Random;

public class rb_First_Response
{
	/**
	 * 
	 * @param code
	 * @return the random response 
	 */
	public String codeResponse(int code)
	{
		Random rand = new Random();
		//	Declaration of final response string
		String response = "";
		
		/*
		 * 		Declaration of string arrays, each meant to hold an assortment of 
		 * 	potential responses to be selected at random, based on the response code
		 * 	given by the main class.
		 */
		String[] listCode1 =
			{
				"Input recieved.  I am glad that you are good.  I am good as well.",
				"Input recieved.  It is good to be... good.",
				"Good.  Good is good.  I am good.  It is good that we are both good.",
				"Good is less than great, but greater than 'meh'.",
				"Computing your condition... you have entered 'good'."
			};
		String[] listCode2 =
			{
				"Test code 2 - 1",
				"Test code 2 - 2",
				"Test code 2 - 3" 
			};
		String[] listCode3 =
			{
				"Test code 3.1",
				"Test code 3.2",
				"Test code 3.3",
				"Test code 3.4",
				"Test code 3.5",
				"Test code 3.6",
				"Test code 3.7",
				"Test code 3.8",
				"Test code 3.9",
				"Test code 3.10"
			};
		String[] listCodeNeg1;
		String[] listCodeNeg2;
		String[] listCodeNeg3;
		String[] listCodeNeg4;
		String[] listGeneric;
		
		switch(code)
		{
			case 1:
			{
				response = listCode1[rand.nextInt(listCode1.length)];
				break;
			}
			case 2:
			{
				response = listCode2[rand.nextInt(listCode2.length)];
				break;
			}
			case 3:
			{
				response = listCode3[rand.nextInt(listCode3.length)];
				break;
			}
			case -1:
			{
				
				break;
			}
			case -2:
			{
				break;
			}
			case -3:
			{
				
				break;
			}
			case -4:
			{
				break;
			}
			case 0:
			{
				
				break;
			}
			case -100:
			{
				
				break;
			}
			default:
			{
				System.out.println("\nUnknown response code!\n");
				break;
			}
		}
		
		//	returns the appropriate response
		return response;
	}
	
	
}
