package homework.lesson3;

import java.util.Scanner;

public class Menu {
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
            menu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter user ID: ");
                    int id = input.nextInt();

                    System.out.print("Enter user name: ");
                    String name = input.next();

                    System.out.print("Enter user contact number: ");
                    String contactNumber = input.next();
                    input.nextLine();

                    user = new User(id, name, contactNumber);
                    userManager.addUser(user);
                    System.out.println(user.toString());
                    break;

                case 2:
                    System.out.print("Enter user ID: ");
                    int idDel = input.nextInt();

                    userManager.removeUser(idDel);
                    break;

                case 3:
                    System.out.print("Enter user ID: ");
                    int idDel2 = input.nextInt();
                    userManager.updateUser(idDel2, input);
                    break;

                case 4:
                    System.out.print("Enter user ID: ");
                    int idDel3 = input.nextInt();
                    if (!userManager.find(idDel3)) {
                        System.out.println("User not found");
                    }
                    break;

                case 5:
                    userManager.displayUsers();
                    break;

                case 9:
                    System.out.println("Goodbye !");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        while (choice != 9);
    }

    public static void menu() {
        System.out.println(" ");
        System.out.println("_____MENU_____");
        System.out.println("1: Add User");
        System.out.println("2: Delete User");
        System.out.println("3: Update User");
        System.out.println("4: Search User");
        System.out.println("5: Display Users");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}




