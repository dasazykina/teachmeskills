public class Starter {
    public static void main(String[] args) {
        String login = "lsh";
        String password = "hju";
        String confirmPassword = "hju";
        boolean result = Authorization.checkAuthInfo(login, password, confirmPassword);
        System.out.println(result);
    }
}
