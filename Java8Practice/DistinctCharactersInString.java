import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCharactersInString {
    public static void main(String[] args) {
        String s = "Nidhilalalalla";
        s.chars().mapToObj(value -> (char)value).distinct().forEach(System.out::print);
    }
}
