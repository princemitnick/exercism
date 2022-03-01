import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    public static void main(String... args){
        HandshakeCalculator hs = new HandshakeCalculator();
        List<Signal> signals = hs.calculateHandshake(51);
        System.out.println();
        for (Signal s: signals
             ) {
            System.out.println(s);
        }

    }

    List<Signal> calculateHandshake(int number) {

        List<Signal> list = new ArrayList<>();
        Signal[] signals = Signal.values();

        int i = 0;
        while (number != 0) {
            int lastbit = number & 1;
            number = number >> 1;
            if (lastbit != 0) {
                if (i < 4) {
                    System.out.println(i);
                    list.add(signals[i]);
                } else if (i == 4) {
                    Collections.reverse(list);
                }
            }
            i++;
            System.out.print(lastbit);
        }
        //System.out.println(i);
        return list;
    }

}
