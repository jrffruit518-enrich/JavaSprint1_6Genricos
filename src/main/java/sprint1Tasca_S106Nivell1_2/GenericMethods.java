package sprint1Tasca_S106Nivell1_2;

public class GenericMethods {

    public static <T,U,V> void printArguments(T t ,U u,V v){
        System.out.println("Arg1: " + (t != null ? t : "null"));
        System.out.println("Arg2: " + (u != null ? u : "null"));
        System.out.println("Arg3: " + (v != null ? v : "null"));
    }
}
