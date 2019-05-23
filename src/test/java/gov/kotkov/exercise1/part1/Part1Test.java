package test.java.gov.kotkov.exercise1.part1;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.java.gov.kotkov.exercise1.part1.Part1;

public class Part1Test {

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void testFourNumbersOffset() {
		int[] result = Part1.interviewArrayTest(new int[]{6, 2, 5, 3}, 2);
		assertArrayEquals(new int[]{5, 3, 6, 2}, result);
	}
	
	@Test
	public void testTwoNumbersOffset() {
		int[] result = Part1.interviewArrayTest(new int[]{1, 2}, 1);
		assertArrayEquals(new int[]{2, 1}, result);
	}
	
	@Test
	public void testOneNumberOffset() {
		int[] result = Part1.interviewArrayTest(new int[]{1}, 1);
		assertArrayEquals(new int[]{1}, result);
	}
	
	@Test
	public void testEmptyArray() {
		exceptionRule.expect(IllegalArgumentException.class);
	    exceptionRule.expectMessage("Array can't be empty");
		Part1.interviewArrayTest(new int[] {}, 1);
	}

	@Test
	public void testOffsetBiggerThenLength() {
		exceptionRule.expect(IllegalArgumentException.class);
	    exceptionRule.expectMessage("Offset can't be bigger then length");
		Part1.interviewArrayTest(new int[] {1, 2}, 3);
	}
	
	@Test
	public void testOffsetIsNegative() {
		exceptionRule.expect(IllegalArgumentException.class);
	    exceptionRule.expectMessage("Offset can't be negative");
		Part1.interviewArrayTest(new int[] {1, 2}, -1);
	}
	
	@Test
	public void testOffsetIsZero() {
		int[] result = Part1.interviewArrayTest(new int[]{1, 2}, 0);
		assertArrayEquals(new int[]{1, 2}, result);
	}
}
