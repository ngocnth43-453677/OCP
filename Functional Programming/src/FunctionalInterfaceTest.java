import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        Function<String, String> u3 = x -> x.toUpperCase();
        BinaryOperator<String> u4 = (x, y) -> x + y;
        BiFunction<String, String, String> u5 = (x, y) -> x + y;
        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));
        System.out.println(u3.apply("chirp"));
        System.out.println(u4.apply("nikon", " f2"));
        System.out.println(u5.apply("nikon", " f2"));
        String val1 = "hello";
        String val2 = new String("world");
        UnaryOperator<String> uo1 = s1 -> s1.concat(val2); //1
        UnaryOperator<String> uo2 = String::toUpperCase; //2
        System.out.println(uo2.apply(uo1.apply(val1))); //3

    }
}
