package my_app.security;

public interface SecurityService {

    String findLoggedInUserName();

    void autoLogin(String userName, String password);
}
