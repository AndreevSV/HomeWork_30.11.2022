public class LoginAndPassword {
    public static final int LENGH_MIN = 1;
    public static final int LENGH_MAX = 20;
    public static boolean validation(String login, String password, String confirmPassword) throws Exception {
        return (validationLoginLengh(login)
                && validationLoginStructure(login)
                && validationPasswordLengh(password)
                && validationPasswordEqueals(password, confirmPassword));
    }

    public static boolean validationLoginLengh(String login) throws Exception {
        if (login.length() >= LENGH_MIN && login.length() <= LENGH_MAX) {
            return true;
        } else {
            throw new WrongLoginException("Неверная длина логина. Должна быть в пределах от 1 до 20 символов");
        }
    }

    public static boolean validationLoginStructure(String login) throws Exception {
        if (login.matches("[a-zA-Z0-9+_]*$")) {
            return true;
        } else {
            throw new WrongLoginException("В логине могут быть использованы только латинский буквы, цыфры и знак _");
        }
    }

    public static boolean validationPasswordLengh(String password) throws Exception {
        if (password.length() >= LENGH_MIN && password.length() <= LENGH_MAX) {
            return true;
        } else {
            throw new WrongPasswordException("Длина пароля должна быть от 1 до 20 символов");
        }
    }

    public static boolean validationPasswordEqueals(String password, String confirmPassword) throws Exception {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

}
