

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;

	public class Arraylist{
	    public static void main(String[] args) {
	        List<String> stringList = new ArrayList<>();
	        stringList.add("Shravya");
	        stringList.add("Reddy");
	        

	        //for loop
	        System.out.println("for loop:");
	        for (int i = 0; i < stringList.size(); i++) {
	            String element = stringList.get(i);
	            System.out.println(element);
	        }

	        //enhanced for loop
	        System.out.println("enhanced for loop:");
	        for (String element : stringList) {
	            System.out.println(element);
	        }

	        //iterator
	        System.out.println(" iterator:");
	        Iterator<String> iterator = stringList.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }

	        //forEach
	        System.out.println(" forEach:");
	        stringList.forEach(element -> System.out.println(element));

	        //parallel Stream
	        System.out.println(" parallel Stream:");
	        stringList.parallelStream().forEach(element -> System.out.println(element));
	    }
	}

