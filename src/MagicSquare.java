
public class MagicSquare {
	public static void main(String[] args) {
		int[][] square1 = { { 10, 3, 8 }, { 5, 7, 9 }, { 6, 11, 4 } };
		int[][] square2 = { { 10, 3, 8 }, { 5, 7, 9 }, { 6, 11, 3 } };
		int[][] square3 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };
		int[][] square4 = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int[][] square5 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 9 } };
		int[][] square6 = { { 5, 1, 1, 1 }, { 1, 5, 1, 1 }, { 1, 1, 5, 1 }, { 1, 1, 1, 5 } };

		System.out.println("Test 1: " + isMagic(square1));
		System.out.println("Test 2: " + isMagic(square2));
		System.out.println("Test 3: " + isMagic(square3));
		System.out.println("Test 4: " + isMagic(square4));
		System.out.println("Test 5: " + isMagic(square5));
		System.out.println("Test 6: " + isMagic(square6));

	}

	// POST: returns true if the array is magic and
	// false otherwise
	public static boolean isMagic(int[][] arr) {
		// Your code here
	}

	// Copy rowSum here

	// Copy colSum here
}
