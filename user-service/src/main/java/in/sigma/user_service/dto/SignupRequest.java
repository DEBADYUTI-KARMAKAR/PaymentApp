package in.sigma.user_service.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    private String name;
    private String email;
    private String password;
    private String adminKey;
    public SignupRequest() {
    }

    public SignupRequest(String name, String email, String password, String adminKey) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.adminKey = adminKey;

    }

}
