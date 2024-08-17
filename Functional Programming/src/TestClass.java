import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

interface Carnivore {
    default int calories(List<String> food) {
        return food.size() * 100;
    }

    int eat(List<String> foods);
}

class Tiger implements Carnivore {
    public int eat(List<String> foods) {
        System.out.println("Eating " + foods);
        return foods.size() * 200;
    }
}

public class TestClass {
    public static int size(List<String> names) {
        return names.size() * 2;
    }

    public static void process(List<String> names, Carnivore c) {
        c.eat(names);
    }

    public static void main(String[] args) {
        List<String> fnames = Arrays.asList("a", "b", "c");
        Tiger t = new Tiger();
        System.out.println(t.calories(fnames));
        process(fnames, t::eat);
        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s -> s.append("helloworld"));
        messages.forEach(s -> {
            s.insert(5, ",");
            System.out.println(s);
        });
        List<Double> dList = Arrays.asList(10.0, 12.0);
        DoubleFunction df = x -> x + 10;

        dList.stream().forEach(d -> System.out.println(d));
        List<Double> dListv = Arrays.asList(10.0, 12.0); dListv.stream().forEach(x->{ x = x+10; }); dListv.stream().forEach(d->System.out.println(d));
    }
}

