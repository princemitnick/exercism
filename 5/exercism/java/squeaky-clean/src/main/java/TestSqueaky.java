public class TestSqueaky {

    public static void main(String... args){
        test("my   Id");
        test("my\0Id");
    }

    public static void test(String string){
        //StringBuilder stringBuilder = new StringBuilder(string);
        //System.out.println(stringBuilder.toString().replace(" ","_"));

        StringBuilder stringBuilder1 = new StringBuilder();
        char [] chars = string.toCharArray();
        int [] codepoints = string.codePoints().toArray();
        for (int i = 0; i < codepoints.length; i++){
            String c =  String.valueOf(Character.toChars(codepoints[i]));
            if (Character.isISOControl(codepoints[i])) {
                c = "CTRL";
            }
            else if (c.equals(" ")){
                c = "_";
            }

            stringBuilder1.append(c);
        }
        System.out.println(stringBuilder1.toString());

    }
}
