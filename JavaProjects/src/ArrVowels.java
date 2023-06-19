import java.util.Arrays;

public class ArrVowels {
    public static void main(String[] args) {
        String[] strings = {"Shree", "Nitya", "John", "Anna", "yyy"};

        Arrays.stream(strings)
                .filter(s -> countVowels(s) > 0)
                .forEach(s -> System.out.println(s + " - " + countVowels(s) + " vowels"));
    }

    public static int countVowels(String string) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(String.valueOf(string.charAt(i)))) {
                count++;
            }
        }

        return count;
    }
}
