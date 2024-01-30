package utils;

import com.github.javafaker.Faker;
import models.Student;

public class Data {

    public static Student generateStudent() {
        Faker faker = new Faker();
        return new Student(faker.name().firstName(), faker.name().lastName(), faker.bothify("abc###@test.com"), "Male", faker.bothify("##########"), "07 January,2024");
    }
}
