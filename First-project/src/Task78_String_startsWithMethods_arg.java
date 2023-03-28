

public class Task78_String_startsWithMethods_arg {
    public static void main(String[] args) {
        String string = args[0];
        String text = args[1];
        boolean result = isStrigStartWhithText(string, text);
        System.out.println(result);

    }
    public static boolean isStrigStartWhithText(String first, String second){
        if(first.startsWith(second)){
            return true;
        }else{
            return false;
        }
    }
}
