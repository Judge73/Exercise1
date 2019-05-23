package test.java.gov.kotkov.exercise1.part3;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import main.java.gov.kotkov.exercise1.part3.Part3;

public class Part3Test {

	@Test
	public void testOne() {
		Map<String, Integer> result = Part3.interviewMapTest(new String[]{"a", "bb", "a", "bb"});
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 2);
		map.put("bb", 2);
		assertEquals(map, result);
	}
	
	@Test
	public void testTwo() {
		Map<String, Integer> result = Part3.interviewMapTest(new String[]{"this", "and", "that", "and"});
		Map<String, Integer> map = new HashMap<>();
		map.put("and", 2);
		map.put("this", 1);
		map.put("that", 1);
		assertEquals(map, result);
	}
	
	@Test
	public void testThree() {
		Map<String, Integer> result = Part3.interviewMapTest(new String[]{"code", "code", "code", "bug"});
		Map<String, Integer> map = new HashMap<>();
		map.put("code", 3);
		map.put("bug", 1);
		assertEquals(map, result);
	}

}
