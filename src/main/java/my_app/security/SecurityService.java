package my_app.security;

public interface SecurityService {

    String findLoggedInUserEmail();

    void autoLogin(String userName, String password);
}
