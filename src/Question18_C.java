import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Question18_C {
    int id = 8;
    String str = "welcome to window";

    public static void main(String[] args) {
        Question18_C question18_c = new Question18_C();
        Consumer<Question18_C> c = h -> System.out.println("Consumer Example ==" + question18_c.str + " " + question18_c.id);
        c.accept(question18_c);

        Supplier<Date> d = Date::new;
        System.out.println(d.get());

        Predicate<Integer> p = n -> n % 2 == 0;
        System.out.println("Predicate Example ==" + p.test(3));

        Function<String, String> f = String::toUpperCase;
        System.out.println("Function Example== " + f.apply("Sachin"));
    }
}