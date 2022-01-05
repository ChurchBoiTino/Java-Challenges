public class UpdateUser extends Person{
    public void updateUserDetails(){
        DeleteUser removeAndUpdate = new DeleteUser();
        AddUser reAddUser = new AddUser();

        removeAndUpdate.removeUser();
        try {
            reAddUser.captureNewUser();
        }
        catch(Exception ex){
            System.out.println("Could not update user");
        }
    }
}
