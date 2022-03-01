import java.util.ArrayList;
import java.util.List;

public class LanguageListTest1 {

    static List<String> languages = new ArrayList<>();

    public static void main(String... args){
        LanguageListTest1.addLanguage("Java");
        LanguageListTest1.addLanguage("Python");
        System.out.println(LanguageListTest1.isEmpty());
        System.out.println("Size : "+LanguageListTest1.count());
        System.out.println();
        LanguageListTest1.removeLanguage("Python");

        System.out.println("Size : "+LanguageListTest1.count());

        System.out.println(LanguageListTest1.firstLanguage());




    }

    public static boolean isEmpty(){
        return languages.isEmpty();
    }

    public static void addLanguage(String language){
        languages.add(language);
    }

    public static void removeLanguage(String language){
        int pos = languages.indexOf(language);
        if (pos == -1){
            System.out.println("Language doesn't exist.");
        }
        else{
            languages.remove(pos);
        }
    }

    public static String firstLanguage(){
        return languages.get(0);
    }

    public static int count(){
        return languages.size();
    }

    public boolean containsLanguage(String language){
        return languages.contains(language);
    }

    public boolean isExciting(){

        boolean isExiting = true;
        for (int i =0 ; i < languages.size(); i++){
            if (languages.get(i).equals("Java") || languages.contains("Kotlin")){
                isExiting =  true;
            }
            else{
                isExiting =  false;
            }
        }
        return isExiting;
    }


}
