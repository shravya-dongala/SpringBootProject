import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Studenthash {
	    private String firstName;
	    private String lastName;
	    private double gpa;
public Studenthash (String firstName, String lastName, double gpa) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.gpa = gpa;
	    }

	    public String toString() {
	        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", GPA=" + gpa + "]";
	    }

	    public static void main(String[] args) {
	        Map<String, Student> studentMap = new HashMap<>();
	        studentMap.put("Anna", new Student("Anna","S", 3.8));
	        studentMap.put("Parish", new Student("Parish", "K", 3.9));
	        studentMap.put("Leela", new Student("Leela", "J", 3.5));
	        studentMap.put("Shree", new Student("Shree", "B", 3.7));
	        studentMap.put("Nitya", new Student("Nitya", "M", 3.6));
	        studentMap.put("Melo", new Student("Melo", "D", 3.4));
	        studentMap.put("Sreya", new Student("Sreya", "K", 3.2));
	        studentMap.put("Sonu", new Student("Sonu", "T", 3.3));

	        System.out.println("Entry Set:");
	        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        System.out.println("\n forEach");
	        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

	        System.out.println("\n keySet and Iterator:");
	        Iterator<String> iterator = studentMap.keySet().iterator();
	        while (iterator.hasNext()) {
	            String key = iterator.next();
	            System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
	        }
	    }
	}


	