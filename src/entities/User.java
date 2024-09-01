package entities;

public abstract class User {
    private String id;// mã số người dùng
    private  String password;// mật khẩu
    private String name;// tên người dùng
    private int role;// vai trò người dùng

    public abstract User copy();

    public User() {

    }

    public User(String id, String password, String name, int role) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
