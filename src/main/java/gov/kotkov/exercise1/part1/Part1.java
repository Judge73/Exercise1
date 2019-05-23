package main.java.gov.kotkov.exercise1.part1;

public class Part1 {

	public static int[] interviewArrayTest(int[] array, int offset) {
		validateArray(array);
		validateOffset(offset, array.length);
		if(array.length == 1) {
			return array;
		}
		int[] result = new int[array.length];
		System.arraycopy(array, offset, result, 0, array.length - offset);
		System.arraycopy(array, 0, result, offset, offset);
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
