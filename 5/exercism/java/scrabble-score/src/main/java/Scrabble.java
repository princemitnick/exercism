import java.util.ArrayList;
import java.util.List;

class Scrabble {

    String word;
    public static void main(String... args){
        Scrabble scrabble = new Scrabble("PaPA");
        scrabble.getScore();
    }
    Scrabble(String word) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.word = word;
    }

    int getScore() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        char [] chars = word.toCharArray();
        int sum = 0;
        String for1Value = "aAeEiIoOuUlLnNrRsStT";
        String for2Value = "dDgG";
        String for3Value = "bBcCmMpP";
        String for4Value = "fFhHvVwWyY";
        String for5Value = "kK";
        String for8Value = "jJxX";
        String for10Value = "qQzZ";
        List<Integer> valList = new ArrayList<Integer>();
        int valOfChar = 0;

        int value = 0;
        if (chars.length == 0){
            sum = 0;
        }
        else{
            for (int i =0; i< chars.length; i++){
                String c = String.valueOf(chars[i]);
                if ( for1Value.contains(c)){
                    valOfChar = 1;
                    valList.add(valOfChar);
                }
                if (for2Value.contains(c)){
                    valOfChar = 2;
                    valList.add(valOfChar);
                }
                if (for3Value.contains(c)){
                    valOfChar = 3;
                    valList.add(valOfChar);
                }
                if (for4Value.contains(c)){
                    valOfChar = 4;
                    valList.add(valOfChar);
                }
                if (for5Value.contains(c)){
                    valOfChar = 5;
                    valList.add(valOfChar);
                }
                if (for8Value.contains(c)){
                    valOfChar = 8;
                    valList.add(valOfChar);
                }
                if (for10Value.contains(c)){
                    valOfChar = 10;
                    valList.add(valOfChar);
                }
            }
        }


        for (int i:valList) {
            sum += i;
        }
        return sum;
    }

}
