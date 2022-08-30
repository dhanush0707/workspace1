package com.suitelevelexecution;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// suite level execution

@RunWith(Suite.class)
@SuiteClasses({Level1.class,Level2.class,Level3.class})

public class Runner {
	
	
}
