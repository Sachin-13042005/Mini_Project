import java.util.*;
class One {
    public static void main(String[] args) {
        User userObj = new User(args[0],args[0]);
        userObj.getUserCredentials();
        userObj.validateUserCredentials();
    }
}

class User {
    String actualUserName ;
    String actualPassword ;
    String userName;
    String password;
    User(){}
    User(String userName,String password){
        this.actualUserName = userName;
        this.actualUserName = password;
    }
   
    void getUserCredentials(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER USERNAME : ");
        this.userName = sc.next();
        System.out.println("ENTER PASSWORD : ");
        this.password = sc.next();
    }
    void validateUserCredentials(){
       if(this.actualUserName.equals(this.userName) && this.actualPassword.equals(this.password)){
           System.out.println("Login Successfull");
       }else{
           System.out.println("Incorrect Username or Password");
       }
    }
}