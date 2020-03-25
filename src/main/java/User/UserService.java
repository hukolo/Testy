package User;

public class UserService {

    String [] users;

    public UserService(String [] users) {
        this.users = users;
    }


    public boolean isUserExist(String login) {
        for(String user : users) {
            if (user == login) {
                return true;
            }
        }
        return false;
    }

    public int countUsersExist(){
        return users.length;
    }

    public int countHowManyExistUser(String user){
        int counter = 0;
        for(String u : users){
            if(u.equals(user))
            counter++;
        }
        return  counter;
    }


}
