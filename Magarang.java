/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package magarang;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Magarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

        
        String[][] users = new String[100][2];
        int userCount = 0;

        int choice;
        do {
            // menu
            System.out.println("==== LOGIN ====");
            System.out.println("1 Login");
            System.out.println("2 Register");
            System.out.println("3 Exit");
            System.out.print("Choose your option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String loginUser = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPass = scanner.nextLine();

                    boolean baba1log = false;
                    for (int i = 0; i < userCount; i++) {
                        if (users[i][0].equals(loginUser) && users[i][1].equals(loginPass)) {
                            System.out.println("Hello, " + loginUser + "!");
                            baba1log = true;
                            break;
                        }
                    }
                    if (!baba1log) {
                        System.out.println("Invalid username or password!");
                    }
                    break;

                case 2:
                    System.out.print("Enter new username: ");
                    String newUser = scanner.nextLine();

                    
                    boolean baba2user = false;
                    for (int i = 0; i < userCount; i++) {
                        if (users[i][0].equals(newUser)) {
                            baba2user = true;
                            break;
                        }
                    }

                    if (baba2user) {
                        System.out.println("Username already exists!");
                    } else {
                        System.out.print("Enter password: ");
                        String newPass = scanner.nextLine();
                        System.out.print("Confirm password: ");
                        String confirmPass = scanner.nextLine();

                        if (!newPass.equals(confirmPass)) {
                            System.out.println("Passwords do not match!");
                        } else {
                            users[userCount][0] = newUser;
                            users[userCount][1] = newPass;
                            userCount++;
                            System.out.println("Registration successful!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid! Try again.");
            }

            System.out.println();
        } while (choice != 3);

        scanner.close();
    }
}
        
