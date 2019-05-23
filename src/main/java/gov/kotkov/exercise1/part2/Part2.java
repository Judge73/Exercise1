package main.java.gov.kotkov.exercise1.part2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Part2 {
	
	private static final Set<Character> VOWELS;
	
	static {
		Set<Character> temp = new HashSet<>();
		temp.add('a');
		temp.add('e');
		temp.add('i');
		temp.add('o');
		temp.add('u');
		temp.add('y');
		VOWELS = Collections.unmodifiableSet(temp);
	}
	
	public static String interviewRecursionTest(String string) {
		validateString(string);
		return insertAsterisk(string.toLowerCase());
	}
	
	private static String insertAsterisk(String string) {
		if(string.length() < 2) {
			return string;
		}
		int index = string.length()/2;
		String str1 = string.substring(0, index);
		String str2 = string.substring(index, string.length());
		
		if(oneIsVowel(str1.charAt(str1.length() - 1), str2.charAt(0))) {
			return insertAsterisk(str1) + '*' + insertAsterisk(str2);
		}
		return insertAsterisk(str1) + insertAsterisk(str2);
	}
	
	private static boolean oneIsVowel(char first, char second) {
		return VOWELS.contains(first) || VOWELS.contains(second);
	}
	
	private static void validateString(String string) {
		if(string.isEmpty()) {
			throw new IllegalArgumentException("String shouldn't be empty");
		}
		if(!string.chars().allMatch(Character::isLetter)) {
			throw new IllegalArgumentException("String shouldn't contain non alphabetic characters");
		}
	}
}
