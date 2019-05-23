package main.java.gov.kotkov.exercise1.part3;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Part3 {

	public static Map<String, Integer> interviewMapTest(String[] strings) {
		return Stream.of(strings).collect(
				Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
	}

}
