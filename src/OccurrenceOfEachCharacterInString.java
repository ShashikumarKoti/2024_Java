import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfEachCharacterInString {

    public static void main(String[] args) {

        String name = "occurrence";
        //java8 to count occurrence of each character
        Map<String, Long> collect = Arrays.stream(name.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((key, value) -> System.out.println( key + " = " + value + " times"));
    }
}
