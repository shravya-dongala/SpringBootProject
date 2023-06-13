public class Inttostring{
	    public static void main(String[] args) {
	        String input1 = "23";
	        printConvertedValue(input1);

	        String input2 = "45.67";
	        printConvertedValue(input2);

	        String input3 = "test";
	        printConvertedValue(input3);

	        String input4 = "123f";
	        printConvertedValue(input4);
	    }

	    public static void printConvertedValue(String input) {
	        try {
	            int result = Integer.parseInt(input);
	            System.out.println(result);
	        } catch (NumberFormatException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}
