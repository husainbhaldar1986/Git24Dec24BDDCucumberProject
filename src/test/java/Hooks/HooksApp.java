package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksApp 
{
	@Before
	public void beforeHook()
	{
		System.out.println("-------Running before hook------------");
	}

	@After
	public void afterHook()
	{
		System.out.println("------Running after hook-------------");
	}
	
//	@BeforeStep
//	public void beforeStepHook()
//	{
//		System.out.println("-------Running before step hook------------");
//	}
//
//	@AfterStep
//	public void afterStepHook()
//	{
//		System.out.println("------Running after step hook-------------");
//	}
	
}
