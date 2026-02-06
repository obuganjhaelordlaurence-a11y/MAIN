public class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String login() {
        return "User " + username + " has successfully logged in.";
    }

    public String getUsername() {
        return username;
    }

    public String identifyRole() {
        return "I am the User class. I represent a person who accesses and operates the computer system.";
    }
}
