package functionalprogramming.mock;

public record StudentDTO(String name, int age, String address, Gender gender) {

    public static StudentDTO map(Students student) {
        return new StudentDTO(student.name(), student.age(), student.address(), student.gender());
    }

}
