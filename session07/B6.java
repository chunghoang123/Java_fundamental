package session07;

import java.util.ArrayList;

public class B6 {
    public final int id;       
    public String username;
    public String password;

    public B6(int id, String username, String password) {
        this.id = id;                
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[id=" + id + ", name=" + username + "]";
    }

    public static ArrayList<B6> users = new ArrayList<>();

    public static void addUser(B6 u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (B6 u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }


    public static void showUsers() {
        int index = 1;
        for (B6 u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }
     public static void main(String[] args) {
        B6 u1 = new B6(1, "dev_a", "123456");
        B6 u2 = new B6(2, "dev_b", "abcdef");
        B6 u3 = new B6(3, "dev_c", "qwerty");

        B6.addUser(u1);
        B6.addUser(u2);
        B6.addUser(u3);

        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");
        B6.showUsers();

        System.out.println("\n>> Kiểm tra đăng nhập:");

        boolean login1 = B6.checkLogin("dev_a", "123456");
        System.out.println("- Login (\"dev_a\", \"123456\"): "
                + (login1 ? "Thành công!" : "Thất bại!"));

        boolean login2 = B6.checkLogin("dev_b", "sai_pass");
        System.out.println("- Login (\"dev_b\", \"sai_pass\"): "
                + (login2 ? "Thành công!" : "Thất bại!"));

        
    }
}
