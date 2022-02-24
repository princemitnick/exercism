public class LogLevels {

    public static void main(String... args){
        //System.out.println(message("[WARNING]: Disk almost full"));
        //logLevel("[ERROR]: Invalid operation");
        System.out.println(reformat("[INFO]: Operation completed"));
    }
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");

        int pos = logLine.indexOf(":");
        String message = logLine.substring(pos+2,logLine.length()).trim();
        return message;
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        int index1 = logLine.indexOf("[");
        int index2 = logLine.indexOf("]");
        String message = logLine.substring(index1+1,index2).toLowerCase();

        return message;
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        int index1 = logLine.indexOf("[");
        int index2 = logLine.indexOf("]");
        String loglevel = logLine.substring(index1+1,index2).toLowerCase();

        int pos = logLine.indexOf(":");
        String message = logLine.substring(pos+2,logLine.length()).trim();

        return message+" ("+loglevel+")";
    }
}
