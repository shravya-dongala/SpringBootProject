public class CharString {
public static void main(String[] args) {
	        int dist = 0;
	        int i = 0, j = 0;
	
	        String s = "Shravya";
	        try {
	            for (i = 0; i < s.length(); i++) {
	                while (s != null) {
	                    s = s.trim();
	                    for (j = 0; j < s.length(); j++) {
	                        if (s.charAt(i) == s.charAt(j)) {
	                            dist++;
	                        }
	                    }
	                    System.out.println(s.charAt(i) + "--" + dist);
	                    String d = String.valueOf(s.charAt(i));
	                    s = s.replaceAll(d, " ");
	                    dist = 0;
	                }
	            }
	        } catch (Exception e) {}
	    }
	}