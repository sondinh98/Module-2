package account;

public class Account {
    private String username;
    private String password;
    private boolean admin;
    private Integer employeeID;


    public Account(String username, String password,Integer employeeID, boolean admin) {
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.employeeID = employeeID;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }
}
