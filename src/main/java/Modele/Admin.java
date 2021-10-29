package Modele;

public class Admin {
    String user;
    String password;

    public Admin(String user, String password){
        this.password = password;
        this.user = user;
    }

    public Admin() {

    }

    public String getPassword() {
        return password;
    }

    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
