import java.util.ArrayList;
import java.util.List;
public class Targetsum {
	    public static List<Integer> findTwoSum(int[] numbers, int sum) {
	        List<Integer> indices = new ArrayList<>();
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = i + 1; j < numbers.length; j++) {
	                if (numbers[i] + numbers[j] == sum) {
	                    indices.add(i);
	                    indices.add(j);
	                }
	            }
	        }
	        return indices;
	    }
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50, 60};
	        int sum = 100;
	        List<Integer> indices = findTwoSum(numbers, sum);
	        System.out.println(indices);
	    }
	}
