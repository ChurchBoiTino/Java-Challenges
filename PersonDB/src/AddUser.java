import java.io.FileWriter;
import java.time.Year;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AddUser extends Person{

    public void captureNewUser()  {
        Scanner getPersonDetails = new Scanner(System.in);
        Person newPersonInput = new Person();
        boolean userInputDetails = false;
        int year = Year.now().getValue();


        try{
            FileWriter writeToFile = new FileWriter("personDB.txt", true);
            do{
                if(userName.isEmpty()){
                    System.out.print("What is your name: ");
                    userName = getPersonDetails.nextLine();
                    userName = userName.replaceAll(" ", "");
                    setUserName(userName);
                }

                if(userSurname.isEmpty()){
                    System.out.print("What is your surname: ");
                    userSurname = getPersonDetails.nextLine();
                    userSurname = userSurname.replaceAll(" ", "");
                    setUserSurname(userSurname);
                }

                if(!userName.isEmpty() && !userSurname.isEmpty()){
                    //userInputDetails = true;
                    break;
                }

            }while(userInputDetails);

            do{
                System.out.print("Enter your email address: ");
                userEmail = getPersonDetails.nextLine();
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

            do {

                System.out.print("Enter your date of birth (DD/MM/YYYY): ");
                userDOB = getPersonDetails.nextLine();
                userDOB = userDOB.replace(" ", "");
                setUserDOB(userDOB);

                if(validateDoB(getUserDOB())){
                    break;
                }
                else{
                    System.out.println("Invalid date entered. Try again");
                }

            }while(!validateDoB(getUserDOB()));

            ArrayList<String> storePersonDetails = new ArrayList<>();
            storePersonDetails.add(getUserEmail());
            storePersonDetails.add(getUserName());
            storePersonDetails.add(getUserSurname());
            storePersonDetails.add(getUserDOB());

            for(String str: storePersonDetails) {
                writeToFile.write(str + " ");
            }
            writeToFile.append("\n");
            writeToFile.close();

        }
        catch(Exception ex){
            System.out.println("Unable to add user");
        }

        String birthYear = getUserDOB().split("/")[2];
        int userBirthYear = Integer.parseInt(birthYear);
        int userAge = year - userBirthYear;


        System.out.println("\n" + "Hello " + getUserName() + " " + getUserSurname() +"." + " You are " + userAge + " years old." + "\n" + "Your details have been saved on the database. \n");
    }
}
