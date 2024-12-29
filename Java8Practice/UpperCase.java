import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Laptop", "Computer","Mobile");

        List<String> listOfUpperCase = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        listOfUpperCase.forEach((str) -> System.out.println(str));
    }
}
