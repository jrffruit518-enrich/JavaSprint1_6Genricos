package sprint1Tasca_S106Nivell2_1;

public class GenericMethods1 {

    public static <T,U> void printArguments(T t, U u, String str){
        System.out.println("Arg1: " + (t != null ? t.getClass().getSimpleName() : "null"));
        System.out.println("Arg2: " + (u != null ? u.getClass().getSimpleName() : "null"));
        System.out.println("Arg3: " + (str != null ? str.getClass().getSimpleName() : "null"));
    }
}
