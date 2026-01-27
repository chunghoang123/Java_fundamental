package session03;

public class b6 {
      public static void main(String[] args) {

        // mảng kho cũ (A) – đã sắp xếp tăng dần
        int[] arrayFirst = {101, 105, 110, 120};

        // mảng sách quyên góp (B) – đã sắp xếp tăng dần
        int[] arraySecond = {100, 105, 115, 120, 130};

        // mảng tạm để gộp
        int[] temp = new int[arrayFirst.length + arraySecond.length];

        int i = 0, j = 0, k = 0;

        // gộp 2 mảng + loại trùng
        while (i < arrayFirst.length && j < arraySecond.length) {
            if (arrayFirst[i] < arraySecond[j]) {
                if (k == 0 || temp[k - 1] != arrayFirst[i]) {
                    temp[k++] = arrayFirst[i];
                }
                i++;
            } else if (arrayFirst[i] > arraySecond[j]) {
                if (k == 0 || temp[k - 1] != arraySecond[j]) {
                    temp[k++] = arraySecond[j];
                }
                j++;
            } else { // bằng nhau
                if (k == 0 || temp[k - 1] != arrayFirst[i]) {
                    temp[k++] = arrayFirst[i];
                }
                i++;
                j++;
            }
        }

        // phần còn lại của mảng A
        while (i < arrayFirst.length) {
            if (k == 0 || temp[k - 1] != arrayFirst[i]) {
                temp[k++] = arrayFirst[i];
            }
            i++;
        }

        // phần còn lại của mảng B
        while (j < arraySecond.length) {
            if (k == 0 || temp[k - 1] != arraySecond[j]) {
                temp[k++] = arraySecond[j];
            }
            j++;
        }

        // in danh sách sách hoàn chỉnh
        System.out.print("Danh sach sach hoan chinh: ");
        for (int x = 0; x < k; x++) {
            System.out.print(temp[x]);
            if (x < k - 1) System.out.print(", ");
        }
    }
    
}
