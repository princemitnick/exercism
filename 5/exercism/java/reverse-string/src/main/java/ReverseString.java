class ReverseString {

    public static void main(String... args){
        ReverseString rv = new ReverseString();
        System.out.println(rv.reverse("looc"));
    }

    String reverse(String inputString) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        char [] chars = inputString.toCharArray();
        String str = "";
        for (int i = chars.length-1; i >= 0; i--){
            System.out.println(chars[i]);
            str +=chars[i];
        }

        return str;
    }
  
}
