package Bai_1;

public class Main {

    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Khương Kim Ái Vy", "Khánh Hoà", 21, 20000, 122);
        nv.getThongTin(nv);
        System.out.println("Tiền thưởng của nhân viên là : " + nv.tinhThuong(nv));
    }
}
