import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Authorization {
    public static boolean checkAuthInfo(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || login.matches(".*\\s.*")) {
                throw new WrongLoginException("Login must be shorter than 20 characters and contain no spaces.");
            }
            if (password.length() > 20 || password.contains(" ") && !password.matches(".*\\d.*")) {
                throw new WrongPasswordException("Password must be shorter than 20 characters, contain no spaces and contain at least one number.");
            }
            if (!confirmPassword.equals(password)) {
                throw new WrongPasswordException("Passwords don't match!");
            }
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}