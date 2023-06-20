import java.util.Arrays;
	public class Oddnum {
	    static int squareSum(int n) {
	        return n * (4 * n * n - 1) / 3;
	    }
	    public static void main(String args[]) {
	        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        double average = Arrays.stream(numbers)
	                .filter(number -> number % 2 != 0)
	                .mapToInt(Oddnum::squareSum)
	                .average()
	                .orElse(0);
	        System.out.println("Average: " + average);
	    }
	}
