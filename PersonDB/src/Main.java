import java.util.Scanner;

public class Main {
    AddUser newUser = new AddUser();
    UpdateUser updateUser = new UpdateUser();
    DeleteUser deleteUser = new DeleteUser();
    ListUsers listUsers = new ListUsers();

    Scanner userInput = new Scanner(System.in);
    String userSelection = "";


    public static void main(String[] args) {
        Main newMain = new Main();

        System.out.print("Hello, \n" + "\n");
        do {
            newMain.mainMenu();
        }while(newMain.userSelection != "5");
    }

    public void mainMenu(){
        String userSelection = "";

            System.out.println("Please select an option from the main menu: \n" +"\n 1. Add a user." + "\n 2. Update user." + "\n 3. Delete a user." + "\n 4. List users." + "\n 5. Exit" + "\n");
            System.out.print("Selection: ");
            userSelection = userInput.nextLine();

            switch(userSelection) {
                case "1":
                    newUser.captureNewUser();
                    break;
                case "2":
                    updateUser.updateUserDetails();
                    break;
                case "3":
                    deleteUser.removeUser();
                    break;
                case "4":
                    listUsers.listAvailableUsers();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("You have selected an invalid option, please select an option from the menu...");
            }
    }
}
