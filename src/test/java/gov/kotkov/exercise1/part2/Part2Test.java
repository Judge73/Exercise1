package test.java.gov.kotkov.exercise1.part2;


import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.java.gov.kotkov.exercise1.part2.Part2;

public class Part2Test {

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testHello() {
		String result = Part2.interviewRecursionTest("hello");
		assertEquals("h*e*ll*o", result);
	}
	
	@Test
	public void testHealo() {
		String result = Part2.interviewRecursionTest("healo");
		assertEquals("h*e*a*l*o", result);
	}
	
	@Test
	public void testAbc() {
		String result = Part2.interviewRecursionTest("abc");
		assertEquals("a*bc", result);
	}
	
	@Test
	public void testOab() {
		String result = Part2.interviewRecursionTest("oab");
		assertEquals("o*a*b", result);
	}

	@Test
	public void testEmptyString() {
		exceptionRule.expect(IllegalArgumentException.class);
	    exceptionRule.expectMessage("String shouldn't be empty");
		Part2.interviewRecursionTest("");
	}
	
	@Test
	public void testStringWithNonAlphabeticCharacters() {
		exceptionRule.expect(IllegalArgumentException.class);
	    exceptionRule.expectMessage("String shouldn't contain non alphabetic characters");
		Part2.interviewRecursionTest("ba1c");
	}
	
}
