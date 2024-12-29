import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sum {
    public static void main(String[] args) {
        int i = 15623;

        int sum = String.valueOf(i).chars().map(Character::getNumericValue ).sum();

        int sum2 = String.valueOf(i).chars().map(Character::getNumericValue).sum();

        System.out.println("Sum = "+sum);

        System.out.println("Sum2 = "+sum2);

        String s1 = "Nidhi";

        String s2 = new String("Nidhi");

        if(s1==s2){
            System.out.println("==");
        }
        if(s1.equals(s2)){
            System.out.println("equals()");
        }
    }
}
