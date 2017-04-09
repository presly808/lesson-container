package ua.artcode.oop.lesson1;

/**
 * @author Serhii Bilobrov
 * @since 1.7
 */
public class TestUser {
    public static void main(String[] args) {
        User user = new User();
        String result = user.hello();

        if(result == null){
            System.out.println("test failed");
        } else {
            System.out.println("Test passed");
        }

    }
}
