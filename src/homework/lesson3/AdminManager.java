package homework.lesson3;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class AdminManager {

    public LinkedList<User> list;

    public AdminManager() {
        list = new LinkedList<>();
    }

    // Add User method
    public void addUser(User user) {
        if (!list.contains(user)) {
            list.add(user);
        }else System.out.println("\nUser already exists.");
    }

    // Delete User method
    public void removeUser(int userId) {
        User userdel = null;

        for(User u : list) {
            if (u.getId() == userId){
                userdel = u;
            }
        }

        if (userdel == null) System.out.println("\nUser not found.");
        else list.remove(userdel);
    }

    // Get user method
    public User getUser(int userId) {

        for(User u : list) {
            if (u.getId() == userId){
                return u;
            }
        }
        return null;
    }

    // Find User method
    public boolean find(int id)
    {

        // Iterating record list
        // using for each loop
        for (User u : list) {

            // Checking record by id Number
            if (u.getId() == id) {

                System.out.println(u);
                return true;
            }
        }
        return false;
    }

    // Update User method
    public void updateUser(int userId, Scanner s) {

        if (find(userId)) {
            User user = getUser(userId);

            System.out.print("\nType users new ID: ");
            try {int id = s.nextInt();}
            catch (InputMismatchException e) {
                System.out.println("\nInvalid ID.");
            }
            System.out.print("Type users new name: ");
            String name = s.next();
            System.out.print("Type users new contactNumber: ");
            String number = s.next();
            System.out.print("\nUpdate is Done!");
        }
        else {
            System.out.println("\nUser not found.");
        }
    }

    // Display Users list method
    public void displayUsers() {
        if(list.isEmpty()){
            System.out.println("\nNo users found.");
        }

        for (User u : list) {
            System.out.println(u.toString());
        }
    }

}
