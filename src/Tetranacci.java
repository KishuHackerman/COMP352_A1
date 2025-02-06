/** Java Implementation
 * The java program calculates Tetranacci numbers by using
 * two different recursive methods. It compares their performance
 * and writes the result in a text file.
 */
public class Tetranacci {

    /**
     * This method follows an exponential time complexity due to redundant
     * recursive calls, making it inefficient for large values of n.
     */
    /*
    Pseudo code
    function Tetranacci(n):
        if n == 0 or n == 1 or n == 2: return 0
        if n == 3: return 1
        return Tetranacci(n-1) + Tetranacci(n-2) + Tetranacci(n-3) + Tetranacci(n-4)
     */
    public static long multipleRecursion(int n){
        if (n == 0 || n == 1 || n == 2) return 0;
        if (n == 3) return 1;
        return multipleRecursion(n-1) + multipleRecursion(n-2) + multipleRecursion(n-3) + multipleRecursion(n-4);
    }

    /**
     * This method avoid redundant calculations by carrying forward the last four
     * computed values, making it more efficient with linear time complexity O(n)
     */
    /*
    Pseudo code
     function LinearTetranacci(n, a, b, c, d):
        if n == 0: return a
        return LinearTetranacci(n-1, b, c, d, a+b+c+d)
     */
    public static long linearRecursion(int n, long a, long b, long c, long d) {
        if (n == 0) return a;
        return linearRecursion(n-1, b, c, d, a+b+c+d);
    }

    public static void main(String[] args) {
        int[] values = {2,11,16,20,30,40,50};
        try (java.io.PrintWriter writer = new java.io.PrintWriter("TetraOut.txt")) {
            writer.println("Tetranacci Performance Comparison\n");
            for (int n : values) {
                long startTime = System.nanoTime();
                long result = multipleRecursion(n);
                long endTime = System.nanoTime();
                writer.println("Tetranacci(" + n + ") = " + result + " (Exponential) - Time: " + (endTime - startTime) + " ns");

                startTime = System.nanoTime();
                result = linearRecursion(n, 0, 0, 0, 1);
                endTime = System.nanoTime();
                writer.println("Tetranacci(" + n + ") = " + result + " (Linear) - Time: " + (endTime - startTime) + " ns");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
