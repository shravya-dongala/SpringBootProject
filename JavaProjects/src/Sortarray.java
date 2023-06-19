import java.util.Arrays;
import java.util.Comparator;


	public class Sortarray {
	    public static void main(String[] args) {
	        String[] strings = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi"};

	        Arrays.sort(strings, Comparator.comparingInt(String::length)
	                .thenComparing((s1, s2) -> Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1))));

	        System.out.println(Arrays.toString(strings));
	    }
	}
