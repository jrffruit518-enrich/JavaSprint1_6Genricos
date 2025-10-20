package sprint1Tasca_S106Nivell1_1;

/**
 * ClassName: NoGenericMethodsMain
 * Package: sprint1Tasca_S106Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:20/10/2025 - 22:08
 * Version:v1.0
 */
public class NoGenericMethodsMain {
    public static void main(String[] args) {
        NoGenericMethods ngm = new NoGenericMethods("hi","hello","good");
        System.out.println(ngm);

        ngm.setValue1("nice");
        ngm.setValue2("great");
        ngm.setValue3("wonder");
        System.out.println("\nAfter setting new values for ngm1: " + ngm);
    }
}
