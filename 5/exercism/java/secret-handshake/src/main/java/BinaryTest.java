import java.util.*;

public class BinaryTest {

    public static void main(String... args){

        String getBinary = Integer.toBinaryString(10);

        System.out.println(getBinary);

        List<Signal> list = new ArrayList<>();

        Signal [] signals = Signal.values();
        System.out.println(Arrays.deepToString(signals));
        int number = 4;
        int i = 0;
        while (number != 0){
            int lastbit = number & 1;
            number = number >> 1;
            //System.out.println("Number: "+number);
            System.out.println("Lastbit: "+lastbit);
            if (lastbit != 0){
                if (i < 4){
                    list.add(signals[i]);
                }
                else if (i == 4){
                    Collections.reverse(list);
                }
            }
        }

        list.forEach(System.out::println);
    }
}
