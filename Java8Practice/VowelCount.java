import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println();
        String s = " language";

        String lowerCaseString = s.toLowerCase();

        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        Predicate<Character> findVowels = n -> (n == 'i' || n =='o' || n == 'e' || n == 'a'|| n == 'u');
        long count = s.chars().mapToObj(c -> (char)c).filter(vowels::contains).count();
        System.out.println(count);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream().mapToInt(value -> (int)value).sum();
        System.out.println(sum);
    }
}
