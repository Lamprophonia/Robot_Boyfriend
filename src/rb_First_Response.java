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
		
		//	"GOOD"
		String[] listCode1 =
			{
				"Input recieved.  I am glad that you are good.",
				"Input recieved.  It is good to be... good.",
				"Good.  Good is good.",
				"Good is less than great, but greater than 'meh'.",
				"Computing your condition... you have entered 'good'."
			};
		//	"GREAT"
		String[] listCode2 =
			{
				"Input recieved.  You are great!  That is good.",
				"Great great, or great like Tony the Tiger?  Grrrrrrrrrrrrreat!",
				"Input recieved, calculating status of 'great'... this is a good thing.",
				"Input recieved.  There was a man named Alexander once.  He was also great."
			};
		//	"OK" or "OKAY"
		String[] listCode3 =
			{
				"Input recieved... Okay is an average emotional state.",
				"Input recieved.  Okay is preferable to bad, but not as preferable as good.",
				"Input recieved, emotional state recognized as 'okay'.  Just okay?"
			};
		//	"NOT BAD"
		String[] listCode4 =
			{
				"Not bad is better than not good."
			};
		//	"NOT GOOD"
		String[] listCodeNeg1 =
			{
				"Not good is less desirable than not bad, or even good."
			};
		//	"NOT GREAT"
		String[] listCodeNeg2 =
			{
				"Not great is worse than not good.  Significantly worse than great."
			};
		//	"NOT OK" or "NOT OKAY"
		String[] listCodeNeg3 =
			{
				"Oh no, what is wrong?"
			};
		//	"BAD"
		String[] listCodeNeg4 =
			{
				"Oh no!  I do not want you to be bad!"
			};
		//	"POOR" or "POORLY"
		String[] listCodeNeg5 =
			{
				"Input recieved... it is unfortunate that you are not doing well."
			};
		//	"SAD"
		String[] listCodeNeg6 =
			{
				"Input recieved... I do not like it when you are sad."
			};
		//	"MEH"
		String[] listCodeNeg7 =
			{
				"Computing 'meh'... it would appear that you are too cool for the proverbial school."
			};
		//	Code 0, no emotional trigger response word
		String[] listGeneric =
			{
				"I hope you are content with your current emotional state."
			};
		
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
			case 4:
			{
				response = listCode4[rand.nextInt(listCode4.length)];
				break;
			}
			case -1:
			{
				response = listCodeNeg1[rand.nextInt(listCodeNeg1.length)];
				break;
			}
			case -2:
			{
				response = listCodeNeg2[rand.nextInt(listCodeNeg2.length)];
				break;
			}
			case -3:
			{
				response = listCodeNeg3[rand.nextInt(listCodeNeg3.length)];
				break;
			}
			case -4:
			{
				response = listCodeNeg4[rand.nextInt(listCodeNeg4.length)];
				break;
			}
			case -5:
			{
				response = listCodeNeg5[rand.nextInt(listCodeNeg5.length)];
				break;
			}
			case -6:
			{
				response = listCodeNeg6[rand.nextInt(listCodeNeg6.length)];
				break;
			}
			case -7:
			{
				response = listCodeNeg7[rand.nextInt(listCodeNeg7.length)];
				break;
			}
			case 0:
			{
				response = listGeneric[rand.nextInt(listGeneric.length)];
				break;
			}
			case -100:
			{
				System.out.printf("Goodbye, Quenby!");
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
