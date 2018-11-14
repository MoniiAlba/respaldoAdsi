import java.util.*;
import java.util.stream.*;
import java.lang.String;
import java.io.IOException;
public class StreamTest{
  public static void main(String[] args) throws IOException{
      Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
        .map(x -> x*x)
        .average()
        .ifPresent(System.out::println); //promedio de los cuadrados

  }
}
