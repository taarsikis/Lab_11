import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattingTask {
    public static List<String> splitting(List<String> input) {
        return input.stream().flatMap(x -> Arrays.stream(x.split(""))).collect(Collectors.toList());
    }
}
