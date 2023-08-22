import Students.Student;
import Students.Users;
import library.Book;
import library.Library;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] argv) {
        int start = 0;
        Users users = new Users();
        Library library = new Library();
        Student localStorage = null;
        while (true) {
            if (start == 0) {
                System.out.println("-------------Hello to Library System manager---------------");
                start++;
            } else if (start == 1) {
                int menuLogin = MenuLogin();
                if (menuLogin == 1) {
                    int countOfRepeat = 0;
                    while (countOfRepeat < 3) {
                        System.out.println("---------Login--------");
                        Student logger = auth();
                        if (users.login(logger)) {
                            localStorage = logger;
                            start++;
                            break;
                        }
                        countOfRepeat++;
                    }
                } else if (menuLogin == 2) {
                    int countOfRepeat = 0;
                    while (countOfRepeat < 3) {
                        System.out.println("---------register-------- \n");
                        Student logger = auth();
                        if (users.register(logger)) {
                            localStorage = logger;
                            start++;
                            break;
                        }
                        countOfRepeat++;
                    }
                }
                while(localStorage != null) {
                    int menu = Menu();
                    if (menu == 1) {
                        library.printBooks();
                    } else if (menu == 2) {
                        library.addBook(createBook());
                    }
                }
            }


        }
    }

    private static Book createBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Title : ");
        String title = scanner.nextLine();
        System.out.println("Author : ");
        String author = scanner.nextLine();
        System.out.println("Quantity : ");
        int quantity = scanner.nextInt();
        return new Book(title,author,quantity);
    }

    public static int  MenuLogin() {
        System.out.println("1 - Login");
        System.out.println("2 - Register");
        System.out.println("Choose : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Student auth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("username : ");
        String username = scanner.nextLine().toLowerCase();
        System.out.println("password : ");
        String password = scanner.nextLine();
        return new Student(username,password);
    }

    public static int  Menu() {
        System.out.println("1 - Show all Books");
        System.out.println("2 - Add Book");
        System.out.println("3 - Delete Book");
        System.out.println("4 - Logout");
        System.out.println("5 - Exit");
        System.out.println("Choose : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}