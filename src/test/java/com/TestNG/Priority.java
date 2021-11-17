package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Priority {
	@Test  (priority = 3)
	private void highschool() {
		System.out.println("iam studying 10th");
     }
	
	@Test (priority = 0)@Ignore
	private void higher_secondary() {
		System.out.println("iam  doing my highersecondary");

	}
	@Test (priority = 4)
	private void UG_college() {
		System.out.println("now iam under graduate");

	}
	@Test (priority = 5,enabled = false)
	private void PG() {
     System.out.println("now iam in final graduation");
	}


}
