public class Oddnum {
	    static int squareSum(int n) {
	        return n * (4 * n * n - 1) / 3;
	    }
	    public static void main(String args[]) {
	        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        int sum = 0;
	        int count = 0;

	        for (int i = 0; i < numbers.length; i++) {
	            Integer number = numbers[i];
	            if (number % 2 != 0) {
	                sum += squareSum(number);
	                count++;
	            }
	        }
	        double average = count > 0 ? (double) sum / count : 0;
	        System.out.println("Average" + average);
	    }
	}
