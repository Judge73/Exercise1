package main.java.gov.kotkov.exercise1.part1;

public class Part1 {

	public static int[] interviewArrayTest(int[] array, int offset) {
		validateArray(array);
		validateOffset(offset, array.length);
		if(array.length == 1) {
			return array;
		}
		int[] result = new int[array.length];
		for(int i = 0; i + offset < array.length; i++) {
			result[i] = array[i + offset];
		}
		for(int j = 0; j < offset; j++) {
			result[array.length - offset] = array[j];
		}
		return result;
	}
	
	private static void validateArray(int[] array) {
		if(array.length == 0) {
			throw new IllegalArgumentException("Array can't be empty");
		}
	}
	
	private static void validateOffset(int offset, int length) {
		if(offset > length) {
			throw new IllegalArgumentException("Offset can't be bigger then length");
		} else if(offset < 0) {
			throw new IllegalArgumentException("Offset can't be negative");
		}
	}
}
