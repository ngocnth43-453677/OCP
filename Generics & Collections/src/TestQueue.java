import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Function;

public class TestQueue {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.push(2);
        d.pop();
        d.offerFirst(3);
        d.remove();
        System.out.println(d);
        //List<String> list = new List<>();

        List<String> vowels = new ArrayList<String>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list->list.subList(2, 4);
        f.apply(vowels);
        vowels.forEach(System.out::print);

    }
}
