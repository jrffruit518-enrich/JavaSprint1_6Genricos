package sprint1Tasca_S106Nivell2_1;


public class GenericMethodsMain1 {
    public static void main(String[] args) {
        Person1 person = new Person1("Rong","Jiang",47);

        GenericMethods1.printArguments(person,5.35,"hello");
        System.out.println();

      /*  The third argument can not be int.
        GenericMethods1.printArguments("hello",person,5.35);

        The third argument can not be Person.
        GenericMethods1.printArguments(5.35,"hello",person);*/

    }
}
