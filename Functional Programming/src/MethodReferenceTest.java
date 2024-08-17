import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceTest {
    public static Predicate<String> startsWith(String str) {
        return s -> str.startsWith(s);
    }
    public static void main(String[] args) {
        Consumer<List<Integer>> methodRef1 = Collections::sort;
        Consumer<List<Integer>> lambda1 = l -> Collections.sort(l);

        String str = "abc";
        Predicate<String> methodRef2 = str::startsWith;
        Predicate<String> lambda2 = startsWith("a");
        //System.out.println(methodRef2.test("a"));
        //System.out.println(lambda2.test("b"));

        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();
        Predicate<String> lambda4 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };

        Supplier<ArrayList> methodRef4 = ArrayList::new;
        //Supplier<ArrayList> lambda4 = () -> new ArrayList();

        List<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        //list.removeIf(s -> s.startsWith("A"));
        String s = null;
        list.removeIf(s::startsWith);
        System.out.println(list); // [Magician]
    }
}
