package homework.lesson3;

import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        User user = new User();
        UserManager userManager = new UserManager();

        user.setId(123);
        user.setName("Jack");
        user.setContactNumber("098123123");

        userManager.addUser(user);

        Scanner input = new Scanner(System.in);
        int choice = 0;

        do {
            Menu.menu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\n" + "Enter user ID: ");
                    int id = input.nextInt();

                    System.out.print("Enter user name: ");
                    String name = input.next();

                    System.out.print("Enter user contact number: ");
                    String contactNumber = input.next();
                    input.nextLine();

                    user = new User(id, name, contactNumber);
                    userManager.addUser(user);
                    System.out.println("\n" + "User Successfully Added!");
                    break;

                case 2:
                    System.out.print("\n" + "Enter user ID: ");
                    int idDel = input.nextInt();

                    userManager.removeUser(idDel);
                    System.out.println("\n" + "User Successfully Deleted!");
                    break;

                case 3:
                    System.out.print("\n" + "Enter user ID: ");
                    int idDel2 = input.nextInt();
                    userManager.updateUser(idDel2, input);
                    System.out.println("\n" + "User Successfully Changed!");
                    break;

                case 4:
                    System.out.print("\n" + "Enter user ID: ");
                    int idDel3 = input.nextInt();
                    if (!userManager.find(idDel3)) {
                        System.out.println("\n" + "User not found");
                    }
                    break;

                case 5:
                    System.out.println("\n" + "_____Users List_____");
                    userManager.displayUsers();
                    break;

                case 9:
                    System.out.println("\n" + "Goodbye !");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\n" + "Invalid choice");
                    break;
            }
        }
        while (choice != 9);
    }

}




