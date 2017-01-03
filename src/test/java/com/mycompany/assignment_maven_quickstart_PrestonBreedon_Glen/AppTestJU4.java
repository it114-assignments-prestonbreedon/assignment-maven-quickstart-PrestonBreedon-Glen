package com.mycompany.assignment_maven_quickstart_PrestonBreedon_Glen;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTestJU4 {
	private String  name;
	private Integer age;
	private App     app;
		
	public static Integer age2add = 10;
	public static String  strAge2add = "20";

	public void testAdd2ageInteger() {
		Integer expected = age + age2add;
		Integer actual = app.add2age(age2add);
		assertEquals("add2age did not add " + age2add + " correctly", expected, actual);
	}
}
