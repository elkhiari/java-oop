package Students;

import java.util.Objects;

public class Student {
    private String  username;
    private String  passowrd; 

    public Student(String username, String password) {
        this.username = username.toLowerCase();
        this.passowrd = password;
    }

    public void printStudent(){
        System.out.println(this.username);
    }

    public String getUsername() {
        return username;
    }

    public boolean comparePassword(String givenPassword) {
        return Objects.equals(givenPassword, this.passowrd);
    }

    public String getPassword() {
        return passowrd;
    }
}
