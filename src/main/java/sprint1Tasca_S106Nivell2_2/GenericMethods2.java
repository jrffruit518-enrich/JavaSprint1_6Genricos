package sprint1Tasca_S106Nivell2_2;

public class GenericMethods2 {

    public static <T, U> void printArguments(T first, String fixed, U... others) {
        System.out.println("Arg1: " + (first != null ? first.getClass().getSimpleName() : "null"));
        System.out.println("Arg2: " + (fixed != null ? fixed.getClass().getSimpleName() : "null"));
        System.out.print("Arg3:  + (others) :");
        if (others == null || others.length == 0) {
            System.out.print("[]");
        } else {
            for (U item : others) {
                System.out.print((item != null ? item.getClass().getSimpleName() : "null") + " ,");
            }

        }System.out.println();
    }
}

