import java.util.Arrays;
public class LetterCap {
    public static void main(String[] args) {
        String[] name = {"wire", "str", "chroma", "system"};
        name = Arrays.stream(name)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(name));
    }
}
