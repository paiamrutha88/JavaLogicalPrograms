package InterviewQuestions;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class ThrowAndThrows {
	
	@Test
	public void doLogin()
	{
		throw new SkipException("Skipping");
	}

	
	@Test
	public void doLogout() throws InterruptedException
	{
	Thread.sleep(5000);
	}
}
