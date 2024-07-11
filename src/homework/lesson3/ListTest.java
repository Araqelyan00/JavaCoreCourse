package homework.lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ListTest {
    public static void adminMenu() {
        User user = new User();
        AdminManager adminManager = new AdminManager();

        user.setId(123);
        user.setName("Jack");
        user.setContactNumber("098123123");

        adminManager.addUser(user);

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            Menu.menuAdmin();
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("""
                        Oops!
                        Input is not valid.
                        Please restart and use valid options!""");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("\nEnter user ID: ");
                    int id = input.nextInt();

                    System.out.print("Enter user name: ");
                    String name = input.next();

                    System.out.print("Enter user contact number: ");
                    String contactNumber = input.next();
                    input.nextLine();

                    user = new User(id, name, contactNumber);
                    adminManager.addUser(user);
                    System.out.println("\nUser Successfully Added!");
                    break;

                case 2:
                    System.out.print("\nEnter user ID: ");
                    int idDel = input.nextInt();

                    adminManager.removeUser(idDel);
                    System.out.println("\nUser Successfully Deleted!");
                    break;

                case 3:
                    System.out.print("\nEnter user ID: ");
                    int idDel2 = input.nextInt();
                    adminManager.updateUser(idDel2, input);
                    System.out.println("\nUser Successfully Changed!");
                    break;

                case 4:
                    System.out.print("\nEnter user ID: ");
                    int idDel3 = input.nextInt();
                    if (!adminManager.find(idDel3)) {
                        System.out.println("\nUser not found");
                    }
                    break;

                case 5:
                    System.out.println("\n_____Users List_____");
                    adminManager.displayUsers();
                    break;

                case 9:
                    System.out.println("\nGoodbye !");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid choice");
                    break;
            }
        }
        while (true);
    }

}




