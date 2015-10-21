package testng;

import org.testng.annotations.Test;

public class sample {
	@Test(priority=0)
	public void test()
	{
		System.out.println("First");
	}
   
	@Test(enabled=false)
	public void reg()
	{
		System.out.println("second");
		
	}
	@Test(priority=2)
	public void connect()
	{
		System.out.println("Third");
	}
	
}
