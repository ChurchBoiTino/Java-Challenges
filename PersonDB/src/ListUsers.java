import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ListUsers {
    SerializationHelper helper = new SerializationHelper();
    public void listAvailableUsers(){
        try{
            ArrayList<String> storePersonDetails = (ArrayList<String>) helper.deserializeFromFile("PersonDB.txt");
            BufferedReader br = new BufferedReader(new FileReader("output.txt"));
            String users;
            System.out.println(storePersonDetails);
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
