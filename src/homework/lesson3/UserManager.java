package homework.lesson3;

import java.util.Scanner;

public class UserManager {
    User user;

    public UserManager() {
        user = new User();
    }
    Scanner sc = new Scanner(System.in);

    public void registerUser() {
        System.out.print("Input your ID : ");
        user.setId(sc.nextInt());
        System.out.print("Input your Name : ");
        user.setName(sc.next());
        System.out.print("Input your Contact Number : ");
        user.setContactNumber(sc.next());
        System.out.print("You are successfully registered.");
    }

    public boolean loginUser() {
        System.out.print("Input your ID : ");
        user.setId(sc.nextInt());
        System.out.print("Input your Contact Number : ");
        user.setContactNumber(sc.next());
        System.out.println("You are successfully logged in.");
        return true;
    }

    public void editUser(){
        if (loginUser()) {
            System.out.print("\nEnter new ID : ");
            user.setId(sc.nextInt());
            System.out.print("Enter new name : ");
            user.setName(sc.next());
            System.out.print("Enter new contactNumber : ");
            user.setContactNumber(sc.next());
            System.out.println("Your info is successfully edited.");
        } else System.out.println("Please try again.");
    }
}
