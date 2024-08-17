import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestOptional {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent())
            System.out.println(opt.get()); // 95.0
        //else System.out.println("empty");
        List<String> letters = Arrays.asList("j", "a", "v", "a");
        String word = letters.stream().collect(Collectors.joining()).toString();
        String word1 = letters.stream().collect(Collectors.groupingBy(a->a)).toString();
        String word2 = letters.stream().collect(Collectors.groupingBy(a->"")).toString();
        System.out.println(word);
        System.out.println(word1);
        System.out.println(word2);
        IntStream.range(0, 5).forEach(System.out::println);
        IntStream is1 = IntStream.range(0, 5);
        OptionalDouble x = is1.average();
        System.out.println(x);
    }
}
