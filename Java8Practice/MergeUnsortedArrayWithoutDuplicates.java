import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeUnsortedArrayWithoutDuplicates {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 5, 1};
         
        int[] b = new int[] {8, 1, 9, 5};

        Set<Integer> set = IntStream.concat(IntStream.of(a), IntStream.of(b)).boxed().collect(Collectors.toCollection(TreeSet::new));

        System.out.println(set);
        }
}
