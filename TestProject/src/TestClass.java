import java.util.Arrays;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("dsf");
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.forEach(System.out::println);
        long count = strings
                .stream()
                .filter(s -> s.equals("ssad"))
                .count();
    }
}
