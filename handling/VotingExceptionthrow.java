package excepation.handling;

public class VotingExceptionthrow extends Exception
{
	public static void main (String[] args)
	{
		VotingExceptionthrow exception=new VotingExceptionthrow();
		VotingException.validate(17);
	}
}
