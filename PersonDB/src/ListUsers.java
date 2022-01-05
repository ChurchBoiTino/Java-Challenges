import java.io.BufferedReader;
import java.io.FileReader;

public class ListUsers {
    public void listAvailableUsers(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String users;

            while((users = br.readLine()) != null){
                System.out.println(users);
            }

            br.close();
        }
        catch(Exception err){
            System.out.println("No information available to display");
        }
    }
}
