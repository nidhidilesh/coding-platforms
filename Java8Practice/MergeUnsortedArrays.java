import java.util.stream.IntStream;

public class MergeUnsortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
         
        int[] b = new int[] {8, 3, 9, 5};

        int[] sortedArray = IntStream.concat(IntStream.of(a), IntStream.of(b)).sorted().toArray();

        for(int i : sortedArray){
            System.out.println(i);
        }
    }
}
