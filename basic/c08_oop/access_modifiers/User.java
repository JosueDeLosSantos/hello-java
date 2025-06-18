package basic.c08_oop.access_modifiers;

public class User {
    private String username;
    private String password;

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        if (password.length() > 0){
            this.password = password;
        } else {
            System.out.println("you have not entered any password");
        }
    }

    public void checkPassword(String inputPassword) {
        if(password.length() > 0 && inputPassword == password){
            System.out.println("You have entered the correct password");
        } else {
            System.out.println("You have not entered the correct password");
        }
    }

    public void getInfo(){
        System.out.println("Your username is " + username + " and your password is " + password);
    }
}
