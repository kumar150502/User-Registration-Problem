import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    private static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    private static final String LAST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
    private static final String MOBILE_NUMBER_REGEX = "^[91]{1}[0-9]{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[\\W]).{8,}$";

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@gmail.com";
        String mobileNumber = "91 9919819801";
        String password = "John@123";

        if (isValidFirstName(firstName)) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is invalid");
        }

        if (isValidLastName(lastName)) {
            System.out.println("Last name is valid");
        } else {
            System.out.println("Last name is invalid");
        }

        if (isValidEmail(email)) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }

        if (isValidMobileNumber(mobileNumber)) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile number is invalid");
        }

        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }

    private static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    private static boolean isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    private static boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static boolean isValidMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    private static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
