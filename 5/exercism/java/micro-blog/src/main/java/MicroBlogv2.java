import java.io.*;

public class MicroBlogv2 {

    public String truncate(String input) {
        int [] codePoints = input.codePoints().limit(5).toArray();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i< codePoints.length; i++){
            stringBuilder.append(Character.toChars(codePoints[i]));
        }

        //System.out.println(input.codePoints().limit(5));

        return stringBuilder.toString();
    }


    public String truncateWithLambda(String input){

        StringBuilder stringBuilder = new StringBuilder();

        input.codePoints().limit(5).forEach(c -> {
            stringBuilder.append(Character.toChars(c));
        });

        return stringBuilder.toString();
    }
}
