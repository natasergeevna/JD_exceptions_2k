import exceptions.CheckedException;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import org.jetbrains.annotations.Contract;

public class Main {
    public static void main(String[] args) {
        try {
            registration("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public static void registration(String login, String password, String confirmPassword) throws WrongPasswordException {
        if (!check(login) || !check(password)) throw new CheckedException("Не прошло проверку на символы!");
        if (login.length() > 20 || password.length() > 20) {
            throw new WrongLoginException("Логин или пароль некорректной длины!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
    }

    public static boolean check(String s) {
        return s.matches("^[a-zA-Z0-9_]*$");
    }
}