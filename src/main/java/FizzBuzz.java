import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n){
        return IntStream.range(0,n).boxed().map( x -> {
            if (x % 15 == 0){
                return "Fizz Buzz";
            }else if (x % 3 == 0){
                return "Fizz";
            }else if (x % 5 == 0){
                return "Buzz";
            }return x.toString();}).collect(Collectors.toList());
    }
}
