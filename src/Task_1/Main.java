package Task_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkValidate("LOgin", "passworD", "ConfirmPassword"));
        System.out.println(checkValidate("Login", "Password!", "confirmPassworD"));
        System.out.println(checkValidate("LogiN!", "pasSWord", "confirmpassword"));
        System.out.println(checkValidate("login", "password", "confirmpassword"));



    }

    public static boolean checkValidate(
            String login,
            String password,
            String confirmPassword) {
        try {
            return Data.validate(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при валидации логина: " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка при валидации пароля: " + e.getMessage());
            return false;
        }
    }
}