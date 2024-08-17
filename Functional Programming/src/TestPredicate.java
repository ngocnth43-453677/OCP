import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2, 4, 6, 9); //1
        Predicate<Integer> check = (Integer i) -> {
            System.out.println("Checking");
            return i == 4; //2
            };
        Predicate<Integer> even = (Integer i)-> i%2==0;  //3
        System.out.println(values.stream().filter(even).count()); //4
        System.out.println(values);
    }
}
