package session06;

public class B3 {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public B3(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan);
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }


    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("❌ Giá bán không hợp lệ! Giá phải > 0");
        }
    }


    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
    }
    public static void main(String[] args) {
        B3 p = new B3("SP01", "Chuột gaming", 250000);

        System.out.println("=== Thông tin ban đầu ===");
        p.hienThiThongTin();

        System.out.println("\n=== Thử set giá không hợp lệ ===");
        p.setGiaBan(-100000);

        System.out.println("\n=== Thông tin sau khi set giá ===");
        p.hienThiThongTin();
    }
    

    
}
