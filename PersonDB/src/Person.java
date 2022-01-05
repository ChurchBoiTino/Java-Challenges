import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    public String userName = "", userSurname = "", userEmail = "", userDOB = "";


    public void setUserName(String name){
        userName = name;
    }

    public void setUserSurname(String surname){
        userSurname = surname;
    }

    public void setUserEmail(String email){
        userEmail = email;
    }

    public void setUserDOB(String dOB){
        userDOB = dOB;
    }

    public String getUserName(){
        return userName;
    }

    public String getUserSurname(){
        return userSurname;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public String getUserDOB(){
        return userDOB;
    }

    public static boolean validateUserEmail(String userEmail){
        String emailRegEx = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailFormat = Pattern.compile(emailRegEx, Pattern.CASE_INSENSITIVE);

        Matcher matcher = emailFormat.matcher(userEmail);
        return matcher.find();
    }
    public static boolean validateDoB(String userDOB){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date birthday = null;
        df.setLenient(false);

        try{
            birthday = df.parse(userDOB);
            return true;
        }
        catch (Exception e){
            return  false;
        }
    }
}
