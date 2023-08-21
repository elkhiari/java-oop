package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Users {
    private List<Student> Users;

    public Users() {
        this.Users = new ArrayList<>();
    }

    public boolean register(Student student) {
        for (Student s : Users) {
            if (Objects.equals(s.getUsername(), student.getUsername())) {
                System.out.println("username already exist please change username");
                return (false);
            }
        }

        System.out.println("user create sucess");
        Users.add(student);
        return (true);
    }

    public boolean login(Student student) {
        for (Student s : Users) {
            if (Objects.equals(s.getUsername(), student.getUsername())) {
                if (s.comparePassword(student.getPassword())) {
                    System.out.println("Welcome back "+student.getUsername());
                    return true;
                }
                System.out.println("i'm sorry "+ s.getUsername() + " password invalid");
                return false;
            }
        }
        System.out.println("i'm sorry "+ student.getUsername() + " not found");
        return  false;
    }
}