import java.util.function.Function;
import java.util.function.Supplier;

public class MyProcessor {


    int value;

    public MyProcessor() {
        value = 10;
    }

    public MyProcessor(int value) {
        this.value = value;
    }

    public void process() {
        System.out.println("Processing " + value);
    }

    public static void main(String[] args) {
        Supplier<MyProcessor> supplier = MyProcessor::new;
        MyProcessor mp = supplier.get();
        mp.process();
        Function<Integer, MyProcessor> f = MyProcessor::new;
        MyProcessor mpf = f.apply(10);
        mpf.process();
    }
}
