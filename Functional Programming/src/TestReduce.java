import java.util.Arrays;
import java.util.List;

public class TestReduce {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
        String result = strings.stream().reduce("-", String::concat);
        System.out.println(result);
    }
}
