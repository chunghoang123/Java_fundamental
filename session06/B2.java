package session06;

import javax.sound.midi.SysexMessage;

public class B2 {
    String userName;
    String passWord;
    String email;

    public B2(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }

    public void doiMatKhau(String maKhauMoi) {
        this.passWord = maKhauMoi;
        System.out.println("Doi mat khau thanh cong");
    }

    public void inThongTin1() {
        System.out.println("Ten dang nhap: " + userName);
        System.out.println("Mat khau: " + passWord);
        System.out.println("Email: " + email);
    }

        public static void main(String[] args) {
            B2 user1 = new B2("abc", "123", "abc@123");

            user1.inThongTin1();
            user1.doiMatKhau("1234");
            user1.inThongTin1();

        }


}
