package session06;

class b1 {

    String maSinhVien;
    String hoTen;
    int namSinh;
    double diemTrungBinh;

    public b1(String maSinhVien, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }


    public void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("----------------------");
        
    }
    public static void main(String[] args) {

        b1 sv1 = new b1("SV001", "Nguyễn Văn A", 2003, 8.5);
        b1 sv2 = new b1("SV002", "Trần Thị B", 2004, 7.8);
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
