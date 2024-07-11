package homework.lesson3;

public interface Menu {

    public static void menuChoseRole(){
        System.out.println(" ");
        System.out.println("_____ROLES_____");
        System.out.println("1: User");
        System.out.println("2: Admin");
        System.out.println("9: Exit program");
        System.out.print("\nEnter your selection : ");
    }

    public static void menuAdmin(){
        System.out.println(" ");
        System.out.println("_____ADMIN MENU_____");
        System.out.println("1: Add User");
        System.out.println("2: Delete User");
        System.out.println("3: Update User");
        System.out.println("4: Search User");
        System.out.println("5: Display Users");
        System.out.println("9: Exit program");
        System.out.print("\nEnter your selection : ");
    }

    public static void menuUser(){
        System.out.println(" ");
        System.out.println("_____USER MENU_____");
        System.out.println("1: Registration");
        System.out.println("2: Login");
        System.out.println("3: Edit");
        System.out.println("9: Exit program");
        System.out.print("\nEnter your selection : ");
    }
}
