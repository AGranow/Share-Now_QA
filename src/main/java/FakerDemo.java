import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class FakerDemo {

    static Faker faker = new Faker();

    public static void main(String[] args) {
        String phoneNumber = faker.numerify("##############");
        System.out.println(phoneNumber);
    }
}
