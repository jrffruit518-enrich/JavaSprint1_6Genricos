package sprint1Tasca_S106Nivell2_2;


public class GenericMethodsMain2 {
    public static void main(String[] args) {
        Person2 person = new Person2("Rong","Jiang",47);
        Person2 person1 = new Person2("Lina","ZHOU",42);

        GenericMethods2.printArguments(person,"hello",5.12,person1,"hello");
        System.out.println();
        GenericMethods2.printArguments(person,"hello");
        System.out.println();

    }
}
