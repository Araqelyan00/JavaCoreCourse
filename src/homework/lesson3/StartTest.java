package homework.lesson3;

import java.util.Objects;
import java.util.Scanner;

public class StartTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int chose = 0;
        do {
            Menu.menuChoseRole();
            chose = sc.nextInt();
            switch (chose) {
                case 1:
                    do {
                        UserManager userManager = new UserManager();
                        User newUser = new User();
                        Menu.menuUser();
                        chose = sc.nextInt();
                        switch (chose) {
                            case 1:
                                userManager.registerUser();
                                break;

                            case 2:
                                userManager.loginUser();
                                break;
                            case 3:
                                userManager.editUser();
                                break;
                            case 9:
                                System.out.print("Goodbye!");
                                System.exit(0);
                            default:
                                System.out.print("\nInvalid choice");
                                break;
                        }
                    } while (chose != 9);
                case 2:
                    Admin admin = new Admin();
                    System.out.print("Hi Aram. Please enter your password : ");
                    String password = sc.next();
                    if (Objects.equals(password, admin.getPassword())){
                    ListTest listTest = new ListTest();
                    ListTest.adminMenu();
                    continue;
                    } else System.out.print("Please enter correct password : ");
                    break;
                case 9:
                    System.out.print("Goodbye!");
                    System.exit(0);

            }
        }while (chose != 9);
    }
}
