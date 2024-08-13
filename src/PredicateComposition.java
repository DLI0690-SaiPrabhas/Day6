
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaaaaa", "eeeeee", "vvvvv");
        Predicate<String> pr1 = c -> c.length() > 5;
        Predicate<String> contains = c -> c.contains("e");
        list.stream()
                .filter(pr1.and(contains))
                .forEach(System.out::println);

    }
}
