package sprint1Tasca_S106Nivell1_1;

import java.util.Objects;

public class NoGenericMethods {
    private String name;
    private String gender;
    private String hobby;

    public NoGenericMethods(String name, String gender, String hobby) {
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoGenericMethods that = (NoGenericMethods) o;
        return Objects.equals(name, that.name) && Objects.equals(gender, that.gender) && Objects.equals(hobby, that.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, hobby);
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
