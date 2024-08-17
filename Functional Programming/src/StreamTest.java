
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Book {
    double price;
    String title;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getTitle() {
        return title;
    }
}

public class StreamTest {
    public static void main(String[] args) {
        Stream<Integer> infinite = Stream.iterate(2, x -> x + 3);
        //infinite.limit(5).forEach(System.out::println);

        infinite.filter(x -> x % 2 == 1)
                .peek(System.out::print)
                .limit(5)
                .forEach(integer -> {
                    System.out.println(integer);
                    System.out.println("ok");
                });

        Stream<Double> randoms = Stream.generate(Math::random);
        List<String> list = Arrays.asList("a", "b", "c");

        List<List<Book>> books = Arrays.asList(
                Arrays.asList(
                        new Book("Windmills of the Gods", 7.0),
                        new Book("Tell me your dreams", 9.0)),
                Arrays.asList(
                        new Book("There is a hippy on the highway", 5.0),
                        new Book("Easy come easy go", 5.0)));
        double d = books.stream()
                .flatMap(bs -> bs.stream())
                .mapToDouble(book -> book.getPrice())
                .sum();
        System.out.println(d);

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.forEach((key, value) -> System.out.printf("%d %s ", key, value));

        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
        List<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("George");
        names.add("Obama");
        String finalvalue = names.stream().reduce("Hello : ", bo);
        System.out.println(finalvalue);

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer maxx = list1.stream().max(Integer::compare).get();
        Integer minn = list1.stream().min(Integer::compare).get();
        System.out.println("Max: " + maxx + "\nMin: " + minn);

        IntStream is1 = IntStream.of(1, 3, 5);  //1
        OptionalDouble x = is1.filter(i -> i % 2 == 0).average(); //2
        System.out.println(x); //3

        IntStream is2 = IntStream.of(2, 4, 6); //4
        int y = is2.filter(i -> i % 2 == 0).sum(); //5
        System.out.println(y); //6


        List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C"); //INSERT CODE HERE
        boolean flag = values.stream().allMatch(str->str.contains("Alpha"));
        boolean flag1 = values.stream().findFirst().get().equals("Alpha A");
        boolean flag2 = values.stream().findAny().get().equals("Alpha A");
        boolean flag3 = values.stream().anyMatch(str->str.equals("Alpha B"));
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
    }
}
