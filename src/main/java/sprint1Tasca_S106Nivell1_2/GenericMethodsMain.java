package sprint1Tasca_S106Nivell1_2;

public class GenericMethodsMain {
    public static void main(String[] args) {
        Person person = new Person("Rong","Jiang",47);

        GenericMethods.printArguments(person,"hello",5.35);
        System.out.println();
        GenericMethods.printArguments("hello",person,5.35);
        System.out.println();
        GenericMethods.printArguments(5.35,"hello",person);

    }
}
