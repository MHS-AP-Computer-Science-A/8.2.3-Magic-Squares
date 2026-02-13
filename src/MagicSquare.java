public class MagicSquare {

    /**
     * Returns true if the 2D array is a magic square.
     *
     * Algorithm:
     * 1. Compute the sum of the first row and store it as the target sum.
     * 2. Check that every remaining row sum matches the target sum.
     *    - If any row sum is different, return false.
     * 3. Check that every column sum matches the target sum.
     *    - If any column sum is different, return false.
     * 4. Check that both diagonals sum matche the target sum.
     *    - If either diagonal is different, return false.
     * 5. If all checks pass, return true.
     */
    public static boolean isMagic(int[][] arr) {
        // TODO: Student implementation
        return false;
    }

    /**
     * Returns the sum of all values in the given row.
     * Precondition: row is a valid index in arr.
     */
    public static int rowSum(int[][] arr, int row) {
        // TODO: Student implementation
        return 0;
    }

    /**
     * Returns the sum of all values in the given column.
     * Precondition: col is a valid index in arr.
     */
    public static int colSum(int[][] arr, int col) {
        // TODO: Student implementation
        return 0;
    }

    /**
     * Returns the sum of the main diagonal (top-left to bottom-right).
     */
    public static int mainDiagonalSum(int[][] arr) {
        // TODO: Student implementation
        return 0;
    }

    /**
     * Returns the sum of the secondary diagonal (top-right to bottom-left).
     */
    public static int secondaryDiagonalSum(int[][] arr) {
        // TODO: Student implementation
        return 0;
    }

    public static void main(String[] args) {

        int[][] square3x3 = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int[][] square4x4 = {
            {16, 2, 3, 13},
            {5, 11, 10, 8},
            {9, 7, 6, 12},
            {4, 14, 15, 1}
        };

        int[][] square5x5 = {
            {17, 24, 1, 8, 15},
            {23, 5, 7, 14, 16},
            {4, 6, 13, 20, 22},
            {10, 12, 19, 21, 3},
            {11, 18, 25, 2, 9}
        };

        int[][] notMagic = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // ---- Helper Method Tests (2 per method) ----

        // rowSum tests
        System.out.println("Row 0 sum (3x3): " + rowSum(square3x3, 0));
        System.out.println("Row 2 sum (5x5): " + rowSum(square5x5, 2));

        // colSum tests
        System.out.println("Col 1 sum (3x3): " + colSum(square3x3, 1));
        System.out.println("Col 3 sum (4x4): " + colSum(square4x4, 3));

        // main diagonal tests
        System.out.println("Main diagonal sum (3x3): " + mainDiagonalSum(square3x3));
        System.out.println("Main diagonal sum (4x4): " + mainDiagonalSum(square4x4));

        // secondary diagonal tests
        System.out.println("Secondary diagonal sum (3x3): " + secondaryDiagonalSum(square3x3));
        System.out.println("Secondary diagonal sum (5x5): " + secondaryDiagonalSum(square5x5));

        // ---- Magic Square Tests ----
        System.out.println("3x3 magic (expected true):  " + isMagic(square3x3));
        System.out.println("4x4 magic (expected true):  " + isMagic(square4x4));
        System.out.println("5x5 magic (expected true):  " + isMagic(square5x5));
        System.out.println("Not magic (expected false): " + isMagic(notMagic));
    }
}

