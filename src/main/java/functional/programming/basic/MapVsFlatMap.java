package functional.programming.basic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    //scenario: read file and find out distinct words

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/ranjit/workspace/java-11-features/src/main/resources/test-file.txt");
        var result = Files.readAllLines(path)
                .stream()
                .map(s -> s.split("\\s+"))
                .flatMap(Arrays::stream)//use to flatten the stream or have a single stream as a view
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
