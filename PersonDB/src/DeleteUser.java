import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class DeleteUser extends Person{
    public void removeUser(){
        Scanner deleteUserDetails = new Scanner(System.in);
        Person deletePerson = new Person();

        do{
            System.out.print("Enter your email address: ");
            userEmail = deleteUserDetails.nextLine();
            userEmail = userEmail.replaceAll(" ", "");
            userEmail = userEmail.toLowerCase(Locale.ROOT);
            setUserEmail(userEmail);

            if(validateUserEmail(getUserEmail())){
                break;
            }
            else{
                System.out.println("Invalid email entered. Try again");
            }
        }while(!validateUserEmail(getUserEmail()));

        try{
            File inputFile = new File("personDB.txt");
            File tempFile = new File("tempPersonDB.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = userEmail;
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + " ");
            }
            writer.close();
            reader.close();
            boolean successful = tempFile.renameTo(inputFile);

        }
        catch (Exception ex){
            System.out.println("The email does not exist.");
        }

    }
}
