package model;

public class User extends Person {
    private String username;
    private String hashedPassword;
    private String role;
    private String villageId;

    public User(String personId, String firstName, String lastName, String gender, String phoneNumber,
            String username, String hashedPassword, String role, String villageId) {
        super(personId, firstName, lastName, gender, phoneNumber);
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.role = role;
        this.villageId = villageId;
    }

    public String getUsername() {
        return username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String getRole() {
        return role;
    }

    public String getVillageId() {
        return villageId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setVillageId(String villageId) {
        this.villageId = villageId;
    }
}
