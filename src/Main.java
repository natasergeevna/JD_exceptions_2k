import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        registration("java_skypro.go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
    }

    public static boolean registration(String login, String password, String confirmPassword) {
        boolean ex = true;
        if (login.length() > 20 || password.length() > 20) {
            ex = false;
            throw new WrongLoginException("Логин или пароль некорректной длины!");
        }
        if (!password.equals(confirmPassword)) {
            ex = false;
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        try {
            boolean len = login.length() <= 20;
            boolean pass = password.length() <= 20;
        } catch (WrongLoginException e) {
        }
        try {
            boolean ps = password.equals(confirmPassword);
        } catch (WrongPasswordException e) {

        }
        return ex;
    }
}