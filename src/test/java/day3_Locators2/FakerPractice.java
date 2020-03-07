package day3_Locators2;


import com.github.javafaker.Faker;

public class FakerPractice {
    public static void main(String[] args) {

        Faker fakeData = new Faker();

        String name = fakeData.name().fullName();

        System.out.println("may name is :" + name);

    }
}
