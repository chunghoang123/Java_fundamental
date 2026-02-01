package session06;

class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            System.out.println("Password không được rỗng");
        } else {
            this.password = password;
        }
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            this.email = email;
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }
}
