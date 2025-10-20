package sprint1Tasca_S106Nivell1_1;

import java.util.Objects;

public class NoGenericMethods {
    private String value1;
    private String value2;
    private String value3;

    public NoGenericMethods(String value1, String value2, String value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NoGenericMethods that = (NoGenericMethods) o;
        return Objects.equals(value1, that.value1) && Objects.equals(value2, that.value2) && Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2, value3);
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                '}';
    }
}
