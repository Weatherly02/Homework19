package Functions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {
    public static void main(String[] args) {

        Function<String, Integer> candy = s -> s.length();
        System.out.println(candy.apply("Hershey"));

        BiFunction<String, String, Integer> eggs = (r, s) -> (r.length() + s.length());
        System.out.println(eggs.apply("boiled", "fried"));

        Consumer<String> useString = s -> System.out.println(s);
        useString.accept("Waylon");

        Supplier<String> makeString = () -> "Hello!";
        System.out.println(makeString.get());

    }
}






