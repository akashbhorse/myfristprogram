package basic;

import org.testng.annotations.Test;

public class HEllo {

	@Test(invocationCount=4)
	public void hello() 
	{
		System.out.println("Hello world");
	}
	@Test(groups= {"smoke"})
	public void hi() 
	{
		System.out.println("Hi this is hi block GROUP");
	}
}
